package com.example.lesson11

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.lesson11.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var bindingClass : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindingClass = ActivityMainBinding.inflate(layoutInflater)
        setContentView(bindingClass.root)

        bindingClass.btReesult.setOnClickListener{
            val resultValue = bindingClass.edValue.text.toString().toInt()
            when(resultValue){
                in 0..1000 -> {
                    bindingClass.tvResult.text = "Вы начинающий блогер"
                }
                in 1000..100000 -> {
                    bindingClass.tvResult.text = "средний блогер"
                }
                    else -> {
                        bindingClass.tvResult.text = "вы супер звезда"
                    }
            }

        }
    }
}