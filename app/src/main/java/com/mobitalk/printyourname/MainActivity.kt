package com.mobitalk.printyourname

import android.os.Bundle
import android.graphics.Color
import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Set your name below :)
        your_name.text = "Harish Annam"
        // Set text color - Available colors : BLACK, BLUE, CYAN, GRAY, GREEN, MAGENTA, RED, WHITE, YELLOW
        your_name.setTextColor(Color.RED)
        // Font size must be in float. So pick your desired font size such as 20f or 40f
        your_name.textSize = 40f

        // Setting Font - Check app/src/mail/assets/fonts folder for list of font names
        val textFont = Typeface.createFromAsset(this.assets, "fonts/8bit.ttf")

        // You can also set the font as BOLD, ITALIC, BOLD_ITALIC
        your_name.setTypeface(textFont, Typeface.BOLD)
    }
}
