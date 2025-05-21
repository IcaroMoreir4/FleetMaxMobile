package com.example.fleetmax_androidapp

import android.content.Intent
import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import com.example.fleetmax_androidapp.databinding.ActivityLoginBinding

class Login : AppCompatActivity() {

    private lateinit var binding: ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnLogin.setOnClickListener {
            val cnpj = binding.editCnpj.text.toString().trim()
            val email = binding.editEmail.text.toString().trim()
            val senha = binding.editSenha.text.toString().trim()

            if (cnpj.isEmpty() || email.isEmpty() || senha.isEmpty()) {
                Toast.makeText(this, "Preencha todos os campos", Toast.LENGTH_SHORT).show()
            } else if (email == "teste@teste.com" && senha == "1234" && cnpj == "12345678000100") {
                Toast.makeText(this, "Login realizado com sucesso!", Toast.LENGTH_SHORT).show()
                val intent = Intent(this, Dashboard::class.java)
                startActivity(intent)
                finish()
            } else {
                Toast.makeText(this, "Dados inválidos. Tente novamente.", Toast.LENGTH_SHORT).show()
            }
        }

        binding.txtRegistrar.setOnClickListener {
            val intent = Intent(this, Register::class.java)
            startActivity(intent)
        }
    }
}
