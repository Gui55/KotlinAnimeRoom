package com.example.kotlinanimeroom

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query

@Dao
interface UsuarioDAO {

    @Insert
    fun insert(usuario: Usuario)

    @Query("SELECT * FROM usuario")
    fun getUsuarios() : List<Usuario>

}