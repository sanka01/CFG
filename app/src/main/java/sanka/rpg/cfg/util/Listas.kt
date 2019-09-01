package sanka.rpg.cfg.util

import sanka.rpg.cfg.model.Atributo
import sanka.rpg.cfg.model.Pericia

class Listas {
    companion object {
        val tipoDano = arrayListOf(
            "Ácido",
            "Concussão",
            "Cortante",
            "Elétrico",
            "Energia",
            "Fogo",
            "Frio",
            "Necrótico",
            "Perfurante",
            "Psíquico",
            "Radiante",
            "Trovejante",
            "Veneno"
        )

        val tipoItem = arrayListOf(
            "Arma",
            "Armadura",
            "Equipamento",
            "Item Magico",
            "Ferramenta",
            "Moeda",
            "Pacote",
            "Veiculo"
        )

        val atributos = arrayListOf(
            Atributo("Força"),
            Atributo("Destreza"),
            Atributo("Constituição"),
            Atributo("Inteligencia"),
            Atributo("Sabedoria"),
            Atributo("Carisma")
        )

        val resistencias = arrayListOf(
            Pericia("Força", atributos[0]),
            Pericia("Destreza", atributos[1]),
            Pericia("Constituição", atributos[2]),
            Pericia("Inteligência", atributos[3]),
            Pericia("Sabedoria", atributos[4]),
            Pericia("Carisma", atributos[5])
        )

        val pericias = arrayListOf(
            Pericia("Acrobacia", atributos[1]),
            Pericia("Arcanismo", atributos[3]),
            Pericia("Atletismo", atributos[0]),
            Pericia("Atuação", atributos[5]),
            Pericia("Blefar", atributos[5]),
            Pericia("Furtividade", atributos[1]),
            Pericia("Historia", atributos[3]),
            Pericia("Intimidação", atributos[5]),
            Pericia("Intuição", atributos[4]),
            Pericia("Investigação", atributos[3]),
            Pericia("Lidar com Animais", atributos[4]),
            Pericia("Medicina", atributos[4]),
            Pericia("Natureza", atributos[3]),
            Pericia("Percepção", atributos[4]),
            Pericia("Persuasão", atributos[5]),
            Pericia("Prestidigitação", atributos[1]),
            Pericia("Religião", atributos[3]),
            Pericia("Sobrevivência", atributos[4])
        )

    }
}