package nl.cpaglebbeek.quickbasic

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

// v0.0.1-Gates — skeleton placeholder.
// v0.6.0-Lampson — WebView wrapper around QuickBasicEmulator_Web build.

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                Surface {
                    Column(modifier = Modifier.padding(24.dp)) {
                        Text("QuickBasicEmulator", style = MaterialTheme.typography.headlineMedium)
                        Spacer(Modifier.height(8.dp))
                        Text("v0.0.1-Gates — skeleton placeholder")
                        Text("WebView runtime arrives v0.6.0-Lampson")
                    }
                }
            }
        }
    }
}
