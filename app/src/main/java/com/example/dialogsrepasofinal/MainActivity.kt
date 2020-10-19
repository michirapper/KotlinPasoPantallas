package com.example.dialogsrepasofinal

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var btnInformacion = findViewById<Button>(R.id.btnInformacion)


        var loginTrue = false
        val objetoIntent: Intent = intent



        if (objetoIntent.getStringExtra("Login").equals("true")) {
            btnInformacion.setVisibility(View.VISIBLE)
        } else {
            btnInformacion.setVisibility(View.INVISIBLE)
        }


    }

    fun registroGo(view: View) {
        var miIntent = Intent(this, MiRegistro::class.java)
        startActivity(miIntent)
    }

    fun customDialogLoad(view: View) {
        val usuarioObj: Usuarios = intent.getSerializableExtra("user") as Usuarios
        var usu = usuarioObj.usuario
        var pass = usuarioObj.contrasena
        Toast.makeText(this, usu + " " + pass, Toast.LENGTH_LONG).show()
        val dialogFragment = MiCustomDialog()
        val args = Bundle()
        args.putString("user",usu)
        args.putString("pass",pass)
        dialogFragment.setArguments(args)
        dialogFragment.show(supportFragmentManager, "MiCustomDialogTag")
    }

    fun pasarInfo(view: View) {
        val usuarioObj: Usuarios = intent.getSerializableExtra("user") as Usuarios
        val intent = Intent(this, MiInformacion::class.java)
        intent.putExtra("user", usuarioObj);
        startActivity(intent)
        finish()
    }
}