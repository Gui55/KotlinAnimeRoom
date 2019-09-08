package com.example.kotlinanimeroom

import android.app.Activity
import android.content.Intent
import android.graphics.Bitmap
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import android.view.View
import android.widget.Toast
import androidx.core.graphics.drawable.toBitmap
import kotlinx.android.synthetic.main.activity_cadastro.*

class CadastroActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cadastro)
    }

    fun realizarCadastro(view: View) {

        if(cadastroUser.text.toString()=="" ||
                cadastroSenha.text.toString()=="" ||
                cadastroConfirmaSenha.text.toString()==""){

            Toast.makeText(this, "Faltam dados", Toast.LENGTH_SHORT).show()


        } else{

            if(cadastroSenha.text.toString()==cadastroConfirmaSenha.text.toString()){

                MainActivity.db!!.usuarioDao().insert(

                    Usuario(0, cadastroUser.text.toString(), cadastroSenha.text.toString(),
                        cadastroImage.drawable.toBitmap())

                )

                startActivity(Intent(this, MainActivity::class.java))

            } else {

                Toast.makeText(this, "As senhas não estão batendo", Toast.LENGTH_SHORT).show()

            }



        }

    }

    fun tirarFoto(view: View) {

        val intent = Intent(MediaStore.ACTION_IMAGE_CAPTURE)

        if (intent.resolveActivity(packageManager) != null) {

            startActivityForResult(intent, 0)

        }

    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        if (requestCode == 0 && resultCode == Activity.RESULT_OK) {

            val extras = data!!.extras
            val foto = extras!!.get("data") as Bitmap?
            cadastroImage.setImageBitmap(foto)

        }

    }
}
