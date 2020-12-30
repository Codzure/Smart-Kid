package com.leon.smartkid

import android.annotation.SuppressLint
import android.content.Intent
import android.graphics.Typeface
import android.os.Bundle
import android.view.Gravity
import android.view.View
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.EditText
import android.widget.LinearLayout
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import java.util.*

class GuessTestActivity : AppCompatActivity() {
    private var presCounter = 0
    private var maxPresCounter = 4
    private var keys = arrayOf("f", "i", "b", "h", "s")
    private var textScreen: TextView? = null
    private var textQuestion: TextView? = null
    private var textTitle: TextView? = null
    private var smallbigforth: Animation? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_guess_test)

        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN

        smallbigforth = AnimationUtils.loadAnimation(this, R.anim.smallbigforth)
        keys = shuffleArray(keys)
        for (key in keys) {
            addView(findViewById<View>(R.id.layoutParent) as LinearLayout, key, findViewById<View>(R.id.editText) as EditText)
        }
        maxPresCounter = 4
    }

    private fun shuffleArray(ar: Array<String>): Array<String> {
        val rnd = Random()
        for (i in ar.size - 1 downTo 1) {
            val index = rnd.nextInt(i + 1)
            val a = ar[index]
            ar[index] = ar[i]
            ar[i] = a
        }
        return ar
    }

    @SuppressLint("SetTextI18n", "UseCompatLoadingForDrawables")
    private fun addView(viewParent: LinearLayout, text: String, editText: EditText) {
        val linearLayoutParams = LinearLayout.LayoutParams(
            LinearLayout.LayoutParams.WRAP_CONTENT,
            LinearLayout.LayoutParams.WRAP_CONTENT
        )
        linearLayoutParams.rightMargin = 4
        linearLayoutParams.leftMargin = 4
        val textView = TextView(this)
        textView.layoutParams = linearLayoutParams
        textView.background = this.resources.getDrawable(R.drawable.bgpink)
        textView.setTextColor(this.resources.getColor(R.color.colorPurple))
        textView.gravity = Gravity.CENTER
        textView.text = text
        textView.isClickable = true
        textView.isFocusable = true
        textView.textSize = 16f
        val typeface = Typeface.createFromAsset(assets, "fonts/FredokaOneRegular.ttf")
        textQuestion = findViewById<View>(R.id.textQuestion) as TextView
        textScreen = findViewById<View>(R.id.textScreen) as TextView
        textTitle = findViewById<View>(R.id.textTitle) as TextView
        textQuestion!!.typeface = typeface
        textScreen!!.typeface = typeface
        textTitle!!.typeface = typeface
        editText.typeface = typeface
        textView.typeface = typeface
        textView.setOnClickListener {
            if (presCounter < maxPresCounter) {
                if (presCounter == 0) editText.setText("")
                editText.setText(editText.text.toString() + text)
                textView.startAnimation(smallbigforth)
                textView.animate().alpha(0f).duration = 300
                presCounter++
                if (presCounter == maxPresCounter) doValidate()
            }
        }
        viewParent.addView(textView)
    }

    private fun doValidate() {
        presCounter = 0
        val editText = findViewById<EditText>(R.id.editText)
        val linearLayout = findViewById<LinearLayout>(R.id.layoutParent)
        val textAnswer = "fish"
        if (editText.text.toString() == textAnswer) {
            val a = Intent(this@GuessTestActivity, MainActivity::class.java)
            startActivity(a)
            finish()
        } else {
            Toast.makeText(this@GuessTestActivity, "Wrong", Toast.LENGTH_SHORT).show()
        }
        editText.setText("")
        keys = shuffleArray(keys)
        linearLayout.removeAllViews()
        for (key in keys) {
            addView(linearLayout, key, editText)
        }
    }
}