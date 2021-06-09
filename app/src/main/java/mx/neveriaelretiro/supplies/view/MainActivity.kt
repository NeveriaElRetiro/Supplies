package mx.neveriaelretiro.supplies.view

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import mx.neveriaelretiro.supplies.R
import mx.neveriaelretiro.supplies.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {

        Thread.sleep(2000)
        setTheme(R.style.Theme_AppCompat_NoActionBar)
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.fabSendList.setOnClickListener { Toast.makeText(this,"Worked with binding",Toast.LENGTH_SHORT).show() }
    }
}