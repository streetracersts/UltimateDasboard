
package com.rissi.ultimatedashboard

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.core.view.WindowInsetsControllerCompat
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter
import java.time.format.FormatStyle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val current = LocalDateTime.now()
        val formatter = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM)
        val formatted = current.format(formatter)
        val velocidade = findViewById<TextView>(R.id.txtVelocidade)
         velocidade.text = 88.toString()
        val dataAtual = findViewById<TextView>(R.id.txtData)
        dataAtual.text = formatted
        hideSystemBars();
    }
    private fun hideSystemBars() {
        val windowInsetsController = ViewCompat.getWindowInsetsController(window.decorView) ?: return
         // Configure the behavior of the hidden system bars
         windowInsetsController.systemBarsBehavior =
         WindowInsetsControllerCompat.BEHAVIOR_SHOW_TRANSIENT_BARS_BY_SWIPE
         // Hide both the status bar and the navigation bar
         windowInsetsController.hide(WindowInsetsCompat.Type.systemBars())
    }

}