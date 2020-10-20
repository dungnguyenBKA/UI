package com.example.ui.screen.di

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.ui.R

class DiExampleActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_di_example)
    }

    companion object{
        fun start(context: Context) {
            val starter = Intent(context, DiExampleActivity::class.java)
            context.startActivity(starter)
        }
    }
}