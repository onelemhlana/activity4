// 123456789 - John Doe
// Healthy Habits Tracker - Splash Screen

package com.example.healthyhabits

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import vcmsa.ci.icetask4.MainActivity
import vcmsa.ci.icetask4.R

@SuppressLint("CustomSplashScreen")
class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        val startButton: Button = findViewById(R.id.btnStart)
        val exitButton: Button = findViewById(R.id.btnExit)

        startButton.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
        }

        exitButton.setOnClickListener {
            finish()
        }
    }
}
