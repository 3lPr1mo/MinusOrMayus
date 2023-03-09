package com.example.tarea3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView
import com.google.android.material.button.MaterialButton

class MainActivity : AppCompatActivity() {

    private lateinit var editTxt: EditText
    private lateinit var btnAceptar: MaterialButton
    private lateinit var txtResult: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        editTxt = findViewById(R.id.edtText)
        btnAceptar = findViewById(R.id.button)
        txtResult = findViewById(R.id.result)

        btnAceptar.setOnClickListener{
            if(validate()){
                mayusOrMinus()
            }
        }
    }

    fun validate(): Boolean{
        var isValid = true
        if(editTxt.text.toString().isBlank()){
            isValid = false
            editTxt.error = getString(R.string.form_required_failed)
        }
        return isValid
    }

    fun mayusOrMinus(){
        if(editTxt.text.toString().equals(editTxt.text.toString().lowercase())){
            txtResult.text = "Texto en Minúsculas"
        }else if(editTxt.text.toString().equals(editTxt.text.toString().uppercase())){
            txtResult.text = "Texto en MAYÚSCULAS"
        }else{
            txtResult.text = "Texto en Minúsuclas y Mayúsculas"
        }
    }
}