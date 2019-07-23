package com.example.hellotest

import android.content.Intent
import android.os.Bundle
import android.util.Log.d
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_my_results.*
import kotlinx.android.synthetic.main.content_main.*

class MyResults : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_my_results)

        //testPutAmount.text = "${waterOunces.text}"


        buttonBack.setOnClickListener {
            d("BrianBack", "Brian clicked back")
            startActivity(Intent(this, MainActivity::class.java))
        }
    }
}