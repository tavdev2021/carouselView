package com.example.carouselview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.synnapps.carouselview.CarouselView
import com.synnapps.carouselview.ImageListener

class MainActivity : AppCompatActivity() {

    var imageArray : ArrayList<Int> = ArrayList()
    var carouselView : CarouselView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        imageArray.add(R.drawable.logo1)
        imageArray.add(R.drawable.logo2)
        imageArray.add(R.drawable.logo3)
        imageArray.add(R.drawable.logo4)
        imageArray.add(R.drawable.logo5)
        imageArray.add(R.drawable.logo6)

        carouselView = findViewById(R.id.carouselView)

        carouselView!!.pageCount = imageArray.size

        carouselView!!.setImageListener(imageListener)

        val btncerrar = findViewById<Button>(R.id.btnsalir)

        btncerrar.setOnClickListener {
           this.finishAffinity()
        }

    }

    var imageListener = ImageListener {
            position, imageView -> imageView.setImageResource(imageArray[position])
    }
}