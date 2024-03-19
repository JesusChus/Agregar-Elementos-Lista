package com.chusdevil.appagregarelementolista

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView.ViewHolder

class ElementoViewHolder(private val view: View) : ViewHolder(view) {

    private val imagen = view.findViewById<ImageView>(R.id.ivImagen)
    private val texto = view.findViewById<TextView>(R.id.tvElemento)

    fun datos(valorTexto: String) {
        texto.text = valorTexto
    }
}