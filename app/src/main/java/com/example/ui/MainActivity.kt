package com.example.ui

import android.view.LayoutInflater
import androidx.viewbinding.ViewBinding
import com.example.ui.base.BaseActivity
import com.example.ui.databinding.MainActivityBinding
import com.example.ui.screen.collapsingsceen.ScrollingActivity
import com.example.ui.screen.customview.CustomViewActivity
import com.example.ui.screen.di.DiExampleActivity
import com.example.ui.screen.showdatamvvm.HomeActivity
import kotlinx.android.synthetic.main.main_activity.*
import kotlinx.android.synthetic.main.main_activity.view.*

class MainActivity : BaseActivity() {
    private lateinit var viewBinding : MainActivityBinding
    override fun getViewBinding(): ViewBinding {
        return viewBinding
    }

    override fun initViewBinding(inflater: LayoutInflater) {
        viewBinding = MainActivityBinding.inflate(inflater)
    }

    override fun configView() {
        viewBinding.root.btn_home.setOnClickListener { HomeActivity.start(this) }
        viewBinding.root.btn_collapsing.setOnClickListener { ScrollingActivity.start(this) }
        viewBinding.root.btn_DI.setOnClickListener { DiExampleActivity.start(this) }
        viewBinding.root.btn_CustomView.setOnClickListener { CustomViewActivity.start(this) }
    }
}