package com.example.prakt17two

import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import com.example.prakt17two.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var bindingClass: ActivityMainBinding
    lateinit var countTemp: TextView
    lateinit var count_start: SharedPreferences
    var count:Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindingClass = ActivityMainBinding.inflate(layoutInflater)
        setContentView(bindingClass.root)
        bindingClass.cl.setBackgroundColor(getColor(R.color.red))
        count_start = getPreferences(MODE_PRIVATE)
        count++
        countTemp = findViewById<TextView>(R.id.counter)
    }

    override fun onStart() {
        super.onStart()
        count_start = getPreferences(MODE_PRIVATE)
        countTemp.setText(count_start.getString("count", ""))
        count++
        if(count % 2 == 0) {
            bindingClass.cl.setBackgroundColor(getColor(R.color.green))
        }
        else {
            bindingClass.cl.setBackgroundColor(getColor(R.color.blue))
        }

    }

    override fun onResume() {
        super.onResume()
    }

    override fun onPause() {
        super.onPause()
    }
}