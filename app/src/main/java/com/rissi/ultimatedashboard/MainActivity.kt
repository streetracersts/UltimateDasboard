
package com.rissi.ultimatedashboard

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
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
    }
}