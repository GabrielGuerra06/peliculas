 package com.example.peliculas

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import com.google.firebase.Firebase
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.auth

 class Login : AppCompatActivity() {

     private lateinit var auth: FirebaseAuth;
     // Write a message to the database



     override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

         auth = Firebase.auth
        var mensajeLogin = findViewById<TextView>(R.id.mensajeLogin)
        var btnLogin = findViewById<Button>(R.id.login)
        var btnCrearCuenta = findViewById<Button>(R.id.crearCuenta)
        var btnRecuperarContraseña = findViewById<Button>(R.id.recuperarContraseña)

        btnLogin.setOnClickListener {
            auth.signInWithEmailAndPassword("gabriel@gmail.com", "123456").addOnCompleteListener {
                task ->
                if(task.isSuccessful){
                    Toast.makeText(this, "Se inicio sesion correctamente", Toast.LENGTH_LONG).show()
                    startActivity(Intent(this, Menu_principal::class.java).putExtra("nombre","Gabriel"))
                }
                else{
                    Toast.makeText(this, "Error: " + task.exception!!.message.toString() , Toast.LENGTH_LONG).show()
                    startActivity(Intent(this, Menu_principal::class.java))

                }
            }
        }

        btnCrearCuenta.setOnClickListener {
            startActivity(Intent(this, Crear_cuenta::class.java))

        }

        btnRecuperarContraseña.setOnClickListener {
            startActivity(Intent(this, Cambiar_pass::class.java))

        }

    }

     public override fun onStart() {
         super.onStart()
         // Check if user is signed in (non-null) and update UI accordingly.
         val currentUser = auth.currentUser
         if(currentUser != null){
             Toast.makeText(this, "Ya estás autenticado", Toast.LENGTH_LONG).show()
             startActivity(Intent(this, Menu_principal::class.java).putExtra("nombre","Gabriel"))
         }

     }

}
