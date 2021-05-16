package com.dicoding.submission.movies.view.detail

import android.annotation.SuppressLint
import android.os.Build
import android.os.Bundle
import android.text.Layout.JUSTIFICATION_MODE_INTER_WORD
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.dicoding.submission.movies.R
import com.dicoding.submission.movies.databinding.ActivityDetailBinding
import com.dicoding.submission.movies.model.MoviesEntity
import com.dicoding.submission.movies.viewmodel.DetailMovieViewModel

class DetailMovieActivity : AppCompatActivity() {
    private lateinit var binding: ActivityDetailBinding

    companion object {
        const val EXTRA_MOVIES = "extra_movies"
    }

    @SuppressLint("WrongConstant")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val viewModel = ViewModelProvider(this).get(DetailMovieViewModel::class.java)

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            binding.tvItemDescription.justificationMode = JUSTIFICATION_MODE_INTER_WORD
        }

        val extras = intent.extras
        if (extras != null) {
            val title = extras.getString(EXTRA_MOVIES)
            if (title != null) {
                viewModel.setSelectedMovie(title)
                detailMovie(viewModel.getMovie())
            }
        }
    }

    private fun detailMovie(movieEntity: MoviesEntity) {
        val production = "Production"
        val actor = "Actors"
        binding.apply {
            tvItemTitle.text = movieEntity.title
            tvItemRelease.text = movieEntity.release
            tvItemRating.text = movieEntity.rating
            tvItemDuration.text = movieEntity.duration
            titleProduction.text = production
            titleActor.text = actor
            tvItemProduction.text = movieEntity.producer
            tvItemGenre.text = movieEntity.genre
            tvItemActor.text = movieEntity.actor
            tvItemDescription.text = movieEntity.description

            Glide.with(this@DetailMovieActivity)
                    .load(movieEntity.poster)
                    .apply(RequestOptions.placeholderOf(R.drawable.ic_loading).error(R.drawable.ic_error))
                    .into(imgPoster)
        }
    }
}