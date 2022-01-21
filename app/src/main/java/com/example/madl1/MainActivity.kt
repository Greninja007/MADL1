package com.example.madl1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var a = 20f

        var tvDisplay = findViewById<TextView>(R.id.tvDisplay)
        val btnTvColor = findViewById<Button>(R.id.btnTvColor)
        val btnTvSize = findViewById<Button>(R.id.btnTvSize)

        btnTvColor.setOnClickListener {
            tvDisplay.setTextColor(resources.getColor(R.color.money_heist))
            Toast.makeText(this,"Text Color Changed Successfully",Toast.LENGTH_SHORT).show()
        }
        btnTvSize.setOnClickListener {
            tvDisplay.textSize = a++
            Toast.makeText(this,"Text Size Changed Successfully",Toast.LENGTH_SHORT).show()
        }
    }
}