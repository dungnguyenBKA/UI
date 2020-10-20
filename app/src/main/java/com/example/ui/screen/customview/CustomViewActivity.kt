package com.example.ui.screen.customview

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.ui.R
import kotlinx.android.synthetic.main.activity_custom_view.*

class CustomViewActivity : AppCompatActivity() {
    companion object{
        @JvmStatic
        fun start(context: Context) {
            val starter = Intent(context, CustomViewActivity::class.java)
            context.startActivity(starter)
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_custom_view)

        customTextView.setText("Blue Eyes Ultimate Dragon")

        customTextView.setOnClickListener{
            customTextView.setText("Blue Eyes Shining Dragon")
        }
    }
}