package com.example.fatih.intentactivity

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


    }


    fun changeActivity (view: View){
        val intent = Intent(applicationContext,Main2Activity::class.java)
        intent.putExtra("input",editText.text.toString())
        startActivity(intent)
    }
}
