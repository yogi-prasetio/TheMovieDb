package com.dicoding.submission.movies.viewmodel

import org.junit.Test

import org.junit.Assert.*
import org.junit.Before

class TvViewModelTest {
    private lateinit var viewModel: TvViewModel

    @Before
    fun setUp() {
        viewModel = TvViewModel()
    }


    @Test
    fun getTvShows() {
        val tvshowEntities = viewModel.getTvShows()
        assertNotNull(tvshowEntities)
        assertEquals(11, tvshowEntities.size)
    }
}