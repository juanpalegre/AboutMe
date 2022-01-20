package com.example.aboutme

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.databinding.DataBindingUtil
import com.example.aboutme.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    private val name: MyName = MyName("Juan Pablo Alegre Román")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        binding.myName = name
        //val buttonDone: Button = findViewById(R.id.btn_done)
        //buttonDone.setOnClickListener {
        //  addReader(it)
        //}
        binding.btnDone.setOnClickListener {
            addReader(it)
        }

    }

    private fun addReader(it: View) {
        //val etReader: EditText = findViewById(R.id.et_reader)
        //val tvReader: TextView = findViewById(R.id.tv_reader)

        binding.apply {
            myName?.reader = etReader.text.toString()
            //tvReader.text = binding.etReader.text
            invalidateAll()
            etReader.visibility = View.GONE
            it.visibility = View.GONE
            tvReader.visibility = View.VISIBLE
        }

    }
}