package com.example.bino_proto.room

import androidx.room.*

@Dao
interface UserArticleDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(userArtice: UserArticleEntity)

    @Update
    fun update(userArtice: UserArticleEntity)

    @Delete
    fun delete(userArtice: UserArticleEntity)
}