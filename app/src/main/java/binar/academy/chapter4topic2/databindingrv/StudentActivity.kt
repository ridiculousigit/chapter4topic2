package binar.academy.chapter4topic2.databindingrv

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.LinearLayoutManager
import binar.academy.chapter4topic2.R
import binar.academy.chapter4topic2.databinding.ActivityStudentBinding

class StudentActivity : AppCompatActivity() {

    lateinit var binding : ActivityStudentBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_student)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_student)

        var listStudent = arrayListOf(
            Student("Sigit","57419199", R.drawable.ic_launcher_foreground),
            Student("Hitler","57419128", R.drawable.ic_launcher_foreground)
        )

        binding.rvStudent.adapter = StudentAdapter(listStudent)
        binding.rvStudent.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
    }
}