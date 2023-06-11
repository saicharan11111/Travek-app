package com.example.travelapp.ui.Fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.travelapp.databinding.HomeFragmentBinding
import com.example.travelapp.ui.base.BaseFragment

class HomeFragment:BaseFragment() {
    private var _binding:HomeFragmentBinding?=null
    private val binding get() = _binding!!
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding=HomeFragmentBinding.inflate(inflater,container,false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState )
    }
    override fun onDestroyView() {
        super.onDestroyView()
        _binding=null
    }
}