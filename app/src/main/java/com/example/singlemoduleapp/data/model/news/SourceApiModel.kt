package com.example.singlemoduleapp.data.model.news


import com.google.gson.annotations.SerializedName

data class SourceApiModel(
    @SerializedName("id")
    val id: String? = null,
    @SerializedName("name")
    val name: String? = null
)