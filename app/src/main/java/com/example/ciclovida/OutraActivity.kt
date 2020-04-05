package com.example.ciclovida

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class OutraActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_outra)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)


        }

    fun fechar(view: View){
        this.finish()


    }
}
