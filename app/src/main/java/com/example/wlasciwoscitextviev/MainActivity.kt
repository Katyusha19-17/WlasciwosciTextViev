package com.example.wlasciwoscitextviev

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        findViewById<Button>(R.id.buttonSkalaX).setOnClickListener {
            findViewById<TextView>(R.id.TextVievEdytowany).scaleX += 1
        }

        findViewById<Button>(R.id.buttonTextSize).setOnClickListener {
            findViewById<TextView>(R.id.TextVievEdytowany).textSize += 1
        }

        findViewById<Button>(R.id.buttonAlpha).setOnClickListener {
            findViewById<TextView>(R.id.TextVievEdytowany).alpha = 0.5f
        }

        findViewById<Button>(R.id.buttonSkalaY).setOnClickListener {
            findViewById<TextView>(R.id.TextVievEdytowany).scaleY +=1
        }

        findViewById<Button>(R.id.buttonOtherText).setOnClickListener {
            findViewById<TextView>(R.id.TextVievEdytowany).text = "Przykladowy tekst"
        }

        findViewById<Button>(R.id.buttonVisibility).setOnClickListener {
            findViewById<TextView>(R.id.TextVievEdytowany).visibility = View.GONE
        }
    }
}