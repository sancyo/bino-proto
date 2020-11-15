package com.example.bino_proto.ui.recycler_view

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.bino_proto.R

// 自分が欲しい情報を簡単に取得できるようにするListener
class RecyclerViewHolder(view: View): RecyclerView.ViewHolder(view) {

    var articleEmojiView: TextView = view.findViewById(R.id.article_emoji)
    var articleTitleView: TextView = view.findViewById(R.id.article_title)
    var articleDateView: TextView = view.findViewById(R.id.article_date)

    init {

    }
}