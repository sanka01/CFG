package sanka.rpg.cfg.model

import java.io.Serializable

class Item constructor(var nome: String) :Serializable{

    var descricao: String = ""

    var classeArmadura: Int? = null

    //efeitos para armas
    var dano: Int? = null
    var tipoDano: String? = null
    var tipo: String = ""
    var danoVersatil: Int? = null
    var distancia: Int? = null
    var distanciaLonga: Int? = null

    var isPesado: Boolean = false
    var isLeve: Boolean = false
    var isDuasMaos: Boolean = false
    var isMunicao: Boolean = false
    var isRecarga: Boolean = false
    var isVersatil: Boolean = false
    var isAcuidade: Boolean = false
    var isAlcance: Boolean = false
    var isArremesso: Boolean = false
    var isEspecial: Boolean = false
    var descricaoEspecial: String? = null


    //0 = não carregado; 1 = carregado; 2 = equipado
    var isEquipado : Int = 0
    var peso: Float? = null
    //valor com base em GP
    var valor: Float? = null


}