package com.palak.advancedradio.radio

import androidx.compose.animation.animateColorAsState
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

@Composable
fun CapsuleRadioGroup(
    options: List<AdvancedRadioOption>,
    selectedOptionId: String? = null,
    onOptionSelected: (AdvancedRadioOption) -> Unit,
    modifier: Modifier = Modifier,
    spacing: Dp = 8.dp
) {
    var selectedId by remember { mutableStateOf(selectedOptionId) }

    Row(modifier = modifier, horizontalArrangement = Arrangement.spacedBy(spacing)) {
        options.forEach { option ->
            val isSelected = option.id == selectedId
            val bgColor by animateColorAsState(
                targetValue = if (isSelected) MaterialTheme.colorScheme.primary else MaterialTheme.colorScheme.surfaceVariant
            )

            Box(
                modifier = Modifier
                    .clickable { selectedId = option.id; onOptionSelected(option) }
                    .background(bgColor, RoundedCornerShape(50))
                    .padding(horizontal = 16.dp, vertical = 8.dp)
            ) {
                Text(
                    text = option.label,
                    style = MaterialTheme.typography.bodyLarge,
                    color = if (isSelected) MaterialTheme.colorScheme.onPrimary else MaterialTheme.colorScheme.onSurface
                )
            }
        }
    }
}