package com.example.navigateapp

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController

class HomeFragment : Fragment(R.layout.fragment_home) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // Navegar a otro fragmento
        view.findViewById<Button>(R.id.btn_to_profile).setOnClickListener {
            findNavController().navigate(R.id.action_homeFragment_to_profileFragment)
        }

        view.findViewById<Button>(R.id.btn_to_settings).setOnClickListener {
            findNavController().navigate(R.id.action_homeFragment_to_settingsFragment)
        }
    }
}