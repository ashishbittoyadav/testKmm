package com.example.testkmmlib

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    private val TAG = "MainActivity.TAG"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//        val data = Greeting().greeting()
//        Log.d(TAG, "onCreate: $data")
    }
}