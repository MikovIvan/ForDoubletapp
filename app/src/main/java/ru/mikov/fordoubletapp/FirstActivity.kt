package ru.mikov.fordoubletapp

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import ru.mikov.fordoubletapp.databinding.ActivityFirstBinding

const val NUMBER = "number"
const val LIFECYCLE = "Lifecycle"

class FirstActivity : AppCompatActivity() {
    private lateinit var binding: ActivityFirstBinding
    var number = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first)
        binding = ActivityFirstBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.tvNumber.setOnClickListener {
            val intent = Intent(this, SecondActivity::class.java).apply {
                putExtra(NUMBER, number)
            }
            startActivity(intent)
        }

        Log.i(LIFECYCLE, "FirstActivity onCreate")
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        Log.i(LIFECYCLE, "FirstActivity onSaveInstanceState")
        outState.putInt(NUMBER, number)
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)

        number = savedInstanceState.getInt(NUMBER)
        number++
        Log.i(LIFECYCLE, "FirstActivity onRestoreInstanceState")
    }

    override fun onStart() {
        super.onStart()
        Log.i(LIFECYCLE, "FirstActivity onStart")
    }

    override fun onResume() {
        super.onResume()
        binding.tvNumber.text = number.toString()
        Log.i(LIFECYCLE, "FirstActivity onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.i(LIFECYCLE, "FirstActivity onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.i(LIFECYCLE, "FirstActivity onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i(LIFECYCLE, "FirstActivity onDestroy")
    }

    override fun onRestart() {
        super.onRestart()
        Log.i(LIFECYCLE, "FirstActivity onRestart")
    }
}