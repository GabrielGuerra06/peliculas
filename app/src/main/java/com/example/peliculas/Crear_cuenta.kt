package com.example.peliculas

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class Crear_cuenta : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_crear_cuenta)

        var saludoCrear =  findViewById<TextView>(R.id.mensajeCrearCuenta)
        var btnVolverLoginCrear = findViewById<Button>(R.id.volverLoginCrear)

        btnVolverLoginCrear.setOnClickListener {
            startActivity(Intent(this, Login::class.java))


        }
    }
}