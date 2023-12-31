package com.example.kotlin_pr_01.screens

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.kotlin_pr_01.R
import com.example.kotlin_pr_01.databinding.FragmentSecondBinding


class SecondFragment : Fragment() {

    lateinit var binding: FragmentSecondBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSecondBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.btnToThird.setOnClickListener {
            MAIN.navController.navigate(R.id.action_secondFragment_to_thirdFragment)
        }
        binding.btnFromSecondToFirst.setOnClickListener {
            MAIN.navController.navigate(R.id.action_secondFragment_to_firstFragment)
        }
    }


}