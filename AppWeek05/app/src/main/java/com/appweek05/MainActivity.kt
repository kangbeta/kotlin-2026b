package com.appweek05

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.appweek05.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val etDan = findViewById<EditText>(R.id.etDan)
        val btnCalculate = findViewById<Button>(R.id.btnCalculate)
        val tvResult = findViewById<TextView>(R.id.tvResult)

        btnCalculate.setOnClickListener {
            val input_text = etDan.text.toString()

            if (input_text.isEmpty()) {
                Toast.makeText(this, "숫자를 입력", Toast.LENGTH_LONG)
                return@setOnClickListener
            }

            val dan = input_text.toInt()
            val result = StringBuilder()
            result.append("$dan 단\n")

            for (i in 0 until 10) {
                result.append("$dan x $i = ${dan * i}\n")
            }

            tvResult.text = result.toString()
        }
    }
}
