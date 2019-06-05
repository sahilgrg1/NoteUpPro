package com.example.noteuppro

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.app.AlertDialog
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private val dialogview by lazy {
        layoutInflater.inflate(R.layout.dialog_layout,null,false)
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        floatingActionButton2.setOnClickListener {
            val intent = Intent(this,Searching::class.java)
            startActivity(intent)

        }


    }
}
