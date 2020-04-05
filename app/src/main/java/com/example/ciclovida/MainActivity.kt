package com.example.ciclovida

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.widget.AppCompatToggleButton
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var texto : TextView
    lateinit var butonabri : Button

    val TAG = "CICLO-VIDA"

    val QUANTIDADE = "Quantidade"

    //Variavel de Estado da Activit
    // Sempre que Possuir essa Situação, sera Necessario Salvar e Restaurar o estado da activit
    var quantidade = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.i(TAG, "onCreate")
        texto = findViewById(R.id.textView)
        butonabri = findViewById(R.id.butonabri)
    }

    override fun onSaveInstanceState(outState: Bundle, outPersistentState: PersistableBundle) {
        outState.putInt(QUANTIDADE, this.quantidade)
        super.onSaveInstanceState(outState)
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        Log.i(TAG, "Restaurando o estado da aplicação")
        super.onRestoreInstanceState(savedInstanceState)
        savedInstanceState.getInt(QUANTIDADE) ?: 0
        //this.texto.text
    }

    override fun onStart() {
        Log.i(TAG,"onStart")
        super.onStart()
    }

    override fun onResume() {
        Log.i(TAG, "onResume")
        super.onResume()
    }

    override fun onPause() {
        Log.i(TAG, "onPause")
        super.onPause()
    }

    override fun onDestroy() {
        Log.i(TAG, "onDestroy")
        super.onDestroy()
    }

    fun contador(View: View){
        this.quantidade++
        texto.text = this.quantidade.toString()
    }

fun abrir(view: View) {
    val i = Intent(this, OutraActivity::class.java)
    startActivity(i)
}


}



