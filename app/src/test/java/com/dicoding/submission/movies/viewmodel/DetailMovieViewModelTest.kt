package com.dicoding.submission.movies.viewmodel

import com.dicoding.submission.movies.model.utils.DataDummy
import org.junit.Test

import org.junit.Assert.*
import org.junit.Before

class DetailMovieViewModelTest {
    private lateinit var viewModel: DetailMovieViewModel
    private val dummyMovie = DataDummy.generateDummyMovies()[0]
    private val title = dummyMovie.title

    @Before
    fun setUp() {
        viewModel = DetailMovieViewModel()
        viewModel.setSelectedMovie(title)
    }

    @Test
    fun getMovie() {
        viewModel.setSelectedMovie(dummyMovie.title)
        val movieEntity = viewModel.getMovie()
        assertNotNull(movieEntity)
        assertEquals(dummyMovie.poster, movieEntity.poster)
        assertEquals(dummyMovie.title, movieEntity.title)
        assertEquals(dummyMovie.release, movieEntity.release)
        assertEquals(dummyMovie.rating, movieEntity.rating)
        assertEquals(dummyMovie.duration, movieEntity.duration)
        assertEquals(dummyMovie.genre, movieEntity.genre)
        assertEquals(dummyMovie.producer, movieEntity.producer)
        assertEquals(dummyMovie.actor, movieEntity.actor)
        assertEquals(dummyMovie.description, movieEntity.description)
    }
}