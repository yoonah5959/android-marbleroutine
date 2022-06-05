package hennu.park.marbleroutine.main.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import hennu.park.marbleroutine.R

@Composable
fun PlusScreen() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(MaterialTheme.colors.primary)
    ) {
        Text(
            text = "test",
            style = MaterialTheme.typography.h1,
            textAlign = TextAlign.Center,
            color = Color.White,
            modifier = Modifier.align(Alignment.Center)
        )
    }
}