package com.example.recepiapp.Screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.recepiapp.R

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun showSplash() {

    Column(
        modifier = Modifier
            .fillMaxSize()

    ) {
        Image(
            painter = painterResource(id = R.drawable.splash_banner),
            contentDescription = "",
            modifier = Modifier.fillMaxWidth() // Ensures image takes full width
        )
        Spacer(modifier = Modifier.height(100.dp)) // Adds space between the image and text
        Text(
            text = "Professional After-Sales Support",
            style = TextStyle(fontSize = 25.sp, color = Color.Blue, fontWeight = FontWeight.Bold),
            modifier = Modifier.align(Alignment.CenterHorizontally)
        )

        Text(
            text = "24 hours at Your Service", color = Color.Black, fontSize = 18.sp,
            modifier = Modifier.align(Alignment.CenterHorizontally)
        )

        Spacer(modifier = Modifier.height(100.dp))

        Box(
            modifier = Modifier
                .clip(RoundedCornerShape(60.dp))
                .background(Color.Blue)
                .padding(12.dp)
                .align(Alignment.CenterHorizontally)
        ) {
            Row(
                modifier = Modifier
                    .padding(horizontal = 40.dp, vertical = 5.dp)
            ) {
                Text(text = "Get Start",
                    fontSize = 18.sp,
                    color = Color.White,
                    modifier = Modifier.align(Alignment.CenterVertically))
                Spacer(modifier = Modifier.width(15.dp))
                Box(modifier = Modifier
                    .clip(CircleShape)
                    .background(Color.White)
                    .padding(12.dp))
                {
                    Image(
                        painter = painterResource(id = R.drawable.baseline_arrow_forward_24),
                        contentDescription = "",
                        colorFilter = ColorFilter.tint(color = Color.Blue)
                    )
                }
            }
        }

    }


}
