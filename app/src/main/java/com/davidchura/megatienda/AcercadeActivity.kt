package com.davidchura.megatienda

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_acercade.*

class AcercadeActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_acercade)
        rbQuienesSomos.setOnClickListener(this)
        rbMision.setOnClickListener(this)
        rbVision.setOnClickListener(this)
    }
    override fun onClick(v: View?) {
        when(v?.id){
            R.id.rbQuienesSomos -> mostrarQuienesSomos()
            R.id.rbMision -> mostrarMision()
            R.id.rbVision -> mostrarVision()
        }
    }
    private fun mostrarVision() {
        supportFragmentManager.beginTransaction()
            .replace(R.id.llContenedor,VisionFragment())
            .commit()
    }
    private fun mostrarMision() {
        supportFragmentManager.beginTransaction()
            .replace(R.id.llContenedor,MisionFragment())
            .commit()
    }
    private fun mostrarQuienesSomos() {
        supportFragmentManager.beginTransaction()
            .replace(R.id.llContenedor,QuienesSomosFragment())
            .commit()
    }
}
