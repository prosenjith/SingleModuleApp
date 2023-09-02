package com.example.singlemoduleapp.data.datasource.remote.news

import com.example.singlemoduleapp.data.model.news.NewsApiModel

class NewsRemoteDataSourceImpl(val api: NewsApi): NewsRemoteDataSource {
    override fun fetchNews(): List<NewsApiModel>{
        return api.fetchNews()
    }
}