package com.farez.composesubmission.ui.components

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Divider
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage

@Composable
fun MessengerItem(
    name : String,
    url : String,
    modifier: Modifier = Modifier,
) {
    Row(
        modifier = modifier.padding(bottom = 16.dp, top = 16.dp)
        ) {
            AsyncImage(
                model = url,
                contentDescription = "image of $name",
                contentScale = ContentScale.Crop,
                modifier = modifier
                    .padding(start = 8.dp, end = 8.dp)
                    .clip(RoundedCornerShape(16.dp))
                    .size(75.dp))
            Text(
                text = name,
                fontWeight = FontWeight.Medium,
                modifier = modifier
                    .fillMaxWidth()
                    .weight(1f)
                    .size(75.dp)
                    .wrapContentHeight(align = Alignment.CenterVertically),

            )
        }
        Divider(thickness = 1.dp, color = Color.LightGray)
}

@Preview(showBackground = true)
@Composable
fun preview() {
    MessengerItem(
        name = "asdad",
        url = "https://apkmodders.com/wp-content/uploads/2019/12/Mystic-Messenger-1024x1024.jpg",
    )
}