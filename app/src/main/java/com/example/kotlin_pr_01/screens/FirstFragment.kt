package com.example.kotlin_pr_01.screens

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.kotlin_pr_01.R
import com.example.kotlin_pr_01.databinding.FragmentFirstBinding


class FirstFragment : Fragment() {


    lateinit var binding: FragmentFirstBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentFirstBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.btnToSecond.setOnClickListener {
            MAIN.navController.navigate(R.id.action_firstFragment_to_secondFragment)
        }
        binding.btnFromFirstToThird.setOnClickListener {
            MAIN.navController.navigate(R.id.action_firstFragment_to_thirdFragment)
        }
    }

}