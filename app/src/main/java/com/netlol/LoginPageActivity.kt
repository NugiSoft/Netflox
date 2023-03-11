package com.netlol

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.netlol.databinding.ActivityLoginPageBinding
import javax.net.ssl.SSLSessionBindingEvent

class LoginPageActivity : AppCompatActivity() {
    private lateinit var binding : ActivityLoginPageBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login_page)
        binding= ActivityLoginPageBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.button.setOnClickListener{
            startActivity(Intent(this,HomeActivity::class.java))
        }
    }
}