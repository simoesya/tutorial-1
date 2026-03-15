package com.example.helloworldoptional

import android.annotation.SuppressLint
import android.os.Build
import android.os.Bundle
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val infoText = findViewById<EditText>(R.id.infoText)
        val texto =
            "Manufacturer: " + Build.MANUFACTURER +
                    "\nModel: " + Build.MODEL +
                    "\nBrand: " + Build.BRAND +
                    "\nType: " + Build.TYPE +
                    "\nUser: " + Build.USER +
                    "\nBase: " + Build.VERSION.BASE_OS +
                    "\nIncremental: " + Build.VERSION.INCREMENTAL +
                    "\nSDK: " + Build.VERSION.SDK_INT +
                    "\nVersion Code: " + Build.VERSION.RELEASE +
                    "\nDisplay: " + Build.DISPLAY

        infoText.setText(texto)
    }
}