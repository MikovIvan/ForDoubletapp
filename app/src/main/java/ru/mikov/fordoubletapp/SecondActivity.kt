package ru.mikov.fordoubletapp

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import ru.mikov.fordoubletapp.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySecondBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        binding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val number = intent.getIntExtra(NUMBER, 0)
        binding.tvSquareNumber.text = (number * number).toString()

        Log.i("Lifecycle", "SecondActivity onCreate")
    }

    override fun onStart() {
        super.onStart()
        Log.i("Lifecycle", "SecondActivity onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.i("Lifecycle", "SecondActivity onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.i("Lifecycle", "SecondActivity onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.i("Lifecycle", "SecondActivity onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i("Lifecycle", "SecondActivity onDestroy")
    }

    override fun onRestart() {
        super.onRestart()
        Log.i("Lifecycle", "SecondActivity onRestart")
    }
}