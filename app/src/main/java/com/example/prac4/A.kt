package com.example.prac4

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button

import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import com.example.prac4.databinding.FragmentABinding


class A : Fragment() {
private lateinit var  binding: FragmentABinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        //: return datatype (View)  for : View?   ? means cannot be null
        // Inflate the layout for this fragment

        //code cannot put at here UI not generate yet


        binding=DataBindingUtil.inflate(inflater,R.layout.fragment_a, container, false)
binding.btnToB.setOnClickListener(){

Navigation.findNavController(binding.root)
    .navigate(R.id.action_a_to_b)



}
//       var btn =  view.findViewById<Button>(R.id.btnToB)
//        //data  bind more fast to run


        return  binding.root
    }

// code also canot put here not execute



}