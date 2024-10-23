package com.example.myassignmentforweek4b

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    private var position:Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val add = findViewById<Button>(R.id.add_fragment)
        val remove = findViewById<Button>(R.id.remove_fragment)

        add.setOnClickListener {
            addFragment()
        }

        remove.setOnClickListener {
            removeFragment()
        }
    }


    fun addFragment(){
        position++
        val fragment = Frame_Fragment(position)
        supportFragmentManager.beginTransaction()
            .add(R.id.fragmentHolder, fragment)
            .addToBackStack(null)
            .commit()
    }

    fun removeFragment(){
        val fragmentManager = supportFragmentManager
        if (fragmentManager.backStackEntryCount > 0){
            fragmentManager.popBackStack()
            position--
        }
    }
}