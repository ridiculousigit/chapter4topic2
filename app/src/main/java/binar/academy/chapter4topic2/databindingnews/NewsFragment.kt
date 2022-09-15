package binar.academy.chapter4topic2.databindingnews

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import binar.academy.chapter4topic2.R

class NewsFragment : Fragment() {

    lateinit var newsAdapter : NewsAdapter
    lateinit var binding : FragmentBi

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_news, container, false)
    }
}