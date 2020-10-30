package com.solsistemas.calculadora

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onClick(v: View?) {
        Toast.makeText(
                applicationContext,
                "Favor preencher valor no campo ",
                Toast.LENGTH_LONG
        ).show()

// está dando erro, não reconhece o componente
// if (! validarValor(edValor1) || ! validarValor(edValor2))
            return
    }

    fun validarValor(edit : EditText) : Boolean {
        if (edit.text.isEmpty()) {
            Toast.makeText(applicationContext, "Favor preencher valor no campo "+edit.contentDescription, Toast.LENGTH_LONG).show()
            return false
        }
        return true
    }

}