package com.example.mainactifitykt

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.graphics.Shadow
import androidx.compose.ui.input.pointer.motionEventSpy
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.modifier.modifierLocalMapOf
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.mainactifitykt.ui.theme.MainActifityktTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MainActifityktTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    BasicCompose(
                        farhan = Modifier.padding(innerPadding)

                    )
                }
            }
        }
    }
}
@Preview(showBackground = true )
@Composable
fun BasicCompose(farhan: Modifier = Modifier) {
    Column(
        modifier = farhan
            .fillMaxSize()
            .padding(10.dp),
        verticalArrangement = Arrangement.spacedBy(6.dp),
        horizontalAlignment = Alignment.CenterHorizontally){
        Text(text = "Login",
            fontSize = 30.sp,
            fontWeight = FontWeight.Bold,
            style = TextStyle(
                shadow = Shadow(
                    color = Color.Blue, // Menambahkan warna hijau untuk bayangan
                    offset = Offset(2f, 8f),  // Mengatur offset shadow
                    blurRadius = 8f  // Mengatur seberapa buram bayangan
                )
            )
        )
        Text(text = "ini halaman Login",
            fontSize = 22.sp,
            fontStyle = FontStyle.Normal,
            fontWeight = FontWeight.SemiBold,
            color = Color.Black)
        Image(painter = painterResource(id = R.drawable.umyy),
            contentDescription = null,
            modifier = farhan.size(150.dp)
                .padding(top = 10.dp)
        )
        Text(text = "Nama :",
            fontSize = 18.sp,
            fontWeight = FontWeight.SemiBold,
            style = TextStyle(
                shadow = Shadow(
                    color = Color.Blue, // Menambahkan warna hijau untuk bayangan
                    offset = Offset(2f, 8f),  // Mengatur offset shadow
                    blurRadius = 8f  // Mengatur seberapa buram bayangan
                )
            )
        )
        Text(text = "FARHAN NAIM DJAFAR.",
            fontSize =28.sp,
            fontWeight = FontWeight.Bold,
            color = Color.Black)
        Text(text = "20220140031",
            fontSize = 20.sp,
            style = TextStyle(
                shadow = Shadow(
                    color = Color.Blue, // Menambahkan warna hijau untuk bayangan
                    offset = Offset(2f, 8f),  // Mengatur offset shadow
                    blurRadius = 8f  // buram bayangan
                )
            )
        )
        Box(
            modifier = farhan
                .size(500.dp),
            contentAlignment = Alignment.Center  // Mengatur konten di tengah
        ){

            Box(
                modifier = farhan
                    .size(480.dp)
                    .clip(CircleShape)
                    .background(Color.Black.copy(alpha = 0.6f))
            )
            Image(
                painter = painterResource(id = R.drawable.alan),
                contentDescription = null,
                modifier = farhan
                    .size(480.dp)
                    .clip(RectangleShape),
                contentScale = ContentScale.Crop
            )
        }
    }
}
@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    MainActifityktTheme {
        Greeting("Android")
    }
}