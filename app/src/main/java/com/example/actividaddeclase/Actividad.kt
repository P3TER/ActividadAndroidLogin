package com.example.actividaddeclase

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldColors
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun Actividad(){
    val pagerState = rememberPagerState(initialPage = 0) {
        2
    }
    Box(modifier = Modifier.fillMaxSize()){
        HorizontalPager(state = pagerState, modifier = Modifier.fillMaxSize()) {
                page ->  when(page){
            0 -> FirstPage()
            1 -> SecondPage()
        }
        }
    }
}

@Composable
fun SecondPage() {
    Column(modifier = Modifier
        .fillMaxSize()
        .background(Color(0xffffffff))) {
        Arriba()
        Abajo()
    }
}

@Composable
fun FirstPage(){
    Column(modifier = Modifier
        .fillMaxSize()
        .background(Color(0xffffffff))) {
        UpperLogin()
        MiddleLogin()
        LowerLogin()
    }
}

@Composable
fun UpperLogin(){
    Column{
        Row(modifier = Modifier.height(50.dp)) {

        }
        Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.Center) {
            Image(painter = painterResource(id = R.drawable.avatar), contentDescription = "", modifier = Modifier
                .size(220.dp))
        }
        Row(modifier = Modifier
            .fillMaxWidth(),
            horizontalArrangement = Arrangement.Center ) {
            Text(text = "Welcome to LemonPie!", fontSize = 23.sp, fontWeight = FontWeight.Bold)
        }
        Row(modifier = Modifier
            .fillMaxWidth()
            .height(70.dp),
            horizontalArrangement = Arrangement.Center )  {
            Text(text = "Keep your data save", fontSize = 17.sp)
        }
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
fun LowerLogin(){
    Column{
        Row(modifier = Modifier
            .fillMaxWidth(),
            horizontalArrangement = Arrangement.Center ) {
            Button(onClick = { /*TODO*/ }, colors = ButtonDefaults.buttonColors(Color.Yellow), modifier = Modifier.width(300.dp)) {
                Text(text = "Login", color = Color(0xFF000000))
            }
        }
        Row (modifier = Modifier
            .fillMaxWidth()
            .height(170.dp), horizontalArrangement = Arrangement.Center ){
            Text(text = "Forgot password?", color = Color(0xFFF9D726))
        }
        Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.Center, verticalAlignment = Alignment.Bottom) {
            Text(text = "Don't have an account?  ")
            Text(text = "Register!", color = Color(0xFFF9D726))
        }
    }}

@Composable
fun MiddleLogin(){
    var user by remember {
        mutableStateOf("")
    }
    var pass by remember {
        mutableStateOf("")
    }
    Column {
        Row(modifier = Modifier
            .fillMaxWidth()
            .height(60.dp),
            horizontalArrangement = Arrangement.Center ){
            OutlinedTextField(value = user, onValueChange = {
                user = it
            }, label = {
                Text(text = "Email")
            }, placeholder = {
                Text(text = "Peter@hog.com")
            }, shape = RoundedCornerShape(20.dp))
        }
        Row(modifier = Modifier
            .fillMaxWidth()
            .height(90.dp),
            horizontalArrangement = Arrangement.Center ) {
            OutlinedTextField(value = pass, onValueChange = {
                pass = it
            }, label = {
                Text(text = "Password")
            }, shape = RoundedCornerShape(20.dp))
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