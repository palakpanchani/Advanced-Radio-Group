package com.palak.advancedradio.radio

import androidx.compose.ui.graphics.Color

/**
 * Data class representing a single radio option.
 * @param id unique identifier for the option
 * @param label the text to display
 * @param description optional secondary text
 * @param color optional color for custom styles
 */
data class AdvancedRadioOption(
    val id: String,
    val label: String,
    val description: String? = null,
    val color: Color? = null
)