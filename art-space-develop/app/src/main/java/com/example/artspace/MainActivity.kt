package com.example.artspace

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.artspace.ui.theme.ArtSpaceTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ArtSpaceTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    ArtSpaceScreen()
                }
            }
        }
    }
}

@Composable
fun ArtSpaceScreen(modifier: Modifier = Modifier) {

    val firstArtwork = R.drawable.pele_face
    val secondArtwork = R.drawable.muhammad_face
    val thirdArtwork = R.drawable.federer_face
    val fourthArtwork = R.drawable.jordan_face
    val fifthArtwork = R.drawable.lebron_face
    val sixthArtwork = R.drawable.woods_face
    val seventhArtwork = R.drawable.phelps_face
    val eighthArtwork = R.drawable.bolt_face
    val ninethArtwork = R.drawable.serena_face
    val tenthArtwork = R.drawable.schumacher_face

    var title by remember { mutableStateOf(R.string.pele) }
    var year by remember { mutableStateOf(R.string.pele_description) }
    var currentArtwork by remember { mutableStateOf(firstArtwork) }
    var imageResource by remember { mutableStateOf(currentArtwork) }

    Column(
        modifier = modifier.fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally,
    ){
        Text(
            text = stringResource(R.string.nombre_codigo), fontSize = 25.sp
        )
        ArtworkImage(
            currentArtwork = currentArtwork
        )
        Spacer(
            modifier = modifier.size(16.dp)
        )
        ArtworkTitle(
            title = title,
            year = year,
        )
        Spacer(
            modifier = modifier.size(25.dp)
        )
        Row(
            modifier = modifier
                .padding(horizontal = 8.dp)
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Button(
                onClick = {
                    when (currentArtwork) {
                        firstArtwork -> {
                            currentArtwork = tenthArtwork
                            title = R.string.schumacher
                            year = R.string.schumacher_description
                        }
                        secondArtwork -> {
                            currentArtwork = firstArtwork
                            title = R.string.pele
                            year = R.string.pele_description
                        }
                        thirdArtwork -> {
                            currentArtwork = secondArtwork
                            title = R.string.muhammad
                            year = R.string.muhammad_description
                        }
                        fourthArtwork -> {
                            currentArtwork = thirdArtwork
                            title = R.string.federer
                            year = R.string.federer_description
                        }
                        fifthArtwork -> {
                            currentArtwork = fourthArtwork
                            title = R.string.jordan
                            year = R.string.jordan_description
                        }
                        sixthArtwork -> {
                            currentArtwork = fifthArtwork
                            title = R.string.leBron
                            year = R.string.leBron_description
                        }
                        seventhArtwork -> {
                            currentArtwork = sixthArtwork
                            title = R.string.woods
                            year = R.string.woods_description
                        }
                        eighthArtwork -> {
                            currentArtwork = seventhArtwork
                            title = R.string.phelps
                            year = R.string.phelps_description
                        }
                        ninethArtwork -> {
                            currentArtwork = eighthArtwork
                            title = R.string.bolt
                            year = R.string.bolt_description
                        }
                        else -> {
                            currentArtwork = ninethArtwork
                            title = R.string.serena
                            year = R.string.serena_description
                        }
                    }
                },
                colors = ButtonDefaults.buttonColors(
                    contentColor = colorResource(id = R.color.gray_900)
                ),
                elevation = ButtonDefaults.elevatedButtonElevation(
                    defaultElevation = 1.dp,
                    pressedElevation = 0.dp,
                    focusedElevation = 0.dp,
                )
            ) {
                Text(
                    text = stringResource(R.string.previous), fontSize = 15.sp
                )
            }
            Button(
                onClick = {

                    currentArtwork = firstArtwork
                    title = R.string.pele
                    year = R.string.pele_description

                }) {
                    Text(
                        text = stringResource(R.string.restart), fontSize = 15.sp
                    )
                }
            Button(
                onClick = {
                    when (currentArtwork) {
                        firstArtwork -> {
                            currentArtwork = secondArtwork
                            title = R.string.muhammad
                            year = R.string.muhammad_description
                        }
                        secondArtwork -> {
                            currentArtwork = thirdArtwork
                            title = R.string.federer
                            year = R.string.federer_description
                        }
                        thirdArtwork -> {
                            currentArtwork = fourthArtwork
                            title = R.string.jordan
                            year = R.string.jordan_description
                        }
                        fourthArtwork -> {
                            currentArtwork = fifthArtwork
                            title = R.string.leBron
                            year = R.string.leBron_description
                        }
                        fifthArtwork -> {
                            currentArtwork = sixthArtwork
                            title = R.string.woods
                            year = R.string.woods_description
                        }
                        sixthArtwork -> {
                            currentArtwork = seventhArtwork
                            title = R.string.phelps
                            year = R.string.phelps_description
                        }
                        seventhArtwork -> {
                            currentArtwork = eighthArtwork
                            title = R.string.bolt
                            year = R.string.bolt_description
                        }
                        eighthArtwork -> {
                            currentArtwork = ninethArtwork
                            title = R.string.serena
                            year = R.string.serena_description
                        }
                        ninethArtwork -> {
                            currentArtwork = thirdArtwork
                            title = R.string.schumacher
                            year = R.string.schumacher_description
                        }
                        else -> {
                            currentArtwork = firstArtwork
                            title = R.string.pele
                            year = R.string.pele_description
                        }
                    }
                },
                colors = ButtonDefaults.buttonColors(
                    contentColor = colorResource(id = R.color.gray_900)
                ),
                elevation = ButtonDefaults.elevatedButtonElevation(
                    defaultElevation = 1.dp,
                    pressedElevation = 0.dp,
                    focusedElevation = 0.dp
                ),
            ) {
                Text(
                    text = stringResource(R.string.next), fontSize = 15.sp
                )
            }
        }
    }
}

@Composable
fun ArtworkImage(
    modifier: Modifier = Modifier,
    @DrawableRes currentArtwork: Int
) {
    Image(
        painter = painterResource(id = currentArtwork),
        contentDescription = null,
        modifier = modifier.fillMaxWidth(),
        contentScale = ContentScale.FillWidth
    )
}

@Composable
fun ArtworkTitle(
    @StringRes title: Int,
    @StringRes year: Int,
) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = stringResource(id = title),
            fontWeight = FontWeight.Bold,
            color = colorResource(id = R.color.red),
            fontSize = 32.sp,
        )
        Text(
            text = stringResource(id = year),
            fontWeight = FontWeight.Medium,
            color = colorResource(id = R.color.black),
            fontSize = 16.sp,
        )
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    ArtSpaceTheme {
        ArtSpaceScreen()
    }
}

