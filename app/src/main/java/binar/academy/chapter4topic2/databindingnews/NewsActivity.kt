package binar.academy.chapter4topic2.databindingnews

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.LinearLayoutManager
import binar.academy.chapter4topic2.R
import binar.academy.chapter4topic2.databinding.ActivityNewsBinding

class NewsActivity : AppCompatActivity(), NewsAdapter.NewsListener {
    lateinit var binding : ActivityNewsBinding
    val viewModel : NewsViewModel by viewModels()
    lateinit var adapter: NewsAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_news)

        viewModel.gotNews()
        viewModel.newsList.observe(this) {
            adapter.getData(it as ArrayList<News>)
        }
        reViewNews()
    }

    fun reViewNews() {
        adapter = NewsAdapter(ArrayList(), this)
        binding.rvNews.adapter = adapter
        binding.rvNews.layoutManager = LinearLayoutManager(this)
    }

    override fun onNewsSelected(news: News) {
        val intent = Intent(this, DetailNewsActivity :: class.java)
        intent.putExtra("berita", news)
        startActivity(intent)
    }
}