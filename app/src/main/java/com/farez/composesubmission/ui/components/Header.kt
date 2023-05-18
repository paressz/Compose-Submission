package com.farez.composesubmission.ui.components

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage

@Composable
fun Header(
    url : String,
    name : String,
    desc : String,
    modifier: Modifier = Modifier,
) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = modifier
                .fillMaxWidth()
                .verticalScroll(rememberScrollState())
                .padding(bottom = 48.dp)
        ) {
            AsyncImage(
                model = url,
                contentDescription = null,
                modifier = modifier
                    .padding(start = 8.dp, end = 8.dp, bottom = 16.dp, top = 16.dp)
                    .clip(RoundedCornerShape(16.dp))
                    .size(300.dp)
            )
                Text(
                    text = name,
                    style = MaterialTheme.typography.h5,
                )
                Text(
                    text = desc,
                    style = MaterialTheme.typography.body1,
                    modifier = modifier
                        .padding(16.dp)
                )
        }
}

@Preview(showSystemUi = true)
@Composable
fun Headerprev() {
    Header("", "adsasdas", "DESKRipssapd")
}