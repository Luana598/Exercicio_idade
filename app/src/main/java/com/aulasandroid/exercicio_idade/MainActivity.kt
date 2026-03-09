package com.aulasandroid.exercicio_idade

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.aulasandroid.exercicio_idade.ui.theme.Exercicio_IdadeTheme
import org.intellij.lang.annotations.JdkConstants

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
    // Váriáveis de estado dos elementos

    //primeira caixa de texto
    var idade by remember {
        mutableStateOf(0)
    }

    Column(modifier = modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ){
        Text(text = "Qual é a sua idade?",
            color = Color(137, 86, 227, 255),
            fontSize = 24.sp
        )

        Text(text = "Aperte os botões para informar sua idade")


        Text( modifier = Modifier.padding(24.dp),
            text = "$idade",
            fontSize = 36.sp)

        Row() {
            Button(modifier = Modifier,
                onClick = {
                    if (idade > 0 ){
                        idade -= 1
                    }
                },
                colors = ButtonDefaults.buttonColors(
                        containerColor = Color(137, 86, 227, 255),
                         contentColor = Color(219, 198, 255, 255)
                ),
                        shape = RoundedCornerShape(5.dp)
            ) {
                Text(text = "-",
                    fontSize = 35.sp)
            }

            Spacer(modifier = Modifier.width(16.dp))

            Button(modifier = Modifier,
                onClick = {if (idade < 99){
                    idade += 1
                } },
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color(137, 86, 227, 255),
                    contentColor = Color(219, 198, 255, 255)
                ),
                shape = RoundedCornerShape(5.dp)
                ) {
                Text(text = "+",
                    fontSize = 35.sp)
            }
        }

        Row(modifier = Modifier.padding(top = 24.dp)) {
            if (idade >= 18){
                Text(text = "Você é MAIOR de idade",
                    color = Color(137, 86, 227, 255),
                    fontSize = 24.sp)
            }else{
                Text(text = "Você é MENOR de idade",
                    color = Color(137, 86, 227, 255),
                    fontSize = 24.sp)
            }
        }
    }
}
