package com.kubrausluca.bottomnavigation

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.fragment.navArgs
import kotlinx.android.synthetic.main.fragment_carpma_sonuc.view.*

class CarpmaSonucFragment : Fragment() {
    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {

        val tasarim = inflater.inflate(R.layout.fragment_carpma_sonuc, container, false)
        val bundle:CarpmaSonucFragmentArgs by navArgs()
        val carpma = bundle.carpmasonuc.toString()

        tasarim.carpmaSonuc.text = "ÇARPMA SONUÇ : $carpma"
        return tasarim
    }
}