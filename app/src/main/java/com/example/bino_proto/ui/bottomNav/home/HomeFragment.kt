package com.example.bino_proto.ui.bottomNav.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import com.example.bino_proto.R
import kotlinx.android.synthetic.main.activity_main.*


class HomeFragment : Fragment() {
    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        view?.findViewById<Button>(R.id.navigation_home)?.setOnClickListener {
            view?.let {
                Navigation.findNavController(it).navigate(R.id.navigation_home)
            }
        }

        view?.findViewById<Button>(R.id.create_article_btn)?.setOnClickListener{
            view?.let {
                Navigation.findNavController(it).navigate(R.id.action_navigation_home_to_navigation_edit)
            }
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_home, container, false)

        return inflater.inflate(R.layout.fragment_home, container, false)
    }
}