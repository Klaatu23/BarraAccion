package com.klaatu.barraaccion

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        //return super.onCreateOptionsMenu(menu)
        menuInflater.inflate(R.menu.menu_main,menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        when(item!!.itemId){
            R.id.addNote->{
                Toast.makeText(this,"Agregar...",Toast.LENGTH_LONG).show()
            }
            R.id.about->{
                Toast.makeText(this,"Acerca de...",Toast.LENGTH_LONG).show()
            }
            R.id.addReset->{
                Toast.makeText(this,"Reset...",Toast.LENGTH_LONG).show()
            }
            R.id.exit->{
                Toast.makeText(this,"Salir...",Toast.LENGTH_LONG).show()
            }
        }

        return super.onOptionsItemSelected(item)
    }
}