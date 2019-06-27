package com.nogas.test010

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import java.lang.Exception
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun calculoEdad(view:View){

        try {



            val anioNacimiento = txtanioNacimiento.text.toString().toInt()
            val anioActual = Calendar.getInstance().get(Calendar.YEAR)

            if(anioNacimiento > 1900 && anioNacimiento < anioActual){

                val res = anioActual - anioNacimiento

                vistaEdad.text = "Tu edad es $res años."
            }
            else{
                vistaEdad.text = " el dato no es correcto"

            }




        }catch (e:Exception){

            vistaEdad.text = " El dato Ingresado es Invalido"
        }




    }


}
