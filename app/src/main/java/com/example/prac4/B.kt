package com.example.prac4

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import com.example.prac4.databinding.FragmentABinding
import com.example.prac4.databinding.FragmentBBinding

class B : Fragment() {


    private lateinit var  binding: FragmentBBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        //: return datatype (View)  for : View?   ? means cannot be null
        // Inflate the layout for this fragment

        //code cannot put at here UI not generate yet


        binding= DataBindingUtil.inflate(inflater,R.layout.fragment_b, container, false)



        binding.btnToC.setOnClickListener(){




            Navigation.findNavController(binding.root)
                .navigate(R.id.action_b_to_c)



        }



//
        binding.back.setOnClickListener(){




          Navigation.findNavController(binding.root)
              .popBackStack()


        }






//       var btn =  view.findViewById<Button>(R.id.btnToB)
//        //data  bind more fast to run


        return  binding.root
    }

// code also canot put here not execute



}