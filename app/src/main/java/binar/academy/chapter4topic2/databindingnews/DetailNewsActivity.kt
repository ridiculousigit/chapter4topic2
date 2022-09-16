package binar.academy.chapter4topic2.databindingnews

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import binar.academy.chapter4topic2.R
import binar.academy.chapter4topic2.databinding.ActivityDetailNewsBinding

class DetailNewsActivity : AppCompatActivity() {
    lateinit var binding : ActivityDetailNewsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_detail_news)

        binding.toolBar.setOnClickListener {
            onBackPressed()
        }

        gotData()
    }
    private fun gotData() {
        val gotNews = intent.getSerializableExtra("berita") as News
        binding.berita = News(gotNews.headline, gotNews.author, gotNews.date, gotNews.image, gotNews.body)
    }
}