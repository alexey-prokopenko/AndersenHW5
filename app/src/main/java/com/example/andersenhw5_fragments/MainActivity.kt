package com.example.andersenhw5_fragments

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.andersenhw5_fragments.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportFragmentManager
            .beginTransaction()
            .replace(R.id.holderFragment, Fragment1())
            .commit()
    }

}