package com.example.mynewcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.mynewcompose.ui.theme.MyNewComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyNewComposeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    MyName("");
                }
            }
        }
    }
}

@Preview(
    name = "Preview 1",
    heightDp = 50,
    widthDp = 200,
    showBackground = true,
    showSystemUi = true,
    apiLevel = 33,
    device = Devices.NEXUS_5

)
@Composable
fun mySuperName() {
    MyName(name = "Alfonso")
}

@Composable
fun MyName(name: String) {
    Text(text = "Mario Valadez :( y tu $name", modifier = Modifier
        .fillMaxSize().padding(20.dp).clickable {  })
}


