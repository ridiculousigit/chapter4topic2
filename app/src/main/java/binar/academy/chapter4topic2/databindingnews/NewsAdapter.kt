package binar.academy.chapter4topic2.databindingnews

import android.os.Bundle
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.recyclerview.widget.RecyclerView
import binar.academy.chapter4topic2.R
import binar.academy.chapter4topic2.databinding.ItemNewsBinding

class NewsAdapter (private var listBerita:ArrayList<News>) : RecyclerView.Adapter<NewsAdapter.ViewHolder>() {
    var onClick:((News) -> Unit)? = null

    class ViewHolder(val binding:ItemNewsBinding):RecyclerView.ViewHolder(binding.root) {
        fun databind(itemData:News){
            binding.news = itemData
            binding.cvBerita.setOnClickListener{
                val bundle = Bundle()
                bundle.putSerializable("news", itemData)
                Navigation.findNavController(itemView).navigate(R.id.action_newsFragment_to_newsDetailFragment)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = ItemNewsBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return  ViewHolder(view)
    }


    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.databind(listBerita[position])
    }

    override fun getItemCount(): Int = listBerita.size
}


