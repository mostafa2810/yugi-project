package com.eltrend.yugi_ohdecks

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var back = object :Thread(){
            override fun run() {
                try {
                    Thread.sleep(8*1000.toLong())
                    startActivity(Intent(this@MainActivity,third ::class.java))

                }catch (ex:Exception){
                    Toast.makeText(baseContext,"error", Toast.LENGTH_LONG).show()
                }
            }
        }
        back.start()
    }
}
