package com.leon.smartkid

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.leon.smartkid.animals.AnimalQuestionsActivity
import com.leon.smartkid.english.EnglishQuestionsActivity
import com.leon.smartkid.maths.MathQuestionsActivity
import com.leon.smartkid.shapes.ShapeQuestionsActivity
import kotlinx.android.synthetic.main.activity_choice.*

class ChoiceActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_choice)
        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN

        setUpData()

        animalsOptionOne.setOnClickListener(this)
        englishOptionOne.setOnClickListener(this)
        mathOptionOne.setOnClickListener(this)
        shapeOptionOne.setOnClickListener(this)
    }

    private fun setUpData(){
        animalsOptionOne.text = "Animals"
        mathOptionOne.text = "Maths"
        englishOptionOne.text = "English"
        shapeOptionOne.text = "Shapes"
    }

    override fun onClick(v: View?) {

        when (v?.id) {
            R.id.animalsOptionOne -> {
                val intent = Intent(this, AnimalQuestionsActivity::class.java)
                startActivity(intent)
            }

            R.id.englishOptionOne -> {
                val intent = Intent(this, EnglishQuestionsActivity::class.java)
                startActivity(intent)
            }

            R.id.mathOptionOne -> {
                val intent = Intent(this, MathQuestionsActivity::class.java)
                startActivity(intent)
            }

            R.id.shapeOptionOne -> {
                val intent = Intent(this, ShapeQuestionsActivity::class.java)
                startActivity(intent)
            }
        }
    }


}