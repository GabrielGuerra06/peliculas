package com.example.peliculas

import android.app.Activity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView
import androidx.core.content.ContextCompat

class PeliAdapter (private val context: Activity, private val arrayList: ArrayList<Pelicula>)
    : ArrayAdapter<Pelicula>(context, R.layout.item, arrayList) {

    override fun getView(position: Int, convertView: android.view.View?, parent: ViewGroup): android.view.View {
        val inflater: LayoutInflater = LayoutInflater.from(context)
        var view: View = inflater.inflate(R.layout.item, null)

        view.findViewById<TextView>(R.id.nombre).text = arrayList[position].nombre.toString()
        view.findViewById<TextView>(R.id.genero).text = arrayList[position].genero.toString()
        view.findViewById<TextView>(R.id.año).text = arrayList[position].año.toString()

        if(arrayList[position].genero == "aventura")
        {
            view.findViewById<ImageView>(R.id.imagen).setImageDrawable(ContextCompat.getDrawable(context,R.drawable.planetadeltesoro))
        }
        if(arrayList[position].genero == "Thriller")
        {
            view.findViewById<ImageView>(R.id.imagen).setImageDrawable(ContextCompat.getDrawable(context,R.drawable.silenciodelosinocentes))
        }
        if(arrayList[position].genero == "infantil")
        {
            view.findViewById<ImageView>(R.id.imagen).setImageDrawable(ContextCompat.getDrawable(context,R.drawable.hercules))
        }

        return view
    }
}