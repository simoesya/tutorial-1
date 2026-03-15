package com.example.catalogocarros

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class DetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val imagemDetalhe = findViewById<ImageView>(R.id.imagemDetalhe)
        val nomeDetalhe = findViewById<TextView>(R.id.nomeDetalhe)
        val descricaoDetalhe = findViewById<TextView>(R.id.descricaoDetalhe)

        val nome = intent.getStringExtra("nome")
        val descricao = intent.getStringExtra("descricao")
        val imagem = intent.getIntExtra("imagem", 0)

        nomeDetalhe.text = nome
        descricaoDetalhe.text = descricao
        imagemDetalhe.setImageResource(imagem)
    }
}