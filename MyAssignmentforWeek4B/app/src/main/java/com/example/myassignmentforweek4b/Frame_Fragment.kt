package com.example.myassignmentforweek4b

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment

class Frame_Fragment(private val postion : Int) : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
       val view = inflater.inflate(R.layout.frame_holder_fragment,container,false)
        val position:TextView = view.findViewById(R.id.framefragment)
        position.text = "Fragment Position:$position"
        return view
    }
}