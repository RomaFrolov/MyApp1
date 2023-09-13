package com.example.myapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import org.w3c.dom.Text



class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val myBottom: Button = findViewById<Button>(R.id.click_btn)
        val myText: TextView = findViewById<TextView>(R.id.my_tv)
        var counter: Int = 0


        myBottom.setOnClickListener(){
            val newNum = counter++.toString()
            myText.text= newNum
        }
    }
}