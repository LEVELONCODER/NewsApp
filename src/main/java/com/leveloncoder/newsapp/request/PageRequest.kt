package com.leveloncoder.newsapp.request

import com.leveloncoder.newsapp.news.NewsForm
import retrofit2.http.GET
import retrofit2.http.Url

@Suppress("UNUSED_VALUE")
interface PageRequest {

    @GET("https://newsapi.org/v2/everything?domains=wsj.com&apiKey=593d4306a22f44468214b48e911121d1")
    fun getNews(@Url url: String) : String {
        val newsForm: NewsForm? = null
        newsForm?.name = url[0].toString()
        newsForm?.id = url[1].digitToInt()
        newsForm?.author = url[2].toString()
        newsForm?.title = url[7].toString()
        newsForm?.url = url[3].toString()
        newsForm?.description = url[6].toString()
        newsForm?.urlToImage = url[5].toString()
        newsForm?.content = url[6].toString()
        newsForm?.publicAt = url[9].toString()
        return url
    }
}