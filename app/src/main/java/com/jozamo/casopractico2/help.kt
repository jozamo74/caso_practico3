package com.jozamo.casopractico2

import java.math.RoundingMode
import java.text.DecimalFormat
import java.text.DecimalFormatSymbols
import java.util.*

/**
 * Created by Jośe Zambrano on 28,abril,2021
 */

fun Double.roundToDecimalPlace(): Double {
    val df = DecimalFormat("#.####", DecimalFormatSymbols(Locale.ENGLISH)).apply {
        roundingMode = RoundingMode.HALF_UP
    }
    return df.format(this).toDouble()
}