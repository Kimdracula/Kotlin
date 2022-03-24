package com.example.kotlin_lesson1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.google.android.material.button.MaterialButton


class MainActivity : AppCompatActivity() {
    private lateinit var textView: TextView
    private lateinit var carCopy: Car
    private lateinit var list: List<Car>


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        toCreateCars()
        initViews()
    }


    private fun initViews() {
        textView = findViewById(R.id.textView)

        val button1: MaterialButton = findViewById(R.id.button1)
        button1.setOnClickListener {
            textView.text =
                    carCopy.toString()        // выводим значение скопированного объекта класса
            case5()

        }

        val button2: MaterialButton = findViewById(R.id.button2)
        button2.setOnClickListener {
            case1()
            textView.append("\n")
            case2()
        }

        val button3: MaterialButton = findViewById(R.id.button3)
        button3.setOnClickListener {
            case3()
            textView.append("\n")
            case4()
        }


    }

    private fun case5() {
        repeat(5) {
            textView.append(carCopy.toString())
        }
    }

    private fun case4() {
        list.forEach { textView.append("\n" + it.toString()) }
    }

    private fun case3() {
        textView.text = ""
        for (i in 10 downTo 4)
            textView.append("" + list[3].weight + ", ")
    }

    private fun case2() {
        for (i in 1..10)
            textView.append("" + list[3].speed + ", ")
    }

    private fun case1() {
        textView.text = ""
        for (i in list)
            textView.append(i.Model + ", ")
    }

    private fun toCreateCars() {
        val car1 = Car("Jaguar", 320, 2000)
        val car2 = Car("BMW", 200, 1400)
        val car3 = Car("Audi", 300, 1600, "Black")
        val car4 = Car("Lada", 70, 1200)
        val car5 = Car("Mercedes", 280, 1500)
        val car6 = Car("Renault", 200, 2000)

        carCopy = car6.copy("Chevrolet")

        list = listOf(car1, car2, car3, car4, car5, car6)
    }
}