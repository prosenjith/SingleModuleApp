package com.example.singlemoduleapp.data.repository.news

import com.example.singlemoduleapp.data.datasource.remote.news.NewsRemoteDataSource
import com.example.singlemoduleapp.data.model.news.NewsApiModel

class NewsRepositoryImpl(val remoteDataSource: NewsRemoteDataSource): NewsRepository {
    override fun fetchNews(): List<NewsApiModel> {
        return remoteDataSource.fetchNews()
    }
}