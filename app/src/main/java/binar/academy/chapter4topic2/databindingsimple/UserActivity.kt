package binar.academy.chapter4topic2.databindingsimple

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import binar.academy.chapter4topic2.R
import binar.academy.chapter4topic2.databinding.ActivityUserBinding

class UserActivity : AppCompatActivity() {

    lateinit var binding : ActivityUserBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_user)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_user)
        /*binding.tvFirstName.text = "Sigit"
        binding.tvLastName.text = "Prasetyo"*/

        binding.userdata = User("Xiao", "Kai")
    }
}