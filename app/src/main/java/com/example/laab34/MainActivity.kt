package com.example.laab34

import android.graphics.Color
import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.laab34.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding=ActivityMainBinding.inflate(layoutInflater)
        val view:ConstraintLayout=binding.root
        setContentView(view)

        binding.textView1.text = "Ім'я: Дарина Бикова"
        binding.textView2.text = "Група: ФІТ 4-7"
        binding.textView3.text = "Місто: Новгород-Северський"

        setTextColorChangeListener(binding.textView1)
        setTextColorChangeListener(binding.textView2)
        setTextColorChangeListener(binding.textView3)

        binding.buttonHide.setOnClickListener {
            binding.textView1.visibility = android.view.View.INVISIBLE
        }

        binding.buttonShow.setOnClickListener {
            binding.textView1.visibility = android.view.View.VISIBLE
        }
    }
    private fun setTextColorChangeListener(textView: TextView) {
        textView.setOnClickListener {
            textView.setTextColor(Color.GREEN)
        }
    }
}