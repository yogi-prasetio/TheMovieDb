package com.dicoding.submission.movies.viewmodel

import androidx.lifecycle.ViewModel
import com.dicoding.submission.movies.model.TvshowEntity
import com.dicoding.submission.movies.model.utils.DataDummy

class TvViewModel: ViewModel() {
    fun getTvShows(): List<TvshowEntity> = DataDummy.generateDummyTvShows()

}