package com.example.diceapp

import java.util.Random
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.core.app.ComponentActivity
import androidx.core.app.ComponentActivity.ExtraData
import androidx.core.content.ContextCompat.getSystemService
import android.icu.lang.UCharacter.GraphemeClusterBreak.T



class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // get reference to button
        val myButton = findViewById(R.id.rollButton) as Button

        val myText = findViewById(R.id.rollText) as TextView

        // set on-click listener
        myButton.setOnClickListener {
            Toast.makeText(this@MainActivity, "Dice was rolled.", Toast.LENGTH_SHORT).show()

            val roll = Random().nextInt(6)+1

            myText.text = roll.toString()
        }
    }



}
