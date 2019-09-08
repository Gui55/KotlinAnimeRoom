package com.example.kotlinanimeroom

import android.graphics.Bitmap
import androidx.room.TypeConverter
import java.io.ByteArrayOutputStream
import android.graphics.BitmapFactory



class Converters {

    @TypeConverter
    public fun BitMapToByte(bitmap: Bitmap): ByteArray {
        val baos = ByteArrayOutputStream()
        bitmap.compress(Bitmap.CompressFormat.PNG, 100, baos)
        return baos.toByteArray()
    }


    @TypeConverter
    public fun ByteToBitmap(bytes: ByteArray) : Bitmap{

        val bmp = BitmapFactory.decodeByteArray(bytes, 0, bytes.size)
        return bmp

    }
}