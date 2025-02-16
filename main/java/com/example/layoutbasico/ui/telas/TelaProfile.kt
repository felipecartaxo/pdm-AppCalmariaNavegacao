package com.example.layoutbasico.ui.telas

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier

@Composable
fun TelaProfile(modifier: Modifier = Modifier, onLogoffClick: () -> Unit) {
    Column (horizontalAlignment = Alignment.CenterHorizontally, modifier = modifier.fillMaxSize()) {
        Text(text = "Tela de profile aqui")
        //        Button(onClick = { onLogoffClick() }) {
        //            Text("Sair")
        //        }


    }
}