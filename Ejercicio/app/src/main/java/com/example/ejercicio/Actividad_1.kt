package com.example.ejercicio

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.ejercicio.ui.theme.Orange

@Composable
fun Container(){
    Box(modifier = Modifier.fillMaxSize()){
        Content()
    }
}

@Composable
fun Content(){
    Column(modifier = Modifier.fillMaxSize(), verticalArrangement = Arrangement.SpaceAround){
        Filas(img = R.drawable.celular, descript = "######")
        Text(text = "Please use the link below to verify your email and start your journey",
            modifier = Modifier.fillMaxWidth(),
            textAlign = TextAlign.Center, fontSize = 20.sp)
        Button(onClick = { /*TODO*/ }, colors = ButtonDefaults.buttonColors(Orange),
            modifier = Modifier
                .fillMaxWidth()
                .padding(80.dp)) {
            Text(text = "VERIFY EMAIL", color = Color.Black)
        }
        Column(modifier = Modifier){
            Text(text = "Do you have any Question?",
                modifier = Modifier.fillMaxWidth(),
                textAlign = TextAlign.Center, fontSize = 20.sp)
            Text(text = "Other Link", color = Orange,
                modifier = Modifier.fillMaxWidth(),
                textAlign = TextAlign.Center, fontSize = 20.sp)
        }
    }
}

@Composable
fun Filas(
    img: Int,
    descript: String,
    modifier: Modifier = Modifier.fillMaxWidth()
){
    Row(modifier = modifier,
        horizontalArrangement = Arrangement.Center){
        Image(painter = painterResource(id = img), contentDescription = descript, modifier = Modifier
            .width(300.dp)
            .height(400.dp))
    }
}

@Preview(name = "container", showSystemUi = true, device = Devices.DEFAULT)
@Composable
private fun Actividad_1(){
    Container()
}