package com.example.singlemoduleapp.data.mapper

interface Mapper<X, Y> {
    fun from(source: X): Y
    fun to(destination: Y): X
}