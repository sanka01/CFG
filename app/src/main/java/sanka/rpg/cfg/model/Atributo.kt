package sanka.rpg.cfg.model

import java.io.Serializable
import java.util.concurrent.ThreadLocalRandom


class Atributo constructor(var nome: String) : Serializable {
    var valor: Int = 10
    var modificador: Int = setModificador()

    fun rolaAtributo() {
        var rolagens: List<Int> = arrayListOf(
            ThreadLocalRandom.current().nextInt(1, 7),
            ThreadLocalRandom.current().nextInt(1, 7),
            ThreadLocalRandom.current().nextInt(1, 7),
            ThreadLocalRandom.current().nextInt(1, 7)
        ).sorted()

        valor = rolagens[1] + rolagens[2] + rolagens[3]

        setModificador()
        println("$nome: $rolagens:" +
                "$valor/$modificador")
    }

    override fun toString(): String {
        return "$valor/$modificador"
    }

    fun setAtributo(valor: Int) {
        this.valor = valor
        rolaAtributo()
    }

    fun setModificador(): Int {
        modificador = Math.round(((valor - 10) / 2).toDouble()).toInt()
        println("modificador: $modificador/valor:" + (valor - 10))
        return modificador
    }
}