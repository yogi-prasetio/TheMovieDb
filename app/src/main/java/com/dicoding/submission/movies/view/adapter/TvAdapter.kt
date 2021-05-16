package com.dicoding.submission.movies.view.adapter

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Build
import android.text.Layout
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.dicoding.submission.movies.R
import com.dicoding.submission.movies.databinding.ItemsTvShowBinding
import com.dicoding.submission.movies.model.TvshowEntity
import com.dicoding.submission.movies.view.detail.DetailTvShowActivity

class TvAdapter: RecyclerView.Adapter<TvAdapter.TvShowViewHolder>() {
    private var listShow = ArrayList<TvshowEntity>()

    fun setTvShows(tvshow: List<TvshowEntity>?) {
        if (tvshow == null) return
        this.listShow.clear()
        this.listShow.addAll(tvshow)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TvShowViewHolder {
        val itemsShowBinding = ItemsTvShowBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return TvShowViewHolder(itemsShowBinding)
    }

    override fun onBindViewHolder(holder: TvShowViewHolder, position: Int) {
        val tvshow = listShow[position]
        holder.bind(tvshow)
    }

    override fun getItemCount(): Int = listShow.size


    class TvShowViewHolder(private val binding: ItemsTvShowBinding) : RecyclerView.ViewHolder(binding.root) {
        @SuppressLint("WrongConstant")
        fun bind(data: TvshowEntity) {
            with(binding) {
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
                    tvItemDescription.justificationMode = Layout.JUSTIFICATION_MODE_INTER_WORD
                }
                tvItemTitle.text = data.title
                tvItemRelease.text = data.release
                tvItemDescription.text = data.description
                itemView.setOnClickListener {
                    val intent = Intent(itemView.context, DetailTvShowActivity::class.java)
                    intent.putExtra(DetailTvShowActivity.EXTRA_TV_SHOW, data.title)
                    itemView.context.startActivity(intent)
                }

                Glide.with(itemView.context)
                    .load(data.poster)
                    .apply(RequestOptions.placeholderOf(R.drawable.ic_loading)
                        .error(R.drawable.ic_error))
                    .into(imgPoster)
            }
        }
    }
}
