package com.example.bino_proto.ui.recycler_view

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.AdapterView
import androidx.recyclerview.widget.RecyclerView
import com.example.bino_proto.R

class RecyclerViewAdapter(private val list: ArrayList<articleList>): RecyclerView.Adapter<RecyclerViewHolder>() {

    // リスナー格納変数
    // lateinit var listener: AdapterView.OnItemClickListener

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val view = layoutInflater.inflate(R.layout.article_list, parent, false)
        val viewholder = RecyclerViewHolder(view)
        return viewholder
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: RecyclerViewHolder, position: Int) {
        val list = list[position]

        holder.articleEmojiView.text = list.emoji
        holder.articleTitleView.text = list.title
        holder.articleDateView.text = list.date
    }
}

// inflater -> 指定したxmlのレイアウトリソースを利用できる仕組み