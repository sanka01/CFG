package sanka.rpg.cfg.view

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import sanka.rpg.cfg.R

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnContinuar : Button = findViewById(R.id.buttonContinuar)

        btnContinuar.setOnClickListener {
            val trocaTela = Intent(this, MenuActivity::class.java)
            startActivity(trocaTela)
        }
    }
}
