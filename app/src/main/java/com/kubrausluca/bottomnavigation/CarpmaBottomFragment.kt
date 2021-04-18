package com.kubrausluca.bottomnavigation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.fragment_carpma_bottom.view.*


class CarpmaBottomFragment : Fragment() {
    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        val tasarim = inflater.inflate(R.layout.fragment_carpma_bottom, container, false)

        tasarim.buttonCarpma.setOnClickListener {
            val carpma = tasarim.textCarpma1.text.toString().toInt() * tasarim.textCarpma2.text.toString().toInt()
            val sonuc = CarpmaBottomFragmentDirections.carpmaSonucGecis(carpma)
            Navigation.findNavController(it).navigate(sonuc)
        }
        return tasarim
    }
}