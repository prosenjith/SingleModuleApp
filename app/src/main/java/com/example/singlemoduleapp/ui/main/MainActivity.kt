package com.example.singlemoduleapp.ui.main

import android.os.Bundle
import com.example.singlemoduleapp.R
import com.example.singlemoduleapp.ui.base.BaseActivity

class MainActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}