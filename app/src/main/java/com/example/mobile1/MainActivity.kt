package com.example.mobile1

import android.graphics.Color
import android.graphics.LinearGradient
import android.graphics.Rect
import android.graphics.Shader
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tv = findViewById<TextView>(R.id.card_one_replies)

        val textShader: Shader = LinearGradient(0f, tv.textSize, 0f, 0f, intArrayOf(
            Color.parseColor("#8E67BE"),
            Color.parseColor("#1A73E9"),
        ), null, Shader.TileMode.REPEAT)

        tv.paint.shader = textShader

        findViewById<TextView>(R.id.card_two_replies).paint.shader = textShader
        findViewById<TextView>(R.id.card_three_replies).paint.shader = textShader

        val account_tv = findViewById<TextView>(R.id.account_text)

        val paint = account_tv.paint
        val width = account_tv.paint.measureText(account_tv.text.toString())

        val accountTextShader: Shader = LinearGradient(0f, account_tv.textSize, width, 0f, intArrayOf(
            Color.parseColor("#6C92F4"),
            Color.parseColor("#1A73E9"),
        ), null, Shader.TileMode.REPEAT)
    }
}