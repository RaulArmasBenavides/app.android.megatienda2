package com.davidchura.megatienda

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.WindowManager

class SplashActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        //Esto es para desaparezca la barra de estado (barra de
        //notificaciones)
        window.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN)

        var handler:Handler = Handler()
        //Se ejecutan las instrucciones entre llaves,
        //despues de un tiempo especificado en milisegundos
        handler.postDelayed({
            startActivity(
                Intent(this,
                    MainActivity::class.java)
            )
            finish()//Cierra el activiry
        },3000)

    }
}
