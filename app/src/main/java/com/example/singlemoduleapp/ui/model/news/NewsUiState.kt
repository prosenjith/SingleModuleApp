package com.example.singlemoduleapp.ui.model.news

data class NewsUiState(
    val articles: List<ArticleUiState?>? = null,
    val status: String? = null,
    val totalResults: Int? = null
)