package com.example.androidcurrencycalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val inputValue: EditText
        val calculateButton: Button
        val resultText: TextView
        var currencyValue: Double


        inputValue = findViewById(R.id.currencyInput)
        calculateButton = findViewById(R.id.calculateButton)
        resultText = findViewById(R.id.resultText)

        calculateButton.setOnClickListener(View.OnClickListener {
            currencyValue = inputValue.text.toString().toDouble()
            resultText.text = (currencyValue * 8).toString()

        })

    }
}