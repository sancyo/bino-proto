package com.example.bino_proto.room

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [UserArticleEntity::class], version = 1, exportSchema = false)
abstract class UserArticleDatabase : RoomDatabase() {

    companion object {
        private var INSTANCE: UserArticleDatabase? = null
        private val lock = Any()

        fun getInstance(context: Context): UserArticleDatabase =
            INSTANCE ?: synchronized(lock) {
                INSTANCE ?: Room.databaseBuilder(
                    context.applicationContext,
                    UserArticleDatabase::class.java, "UserArticleEntity.db"
                )
                    .build()
                    .also { INSTANCE = it }
            }

        fun destroyInstance() {
            INSTANCE = null
        }
    }
}