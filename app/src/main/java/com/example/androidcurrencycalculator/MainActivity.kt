package com.example.androidcurrencycalculator

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val dollarButton: Button
        val euroButton: Button
        val sterlinButton: Button
        val bitcoinButton: Button

        dollarButton = findViewById(R.id.dollarButton)
        euroButton = findViewById(R.id.euroButton)
        sterlinButton = findViewById(R.id.sterlinButton)
        bitcoinButton = findViewById(R.id.bitcoinButton)

        dollarButton.setOnClickListener(View.OnClickListener {
            CONST.currencyType = "dolar"
            startCalculateActivity()
        })
        euroButton.setOnClickListener(View.OnClickListener {
            CONST.currencyType = "euro"
            startCalculateActivity()
        })

        sterlinButton.setOnClickListener(View.OnClickListener {
            CONST.currencyType = "sterlin"
            startCalculateActivity()
        })

        bitcoinButton.setOnClickListener(View.OnClickListener {
            CONST.currencyType = "bitcoin"
            startCalculateActivity()
        })

    }
    fun startCalculateActivity(){
        val intent =  Intent(this,CalculateActivity::class.java)
        startActivity(intent)
    }
}