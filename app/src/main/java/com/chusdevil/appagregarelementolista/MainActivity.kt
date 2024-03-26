package com.chusdevil.appagregarelementolista

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private val texto = mutableListOf<String>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val lista = findViewById<RecyclerView>(R.id.rvLista)
        val adapter = ListaAdapter(texto)
        lista.layoutManager = LinearLayoutManager(this)
        lista.adapter = adapter

        val boton: Button = findViewById(R.id.btnBoton)
        boton.setOnClickListener {
            agregar()
            adapter.notifyDataSetChanged()
        }

    }
    private fun agregar() {
        texto.add("")
    }
}

