package com.example.singlemoduleapp.ui.news

import android.os.Bundle
import android.view.View
import androidx.navigation.fragment.findNavController
import com.example.singlemoduleapp.R
import com.example.singlemoduleapp.ui.base.BaseFragment
import com.google.android.material.button.MaterialButton

class NewsListFragment : BaseFragment() {
    override val layoutResourceId: Int
        get() = R.layout.fragment_news_list

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val goButton = view.findViewById<MaterialButton>(R.id.goButton)
        goButton.setOnClickListener {
            val action = NewsListFragmentDirections.actionNewsListFragmentToNewsDetailsFragment()
            findNavController().navigate(action)
        }
    }

}