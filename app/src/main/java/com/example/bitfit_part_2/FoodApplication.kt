package com.example.bitfit_part_2
import android.app.Application

class FoodApplication : Application() {
    val db by lazy { AppDatabase.getInstance(this) }
}