package com.example.dialogsrepasofinal

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


    }

    fun registroGo(view: View) {
        var miIntent = Intent(this, MiRegistro::class.java)
        startActivity(miIntent)
    }

    fun customDialogLoad(view: View) {
        MiCustomDialog().show(supportFragmentManager, "MiCustomDialogTag")
    }
    fun pasarInfo(view: View){
        val usuarioObj: Usuarios = intent.getSerializableExtra("user") as Usuarios
        val intent = Intent(this, MiInformacion::class.java)
        intent.putExtra("user", usuarioObj);
        startActivity(intent)
        finish()
    }
}