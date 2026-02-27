package com.palak.advanceradiobutton

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.palak.advancedradio.radio.AdvancedRadioGroup
import com.palak.advancedradio.radio.AdvancedRadioOption
import com.palak.advancedradio.radio.CapsuleRadioGroup
import com.palak.advancedradio.radio.IconRadioGroup
import com.palak.advancedradio.radio.OutlinedRadioGroup
import com.palak.advancedradio.radio.RadioOption
import com.palak.advanceradiobutton.ui.theme.AdvanceRadioButtonTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme{
                AdvanceRadioButton()
            }
        }
    }

    @Preview
    @Composable
    fun PreviewMethod(){
        MaterialTheme{
            AdvanceRadioButton()
        }
    }


    @Composable
    fun AdvanceRadioButton() {
        val scrollState = rememberScrollState()

        // Sample options
        val options = listOf(
            AdvancedRadioOption(id = "1", label = "Option 1"),
            AdvancedRadioOption(id = "2", label = "Option 2"),
            AdvancedRadioOption(id = "3", label = "Option 3")
        )

        // Track selected option
        var selectedOption by remember { mutableStateOf<String?>(null) }

        Column(
            modifier = Modifier
                .verticalScroll(scrollState)
                .fillMaxSize()
                .padding(24.dp),
            verticalArrangement = Arrangement.spacedBy(16.dp)
        ) {
        /*    Text(text = "Rounded pill-shaped buttons:", style = MaterialTheme.typography.titleMedium)

            CapsuleRadioGroup(
                options = options,
                selectedOptionId = selectedOption,
                onOptionSelected = { option ->
                    selectedOption = option.id
                }
            )

            Spacer(modifier = Modifier.height(24.dp))


          Text(text = " Uses icons for selection:", style = MaterialTheme.typography.titleMedium)

            IconRadioGroup(
                options = options,
                selectedOptionId = selectedOption,
                onOptionSelected = { option ->
                    selectedOption = option.id
                }
            )

            Spacer(modifier = Modifier.height(24.dp))
*/
              Text(text = "Outlined boxes with custom colors:", style = MaterialTheme.typography.titleMedium)

             OutlinedRadioGroup(
                 options = options,
                 selectedOptionId = selectedOption,
                 onOptionSelected = { option ->
                     selectedOption = option.id
                 }
             )

             Spacer(modifier = Modifier.height(24.dp))

        }
    }
}