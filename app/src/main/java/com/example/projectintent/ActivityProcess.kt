package com.example.projectintent

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_process.*

class ActivityProcess : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_process)

        val bundle: Bundle? = intent.extras
        val nim = bundle?.get("nim")
        val nm = bundle?.get("nama")
        val pnilai = bundle?.get("nilai")

        //kondisi

        val nil= pnilai.toString()
        val nilai = nil.toInt()
        if (nilai >= 80){
            out_keterangan.setText("A")}
        else if(nilai >= 60 ){
            out_keterangan.setText("B")}
        else if(nilai >= 40 ){
            out_keterangan.setText("C")}
        else if(nilai >= 20 ){
            out_keterangan.setText("D")}
        else{
            out_keterangan.setText("E")}

        out_nim.setText(""+nim)
        out_nama.setText(""+nm)
        out_nilai.setText(""+pnilai)

        btn_kembali.setOnClickListener(){
            intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
        }
    }
}

