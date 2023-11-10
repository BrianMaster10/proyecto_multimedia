package com.example.proyecto_multi

import android.os.Bundle

class Usuario {
    var character: String
    var nombre:String

    var apellido:String


    constructor(nombre: String, apellido: String, character: String) {
        this.nombre = nombre
        this.apellido = apellido
        this.character =  character

    }
    constructor(bundle: Bundle){
        this.nombre = bundle.getString("nombre")!!
        this.apellido = bundle.getString("apellido")!!
        this.character = bundle.getString("character")!!
    }
    fun getBundle(): Bundle?{
        var bundle = Bundle()

        bundle.putString("nombre",this.nombre)
        bundle.putString("apellido", this.apellido)
        bundle.putString("Character", this.character)
        return bundle
    }
}