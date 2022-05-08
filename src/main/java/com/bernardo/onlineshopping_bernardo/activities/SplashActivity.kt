package com.bernardo.onlineshopping_bernardo.activities

import android.content.Intent
import android.os.Build
import android.os.Bundle
import android.os.Handler
import android.view.WindowInsets
import android.view.WindowManager.LayoutParams.FLAG_FULLSCREEN
import androidx.appcompat.app.AppCompatActivity
import com.bernardo.onlineshopping_bernardo.R

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        @Suppress("DEPRECATION")
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.R) {
            window.insetsController?.hide(WindowInsets.Type.statusBars())
        } else {
            window.setFlags(
                FLAG_FULLSCREEN,
                FLAG_FULLSCREEN
            )
        }

        @Suppress("DEPRECATION")
        Handler().postDelayed(
            {
                startActivity(Intent(this@SplashActivity, LoginActivity::class.java))
                finish()
            },
            1500
        )

        //val typeface: Typeface = Typeface.createFromAsset(assets, "Montserrat-Bold.ttf")
        //tv_app_name.typeface = typeface
        //**HAVING PROBLEMS TO FIND THE ID**
    }
}