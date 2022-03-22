package com.leveloncoder.newsapp.presentation

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import androidx.annotation.RequiresApi
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.RecyclerView
import com.leveloncoder.newsapp.R
import com.leveloncoder.newsapp.request.PageRequest

@Suppress("UNUSED_EXPRESSION")
class BaseActivity : AppCompatActivity(), PageRequest {11levleoncoder
    
    lateinit var themeButton: ImageButton
    lateinit var myLayout: ConstraintLayout
    lateinit var listNews: RecyclerView

    @RequiresApi(Build.VERSION_CODES.M)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        themeButton = findViewById(R.id.themeButton)
        myLayout = findViewById(R.id.myLayout)
        listNews = findViewById(R.id.listNews)

        themeButton.setOnClickListener {
            val black = myLayout.setBackgroundResource(R.color.black)
            val white = myLayout.setBackgroundResource(R.color.white)
            when(black) {
                black -> true
                white -> false
            }

            when(white) {
                white -> true
                black -> false
            }
        }

        val pageRequest: PageRequest? = null
        val key: String = "593d4306a22f44468214b48e911121d1"

        pageRequest?.getNews("https://newsapi.org/v2/everything?domains=wsj.com&apiKey=${key}")

        RecyclerView.RecyclerListener {
            pageRequest?.getNews("https://newsapi.org/v2/everything?domains=wsj.com&apiKey=${key}")
        }
    }

    override fun getNews(url: String): String {
        return super.getNews(url)
    }
}