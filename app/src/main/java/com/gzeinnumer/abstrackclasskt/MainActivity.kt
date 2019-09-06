package com.gzeinnumer.abstrackclasskt

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val zein = Guru("Zein")
        zein.displayPekerjaan("Guru Progamming") //dari person ke Guru
        zein.displayNoHp(123123123) // dari Person
    }
}


abstract class Person(nama:String){
    init {
        println("Init nama saya $nama")
    }
    fun displayNoHp(noHp: Int){
        println("fun No Hp $noHp")
    }
    abstract fun displayPekerjaan(desk: String)
}

class Guru(nama:String):Person(nama){
    override fun displayPekerjaan(desk: String) {
        println(desk)
    }
}