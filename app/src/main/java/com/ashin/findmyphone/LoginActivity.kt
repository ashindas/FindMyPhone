package com.ashin.findmyphone

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.ashin.findmyphone.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {
    private lateinit var binding: ActivityLoginBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_login)
        binding=ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
     fun Register(view: View)
    {
    val userData=UserData(this)
        userData.savePhone(binding.etPhone.text.toString())
          finish()
    }
}