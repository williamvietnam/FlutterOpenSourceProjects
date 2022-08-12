package com.nbgsoftware.myinstagram.ui.features.personal

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import coil.compose.rememberAsyncImagePainter
import com.nbgsoftware.myinstagram.R

@Preview(showBackground = true)
@Composable
fun PersonalScreen() {

}

@Composable
fun PersonalToolbar(userName: String) {
    Row() {
        Text(text = userName)
        Image(painter = painterResource(id = R.drawable.ic_create), contentDescription = "Create")
        Image(painter = painterResource(id = R.drawable.ic_menu), contentDescription = "Menu")
    }
}

@Composable
fun PersonalInformation(avatar: String, name: String, description: String, urlWeb: String) {
    Column() {
        Image(
            painter = rememberAsyncImagePainter(avatar),
            contentDescription = null
        )

        Text(text = name)

        Text(text = description)

        Text(text = urlWeb)
    }
}

@Composable
fun FollowInformation(postAmount: String, followedAmount: String, followingAmount: String) {
    Row() {
        Column() {
            Text(text = postAmount)
            Text(text = "Bài đăng")
        }
        Column() {
            Text(text = followedAmount)
            Text(text = "Người theo dõi")
        }
        Column() {
            Text(text = followingAmount)
            Text(text = "Đang theo dõi")
        }
    }
}

