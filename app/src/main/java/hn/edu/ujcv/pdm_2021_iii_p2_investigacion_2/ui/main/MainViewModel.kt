package hn.edu.ujcv.pdm_2021_iii_p2_investigacion_2.ui.main

import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {
    private val CEN_TO_PULG = 2.54f
    private var PulgText = ""
    private var resultado: Float = 0f
    private var resultado2: Float = 0f

    fun setValor(valor:String): Float?{
        this.PulgText = valor
        resultado = valor.toFloat() * CEN_TO_PULG
        return resultado
    }
    fun setValor2(valor2:String): Float?{
        this.PulgText = valor2
        resultado2 = valor2.toFloat() / CEN_TO_PULG
        return resultado2
    }
    fun getResultado(): Float?{
        return resultado
    }
    fun getResultado2(): Float?{
        return resultado2
    }
}