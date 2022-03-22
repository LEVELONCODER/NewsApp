package com.leveloncoder.newsapp.news

import com.google.gson.annotations.SerializedName

data class NewsForm(
    @SerializedName("name") var name: String,
    @SerializedName("id") var id: Int,
    @SerializedName("author") var author: String,
    @SerializedName("url") var url: String,
    @SerializedName("urlToImage") var urlToImage: String,
    @SerializedName("content") var content: String,
    @SerializedName("description") var description: String,
    @SerializedName("title") var title: String,
    @SerializedName("publishAt") var publicAt: String
)