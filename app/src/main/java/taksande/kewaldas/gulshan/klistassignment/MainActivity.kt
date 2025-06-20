package taksande.kewaldas.gulshan.klistassignment

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import taksande.kewaldas.gulshan.klistassignment.klist.KList
import taksande.kewaldas.gulshan.klistassignment.ui.KListDemo
import taksande.kewaldas.gulshan.klistassignment.ui.theme.KListAssignmentTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            KListAssignmentTheme {
                KListDemo()
            }
        }
    }
}
