package com.example.singlemoduleapp.data.model.news

import com.google.gson.annotations.SerializedName

data class NewsApiModel(
    @SerializedName("articles")
    val articles: List<ArticleApiModel?>? = null,
    @SerializedName("status")
    val status: String? = null,
    @SerializedName("totalResults")
    val totalResults: Int? = null
)