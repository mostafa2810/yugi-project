package com.eltrend.yugi_ohdecks

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.AnimationUtils
import android.widget.AdapterView
import android.widget.LinearLayout
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_third.*
import kotlinx.android.synthetic.main.layout_blog_list_item.*

class third : AppCompatActivity() {
private lateinit var blogAdapter:BlogRecyclerAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third)


        initRecyclerView()
        addDataSet()
    }
    private fun addDataSet(){
        val data=DataSource.createDataSet()
        blogAdapter.submitList(data)

    }
    private fun initRecyclerView(){
        recycler_view.apply {
            layoutManager=LinearLayoutManager(this@third)
            val topSpacingDecoration=TopSpacingItemDecoration(30)
            addItemDecoration(topSpacingDecoration)
            blogAdapter= BlogRecyclerAdapter()
            adapter=blogAdapter

        }
    }


}
