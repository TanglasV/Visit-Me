package com.example.visitme

import android.content.Intent
import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat.startActivity

class MainActivity : AppCompatActivity() {

    private lateinit var swinburneImage: ImageView
    private lateinit var auburnHotelImage: ImageView
    private lateinit var rocketParkImage: ImageView
    private lateinit var rathminesReserveImage: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Initialize views
        swinburneImage = findViewById(R.id.swinburne)
        auburnHotelImage = findViewById(R.id.auburn_hotel)
        rocketParkImage = findViewById(R.id.rocket_park)
        rathminesReserveImage = findViewById(R.id.rathmines_reserve)

        // Set click listeners for each image
        swinburneImage.setOnClickListener {
            launchDetailsActivity(LocationInfo(
                R.drawable.swinburne,
                "Swinburne",
                "Wakefield St",
                "01/05/2024",
                4.5f
            ))
        }

        auburnHotelImage.setOnClickListener {
            launchDetailsActivity(LocationInfo(
                R.drawable.auburn_hotel,
                "Auburn Hotel",
                "Auburn Rd",
                "02/05/2024",
                4.0f
            ))
        }

        rocketParkImage.setOnClickListener {
            launchDetailsActivity(LocationInfo(
                R.drawable.rocket_park,
                "Rocket Park",
                "Henry St",
                "03/05/2024",
                5.0f
            ))
        }

        rathminesReserveImage.setOnClickListener {
            launchDetailsActivity(LocationInfo(
                R.drawable.rathmines_reserve,
                "Rathmines Reserve",
                "Rathmines Rd",
                "04/05/2024",
                3.5f
            ))
        }
    }

    private fun launchDetailsActivity(locationInfo: LocationInfo) {
        val intent = Intent(this, DetailActivity::class.java)
        intent.putExtra("locationInfo", locationInfo)
        startActivity(intent)
    }
}