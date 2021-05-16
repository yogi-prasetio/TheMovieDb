package com.dicoding.submission.movies.viewmodel

import com.dicoding.submission.movies.model.utils.DataDummy
import org.junit.Test

import org.junit.Assert.*
import org.junit.Before

class DetailTvShowViewModelTest {
    private lateinit var viewModel: DetailTvShowViewModel
    private val dummyTvshow = DataDummy.generateDummyTvShows()[0]
    private val title = dummyTvshow.title

    @Before
    fun setUp() {
        viewModel = DetailTvShowViewModel()
        viewModel.setSelectedShow(title)
    }

    @Test
    fun getTvShow() {
        viewModel.setSelectedShow(dummyTvshow.title)
        val tvshowEntity = viewModel.getTvShow()
        assertNotNull(tvshowEntity)
        assertEquals(dummyTvshow.poster, tvshowEntity.poster)
        assertEquals(dummyTvshow.title, tvshowEntity.title)
        assertEquals(dummyTvshow.release, tvshowEntity.release)
        assertEquals(dummyTvshow.rating, tvshowEntity.rating)
        assertEquals(dummyTvshow.duration, tvshowEntity.duration)
        assertEquals(dummyTvshow.genre, tvshowEntity.genre)
        assertEquals(dummyTvshow.creator, tvshowEntity.creator)
        assertEquals(dummyTvshow.cast, tvshowEntity.cast)
        assertEquals(dummyTvshow.description, tvshowEntity.description)
    }
}