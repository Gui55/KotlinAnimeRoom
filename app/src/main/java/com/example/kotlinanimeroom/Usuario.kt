package com.example.kotlinanimeroom

import android.graphics.Bitmap
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
class Usuario(@PrimaryKey(autoGenerate = true)var id: Int,
              var userName: String,
              var senha: String,
              var imagem: Bitmap)