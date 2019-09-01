package sanka.rpg.cfg.view

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import sanka.rpg.cfg.R
import sanka.rpg.cfg.model.Personagem


class FichaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setTheme(R.style.Theme_AppCompat_NoActionBar)
        setContentView(R.layout.activity_ficha)

        getPersonagem()

    }

    fun getPersonagem() {
        val personagem: Personagem = intent.extras?.getSerializable("personagem") as Personagem
        val nome = findViewById<TextView>(R.id.editNome)
        val proficiencia = findViewById<TextView>(R.id.editProf)
        val ca = findViewById<TextView>(R.id.editCa)
        val forca = findViewById<TextView>(R.id.viewMod0)
        val destreza = findViewById<TextView>(R.id.viewMod1)
        val constituicao = findViewById<TextView>(R.id.viewMod2)
        val sabedoria = findViewById<TextView>(R.id.viewMod3)
        val inteligencia = findViewById<TextView>(R.id.viewMod4)
        val carisma = findViewById<TextView>(R.id.viewMod5)

        println(personagem)
        nome.text = personagem.nome
        proficiencia.text = "${personagem.proeficiencia}"
        ca.text =   "${personagem.classeArmadura}"
        forca.text = "${personagem.forca.valor}"
        destreza.text = "${personagem.destreza.valor}"
        constituicao.text = "${personagem.constituicao.valor}"
        sabedoria.text = "${personagem.sabedoria.valor}"
        inteligencia.text = "${personagem.inteligencia.valor}"
        carisma.text = "${personagem.carisma.valor}"


    }
}