package com.example.singlemoduleapp.ui.model.news

data class ArticleUiState(
    val author: String? = null,
    val content: String? = null,
    val description: String? = null,
    val publishedAt: String? = null,
    val source: SourceUiState? = null,
    val title: String? = null,
    val url: String? = null,
    val urlToImage: String? = null
)