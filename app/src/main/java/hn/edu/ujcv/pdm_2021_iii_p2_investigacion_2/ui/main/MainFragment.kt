package hn.edu.ujcv.pdm_2021_iii_p2_investigacion_2.ui.main

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import hn.edu.ujcv.pdm_2021_iii_p2_investigacion_2.R
import kotlinx.android.synthetic.main.main_fragment.*

class MainFragment : Fragment() {

    companion object {
        fun newInstance() = MainFragment()
    }

    private lateinit var viewModel: MainViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return inflater.inflate(R.layout.main_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(MainViewModel::class.java)
        txvResultado.text = viewModel.getResultado().toString()
        txvResultado2.text = viewModel.getResultado2().toString()
        btnConversión.setOnClickListener {
            if (txtPulgadas.text.isNotEmpty()){
                viewModel.setValor(txtPulgadas.text.toString())
                txvResultado.text = viewModel.getResultado().toString()
            }else{
                txvResultado.text = "Disponga de un valor"
            }
        }
        btnConversión2.setOnClickListener {
            if (txtCentimetros.text.isNotEmpty()){
                viewModel.setValor2(txtCentimetros.text.toString())
                txvResultado2.text = viewModel.getResultado2().toString()
            }else{
                txvResultado2.text = "Disponga de un valor"
            }
        }
    }

}