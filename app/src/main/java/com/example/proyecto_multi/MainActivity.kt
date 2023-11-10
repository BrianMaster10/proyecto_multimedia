package com.example.proyecto_multi


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.RadioButton
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var textViewEtiqueta: TextView
    lateinit var editTextNombre: EditText
    lateinit var editTextApellido:EditText
    var apellido = ""
    var nombre = ""

    lateinit var Alumno: RadioButton
    lateinit var Profesor: RadioButton


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        editTextApellido = findViewById(R.id.editTextApellido)
        editTextNombre = findViewById(R.id.editTextNombre)
        Alumno = findViewById(R.id.BtRadAlumno)
        Profesor = findViewById(R.id.BtRadProf)

    }

    fun onAltaUsuario(view: View) {
        nombre = editTextNombre.text.toString()
        apellido = editTextApellido.text.toString()
        var character: String
        character=validar()
        var usuario = Usuario(nombre,apellido,character)

        var mi_intent2: Intent = Intent(this, MainActivity2::class.java)

        mi_intent2.putExtra("claseUsuario", usuario.getBundle())
        startActivity(mi_intent2)
    }
    fun validar(): String {
        return when {
            Alumno.isChecked -> "Alumno"
            Profesor.isChecked -> "Profesor"
            else -> ""
        }
    }

}