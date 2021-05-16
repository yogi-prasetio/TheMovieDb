package com.dicoding.submission.movies.model

data class MoviesEntity(
    var poster: Int,
    var title: String,
    var release: String,
    var rating: String,
    var duration: String,
    var producer: String,
    var genre: String,
    var actor: String,
    var description: String
)
