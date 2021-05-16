package com.dicoding.submission.movies.view.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.dicoding.submission.movies.databinding.FragmentMoviesBinding
import com.dicoding.submission.movies.view.adapter.MoviesAdapter
import com.dicoding.submission.movies.viewmodel.MoviesViewModel

class MoviesFragment : Fragment() {
    private lateinit var frgmntmoviesbinding: FragmentMoviesBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        frgmntmoviesbinding = FragmentMoviesBinding.inflate(layoutInflater, container, false)
        return frgmntmoviesbinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        if (activity != null) {
            val viewModel = ViewModelProvider(this, ViewModelProvider.NewInstanceFactory())[MoviesViewModel::class.java]
            val movies = viewModel.getMovies()

            val moviesAdapter = MoviesAdapter()
            moviesAdapter.setMovies(movies)

            showLoading(true)
            with(frgmntmoviesbinding.rvMovie) {
                layoutManager = LinearLayoutManager(context)
                setHasFixedSize(true)
                adapter = moviesAdapter
                showLoading(false)
            }
        }
    }

    private fun showLoading(state: Boolean){
        if (state){
            frgmntmoviesbinding.progressBar.visibility = View.VISIBLE
        } else {
            frgmntmoviesbinding.progressBar.visibility = View.GONE
        }
    }
}