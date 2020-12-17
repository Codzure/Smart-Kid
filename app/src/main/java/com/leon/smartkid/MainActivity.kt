package com.leon.smartkid

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.core.content.ContentProviderCompat.requireContext
import com.leon.smartkid.common.Constants
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private var mUserName: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN

        setOnClickListener()
    }

    private fun setOnClickListener(){
        btnStart.setOnClickListener {
        if (userName.text.toString().isEmpty()){
            Toast.makeText(this, "Username is required", Toast.LENGTH_SHORT).show()
        }else
        {
            val intent = Intent(this,ChoiceActivity::class.java)
            intent.putExtra(Constants.USER_NAME, mUserName)
            startActivity(intent)
            finish()
        }
        }
    }
}