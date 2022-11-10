package com.aliyev.intentkotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_next.*

class NextActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_next)

        val intent = intent
        val name = intent.getStringExtra("name")
        val surname = intent.getStringExtra("surname")

        textView.text = "Name: ${name}"
        textView2.text = "Name: ${surname}"

    }

    fun back(view: View){
        val backs = Intent(applicationContext, MainActivity::class.java)
        startActivity(backs)
    }

}