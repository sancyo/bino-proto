package com.example.bino_proto.ui.edit

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageButton
import android.widget.ImageView
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import com.example.bino_proto.R

class EditFragment : Fragment() {
    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        view?.findViewById<Button>(R.id.navigation_home)?.setOnClickListener {
            view?.let { Navigation.findNavController(it).navigate(R.id.navigation_home)}
        }

        view?.findViewById<ImageView>(R.id.to_home_btn)?.setOnClickListener{
            view?.let {
                Navigation.findNavController(it).navigate(R.id.action_navigation_edit_to_navigation_home)
            }
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_edit, container, false)
    }
}