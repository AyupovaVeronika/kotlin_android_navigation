package com.example.kotlin_pr_01.screens

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.kotlin_pr_01.R
import com.example.kotlin_pr_01.databinding.FragmentThirdBinding


class ThirdFragment : Fragment() {
    lateinit var binding: FragmentThirdBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentThirdBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.btnToFirst.setOnClickListener {
            MAIN.navController.navigate(R.id.action_thirdFragment_to_firstFragment)
        }
        binding.btnFromThirdToSecond.setOnClickListener {
            MAIN.navController.navigate(R.id.action_thirdFragment_to_secondFragment)
        }
    }



}