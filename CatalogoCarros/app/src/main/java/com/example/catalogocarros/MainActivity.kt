package com.example.catalogocarros

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val imgCarro1 = findViewById<ImageView>(R.id.imgCarro1)
        val imgCarro2 = findViewById<ImageView>(R.id.imgCarro2)
        val imgCarro3 = findViewById<ImageView>(R.id.imgCarro3)
        val imgCarro4 = findViewById<ImageView>(R.id.imgCarro4)

        imgCarro1.setOnClickListener {
            val intent = Intent(this, DetailActivity::class.java)
            intent.putExtra("nome", "BMW M3")
            intent.putExtra("descricao", "O BMW M3 é um sedan desportivo conhecido pela sua potência, aceleração rápida e condução dinâmica. É uma excelente escolha para quem procura desempenho e design moderno.")
            intent.putExtra("imagem", R.drawable.carro1)
            startActivity(intent)
        }

        imgCarro2.setOnClickListener {
            val intent = Intent(this, DetailActivity::class.java)
            intent.putExtra("nome", "BMW M4")
            intent.putExtra("descricao", "O BMW M4 é um coupé desportivo elegante, com um motor potente e um visual agressivo. Combina luxo, velocidade e excelente estabilidade em estrada.")
            intent.putExtra("imagem", R.drawable.carro2)
            startActivity(intent)
        }

        imgCarro3.setOnClickListener {
            val intent = Intent(this, DetailActivity::class.java)
            intent.putExtra("nome", "BMW M5")
            intent.putExtra("descricao", "O BMW M5 é uma berlina de alta performance que junta conforto, tecnologia e muita potência. É ideal para quem quer um carro rápido sem perder sofisticação.")
            intent.putExtra("imagem", R.drawable.carro3)
            startActivity(intent)
        }

        imgCarro4.setOnClickListener {
            val intent = Intent(this, DetailActivity::class.java)
            intent.putExtra("nome", "BMW M2")
            intent.putExtra("descricao", "O BMW M2 é um coupé desportivo compacto, conhecido pela sua agilidade, potência e condução divertida.")
            intent.putExtra("imagem", R.drawable.carro4)
            startActivity(intent)
        }
    }
}