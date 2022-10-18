package com.example.bitfit_part_2


import android.os.Parcelable
import kotlinx.parcelize.Parcelize



@Parcelize
data class Food1(
    val name: String? = "",
    val calories: Double?
) : Parcelable