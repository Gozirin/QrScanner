

package com.prof18.secureqrreader.screens

import android.content.res.Configuration
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.prof18.secureqrreader.R.drawable
import com.prof18.secureqrreader.R.string
import com.prof18.secureqrreader.style.Margins
import com.prof18.secureqrreader.style.SecureQrReaderTheme

@Composable
internal fun WelcomeScreen(
    onStartClick: () -> Unit = {},
) {
    Column(
        modifier = Modifier.fillMaxSize(),
    ) {
        LazyColumn(
            modifier = Modifier.weight(1f)
        ) {
            item {
                Text(
                    modifier = Modifier
                        .padding(top = Margins.big)
                        .fillMaxWidth()
                        .wrapContentWidth(align = Alignment.CenterHorizontally),
                    color = MaterialTheme.colors.onBackground,
                    text = stringResource(id = string.app_name),
                    style = MaterialTheme.typography.h1.copy(fontSize = 28.sp),
                )
            }
            item {
                Text(
                    modifier = Modifier
                        .padding(horizontal = Margins.big)
                        .padding(top = Margins.big),
                    color = MaterialTheme.colors.onBackground,
                    text = stringResource(id = string.welcome_screen_content),
                    style = MaterialTheme.typography.body1,
                )
            }
            item {
                Image(
                    painter = painterResource(id = drawable.privacy_vector),
                    contentDescription = null,
                )
            }
        }
        Button(
            modifier = Modifier
                .align(Alignment.End)
                .padding(Margins.regular),
            onClick = onStartClick
        ) {
            Text(stringResource(id = string.welcome_screen_button))
        }
    }
}

@Preview
@Preview(uiMode = Configuration.UI_MODE_NIGHT_YES)
@Preview(device = Devices.AUTOMOTIVE_1024p, widthDp = 720, heightDp = 360)
@Composable
private fun WelcomeScreenPreview() {
    SecureQrReaderTheme {
        Surface {
            WelcomeScreen()
        }
    }
}
