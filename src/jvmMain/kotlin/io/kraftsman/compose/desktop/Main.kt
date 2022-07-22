package io.kraftsman.compose.desktop

import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import androidx.compose.ui.window.rememberWindowState
import io.kraftsman.compose.desktop.ui.components.LotteryBoard

fun main() = application {
    Window(
        title = "樂透抽獎程式",
        state = rememberWindowState(width = 550.dp, height = 650.dp),
        onCloseRequest = ::exitApplication
    ) {
        LotteryBoard()
    }
}
