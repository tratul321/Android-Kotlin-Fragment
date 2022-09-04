package com.example.sandy.kotlinfragment

import android.app.Activity
import android.content.res.Configuration
import android.content.res.Resources
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*


class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        changeLanguage();

        var fManager = supportFragmentManager

        var tx = fManager.beginTransaction()
        tx.add(R.id.frag, HomeFrag())
        tx.addToBackStack(null)
        tx.commit()

    }



    fun changeLanguage(){
        textview_first.setOnClickListener {
            if (Locale.getDefault().language.equals("en")){
                setLocale(this, "bn")
                Toast.makeText(this, "test", Toast.LENGTH_SHORT).show()
                recreate()
            }
            else{
                setLocale(this, "en")
                Toast.makeText(this, "check", Toast.LENGTH_SHORT).show()
                recreate()
            }
        }
    }

    fun setLocale(activity: Activity, languageCode: String?) {
        val locale = Locale(languageCode)
        Locale.setDefault(locale)
        val resources: Resources = activity.resources
        val config: Configuration = resources.getConfiguration()
        config.setLocale(locale)
        resources.updateConfiguration(config, resources.getDisplayMetrics())
    }

}



