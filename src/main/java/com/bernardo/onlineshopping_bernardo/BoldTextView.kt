package com.bernardo.onlineshopping_bernardo

import androidx.appcompat.widget.AppCompatTextView
import android.util.AttributeSet
import android.content.Context
import android.graphics.Typeface

class BoldTextView(context: Context, attributeSet: AttributeSet)
    : AppCompatTextView(context, attributeSet) {

        init {
            applyFont()
        }

    private fun applyFont(){
        val boldTypeface: Typeface =
            Typeface.createFromAsset(context.assets, "Montserrat-Bold.ttf")
        typeface = boldTypeface
    }
}