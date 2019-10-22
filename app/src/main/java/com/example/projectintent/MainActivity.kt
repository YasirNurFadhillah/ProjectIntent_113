package com.example.projectintent

import android.content.Intent
import android.os.Bundle
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val nim: EditText = findViewById(R.id.in_nim)
        val nama: EditText = findViewById(R.id.in_nama)
        val nilai: EditText = findViewById(R.id.in_nilai)

        btn_process.setOnClickListener(){
            intent = Intent(this,ActivityProcess::class.java)
            intent.putExtra("nim",nim.getText())
            intent.putExtra("nama",nama.getText())
            intent.putExtra("nilai",nilai.getText())
            startActivity(intent)
        }
    }
}
