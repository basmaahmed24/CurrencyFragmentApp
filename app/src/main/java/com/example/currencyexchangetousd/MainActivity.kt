package com.example.currencyexchangetousd

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }
    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu to use in the action bar
        val inflater = menuInflater
        inflater.inflate(R.menu.currency, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean{
        if(item.itemId==R.id.item1){
            supportFragmentManager.beginTransaction()
                .replace(R.id.frag,currency_name())
                .commitNow()
        }
        if(item.itemId==R.id.item2){
            supportFragmentManager.beginTransaction()
                .replace(R.id.frag,currency_rate())
                .commitNow()

        }
        if(item.itemId==R.id.close){
         finish()
         //   setContentView(R.layout.activity_main)
        }
        return true
    }

}