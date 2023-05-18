package com.farez.composesubmission.ui.screen

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.farez.composesubmission.ui.components.Header

@Composable
fun AboutScreen() {
    Header(
        url =  "https://dicoding-web-img.sgp1.cdn.digitaloceanspaces.com/small/avatar/dos:dd1e10dfffa4b7affea76e3ac6da07a820230222154934.png",
        name = "Achmad Farez Syafei",
        desc = "farez0830@gmail.com"
    )
}

@Preview
@Composable
fun abourPrev() {
    AboutScreen()
}