package sanka.rpg.cfg.util

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.Adapter
import kotlinx.android.synthetic.main.portrait_personagem.view.*
import sanka.rpg.cfg.R
import sanka.rpg.cfg.model.Personagem
import sanka.rpg.cfg.view.FichaActivity


class PersonagemListAdapter(private val personagens: List<Personagem>, private val context: Context): Adapter<PersonagemListAdapter.ViewHolder>() {
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val personagem = personagens[position]
        holder.bindView(personagem)
        holder.itemView.portrait.setOnClickListener {
            val trocaTela = Intent(context, FichaActivity::class.java).putExtra("personagem", personagem)
            context.startActivity(trocaTela)
        }
   }

    override fun getItemCount(): Int = personagens.size

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.portrait_personagem, parent, false)
        return ViewHolder(view)
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val nome = itemView.nome

        fun bindView(personagem: Personagem) {
            val nome = itemView.nome
            val portrait = itemView.portrait
            nome.text = personagem.nome


        }
    }
}
