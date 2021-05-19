package com.example.androidcurrencycalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class CalculateActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculate)
        val inputValue: EditText
        val calculateButton: Button
        val resultText: TextView
        var currencyValue: Double

        inputValue = findViewById(R.id.inputEditText)
        calculateButton = findViewById(R.id.calculateButton)
        resultText = findViewById(R.id.resultTextView)

        if(CONST.currencyType == "dollar"){
            inputValue.hint = "Enter Dollar"
            calculateButton.setOnClickListener(View.OnClickListener {
                currencyValue = inputValue.text.toString().toDouble() * 8.41
                resultText.text = "Result : " + currencyValue
            })
        }
        if(CONST.currencyType == "euro"){
            inputValue.hint = "Enter Euro"
            calculateButton.setOnClickListener(View.OnClickListener {
                currencyValue = inputValue.text.toString().toDouble() * 10.28
                resultText.text = "Result : " + currencyValue
            })
        }
        if(CONST.currencyType == "sterlin"){
            inputValue.hint = "Enter Sterlin"
            calculateButton.setOnClickListener(View.OnClickListener {
                currencyValue = inputValue.text.toString().toDouble() * 11.92
                resultText.text = "Result : " + currencyValue

            })
        }
        if(CONST.currencyType == "bitcoin"){
            inputValue.hint = "Enter Bitcoin"
            calculateButton.setOnClickListener(View.OnClickListener {
                currencyValue = inputValue.text.toString().toDouble() * 325025.67
                resultText.text = "Result : " + currencyValue

            })

        }
    }
}
































