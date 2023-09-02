package com.example.singlemoduleapp.data.datasource.remote.news

import com.example.singlemoduleapp.data.model.news.NewsApiModel

interface NewsApi {
    fun fetchNews(): List<NewsApiModel>
}