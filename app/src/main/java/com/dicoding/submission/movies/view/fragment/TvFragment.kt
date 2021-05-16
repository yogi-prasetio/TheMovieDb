package com.dicoding.submission.movies.view.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.dicoding.submission.movies.databinding.FragmentTvshowBinding
import com.dicoding.submission.movies.view.adapter.TvAdapter
import com.dicoding.submission.movies.viewmodel.TvViewModel

class TvFragment : Fragment() {
    private lateinit var frgmntmoviesbinding: FragmentTvshowBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        frgmntmoviesbinding = FragmentTvshowBinding.inflate(layoutInflater, container, false)
        return frgmntmoviesbinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        if (activity != null) {
            val viewModel = ViewModelProvider(this, ViewModelProvider.NewInstanceFactory())[TvViewModel::class.java]
            val show = viewModel.getTvShows()

            val tvAdapter = TvAdapter()
            tvAdapter.setTvShows(show)

            showLoading(true)
            with(frgmntmoviesbinding.rvTvShow) {
                layoutManager = LinearLayoutManager(context)
                setHasFixedSize(true)
                adapter = tvAdapter
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