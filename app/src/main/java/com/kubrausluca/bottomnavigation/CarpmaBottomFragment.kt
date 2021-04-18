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
            var carpmaSonucu = 0

            val sayi1 = Integer.parseInt(tasarim.textCarpma1.text.toString())
            val sayi2 = Integer.parseInt(tasarim.textCarpma2.text.toString())

            carpmaSonucu = sayi1 * sayi2

            val sonuc = CarpmaBottomFragmentDirections.carpmaSonucGecis(carpmaSonucu)
            Navigation.findNavController(it).navigate(sonuc)
        }
        return tasarim
    }
}