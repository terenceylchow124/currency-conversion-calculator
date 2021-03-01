package com.example.lab1

import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem

import android.view.View

import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.content_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)

        fab.setOnClickListener { view ->
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                    .setAction("Action", null).show()
        }
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        return when (item.itemId) {
            R.id.action_settings -> true
            else -> super.onOptionsItemSelected(item)
        }
    }

    /*fun convertCurrency(view: View){
        val dollarText = dollarText
        val textView = textView
        if(dollarText.getText().toString() !=""){
            val dollarValue: Float = java.lang.Float.valueOf(dollarText.getText().toString())
            val euroValue: Float = dollarValue * 0.85f
            textView.setText(euroValue!!.toString())
        } else
            textView.setText("No Value!")
    }

     */

    fun convertCurrency(view: View){
        if(dollarText.text.isNotEmpty()){
            val dollarValue  = dollarText.text.toString().toFloat()
            val candollars = dollarValue*1.13f
            textView.text = candollars.toString()
        } else{
            textView.text = "Please enter the usd!!"
        }
    }
}
