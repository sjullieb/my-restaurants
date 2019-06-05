package com.sjullieb.myrestaurants

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

const val EXTRA_LOCATION = "location"
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findRestaurantBtn.setOnClickListener(){
            println("Button clicked")
           // Toast.makeText(this, "Hello!", Toast.LENGTH_LONG).show()
            val intent = Intent(this, RestaurantsActivity::class.java)
            intent.putExtra(EXTRA_LOCATION, locationEditTxt.text.toString())
            startActivity(intent)
        }

    }
}

