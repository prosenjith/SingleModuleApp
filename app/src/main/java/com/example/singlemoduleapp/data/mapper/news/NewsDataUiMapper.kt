package com.example.singlemoduleapp.data.mapper.news

import com.example.singlemoduleapp.data.mapper.Mapper
import com.example.singlemoduleapp.data.model.news.NewsApiModel
import com.example.singlemoduleapp.ui.model.news.NewsUiState

class NewsDataUiMapper : Mapper<NewsUiState, NewsApiModel> {
    override fun from(source: NewsUiState): NewsApiModel {
        return NewsApiModel()
    }

    override fun to(destination: NewsApiModel): NewsUiState {
        return NewsUiState()
    }
}