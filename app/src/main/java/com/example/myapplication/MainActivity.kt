package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button =findViewById(R.id.roll_button)
        rollButton.setOnClickListener{(rollDice())}

        val countUpButton: Button =findViewById(R.id.countUpButton)
        countUpButton.setOnClickListener{(rollcu())}
    }

    private fun rollDice(){
        val rollText: TextView =findViewById(R.id.roll_text)
        val randomInt = (1..6).random()
        rollText.text=randomInt.toString()
        Toast.makeText(this, "button clicked",Toast.LENGTH_SHORT).show()
    }

    private fun rollcu(){
        val rollText: TextView =findViewById(R.id.roll_text)
       // val randomInt = (1..6).random()
        rollText.text= rollText.text + 1
        Toast.makeText(this, "button clicked",Toast.LENGTH_SHORT).show()
    }
}
