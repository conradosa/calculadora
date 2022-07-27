package com.example.calculadora

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val num1 = findViewById<EditText>(R.id. editTextNumber)
        val num2 = findViewById<EditText>(R.id. editTextNumber2)
        val plus = findViewById<Button>(R.id. plus)
        val minus = findViewById<Button>(R.id. minus)
        val mult = findViewById<Button>(R.id. mult)
        val div = findViewById<Button>(R.id. div)
        val resultado = findViewById<TextView>(R.id. textView2)

        plus.setOnClickListener {
            val val1 = num1.text.toString().toFloat()
            val val2 = num2.text.toString().toFloat()
            val total = val1 + val2
            resultado.text = total.toString()
        }

        minus.setOnClickListener {
            val val1 = num1.text.toString().toFloat()
            val val2 = num2.text.toString().toFloat()
            val total = val1 - val2
            resultado.text = total.toString()
        }

        mult.setOnClickListener {
            val val1 = num1.text.toString().toFloat()
            val val2 = num2.text.toString().toFloat()
            val total = val1 * val2
            resultado.text = total.toString()
        }

        div.setOnClickListener {
            val val1 = num1.text.toString().toFloat()
            val val2 = num2.text.toString().toFloat()
            val total = val1 / val2
            resultado.text = total.toString()
        }

    }
}