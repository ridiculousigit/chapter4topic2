package binar.academy.chapter4topic2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import binar.academy.chapter4topic2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)

        binding.txtHello.text = "Welcome"
    }
}