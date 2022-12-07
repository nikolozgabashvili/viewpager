package com.example.viewpager2.adapters

import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.viewpager2.FragmentPackage.Fragment1
import com.example.viewpager2.FragmentPackage.Fragment2
import com.example.viewpager2.FragmentPackage.Fragment3


class ViewPagerFragmentAdapter(activity: AppCompatActivity):FragmentStateAdapter(activity) {
    override fun getItemCount(): Int {
        return 3
    }

    override fun createFragment(position: Int): Fragment {
        return when(position){
            0 ->Fragment1()
            1->Fragment2()
            2->Fragment3()
            else -> {
                Fragment1()
            }
        }
    }

}