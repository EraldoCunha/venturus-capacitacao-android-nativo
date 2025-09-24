package com.app.primeiroapp

import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }

    override fun onStart() {
        super.onStart()

        val layout = findViewById<ConstraintLayout>(R.id.main)
        layout.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        val title = findViewById<TextView>(R.id.text)
        val image = findViewById<ImageView>(R.id.image)
        if(title.text == getString(R.string.app_text)) {
            title.text = "Layout clicado!"
            image.setImageResource(R.drawable.ic_launcher_foreground)
        }else {
            title.text = getString(R.string.app_text)
            image.setImageResource(R.drawable.ic_launcher_background)
        }
    }

    override fun onResume() {
        super.onResume()
    }

    override fun onStop() {
        super.onStop()
    }

    override fun onPause() {
        super.onPause()
    }

    override fun onDestroy() {
        super.onDestroy()
    }

}