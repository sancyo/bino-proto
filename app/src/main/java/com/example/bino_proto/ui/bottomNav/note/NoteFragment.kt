package com.example.bino_proto.ui.bottomNav.note

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.bino_proto.R
import com.example.bino_proto.ui.recycler_view.RecyclerViewAdapter
import com.example.bino_proto.ui.recycler_view.articleList
import kotlinx.android.synthetic.main.fragment_note.*

class NoteFragment : Fragment() {
    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        view?.findViewById<Button>(R.id.navigation_home)?.setOnClickListener {
            view?.let { Navigation.findNavController(it).navigate(R.id.navigation_home)}
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_note, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // ==================== recyclerView logic ====================
        lateinit var userArticleAdapter: RecyclerViewAdapter
        lateinit var mAnimalList: ArrayList<articleList>

        val a1 = articleList("hoge", "2020/11/11", "\uD83D\uDC53")
        mAnimalList = arrayListOf(a1)

        // RecyclerViewの取得
        val recyclerView = article_recycler_view

        // LayoutManagerの設定
        recyclerView.layoutManager = LinearLayoutManager(activity)

        // CustomAdapterの生成と設定
        userArticleAdapter = RecyclerViewAdapter(mAnimalList)
        recyclerView.adapter = userArticleAdapter
        // ============================================================
    }
}