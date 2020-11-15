package com.example.bino_proto.room

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = arrayOf(UserArticleEntity::class), version = 1, exportSchema = false)
abstract class UserArticleDatabase : RoomDatabase() {

    abstract fun userArticleDao(): UserArticleDao

    companion object {

        private var INSTANCE: UserArticleDatabase? = null

        private val lock = Any()

        fun getInstance(context: Context): UserArticleDatabase {
            synchronized(lock) {
                if (INSTANCE == null) {
                    INSTANCE = Room.databaseBuilder(
                        context.applicationContext,
                        UserArticleDatabase::class.java,
                        "User.db"
                    )
                        .allowMainThreadQueries()
                        .build()
                }
                return INSTANCE!!
            }
        }
    }
}
/*
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
*/
