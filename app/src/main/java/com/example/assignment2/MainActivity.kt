package com.example.assignment2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import java.util.Random

class MainActivity : AppCompatActivity() {

    val foodList = ArrayList<String>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        foodList.add("Hamburger")
        foodList.add("Pizza")
        foodList.add("Mexican")
        foodList.add("American")
        foodList.add("Chinese")
    }

    fun addFood(v: View) {
        val newFood = findViewById<EditText>(R.id.newfood_et)
        val text = newFood.editableText.toString()
        foodList.add(text)
        newFood.text.clear()
        Toast.makeText(this, "New Food Added", Toast.LENGTH_SHORT).show()
    }

    fun decide(v: View) {
        val randomIndex = kotlin.random.Random.nextInt(foodList.size);
        val randomText = foodList[randomIndex]
        val textView = findViewById<TextView>(R.id.textView)
        textView.text = randomText
    }
}