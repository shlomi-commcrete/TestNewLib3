package com.example.mypackageclient

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.mylibrary.MyClass
import com.example.mylibrary.multiplyBy2
import com.example.mypackageclient.ui.theme.MyPackageClientTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyPackageClientTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting()
                }
            }
        }
    }
}

@Composable
fun Greeting() {
    var number by remember {mutableStateOf(1)}

    Column {
        Text(number.toString())

        Button(onClick = { number = multiplyBy2(x=number) }) {
            Text(text = "multiply")

        }
    }

}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    MyPackageClientTheme {
        Greeting()
    }
}