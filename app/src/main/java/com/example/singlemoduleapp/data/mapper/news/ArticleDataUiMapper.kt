package com.example.singlemoduleapp.data.mapper.news

import com.example.singlemoduleapp.data.mapper.Mapper
import com.example.singlemoduleapp.data.model.news.ArticleApiModel
import com.example.singlemoduleapp.ui.model.news.ArticleUiState

class ArticleDataUiMapper: Mapper<ArticleUiState, ArticleApiModel> {
    override fun from(source: ArticleUiState): ArticleApiModel {
        return ArticleApiModel()
    }

    override fun to(destination: ArticleApiModel): ArticleUiState {
        return ArticleUiState()
    }
}