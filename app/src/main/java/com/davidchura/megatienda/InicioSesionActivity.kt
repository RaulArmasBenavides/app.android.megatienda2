package com.davidchura.megatienda

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.view.View
import kotlinx.android.synthetic.main.activity_inicio_sesion.*
import kotlinx.android.synthetic.main.activity_main.*

class InicioSesionActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_inicio_sesion)
        btnIniciarSesion.setOnClickListener(this)
    }
    override fun onClick(v: View?) {
        when(v?.id){
            R.id.btnIniciarSesion -> mostrarEscritorio()
        }
    }

    private fun mostrarEscritorio() {
        startActivity(
            Intent(this,
                EscritorioActivity::class.java)
        )
    }


    //Para implementar el menu
    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        val inflater: MenuInflater = menuInflater
        inflater.inflate(R.menu.menu_inicio_sesion, menu)
        return true
    }
    //Para implementar el evento clic del menu
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle item selection
        return when (item.itemId) {
            R.id.nav_informacion -> {
                mostrarInformacion()
                true
            }
            R.id.nav_acerca_de -> {
                mostrarAcercade()
                true
            }
            R.id.nav_terminos -> {
                mostrarTerminos()
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }

    private fun mostrarTerminos() {
        startActivity(
            Intent(this,
                TerminosActivity::class.java)
        )
    }

    private fun mostrarAcercade() {
        startActivity(
            Intent(this,
                AcercadeActivity::class.java)
        )
    }

    private fun mostrarInformacion() {
        startActivity(
            Intent(this,
                InformacionActivity::class.java)
        )
    }
}
