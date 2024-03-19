package com.chusdevil.appagregarelementolista

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView.Adapter

class ListaAdapter(val texto: List<String>) : Adapter<ElementoViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ElementoViewHolder {
        val elementoXml =
            LayoutInflater.from(parent.context).inflate(R.layout.elemento_lista, parent, false)
        val elemento = ElementoViewHolder(elementoXml)
        return elemento
    }

    override fun getItemCount(): Int {
        return texto.size
    }

    override fun onBindViewHolder(holder: ElementoViewHolder, position: Int) {
        var posicion = position
        holder.datos("Elemento $posicion")
    }
}