package com.example.singlemoduleapp.data.repository.news

import com.example.singlemoduleapp.data.model.news.NewsApiModel

interface NewsRepository {
    fun fetchNews(): List<NewsApiModel>
}