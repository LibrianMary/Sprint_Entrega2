package com.example.wireframe_sprint

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.wireframe_sprint.databinding.FragmentItensColectionBinding

class ItensColectionFragment : Fragment() {

    private var binding: FragmentItensColectionBinding? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentItensColectionBinding.inflate(inflater, container, false)
        // Inflate the layout for this fragment
        return binding?.root
    }

    override fun onDestroy() {
        super.onDestroy()
        binding = null
    }
}