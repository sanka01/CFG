package sanka.rpg.cfg.view

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import kotlinx.android.synthetic.main.activity_menu.*
import sanka.rpg.cfg.R
import sanka.rpg.cfg.model.Personagem
import sanka.rpg.cfg.util.PersonagemListAdapter

class MenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        val recyclerView = recycler_view_personagens
        recyclerView.adapter = PersonagemListAdapter(personagens(), this)
        val layoutManager = StaggeredGridLayoutManager(1, StaggeredGridLayoutManager.HORIZONTAL)
        recyclerView.layoutManager = layoutManager

    }

    private fun personagens(): List<Personagem> {
        val listas: List<Personagem> =
            listOf(
                Personagem("Cleber").random(),
                Personagem("Erlond").random(),
                Personagem("Brisael").random(),
                Personagem("Morganzinha").random()
            )
        println(listas[0])

        return listas
    }

}