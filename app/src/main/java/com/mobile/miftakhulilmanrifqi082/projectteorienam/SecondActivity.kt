package com.mobile.miftakhulilmanrifqi082.projectteorienam

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.mobile.miftakhulilmanrifqi082.projectteorienam.databinding.ActivityKeduaBinding

class SecondActivity : AppCompatActivity() {

    private lateinit var binding : ActivityKeduaBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityKeduaBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var intentThatStartedThisActivity = getIntent()
        var b = intentThatStartedThisActivity.getStringExtra("txtPertama").toString()
        var c = intentThatStartedThisActivity.getStringExtra("txtEdit").toString()
        binding.txtKedua.text = b + " dan " + c

//        if (intentThatStartedThisActivity.hasExtra(Intent.EXTRA_TEXT)) {
//            var partId = intentThatStartedThisActivity.getStringExtra(Intent.EXTRA_TEXT)
//            binding.txtKedua.text  = partId.toString()
//        }
    }
}
