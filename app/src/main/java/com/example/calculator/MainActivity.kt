package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var btnAdd: Button
    lateinit var btnSubtract: Button
    lateinit var btnMultiply: Button
    lateinit var btnModulus: Button
    lateinit var etNumber1: EditText
    lateinit var etNumber2: EditText
    lateinit var tvResult: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnAdd = findViewById(R.id.btnAdd)
        btnSubtract = findViewById(R.id.btnSubtract)
        btnMultiply = findViewById(R.id.btnMultiply)
        btnModulus = findViewById(R.id.btnModulus)
        etNumber1 = findViewById(R.id.etNumber1)
        etNumber2 = findViewById(R.id.etNumber2)
        tvResult = findViewById(R.id.tvResult)

        btnAdd.setOnClickListener {

            var res1 = etNumber1.text.toString().toInt()
            var res2 = etNumber2.text.toString().toInt()

            add(res1, res2)
        }
        btnSubtract.setOnClickListener {

            var res1 = etNumber1.text.toString().toInt()
            var res2 = etNumber1.text.toString().toInt()

            Subtract(res1, res2)
        }
        btnMultiply.setOnClickListener {

            var res1 = etNumber1.text.toString().toInt()
            var res2 = etNumber1.text.toString().toInt()

            Multiply(res1, res2)
        }
        btnModulus.setOnClickListener {

            var res1 = etNumber1.text.toString().toInt()
            var res2 = etNumber1.text.toString().toInt()

            Modulus(res1, res2)

        }

    }

    fun add(res1:Int,res2:Int){
        var res=res1 + res2
        tvResult.text=res.toString()
    }

    fun Subtract(res1:Int,res2:Int){
        var res=res1 - res2
        tvResult.text=res.toString()
    }
    fun Multiply(res1:Int,res2:Int){
        var res=res1 * res2
        tvResult.text=res.toString()
    }
    fun Modulus(res1:Int,res2:Int){
        var res=res1 % res2
        tvResult.text=res.toString()
    }


}