package org.roadtocode.sicalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val etAm: EditText = findViewById(R.id.etAm)

        val etRate: EditText = findViewById(R.id.etRate)

        val etTime: EditText = findViewById(R.id.etTime)

        val btnCal: Button = findViewById(R.id.btnCal)

        val tvAns: TextView = findViewById(R.id.tvAns)


        btnCal.setOnClickListener{

            val userAm: Int = etAm.text.toString().toInt()
            val userRt: Int = etRate.text.toString().toInt()
            val userT: Int = etTime.text.toString().toInt()
            val fn = (userAm*userRt*userT)/100
            tvAns.text = fn.toString()


        }



    }
}