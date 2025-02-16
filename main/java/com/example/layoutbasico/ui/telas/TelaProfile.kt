package com.example.layoutbasico.ui.telas

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.layoutbasico.R

@Composable
fun TelaProfile(modifier: Modifier = Modifier, onLogoffClick: () -> Unit) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        // Foto de Perfil
        Image(
            painter = painterResource(id = R.drawable.profile_photo),
            contentDescription = "Foto de perfil",
            modifier = Modifier
                .size(150.dp)
                // .clip(CircleShape) // Se a imagem fosse circular, ficaria melhor
        )

        // Espaçamento entre a foto e o nome do perfil
        Spacer(modifier = Modifier.height(16.dp))

        // Principais informações do perfil
        // Nome
        Text(
            text = "Maria da Silva",
            fontSize = 22.sp,
            fontWeight = FontWeight.Bold
        )
        // Email
        Text(
            text = "mariasilva96@gmail.com",
            fontSize = 16.sp,
            color = MaterialTheme.colorScheme.secondary
        )

        // Espaçamento entre as informações primárias e secundárias
        Spacer(modifier = Modifier.height(48.dp))

        // Informações secundárias
        ProfileInfo(label = "Idade", value = "28 anos")
        ProfileInfo(label = "Cidade", value = "Campina Grande, PB")
        ProfileInfo(label = "Profissão", value = "Desenvolvedora Backend")
        ProfileInfo(label = "Stack", value = "Java | SpringBoot | SQL")

        Spacer(modifier = Modifier.height(32.dp))
    }
}

// Composable customizado para exibir informações secundárias
@Composable
fun ProfileInfo(label: String, value: String) {
    Row(
        horizontalArrangement = Arrangement.SpaceBetween,
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 32.dp, vertical = 4.dp)
    ) {
        Text(text = label, fontWeight = FontWeight.Bold)
        Text(text = value)
    }
}