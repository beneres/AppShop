package com.bernardo.onlineshopping_bernardo.utils

import android.util.AttributeSet
import android.content.Context
import android.graphics.Typeface
import androidx.appcompat.widget.AppCompatEditText

class MSPEditText (context: Context, attrs: AttributeSet) : AppCompatEditText(context, attrs) {

    init {
        applyFont()
    }

    private fun applyFont() {
        val typeface: Typeface =
            Typeface.createFromAsset(context.assets, "Montserrat-Regular.ttf")
        setTypeface(typeface)
    }
}