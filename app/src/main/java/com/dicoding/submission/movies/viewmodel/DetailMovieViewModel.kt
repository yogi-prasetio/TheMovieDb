package com.dicoding.submission.movies.viewmodel

import androidx.lifecycle.ViewModel
import com.dicoding.submission.movies.model.MoviesEntity
import com.dicoding.submission.movies.model.utils.DataDummy

class DetailMovieViewModel: ViewModel() {
    private lateinit var titleMovie: String

    fun setSelectedMovie(movie: String) {
        this.titleMovie = movie
    }

    fun getMovie(): MoviesEntity {
        lateinit var movie: MoviesEntity
        val moviesEntities = DataDummy.generateDummyMovies()
        for (movieEntity in moviesEntities) {
            if (movieEntity.title == titleMovie) {
                movie = movieEntity
            }
        }
        return movie
    }
}