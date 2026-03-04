package com.aulasandroid.exercicio_idade

import android.graphics.Color
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.aulasandroid.exercicio_idade.ui.theme.Exercicio_IdadeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Exercicio_IdadeTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    TelaIdade(modifier = Modifier.padding(innerPadding))
                }
            }
        }
    }
}


@Composable
fun TelaIdade(modifier: Modifier = Modifier) {
    Column(modifier = Modifier.fillMaxWidth()
        .background(androidx.compose.ui.graphics.Color.White)
    ){
        Row() {
            Text(text = "Qual é a sua idade?")
        }
        Row() {
        Text(text = "Aperte os botões para informar sua idade")
        }
        Box(){}
        Row() {
        }
        Row() { }
    }
}
