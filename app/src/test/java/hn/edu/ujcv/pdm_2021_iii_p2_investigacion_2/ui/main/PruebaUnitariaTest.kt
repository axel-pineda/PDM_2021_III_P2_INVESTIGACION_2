package hn.edu.ujcv.pdm_2021_iii_p2_investigacion_2.ui.main

import org.junit.Assert.*
import org.junit.Test
class PruebaUnitariaTest{
    private val tamaño = MainViewModel()

    @Test
    fun InchesToCentimetersTest(){
        val inches = 1f
        val ecuacion = tamaño.setValor(inches.toString())
        assertEquals(2.54f,ecuacion)

    }
    @Test
    fun CentimetersToInchesTest(){
        val centimeters = 2.54f
        val ecuacion = tamaño.setValor2(centimeters.toString())
        assertEquals(1.0f,ecuacion)
    }
}