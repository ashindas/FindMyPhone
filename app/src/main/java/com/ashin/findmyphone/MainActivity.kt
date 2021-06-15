package com.ashin.findmyphone

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val userData=UserData(this)
        userData.getPhone()
        println("hello")
        print("iam ashin")

        println("Experimental")
    }
}