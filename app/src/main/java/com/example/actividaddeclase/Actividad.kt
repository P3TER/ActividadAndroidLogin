package com.example.actividaddeclase

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun Actividad(){
    Conenedor()
}

@Composable
fun Conenedor() {
    Column(modifier = Modifier.fillMaxSize()) {
        Arriba()
        Abajo()
    }
}

@Composable
fun Arriba(){
    Column{
        Row(modifier = Modifier.height(80.dp)) {

        }
        Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.Center) {
            Image(painter = painterResource(id = R.drawable.not_found), contentDescription = "", modifier = Modifier
                .height(350.dp)
                .size(400.dp))
        }
        Row(modifier = Modifier
            .fillMaxWidth()
            .height(100.dp), horizontalArrangement = Arrangement.Center ) {
            Text(text = "Please use the link below to verify your\n" +
                    "      email and start your journey", fontSize = 20.sp)
        }
    }
}

@Composable
fun Abajo(){
    Column{
        Row(modifier = Modifier
            .fillMaxWidth()
            .height(200.dp), horizontalArrangement = Arrangement.Center ) {
            Button(onClick = { /*TODO*/ }, colors = ButtonDefaults.buttonColors(Color.Yellow), modifier = Modifier.width(300.dp)) {
                Text(text = "Verify Email", color = Color(0xFF000000))
                }
        }
        Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.Center, verticalAlignment = Alignment.Bottom) {
            Text(text = "Do you have any question?")
        }
}}

@Preview(showSystemUi = true, device = Devices.DEFAULT)
@Composable
fun PreviewActividad(){
    Actividad()
}