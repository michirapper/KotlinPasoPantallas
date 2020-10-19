package com.example.dialogsrepasofinal

import android.os.Bundle
import android.view.View
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class MiInformacion : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mi_informacion)
        val usuarioObj: Usuarios = intent.getSerializableExtra("user") as Usuarios

        findViewById<EditText>(R.id.editTextNombreInfo).setText(usuarioObj.nombre)
        findViewById<EditText>(R.id.editTextApellidoInfo).setText(usuarioObj.apellidos)
        findViewById<EditText>(R.id.editTextUsuarioInfo).setText(usuarioObj.usuario)
        findViewById<EditText>(R.id.editTextContrasenaInfo).setText(usuarioObj.contrasena)

        findViewById<EditText>(R.id.editTextNombreInfo).setEnabled(false)
        findViewById<EditText>(R.id.editTextApellidoInfo).setEnabled(false)
        findViewById<EditText>(R.id.editTextUsuarioInfo).setEnabled(false)
        findViewById<EditText>(R.id.editTextContrasenaInfo).setEnabled(false)

    }

    fun atras(view: View) {
        onBackPressed()
    }

}


