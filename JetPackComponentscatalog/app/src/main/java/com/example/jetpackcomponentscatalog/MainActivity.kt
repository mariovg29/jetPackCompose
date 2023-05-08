package com.example.jetpackcomponentscatalog

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.jetpackcomponentscatalog.ui.theme.JetPackComponentscatalogTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetPackComponentscatalogTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Column() {


                        myTextFieldOutlined()
                    }
                }
            }
        }
    }
}

@Composable
fun myTextFieldOutlined() {
    var mytextField by remember { mutableStateOf("") }
    OutlinedTextField(
        value = mytextField,
        onValueChange = { mytextField = it },
        modifier = Modifier.padding(24.dp),
        label = {Text(text= "Holita")},
        colors = TextFieldDefaults.outlinedTextFieldColors(
            focusedBorderColor = Color.Blue,
            unfocusedBorderColor = Color.Magenta

        )
    )

}

@Composable
fun mytextfieldAdvanced() {
    var mytextField by remember { mutableStateOf("") }
    TextField(value = mytextField, onValueChange = {
        mytextField = if (it.contains("a")) {
            it.replace("a", "")
        } else {
            it
        }
    },
        label = { Text(text = "Type your name here") })

}

@Composable
fun myTextfield() {
    var mytextField by remember { mutableStateOf("") }
    TextField(value = mytextField, onValueChange = { mytextField = it })
}

@Composable
fun myText() {

    Column(Modifier.fillMaxSize()) {

        Text(text = "This is a String example ")
        Text(text = "This is a String example2 ", color = Color.Blue)
        Text(text = "This is a String example ", fontWeight = FontWeight.Bold)
        Text(text = "This is a String example ", fontWeight = FontWeight.Light)
        Text(text = "This is a String example ", style = TextStyle(fontFamily = FontFamily.Cursive))
        Text(
            text = "This is a String example ",
            style = TextStyle(textDecoration = TextDecoration.LineThrough)
        )
        Text(
            text = "This is a String example ",
            style = TextStyle(textDecoration = TextDecoration.Underline)
        )
        Text(
            text = "This is a String example ",
            style = TextStyle(textDecoration = TextDecoration.Underline)
        )
        Text(text = "This is a String example ", fontSize = 30.sp)

    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    JetPackComponentscatalogTheme {
        myTextFieldOutlined()
    }
}