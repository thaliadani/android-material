package br.com.messoretech.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import br.com.messoretech.R
import com.google.android.material.textfield.TextInputLayout

class TextFieldsActivity: AppCompatActivity() {
    lateinit var layoutInput: TextInputLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_text_fields)

        setupView()
        errorMessage()
    }

    fun setupView(){
        layoutInput = findViewById(R.id.il_errorMessage)
    }

    fun errorMessage(){
        layoutInput.error = "Campo obrigatório"
    }
}