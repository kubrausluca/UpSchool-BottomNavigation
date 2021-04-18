package com.kubrausluca.bottomnavigation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.fragment_toplama_bottom.view.*

class ToplamaBottomFragment : Fragment() {
    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        val tasarim = inflater.inflate(R.layout.fragment_toplama_bottom, container, false)

        tasarim.buttonToplama.setOnClickListener {
            var toplamaSonucu = 0

            val sayi1 = Integer.parseInt(tasarim.textSayi1.text.toString())
            val sayi2 = Integer.parseInt(tasarim.textSayi2.text.toString())

            toplamaSonucu = sayi1 + sayi2

            val sonuc = ToplamaBottomFragmentDirections.toplamaSonucGecis(toplamaSonucu)
            Navigation.findNavController(it).navigate(sonuc)
        }
        return tasarim
    }
}