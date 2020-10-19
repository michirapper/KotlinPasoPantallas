package com.example.dialogsrepasofinal

import java.io.Serializable

class Usuarios : Serializable {
    var nombre: String
    var apellidos: String
    var usuario: String
    var contrasena:String

    constructor(nombre: String, apellidos: String, usuario: String, contrasena: String) {
        this.nombre = nombre
        this.apellidos = apellidos
        this.usuario = usuario
        this.contrasena = contrasena
    }

}
