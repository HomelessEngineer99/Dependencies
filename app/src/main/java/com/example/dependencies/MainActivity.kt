package com.example.dependencies

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.gson.Gson
import java.io.StringWriter

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val array = arrayOf("One", "Two", "Three")
        val gson = Gson()
        val writer = StringWriter()
        gson.toJson(array, writer)
        println(writer.toString())
    }
}
