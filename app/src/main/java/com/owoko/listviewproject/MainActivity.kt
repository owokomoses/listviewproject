package com.owoko.listviewproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var mylistview=findViewById<ListView>(R.id.mylistview)
        var list= mutableListOf<Model>()

        list.add(Model("sunset","The sun is setting",R.drawable.dp))
        list.add(Model("Anime","Anime character",R.drawable.dp2))
        list.add(Model("Anime","Anime character",R.drawable.dp3))
        list.add(Model("Anime","Anime character",R.drawable.dp5))
        list.add(Model("Anime","Anime character",R.drawable.dp6))

        mylistview.adapter=MyAdapter(this,R.layout.row,list)
    }
}