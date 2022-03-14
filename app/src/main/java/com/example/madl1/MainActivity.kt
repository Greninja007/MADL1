package com.example.madl1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var a = 0f

        var tvcolorIncrementer: Int = 0
        var bgcolorIncrementer: Int = 0
        var tvDisplay = findViewById<TextView>(R.id.tvDisplay)
        var mainLayout = findViewById<LinearLayout>(R.id.mainLL)
        val btnTvColor = findViewById<Button>(R.id.btnTvColor)
        val btnTvSize = findViewById<Button>(R.id.btnTvSize)
        val btnAppGB = findViewById<Button>(R.id.appBgColor)
        btnTvColor.setOnClickListener {

            ++tvcolorIncrementer
            if (tvcolorIncrementer == 1) {
                tvDisplay.setTextColor(resources.getColor(R.color.red))
                Toast.makeText(this,"Text Color Changed to RED Successfully",Toast.LENGTH_SHORT).show()
            }
            else if (tvcolorIncrementer == 2) {
                tvDisplay.setTextColor(resources.getColor(R.color.green))
                Toast.makeText(this,"Text Color Changed to GREEN Successfully",Toast.LENGTH_SHORT).show()
            }
            else if (tvcolorIncrementer == 3) {
                tvDisplay.setTextColor(resources.getColor(R.color.blue))
                Toast.makeText(this,"Text Color Changed to BLUE Successfully",Toast.LENGTH_SHORT).show()
            }
            else{
                tvcolorIncrementer = 0
            }


        }
        btnTvSize.setOnClickListener {
            a += 10f
//            if(a>50f){
//                Toast.makeText(this,"Text Size threshold reached",Toast.LENGTH_SHORT).show()
//            }
//            else{
                tvDisplay.textSize = a%100f
                Toast.makeText(this,"Text Size Changed Successfully",Toast.LENGTH_SHORT).show()
//            }
        }

        btnAppGB.setOnClickListener {
            ++bgcolorIncrementer
            if (bgcolorIncrementer == 1) {
                mainLayout.setBackgroundColor(resources.getColor(R.color.red))
                Toast.makeText(this,"Background Color Changed to RED Successfully",Toast.LENGTH_SHORT).show()
            }
            else if (bgcolorIncrementer == 2) {
                mainLayout.setBackgroundColor(resources.getColor(R.color.green))
                Toast.makeText(this,"Background Color Changed to GREEN Successfully",Toast.LENGTH_SHORT).show()
            }
            else if (bgcolorIncrementer == 3) {
                mainLayout.setBackgroundColor(resources.getColor(R.color.blue))
                Toast.makeText(this,"Background Color Changed to BLUE Successfully",Toast.LENGTH_SHORT).show()
            }
            else{
                bgcolorIncrementer = 0
            }
        }


    }
}