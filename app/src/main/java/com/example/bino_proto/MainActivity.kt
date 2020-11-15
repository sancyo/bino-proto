package com.example.bino_proto

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.ArrayAdapter
import androidx.navigation.findNavController
import androidx.navigation.ui.setupWithNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.bino_proto.room.UserArticleDao
import com.example.bino_proto.room.UserArticleDatabase
import com.example.bino_proto.room.UserArticleEntity
import com.example.bino_proto.ui.recycler_view.RecyclerViewAdapter
import com.example.bino_proto.ui.recycler_view.articleList
import com.google.android.material.bottomnavigation.BottomNavigationView
import kotlinx.android.synthetic.main.fragment_note.*

class MainActivity : AppCompatActivity() {

    // ==================== database variable ====================
    lateinit var userArticleDao: UserArticleDao
    //lateinit var userArticleAdapter: ArrayAdapter<String>
    // ==============================================================

    // ==================== recyclerView variable ====================

    // ===============================================================

    private var userArticleList: List<UserArticleEntity> = listOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //使用する下部ナビゲーションを指定
        val navView: BottomNavigationView = findViewById(R.id.nav_view)
        val navController = findNavController(R.id.nav_host_fragment)
        navView.setupWithNavController(navController)

        userArticleDao = UserArticleDatabase.getInstance(this).userArticleDao()

        val article2 = UserArticleEntity(2, "hoge", "fuga", "2020/11/14", "\uD83D\uDC53")
        val article3 = UserArticleEntity(3, "hoge", "fuga", "2020/11/14", "A")
        val article4 = UserArticleEntity(4, "hoge", "fuga", "2020/11/14", "A")
        val article5 = UserArticleEntity(5, "hoge", "fuga", "2020/11/14", "A")
        //userArticleDao.insert(article2)


        println("hoge" + userArticleDao.loadAllArticle())
    }

    private fun getUserArticle() {
        userArticleList = userArticleDao.loadAllArticle()
    }

    // val localdb = UserArticleDatabase.getInstance(this)
}


// var => 再代入可能な変数
// val => 再代入不可な変数

//navHostFragment => この中身を入れ替えることで画面遷移を実現しているらしい。クラス

// インターフェース =>　継承先に定義したメソッドなどの実装を強制する仕組み

// val newArticle = UserArticleEntity(0, "hoge", "fuga", "2020/11/14", "A")