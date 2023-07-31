package com.mobile.miftakhulilmanrifqi082.projectteorienam

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.mobile.miftakhulilmanrifqi082.projectteorienam.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btnTekan.setOnClickListener{
//            var name =  binding.txtPertama.text.toString()

            val showKedua = Intent(this, SecondActivity::class.java)
//            showKedua.putExtra("name",name)
            showKedua.putExtra("txtPertama", binding.txtPertama.text.toString())
            showKedua.putExtra("txtEdit", binding.editText.text.toString())

//            showKedua.putExtra(Intent.EXTRA_TEXT, binding.txtPertama.text.toString())
//            showKedua.putExtra(Intent.EXTRA_TEXT, binding.editText.text.toString())
            startActivity(showKedua)
        }
    }
}
