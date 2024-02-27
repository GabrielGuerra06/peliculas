package com.example.peliculas

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class Cambiar_pass : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cambiar_pass)

        var saludoCambiar =  findViewById<TextView>(R.id.mensajeCambiarContraseña)
        var btnVolverLogin = findViewById<Button>(R.id.volverLoginCambiar)

        btnVolverLogin.setOnClickListener {
            startActivity(Intent(this, Login::class.java))

        }
    }
}