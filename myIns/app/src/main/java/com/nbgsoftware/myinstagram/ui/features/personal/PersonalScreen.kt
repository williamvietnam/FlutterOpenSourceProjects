package com.nbgsoftware.myinstagram.ui.features.personal

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion.White
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.*
import coil.compose.rememberAsyncImagePainter
import com.google.accompanist.pager.*
import com.nbgsoftware.myinstagram.R
import com.nbgsoftware.myinstagram.ui.theme.Primary
import kotlinx.coroutines.launch

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

/**
 * load image from url:
 *
 * https://stackoverflow.com/questions/58594262/how-do-i-load-url-into-image-into-drawimage-in-compose-ui-android-jetpack
 *
 *
 * https://coil-kt.github.io/coil/compose/
 * */
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

/**
 * ListView hàng ngang sdung LazyRow
 *
 * ListView dọc sdung LazyColumn
 * */
@Composable
fun PersonalStories() {
    LazyRow(contentPadding = PaddingValues(horizontal = 8.dp, vertical = 8.dp)) {

    }
}

/**
 * tabLayout để di chuyển giữa 3 tab: bài đăng, reels, kho lưu trữ bài đăng
 *
 *
 * https://www.geeksforgeeks.org/tab-layout-in-android-using-jetpack-compose/
 * */
@OptIn(ExperimentalPagerApi::class, ExperimentalUnitApi::class)
@ExperimentalPagerApi
@Composable
fun TabOptionList() {
    val pagerState = rememberPagerState(pageCount = 3)
    // on below line we are creating a column for our widgets.
    Column(
        // for column we are specifying modifier on below line.
        modifier = Modifier.background(White)
    ) {
        // on the below line we are specifying the top app bar
        // and specifying background color for it.
        TopAppBar(backgroundColor = Primary) {
            // on below line we are specifying a column
            // for our text view to display a text
            // in our top app bar.
            Column(
                modifier = Modifier.fillMaxSize(),
                // on below line we are providing alignment for our
                // column to center of our top app bar.
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {
                // on below line we are specifying a text and
                // specifying a text as "Tab Layout Example"
                Text(
                    text = "Tab Layout Example",
                    style = TextStyle(color = White),
                    fontWeight = FontWeight.Bold,
                    fontSize = TextUnit(
                        18F,
                        TextUnitType.Sp
                    ),
                    // on below line we are specifying a modifier
                    // to our text and adding passing from all sides.
                    modifier = Modifier.padding(all = Dp(5F)),
                    // on below line we are aligning
                    // our text to center.
                    textAlign = TextAlign.Center
                )
            }
        }
        // on below line we are calling tabs
        Tabs(pagerState = pagerState)
        // on below line we are calling tabs content
        // for displaying our page for each tab layout
        TabsContent(pagerState = pagerState)
    }
}

@ExperimentalPagerApi
@Composable
fun Tabs(pagerState: PagerState) {
    // in this function we are creating a list
    // in this list we are specifying data as
    // name of the tab and the icon for it.
    val list = listOf(
        "Posts" to Icons.Default.Home,
        "Reels" to Icons.Default.ShoppingCart,
        "PostStorages" to Icons.Default.Settings
    )
    // on below line we are creating
    // a variable for the scope.
    val scope = rememberCoroutineScope()
    // on below line we are creating a
    // individual row for our tab layout.
    TabRow(
        // on below line we are specifying
        // the selected index.
        selectedTabIndex = pagerState.currentPage,

        // on below line we are
        // specifying background color.
        backgroundColor = Primary,

        // on below line we are specifying content color.
        contentColor = White,

        // on below line we are specifying
        // the indicator for the tab
        indicator = { tabPositions ->
            // on below line we are specifying the styling
            // for tab indicator by specifying height
            // and color for the tab indicator.
            TabRowDefaults.Indicator(
                Modifier.pagerTabIndicatorOffset(pagerState, tabPositions),
                height = 2.dp,
                color = White
            )
        }
    ) {
        // on below line we are specifying icon
        // and text for the individual tab item
        list.forEachIndexed { index, _ ->
            // on below line we are creating a tab.
            Tab(
                // on below line we are specifying icon
                // for each tab item and we are calling
                // image from the list which we have created.
                icon = {
                    Icon(imageVector = list[index].second, contentDescription = null)
                },
                // on below line we are specifying the text for
                // the each tab item and we are calling data
                // from the list which we have created.
                text = {
                    Text(
                        list[index].first,
                        // on below line we are specifying the text color
                        // for the text in that tab
                        color = if (pagerState.currentPage == index) White else Color.LightGray
                    )
                },
                // on below line we are specifying
                // the tab which is selected.
                selected = pagerState.currentPage == index,
                // on below line we are specifying the
                // on click for the tab which is selected.
                onClick = {
                    // on below line we are specifying the scope.
                    scope.launch {
                        pagerState.animateScrollToPage(index)
                    }
                }
            )
        }
    }
}

@ExperimentalPagerApi
@Composable
fun TabsContent(pagerState: PagerState) {
    // on below line we are creating
    // horizontal pager for our tab layout.
    HorizontalPager(state = pagerState) {
        // on below line we are specifying
        // the different pages.
            page ->
        when (page) {
            // on below line we are calling tab content screen
            // and specifying data as Home Screen.
//  0 -> TabContentScreen(data = "Welcome to Posts")
            0 -> PostList()
            // on below line we are calling tab content screen
            // and specifying data as Shopping Screen.
//  1 -> TabContentScreen(data = "Welcome to Reels")
            1 -> ReelsList()
            // on below line we are calling tab content screen
            // and specifying data as Settings Screen.
//  2 -> TabContentScreen(data = "Welcome to PostStorage")
            2 -> PostStorageList()
        }
    }
}

/**
 * need fix here //todo
 * */
@Composable
fun TabContentScreen(data: String) {
    // on below line we are creating a column
    Column(
        // in this column we are specifying modifier
        // and aligning it center of the screen on below lines.
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        // in this column we are specifying the text
        Text(
            // on below line we are specifying the text message
            text = data,

            // on below line we are specifying the text style.
            style = MaterialTheme.typography.h5,

            // on below line we are specifying the text color
            color = Primary,

            // on below line we are specifying the font weight
            fontWeight = FontWeight.Bold,

            //on below line we are specifying the text alignment.
            textAlign = TextAlign.Center
        )
    }
}

/**
 * Danh sach bai dang
 * */
@Composable
fun PostList() {
    LazyVerticalGrid(columns = GridCells.Fixed(3)) {

    }
}

/**
 * Danh sach reels
 * */
@Composable
fun ReelsList() {

}

/**
 * Danh sach luu tru bai dang
 * */
@Composable
fun PostStorageList() {
    LazyVerticalGrid(columns = GridCells.Fixed(3)) {

    }
}