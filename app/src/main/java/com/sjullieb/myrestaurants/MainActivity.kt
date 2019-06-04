package com.sjullieb.myrestaurants

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findRestaurantBtn.setOnClickListener(){
            println("Button clicked")
            Toast.makeText(this, "Hello!", Toast.LENGTH_LONG).show()
        }

    }
}

