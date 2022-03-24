package com.example.kotlin_lesson1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.google.android.material.button.MaterialButton


class MainActivity : AppCompatActivity() {
    private lateinit var textView: TextView
    private lateinit var carCopy: Car
    private lateinit var list: ArrayList<Car>


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initViews()
        toCreateCars()


    }


    private fun initViews() {
        val button: MaterialButton = findViewById(R.id.button)
        button.setOnClickListener {
            textView.text =
                carCopy.toString()      // выводим значение скопированного объекта класса
        }

        val button1: MaterialButton = findViewById(R.id.button1)
        button.setOnClickListener {

        }

        val button2: MaterialButton = findViewById(R.id.button2)
        button.setOnClickListener {

        }



        textView = findViewById(R.id.textView)
    }

    private fun toCreateCars() {
        val car1 = Car("Jaguar", 320, 2000)
        val car2 = Car("BMW", 200, 1400)
        val car3 = Car("Audi", 300, 1600, "Black")
        val car4 = Car("Lada", 70, 1200)
        val car5 = Car("Mercedes", 280, 1500)
        val car6 = Car("Renault", 200, 2000)

    }


}