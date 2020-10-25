package com.example.bino_proto.ui.bottomNav.statistics

import android.os.Bundle
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import com.example.bino_proto.R


class StatisticsFragment : Fragment() {
    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        view?.findViewById<Button>(R.id.navigation_home)?.setOnClickListener {
            view?.let { Navigation.findNavController(it).navigate(R.id.navigation_home)}
        }
    }
}