package com.example.ra2_03_crearunainterfazconlista

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            MaterialTheme {
                Lista()
            }
        }
    }
}

@Composable
fun Lista() {

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {

        // OBJETO 1
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .border(
                    3.dp,
                    Color.Blue,
                    RoundedCornerShape(20.dp)
                )
                .padding(10.dp)
        ) {

            Image(
                painter = painterResource(R.drawable.gato),
                contentDescription = "Gato",
                modifier = Modifier.size(80.dp)
            )

            Column(
                modifier = Modifier.padding(10.dp)
            ) {
                Text("Gato")
                Text("Animal doméstico y curioso.")
            }
        }

        Spacer(modifier = Modifier.height(15.dp))


        // OBJETO 2
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .border(
                    3.dp,
                    Color.Blue,
                    RoundedCornerShape(20.dp)
                )
                .padding(10.dp)
        ) {

            Image(
                painter = painterResource(R.drawable.perro),
                contentDescription = "Perro",
                modifier = Modifier.size(80.dp)
            )

            Column(
                modifier = Modifier.padding(10.dp)
            ) {
                Text("Perro")
                Text("Animal doméstico y fiel.")
            }
        }

        Spacer(modifier = Modifier.height(15.dp))


        // OBJETO 3
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .border(
                    3.dp,
                    Color.Blue,
                    RoundedCornerShape(20.dp)
                )
                .padding(10.dp)
        ) {

            Image(
                painter = painterResource(R.drawable.leon),
                contentDescription = "León",
                modifier = Modifier.size(80.dp)
            )

            Column(
                modifier = Modifier.padding(10.dp)
            ) {
                Text("León")
                Text("Gran felino que vive en África.")
            }
        }
    }
}