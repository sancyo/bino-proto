package com.example.bino_proto

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //使用する下部ナビゲーションを指定
        val navView: BottomNavigationView = findViewById(R.id.nav_view)

        val navController = findNavController(R.id.nav_host_fragment)

        // ナビゲーショングラフのIDを指定
        val appBarConfiguration = AppBarConfiguration(setOf(R.id.navigation_home, R.id.navigation_statistics, R.id.navigation_note))

        setupActionBarWithNavController(navController, appBarConfiguration)
        navView.setupWithNavController(navController)
    }
}

// var => 再代入可能な変数
// val => 再代入不可な変数

//navHostFragment => この中身を入れ替えることで画面遷移を実現しているらしい。クラス

// インターフェース =>　継承先に定義したメソッドなどの実装を強制する仕組み