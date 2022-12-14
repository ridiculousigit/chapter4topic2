package binar.academy.chapter4topic2.databindingnews

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import binar.academy.chapter4topic2.databinding.ItemNewsBinding

class NewsAdapter (private var listBerita:ArrayList<News>, private val newsListener: NewsListener) : RecyclerView.Adapter<NewsAdapter.ViewHolder>() {

    inner class ViewHolder(val binding:ItemNewsBinding):RecyclerView.ViewHolder(binding.root) {
        fun databind(itemData:News){
            binding.berita = itemData
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = ItemNewsBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return  ViewHolder(view)
    }


    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.databind(listBerita[position])
        holder.itemView.setOnClickListener {
            newsListener.onNewsSelected(listBerita[position])
        }
    }

    override fun getItemCount(): Int = listBerita.size

    fun getData(data : ArrayList<News>) {
        this.listBerita = data
    }

    interface NewsListener {
        fun onNewsSelected(news: News)
    }
}