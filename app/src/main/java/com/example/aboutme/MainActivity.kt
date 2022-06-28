package com.example.aboutme

import android.app.Activity
import android.content.Context
import android.opengl.Visibility
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.inputmethod.InputMethodManager
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import com.example.aboutme.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)



        binding.done.setOnClickListener{
            Toast.makeText(this, "Form completed", Toast.LENGTH_SHORT).show()
        }


//        findViewById<Button>(R.id.button).setOnClickListener{
//            addNickName(it)
//        }
    }


//    private fun addNickName(view: View) {
//        val  editText = findViewById<EditText>(R.id.edit_text)
//        val nickname = findViewById<TextView>(R.id.bio_text)
//
//        nickname.text = editText.text
//        editText.visibility = View.GONE
//        view.visibility = View.GONE
//        nickname.visibility = View.VISIBLE
//
//
//        // Hide the keyboard.
//        val imm = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
//        imm.hideSoftInputFromWindow(view.windowToken, 0)
//
//    }
}