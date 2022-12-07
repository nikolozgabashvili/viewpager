package com.example.viewpager2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.ActionBar
import androidx.viewpager2.widget.ViewPager2
import com.example.viewpager2.adapters.ViewPagerFragmentAdapter
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class MainActivity : AppCompatActivity() {
    private lateinit var tabLayout: TabLayout

    private lateinit var viewPager2: ViewPager2
    private lateinit var viewPagerFragmentAdapter: ViewPagerFragmentAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tabLayout = findViewById(R.id.tabs)
        viewPager2 = findViewById(R.id.viewpager)
        val actionBar:ActionBar?=supportActionBar
        actionBar?.hide()
        viewPagerFragmentAdapter = ViewPagerFragmentAdapter(this)
        viewPager2.adapter = viewPagerFragmentAdapter
        TabLayoutMediator(tabLayout,viewPager2){
            tab,position ->
            tab.text = "page${position+1}"
        }.attach()


    }
}