package com.example.recyclerlistadapter

import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter

class ViewPagerAdapter(fragment: Fragment) : FragmentStateAdapter(fragment)  {
    override fun getItemCount() =3


    override fun createFragment(position: Int): Fragment {
      return  when(position){
            0 ->{
                FirstFragment()
            }
            1 ->{
                ThirdFragment()
            }
            2 ->{
                FourFragment()
            }else ->{
                FirstFragment()
            }
        }
      // val fragment= FirstFragment()
//        fragment.arguments= Bundle().apply {
//            putString(Test.ARG_OBJECT,"Page Number = ${position+1}")
//        }
//        return fragment
    }
}