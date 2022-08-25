package com.davidchura.megatienda

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.android.volley.Request
import com.android.volley.Response
import com.android.volley.toolbox.StringRequest
import com.android.volley.toolbox.Volley
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnCrearCuenta.setOnClickListener {
            startActivity(
                Intent(this,
                    CrearCuentaActivity::class.java)
            )
        }
        tvIniciarSesion.setOnClickListener {
            startActivity(
                Intent(this,
                    InicioSesionActivity::class.java)
            )
        }
        leerDatos()
    }

    private fun leerDatos() {
        val mtvIP = findViewById<TextView>(R.id.tvIP)
        // ...
        // Instantiate the RequestQueue.
        val queue = Volley.newRequestQueue(this)
        val url = "https://api.ipify.org/"
        //val url = "https://pix.pe/servicioandroid/serviciocategorias.php"
        // Request a string response from the provided URL.
        val stringRequest = StringRequest(
            Request.Method.GET, url,
            Response.Listener<String> { response ->
                mtvIP.text = response
            },
            Response.ErrorListener { mtvIP.text = "No funciona!" })
        // Add the request to the RequestQueue.
        queue.add(stringRequest)
    }
}
