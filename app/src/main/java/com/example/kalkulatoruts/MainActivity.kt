package com.example.kalkulatoruts

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
  private fun kali (view:View) {
    val input1 :TextView =findViewById(R.id.input1)
    val input2 :TextView =findViewById(R.id.input2)
    val hasil  :TextView =findViewById(R.id.hasil)
      hasil.text= (input1.text.toString().toInt() * input2.text.toString().toInt()).toString()

  }
    private fun tambah (view:View) {
        val input1 :TextView =findViewById(R.id.input1)
        val input2 :TextView =findViewById(R.id.input2)
        val hasil  :TextView =findViewById(R.id.hasil)

        hasil.text= (input1.text.toString().toInt() + input2.text.toString().toInt()).toString()
    }

}