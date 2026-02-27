package com.palak.advancedradio.radio

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

/**
 * A customizable, Material 3 styled Advanced Radio Group.
 *
 * @param options List of RadioOption
 * @param selectedOptionId Optional pre-selected option id
 * @param onOptionSelected Callback when an option is selected
 * @param modifier Modifier for outer container
 */
@Composable
fun AdvancedRadioGroup(
    options: List<RadioOption>,
    selectedOptionId: String? = null,
    onOptionSelected: (RadioOption) -> Unit,
    modifier: Modifier = Modifier
) {
    var selectedId by remember { mutableStateOf(selectedOptionId) }

    Column(modifier = modifier) {
        options.forEach { option ->
            val isSelected = option.id == selectedId
            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 4.dp)
                    .clickable {
                        selectedId = option.id
                        onOptionSelected(option)
                    },
                shape = RoundedCornerShape(12.dp),
                colors = CardDefaults.cardColors(
                    containerColor = if (isSelected) MaterialTheme.colorScheme.primary.copy(alpha = 0.2f)
                    else MaterialTheme.colorScheme.surface
                )
            ) {
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier
                        .padding(16.dp)
                ) {
                    RadioButton(
                        selected = isSelected,
                        onClick = {
                            selectedId = option.id
                            onOptionSelected(option)
                        },
                        colors = RadioButtonDefaults.colors(
                            selectedColor = MaterialTheme.colorScheme.primary
                        )
                    )

                    Spacer(modifier = Modifier.width(12.dp))

                    Column {
                        Text(
                            text = option.label,
                            style = MaterialTheme.typography.bodyLarge,
                            color = MaterialTheme.colorScheme.onSurface
                        )
                        option.description?.let {
                            Text(
                                text = it,
                                style = MaterialTheme.typography.bodyMedium,
                                color = MaterialTheme.colorScheme.onSurfaceVariant
                            )
                        }
                    }
                }
            }
        }
    }
}