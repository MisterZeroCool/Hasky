package ru.agavrilyuk

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.animation.AnimationUtils
import ru.agavrilyuk.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        //initialize animations

        var fade_in = AnimationUtils.loadAnimation(this, R.anim.fade_in)
        var bottom_down = AnimationUtils.loadAnimation(this, R.anim.button_down)

        //setting the bottom down animations on top layout

        binding.topLinearLayout.animation = bottom_down

        //create handler for layouts
        var handler = Handler()
        var runnable = Runnable {
            binding.cardView.animation = fade_in
            binding.cardView2.animation = fade_in
            binding.cardView3.animation = fade_in
            binding.textView.animation = fade_in
            binding.textView2.animation = fade_in
            binding.registerLayout.animation = fade_in
        }

        handler.postDelayed(runnable,1000)
    }
}