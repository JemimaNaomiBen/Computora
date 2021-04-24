package com.nayhomie.computora

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class SplashScreenActivity : AppCompatActivity() {

    private var DURATION = 3000L

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_userchoice)
        loadSplashScreen()
        }

    fun loadSplashScreen(){
        Handler().postDelayed(
                {
                    startActivity(Intent(this@SplashScreenActivity, UserChoiceActivity::class.java))
                    finish()
                }, DURATION)
    }

    }