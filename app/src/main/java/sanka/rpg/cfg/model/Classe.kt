package sanka.rpg.cfg.model

import java.io.Serializable

class Classe constructor(var nome: String, var dv: Int) : Serializable{
    var nivel: Int = 0
    var habilidades: ArrayList<Habilidade> = arrayListOf()
    var arquetipo: Classe? = null
    fun novaHabilidade(habilidade: Habilidade) {
        if (!habilidades.contains(habilidade))
            habilidades.add(habilidade)
    }
}