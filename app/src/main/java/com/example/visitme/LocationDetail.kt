package com.example.visitme

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class LocationInfo(
    val imageResourceId: Int,
    val name: String,
    val location: String,
    val lastVisitDate: String,
    val rating: Float
) : Parcelable
