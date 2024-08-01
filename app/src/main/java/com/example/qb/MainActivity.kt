package com.example.qb

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.qb.ui.theme.QBTheme

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.ui.res.painterResource

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.ui.draw.clip
import androidx.compose.ui.unit.dp
import androidx.compose.material3.*
import android.content.res.Configuration
import androidx.compose.foundation.BorderStroke
import androidx.compose.ui.Alignment
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.unit.sp
import com.example.qb.ui.theme.gold
import com.example.qb.ui.theme.gray_dark
import com.example.qb.ui.theme.gray_light
import com.example.qb.ui.theme.qBFont


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            QBTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    logo_main(modifier = Modifier.padding(innerPadding))
                }
            }
        }
    }
}

@Composable
fun logo_main(modifier: Modifier = Modifier) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .padding(40.dp)
    ) {
        Image(
            painter = painterResource(R.drawable.logo),
            contentDescription = "Contact profile picture",
        )
        Column(
            modifier = Modifier
                .padding(vertical = 40.dp)
        )
        {
            ElevatedButton(onClick = {},
                shape = RectangleShape,
                colors = ButtonDefaults.buttonColors(
                    containerColor = gray_light, // Background color
                    contentColor = gray_dark   // Text color
                ),
                elevation = ButtonDefaults.buttonElevation(
                    defaultElevation = 12.dp, // Elevation when the button is in its default state
                    pressedElevation = 4.dp, // Elevation when the button is pressed
                    disabledElevation = 0.dp // Elevation when the button is disabled
                ),
                modifier = Modifier
                    .padding(vertical = 10.dp)
                    .fillMaxWidth()
                    .weight(2F)
            ) {
                Text("play",
                    fontFamily = qBFont,
                    fontSize = 40.sp)
            }
            ElevatedButton(onClick = {},
                shape = RectangleShape,
                colors = ButtonDefaults.buttonColors(
                    containerColor = gray_light, // Background color
                    contentColor = gray_dark   // Text color
                ),
                elevation = ButtonDefaults.buttonElevation(
                    defaultElevation = 12.dp, // Elevation when the button is in its default state
                    pressedElevation = 4.dp, // Elevation when the button is pressed
                    disabledElevation = 0.dp // Elevation when the button is disabled
                ),
                modifier = Modifier
                    .padding(vertical = 10.dp)
                    .fillMaxWidth()
                    .weight(1F)
            ) {
                Text("tutorial",
                    fontFamily = qBFont,
                    fontSize = 24.sp)
            }
            ElevatedButton(onClick = {},
                shape = RectangleShape,
                colors = ButtonDefaults.buttonColors(
                    containerColor = gray_light, // Background color
                    contentColor = gray_dark   // Text color
                ),
                elevation = ButtonDefaults.buttonElevation(
                    defaultElevation = 12.dp, // Elevation when the button is in its default state
                    pressedElevation = 4.dp, // Elevation when the button is pressed
                    disabledElevation = 0.dp // Elevation when the button is disabled
                ),
                modifier = Modifier
                    .padding(vertical = 10.dp)
                    .fillMaxWidth()
                    .weight(1F)
            ) {
                Text("thanks",
                    fontFamily = qBFont,
                    fontSize = 24.sp)
            }
        }
    }

}

@Preview(showBackground = true)
@Composable
fun logo_main_preview() {
    QBTheme {
        Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
            logo_main(modifier = Modifier.padding(innerPadding))
        }
    }
}