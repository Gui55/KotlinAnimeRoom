package com.example.kotlinanimeroom

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters


@Database(entities = [Usuario::class], version = 1, exportSchema = false)
@TypeConverters(Converters::class)
abstract class UsuarioDatabase : RoomDatabase(){

    public abstract fun usuarioDao() : UsuarioDAO

}