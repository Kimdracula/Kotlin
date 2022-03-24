package com.example.kotlin_lesson1

data class Car @JvmOverloads constructor (val Model: String, val speed:Int =300, val weight: Int,val Color:String? = null )
