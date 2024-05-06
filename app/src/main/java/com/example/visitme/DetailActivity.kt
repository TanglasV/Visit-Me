package com.example.visitme

import android.content.Intent
import android.os.Bundle
import android.widget.RatingBar
import android.widget.TextView
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class DetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        // Retrieve locationName from intent extras
        val locationInfo = intent.getParcelableExtra<LocationInfo>("locationInfo")

        // Initialize views
        val imageView: ImageView = findViewById(R.id.imageDetail)
        val titleTextView: TextView = findViewById(R.id.Name)
        val locationTextView: TextView = findViewById(R.id.Location)
        val lastVisitDateTextView: TextView = findViewById(R.id.LastVisit)
        val ratingBar: RatingBar = findViewById(R.id.ratingDetail)

        // Populate views with location details
        locationInfo?.let { location: LocationInfo ->
            imageView.setImageResource(location.imageResourceId)
            titleTextView.text = location.name
            locationTextView.text = location.location
            lastVisitDateTextView.text = "Last Visit: ${location.lastVisitDate}"
            ratingBar.rating = location.rating
        }

    }
}
