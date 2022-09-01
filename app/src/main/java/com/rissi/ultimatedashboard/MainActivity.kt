
package com.rissi.ultimatedashboard

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextClock
import android.widget.TextView


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) 
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        
        //window.decorView.systemUiVisibility = (View.SYSTEM_UI_FLAG_IMMERSIVE
        val txtHora = findViewById<TextClock>(R.id.txtHora)
            txtHora.text
         val txtDatw = findViewById<textClock>(R.id.txtData)
             txtData.text
         val velocidade = findViewById<textEdit>(R.id.txtVelocidade)
         velocidade = 88
    }
    hideSystemBars();
    private fun hideSystemBars() {
  val windowInsetsController =
      ViewCompat.getWindowInsetsController(window.decorView) ?: return
  // Configure the behavior of the hidden system bars
  windowInsetsController.systemBarsBehavior =
      WindowInsetsControllerCompat.BEHAVIOR_SHOW_TRANSIENT_BARS_BY_SWIPE
  // Hide both the status bar and the navigation bar
  windowInsetsController.hide(WindowInsetsCompat.Type.systemBars())
}

      private fun showSystemUI() {
        window.decorView.systemUiVisibility = (View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                or View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                or View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN)
    }
}