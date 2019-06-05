package com.sjullieb.myrestaurants

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import kotlinx.android.synthetic.main.activity_restaurants.*

class RestaurantsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_restaurants)

        //val intent = savedInstanceState.getIntent();
        //var bundle: Bundle? =intent.extras

        val zipCode = intent.getStringExtra(EXTRA_LOCATION)
        locationTxt.text = zipCode
        println("recieved ZIP code " + zipCode)
    }
}
