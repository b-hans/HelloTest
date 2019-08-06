package com.example.hellotest

import android.content.Intent
import android.os.Bundle
import android.util.Log.d
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem

import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_my_results.*
import kotlinx.android.synthetic.main.content_main.*
import kotlinx.android.synthetic.main.content_results.*

class MainActivity : AppCompatActivity() {

    class CoffeeValues {

        fun getSomeText(): String{
            return "Function text"
        }

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)


        buttonClear.setOnClickListener {
            d("Brian", "Brian clicked clear!")

        }

        buttonConvert.setOnClickListener {
            d("Brian2", "Brian clicked convert!")
            //testOne.text = "${waterOunces.text}"
            startActivity(Intent(this, MyResults::class.java))
        }

        val myCoffeeValues = CoffeeValues()

        testOne.text = myCoffeeValues.getSomeText()

    }

}
