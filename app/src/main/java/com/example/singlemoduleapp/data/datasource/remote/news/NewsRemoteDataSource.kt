package com.example.singlemoduleapp.data.datasource.remote.news

import com.example.singlemoduleapp.data.model.news.NewsApiModel

interface NewsRemoteDataSource {
    fun fetchNews(): List<NewsApiModel>
}