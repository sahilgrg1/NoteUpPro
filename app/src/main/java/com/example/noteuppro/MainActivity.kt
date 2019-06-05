package com.example.noteuppro

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.app.AlertDialog
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.dialog_layout.view.*

class MainActivity : AppCompatActivity() {
    private val dialogview by lazy {
        layoutInflater.inflate(R.layout.dialog_layout,null,false)
    }
    private val noteAlert by lazy {
        AlertDialog.Builder(this)
            .setTitle("Enter the note here")
            .setView(dialogview)
            .setPositiveButton("Save") { dialog, _ ->
                val note = Notes(
                    dialogview.etTitle.text.toString(),
                    dialogview.etDescription.text.toString()
                )

                dialog.dismiss()
            }
            .setNegativeButton("Cancel") { dialog, _ ->
                dialog.dismiss()
            }
            .create()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        floatingActionButton2.setOnClickListener {
            val intent = Intent(this,Searching::class.java)
            startActivity(intent)

        }
        floatingActionButton.setOnClickListener {
            noteAlert.show()
        }

    }
}
