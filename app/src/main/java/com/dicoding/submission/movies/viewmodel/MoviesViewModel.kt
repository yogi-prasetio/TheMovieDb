package com.dicoding.submission.movies.viewmodel

import androidx.lifecycle.ViewModel
import com.dicoding.submission.movies.model.MoviesEntity
import com.dicoding.submission.movies.model.utils.DataDummy

class MoviesViewModel: ViewModel() {
    fun getMovies(): List<MoviesEntity> = DataDummy.generateDummyMovies()
}