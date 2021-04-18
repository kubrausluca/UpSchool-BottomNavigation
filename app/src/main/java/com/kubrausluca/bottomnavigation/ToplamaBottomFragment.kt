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
            val toplam = tasarim.textSayi1.text.toString().toInt()+tasarim.textSayi2.text.toString().toInt()
            val sonuc = ToplamaBottomFragmentDirections.toplamaSonucGecis(toplam)
            Navigation.findNavController(it).navigate(sonuc)
        }
        return tasarim
    }
}