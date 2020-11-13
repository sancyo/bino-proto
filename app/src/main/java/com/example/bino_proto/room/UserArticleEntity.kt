package com.example.bino_proto.room

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "user-article")
data class UserArticleEntity(
    @PrimaryKey(autoGenerate = true)
    val article_id: Long,
    val article_title: String,
    val article_body: String,
    val article_date:String,
    val article_emoji: String
)