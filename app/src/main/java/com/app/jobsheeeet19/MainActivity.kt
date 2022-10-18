package com.app.jobsheeeet19

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val editText = findViewById<EditText>(R.id.editText)
        val btn = findViewById<Button>(R.id.btn)

        btn.setOnClickListener {
            konversiNilai(editText.text.toString().toInt())
        }
    }
    fun konversiNilai(editText: Int) {

        if(editText >= 86 && editText <= 100){
            Toast.makeText(this,"Nilai Kamu = A", Toast.LENGTH_SHORT).show() ;
        }
        else if(editText >= 76 && editText <= 85) {
            Toast.makeText(this,"Nilai Kamu = B", Toast.LENGTH_SHORT).show()
        }
        else if(editText >= 66 && editText <= 75) {
            Toast.makeText(this,"Nilai Kamu = C", Toast.LENGTH_SHORT).show()
        }
        else if(editText >= 51 && editText <= 65) {
            Toast.makeText(this,"Nilai Kamu = D", Toast.LENGTH_SHORT).show()
        }
        else if(editText >= 0 && editText <= 50) {
            Toast.makeText(this,"Nilai Kamu = E", Toast.LENGTH_SHORT).show()
        }
        else {
            Toast.makeText(this, "Nilai Kamu = Lebih dari yang ditentukan", Toast.LENGTH_SHORT).show()
        }
    }
}