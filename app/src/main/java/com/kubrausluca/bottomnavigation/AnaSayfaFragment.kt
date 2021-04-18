package com.kubrausluca.bottomnavigation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup


class AnaSayfaFragment : Fragment() {
    override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        val tasarim = inflater.inflate(R.layout.fragment_anasayfa, container, false)
        return tasarim
    }
}