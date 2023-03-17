package com.example.recyclerlistadapter

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment

object Test{
    const val ARG_OBJECT = "object"
}
class FirstFragment : Fragment(R.layout.fragment_first) {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return super.onCreateView(inflater, container, savedInstanceState)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        arguments?.takeIf {
            it.containsKey(Test.ARG_OBJECT)
        }?.apply {
            view.findViewById<TextView>(R.id.txt_id).text = getString(Test.ARG_OBJECT)
        }
    }
}