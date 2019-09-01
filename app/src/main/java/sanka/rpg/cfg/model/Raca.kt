package sanka.rpg.cfg.model

import java.io.Serializable

class Raca constructor(var nome:String, var tamanho: Int ) : Serializable {
    var habilidades : List<Habilidade> = arrayListOf()
    var deslocamentoBase : Int? = null
}