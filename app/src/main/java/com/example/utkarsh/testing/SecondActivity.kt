package com.example.utkarsh.testing

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        Log.i("MYTAG", "SecondActivity :OnCreate")

        val userName=intent.getStringExtra("User")
        val textView=findViewById<TextView>(R.id.tvOffer)
        val message="$userName, you will get free access to all the content for one month"
        textView.text=message
    }
    override fun onStart() {
        super.onStart()
        Log.i("MYTAG", "SecondActivity :OnStart")
    }
    override fun onResume() {
        super.onResume()
        Log.i("MYTAG", "SecondActivity :OnResume")
    }
    override fun onPause() {
        super.onPause()
        Log.i("MYTAG", "SecondActivity :onPause")
    }
    override fun onStop() {
        super.onStop()
        Log.i("MYTAG", "SecondActivity :OnStop")
    }
    override fun onDestroy() {
        super.onDestroy()
        Log.i("MYTAG", "SecondActivity :OnDestroy")
    }
    override fun onRestart() {
        super.onRestart()
        Log.i("MYTAG", "SecondActivity :OnRestart")
    }
}