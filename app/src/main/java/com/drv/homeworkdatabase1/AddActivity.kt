package com.drv.homeworkdatabase1

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.lifecycleScope
import com.drv.homeworkdatabase1.databinding.ActivityAddBinding
import kotlinx.coroutines.launch

class AddActivity : AppCompatActivity() {

    private lateinit var binding: ActivityAddBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAddBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.btnAddUser.setOnClickListener { addUser() }
    }
     private fun addUser(){
            val  name = binding.edName.text.toString()
            val  style = binding.edStyle.text.toString()
            val  price = binding.edprice.text.toString()

        lifecycleScope.launch {
            val user = User(name = name,style = style ,price= price)
            AppDatabase(this@AddActivity).getUserDao().addUser(user)
            finish()
        }


        }
    }