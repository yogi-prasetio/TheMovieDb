package com.dicoding.submission.movies.viewmodel

import androidx.lifecycle.ViewModel
import com.dicoding.submission.movies.model.TvshowEntity
import com.dicoding.submission.movies.model.utils.DataDummy

class DetailTvShowViewModel: ViewModel() {
    private lateinit var titleShow: String

    fun setSelectedShow(show: String) {
        this.titleShow = show
    }

    fun getTvShow(): TvshowEntity {
        lateinit var show: TvshowEntity
        val entities = DataDummy.generateDummyTvShows()
        for (tvshow in entities) {
            if (tvshow.title == titleShow) {
                show = tvshow
            }
        }
        return show
    }
}