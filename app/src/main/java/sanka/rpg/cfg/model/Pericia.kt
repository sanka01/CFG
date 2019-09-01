package sanka.rpg.cfg.model

import java.io.Serializable

class Pericia constructor(var nome:String, var atributo: Atributo) : Serializable{
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Pericia) return false

        if (nome != other.nome) return false

        return true
    }

    override fun hashCode(): Int {
        return nome.hashCode()
    }

}