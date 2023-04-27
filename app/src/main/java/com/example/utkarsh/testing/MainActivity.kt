package com.example.utkarsh.testing

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.ActionMode
import android.view.View.INVISIBLE
import android.view.View.VISIBLE
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.i("MYTAG", "MainActivity :OnCreate")
        //can learn by doin' things
        //val used Read only, greetingTextView=variable
        val greetingTextView = findViewById<TextView>(R.id.tvHello)
        val inputFeild = findViewById<EditText>(R.id.etName)
        val submitButton = findViewById<Button>(R.id.btnSubmit)
        val offersButton = findViewById<Button>(R.id.btnOffers)
        var enteredName=""
        submitButton.setOnClickListener {
            //here we get text as editable object hence to use this we convert to string
            enteredName = inputFeild.text.toString()
            if (enteredName == "") {
                //context?
                offersButton.visibility= INVISIBLE
                //greetingTextView.text=""
                Toast.makeText(this@MainActivity,
                "Please Enter Your Name ",
                Toast.LENGTH_SHORT).show()
                greetingTextView.text=""
            }
            else {
                //val message="WelCome "+enteredName+" to Android"
                val message = "Welcome $enteredName"
                Log.i("MYTAG",message)
                greetingTextView.text = message
                Log.i("MYTAG", "After displaying the message on the TextView")
                inputFeild.text.clear()
                offersButton.visibility = VISIBLE
            }
        }
        offersButton.setOnClickListener{
            val intent=Intent(this, SecondActivity::class.java)
            intent.putExtra("User",enteredName)
            startActivity(intent)
        }
    }
    override fun onStart() {
        super.onStart()
        Log.i("MYTAG", "MainActivity :OnStart")
    }
    override fun onResume() {
        super.onResume()
        Log.i("MYTAG", "MainActivity :OnResume")
    }
    override fun onPause() {
        super.onPause()
        Log.i("MYTAG", "MainActivity :onPause")
    }
    override fun onStop() {
        super.onStop()
        Log.i("MYTAG", "MainActivity :OnStop")
    }
    override fun onDestroy() {
        super.onDestroy()
        Log.i("MYTAG", "MainActivity :OnDestroy")
    }
    override fun onRestart() {
        super.onRestart()
        Log.i("MYTAG", "MainActivity :OnRestart")
    }
}