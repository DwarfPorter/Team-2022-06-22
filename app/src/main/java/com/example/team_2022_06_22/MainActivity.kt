package com.example.team_2022_06_22

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Toast.makeText(this, "Загрузка", Toast.LENGTH_SHORT).show()

        val btn = findViewById<Button>(R.id.button)
        btn.setOnClickListener {
            Toast.makeText(this, "Кнопка нажата", Toast.LENGTH_LONG).show()
        }

    }
}