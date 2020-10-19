package com.example.dialogsrepasofinal

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import java.io.Serializable


class MiRegistro : AppCompatActivity(), Serializable {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mi_registro)
    }

    fun Registro(view: View) {
        var usuario = Usuarios("", "", "", "")
        usuario.nombre = findViewById<EditText>(R.id.editTextNombreInfo).text.toString()
        usuario.apellidos = findViewById<EditText>(R.id.editTextApellidoInfo).text.toString()
        usuario.usuario = findViewById<EditText>(R.id.editTextUsuarioInfo).text.toString()
        usuario.contrasena = findViewById<EditText>(R.id.editTextContrasenaInfo).text.toString()
        val intent = Intent(this, MainActivity::class.java)
        intent.putExtra("user", usuario);

        startActivity(intent)
        finish()

        //onBackPressed()

    }

    fun atras(view: View) {
        onBackPressed()
    }
}