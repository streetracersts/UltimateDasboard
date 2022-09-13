
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
//import android.location.Location;
import android.location.LocationListener;
//import android.location.LocationManager;

class MainActivity : AppCompatActivity() implements LocationListener {
    LocationManager lm = (LocationManager) this.getSystemService(Context.LOCATION_SERVICE);
    lm.requestLocationUpdates(Location
    .GPS_PROVIDER, 0, 0, this);
    this.onLocationCahnged(null);
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val current = LocalDateTime.now()
        val formatter = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM)
        val formatted = current.format(formatter)
        val velocidade = findViewById<TextView>(R.id.txtVelocidade)
         velocidade.text = 88//.location.getSpeed().toString
        val dataAtual = findViewById<TextView>(R.id.txtData)
        dataAtual.text = formatted
        hideSystemBars();
    }
    public void onLocationCahnged(Location location){
        if (location==null){
            velocidade.text = "0 km/h";
        }else{
            int speed = (int) ((location.getSpeed()*3600)/1000));
            velocidade.text = speed+" km/h";
        }
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