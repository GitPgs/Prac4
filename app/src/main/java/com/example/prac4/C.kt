package com.example.prac4

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import com.example.prac4.databinding.FragmentBBinding
import com.example.prac4.databinding.FragmentCBinding

class C : Fragment() {


    private lateinit var  binding: FragmentCBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        //: return datatype (View)  for : View?   ? means cannot be null
        // Inflate the layout for this fragment

        //code cannot put at here UI not generate yet


        binding= DataBindingUtil.inflate(inflater,R.layout.fragment_c, container, false)
        binding.gotoHome.setOnClickListener(){
            Navigation.findNavController(binding.root)
                .popBackStack()







        }



//







//       var btn =  view.findViewById<Button>(R.id.btnToB)
//        //data  bind more fast to run


        return  binding.root
    }


}