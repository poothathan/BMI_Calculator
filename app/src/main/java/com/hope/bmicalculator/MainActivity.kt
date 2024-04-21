package com.hope.bmicalculator

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    var weight : TextView? = null
    var height : TextView? = null
    var button : Button? = null
    var textview1 : TextView? = null
    var textview2 : TextView? = null
    var image : ImageView? = null
    var ans : Float = 0F

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        weight = findViewById(R.id.weight)
        height = findViewById(R.id.height)
        button = findViewById(R.id.button)
        textview1 = findViewById(R.id.textview1)
        textview2 = findViewById(R.id.textview2)
        image = findViewById(R.id.image)

        button?.setOnClickListener {
            var w = weight?.text.toString()
            var h = height?.text.toString()

            var wei = w.toFloat()
            var hei = h.toFloat()

            var hh = hei / 100.0F
            var squre = hh * hh

            ans = wei / squre
            textview1?.text = ans.toString()

            if (ans <= 18.5) {
                textview2?.text = "YOU ARE UNDERWEIGHT"
                textview2?.setTextColor(Color.RED)
            }
            else if (18.5 < ans && ans <= 24.9) {
                textview2?.text = "YOU ARE NORMAL WEIGHT"
                textview2?.setTextColor(Color.GREEN)
            }
            else if (24.9 < ans && ans <= 29.9) {
                textview2?.text = "YOU ARE OVER WEIGHT"
                textview2?.setTextColor(Color.RED)
            }
            else {
                textview2?.text = "YOU ARE OBESE"
                textview2?.setTextColor(Color.RED)
            }
            image?.setImageResource(R.drawable.bmi)
        }
    }

}