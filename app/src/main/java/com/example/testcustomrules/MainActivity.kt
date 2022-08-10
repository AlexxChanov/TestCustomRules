package com.example.testcustomrules

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.testcustomrules.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.activity_main.txt_testing

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        txt_testing.text = "Hello"
    }
}
