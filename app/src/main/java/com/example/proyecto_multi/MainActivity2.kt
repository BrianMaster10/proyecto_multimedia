package com.example.proyecto_multi


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import android.widget.TextView


lateinit var textViewEtiqueta2: TextView
class MainActivity2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        lateinit var textViewcharacter : TextView
        lateinit var textViewNombre:TextView
        lateinit var textViewApellido: TextView

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        textViewcharacter = findViewById(R.id.textViewcharacter)
        textViewNombre = findViewById(R.id.textViewNombre)
        textViewApellido = findViewById(R.id.textViewApellido)



        var bundleUsuario = intent.getBundleExtra("claseUsuario")
        var usuario = Usuario(bundleUsuario!!)
        textViewNombre.text = usuario.nombre
        textViewApellido.text = usuario.apellido
        textViewcharacter.text = usuario.character

    }
    fun onVolver(){
        var mi_intent2: Intent = Intent(this, MainActivity::class.java)
        startActivity(mi_intent2)
        finish()
    }
}