package com.sjullieb.myrestaurants

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_restaurants.*

class RestaurantsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_restaurants)

        val zipCode = intent.getStringExtra("location")
        locationTxt.text = zipCode
        println(zipCode)
    }
}
