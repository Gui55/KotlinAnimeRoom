package com.example.kotlinanimeroom

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.room.Room
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    companion object {
        var db: UsuarioDatabase? = null
        fun getDatabase(): UsuarioDatabase? {
            return db
        }

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        db = Room.databaseBuilder(applicationContext, UsuarioDatabase::class.java, "userDB")
            .allowMainThreadQueries().build()


        recycle.layoutManager = LinearLayoutManager(this)
        recycle.adapter = UsuarioAdapter(db?.usuarioDao()!!.getUsuarios(), this)
    }

    fun irAoCadastro(view: View) {

        startActivity(Intent(this, CadastroActivity::class.java))

    }
}
