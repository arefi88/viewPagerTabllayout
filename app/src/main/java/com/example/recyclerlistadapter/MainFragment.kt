package com.example.recyclerlistadapter

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class MainFragment : Fragment(R.layout.fragment_second) {
    private val lableList:ArrayList<String> = arrayListOf("object1","object2","object3")
    private lateinit var viewPagerAdapter: ViewPagerAdapter
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return super.onCreateView(inflater, container, savedInstanceState)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewPagerAdapter= ViewPagerAdapter(this)
       val viewPager= view.findViewById<ViewPager2>(R.id.viewPager)
        viewPager.adapter=viewPagerAdapter
       val tabLayout=view.findViewById<TabLayout>(R.id.tabLayout)
        TabLayoutMediator(tabLayout,viewPager){tab,position ->
            tab.text = lableList[position]
        }.attach()
        //viewPager.setCurrentItem(1,false)


    }
}