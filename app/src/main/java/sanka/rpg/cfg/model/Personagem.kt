package sanka.rpg.cfg.model

import java.io.Serializable

data class Personagem constructor(var nome: String, var tendencia: String, var xp: Int) : Serializable {
    var forca: Atributo = Atributo("Força")
    var destreza: Atributo = Atributo("Destreza")
    var constituicao: Atributo = Atributo("Constituição")
    var inteligencia: Atributo = Atributo("Inteligencia")
    var sabedoria: Atributo = Atributo("Sabedoria")
    var carisma: Atributo = Atributo("Carisma")


    var classe: Classe = Classe("Plebeu", 4)
    var subClasse: ArrayList<Classe> = arrayListOf()
    var raca: Raca? = null

    var pericias: ArrayList<Pericia> = arrayListOf()
    var proeficiencia: Int = 2
        get() {
            field = ((nivel() - 1) / 4 + 2)
            return field
        }
    var pontosDeVida: Int = 0
    var pontosDeVidaAtual: Int = 0
    var classeArmadura: Int = 0
    var armas: ArrayList<Item> = arrayListOf()
    var itens: ArrayList<Item> = arrayListOf()


    constructor(nome: String) : this(nome, "", 0)


    fun nivel(): Int {
        var nivelTotal = 0
        nivelTotal += classe.nivel
        subClasse.forEach {
            nivelTotal += it.nivel
        }

        return nivelTotal
    }

    fun random(): Personagem {
        forca.rolaAtributo()
        destreza.rolaAtributo()
        constituicao.rolaAtributo()
        inteligencia.rolaAtributo()
        sabedoria.rolaAtributo()
        carisma.rolaAtributo()
        classeArmadura = setCA(null, null)

        return this
    }

    fun dano(valor: Int) {
        pontosDeVidaAtual -= valor
    }

    fun novaPericia(pericia: Pericia) {
        if (!pericias.contains(pericia))
            pericias.add(pericia)
    }

    fun setCA(armadura: Item?, escudo: Item?): Int {
        var classeArmadura = 10 + destreza.modificador
        if (armadura != null)
            classeArmadura = if (armadura.isPesado)
                armadura.classeArmadura!!
            else
                destreza.modificador + armadura.classeArmadura!!

        if (escudo != null)
            classeArmadura += escudo.classeArmadura!!
        return classeArmadura
    }

    override fun toString(): String {
        return "Personagem(nome='$nome', forca=$forca, destreza=$destreza, " +
                "constituicao=$constituicao, inteligencia=$inteligencia, " +
                "sabedoria=$sabedoria, carisma=$carisma, classeArmadura=$classeArmadura)"
    }


}