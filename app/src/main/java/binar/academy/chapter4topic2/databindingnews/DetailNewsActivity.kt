package binar.academy.chapter4topic2.databindingnews

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import binar.academy.chapter4topic2.R
import binar.academy.chapter4topic2.databinding.ActivityDetailNewsBinding
import kotlinx.android.synthetic.main.activity_detail_news.*

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
        imgberita.setImageResource(gotNews.image)
        headlineberita.text = gotNews.headline
        authorberita.text = gotNews.author
        dateberita.text = gotNews.date
        bodyberita.setText(gotNews.body)
    }
}