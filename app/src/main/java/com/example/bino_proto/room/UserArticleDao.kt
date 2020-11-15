package com.example.bino_proto.room

import androidx.lifecycle.LiveData
import androidx.room.*
import kotlinx.coroutines.flow.Flow

@Dao
interface UserArticleDao {
    @Query("SELECT * FROM user_article")
    fun loadAllArticle(): List<UserArticleEntity>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(userArtice: UserArticleEntity)

    @Update
    fun update(userArtice: UserArticleEntity)

    @Delete
    fun delete(userArtice: UserArticleEntity)
}