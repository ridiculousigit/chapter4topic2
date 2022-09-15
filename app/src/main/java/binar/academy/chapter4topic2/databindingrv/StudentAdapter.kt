package binar.academy.chapter4topic2.databindingrv

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import binar.academy.chapter4topic2.databinding.ItemStudentBinding

class StudentAdapter(var listStudent : ArrayList<Student>) : RecyclerView.Adapter<StudentAdapter.ViewHolder>() {
    class ViewHolder (val binding : ItemStudentBinding) : RecyclerView.ViewHolder(binding.root) {
        fun databind(itemData : Student) {
            binding.student = itemData
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        var view = ItemStudentBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.databind(listStudent[position])
    }

    override fun getItemCount(): Int {
        return listStudent.size
    }
}