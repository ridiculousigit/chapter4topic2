package binar.academy.chapter4topic2.databindingnews

import java.io.Serializable

data class News (val headline : String, val author : String, val date : String, val image : Int, val body : Int) : Serializable