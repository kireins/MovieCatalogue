package com.kirei.moviecatalogue.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.kirei.moviecatalogue.BuildConfig
import com.kirei.moviecatalogue.R
import com.kirei.moviecatalogue.model.movie.MovieItemResponse
import kotlinx.android.synthetic.main.item_movie_popular.view.*

class PopularMovieAdapter (var listMovie : List<MovieItemResponse>) : RecyclerView.Adapter<PopularMovieAdapter.MovieViewHolder>(){
    inner class  MovieViewHolder (val view : View): RecyclerView.ViewHolder (view){
        fun bind (movieItems : MovieItemResponse) {
            with(itemView) {
                Glide.with(context).load(BuildConfig.IMAGE_URL + movieItems.poster_path).into(iv_movie_poster)
                tv_title_movie.text = movieItems.title
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MovieViewHolder {
        return MovieViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_movie_popular, parent, false))
    }

    override fun onBindViewHolder(holder: MovieViewHolder, position: Int) {
        holder.bind(listMovie.get(position))
    }

    override fun getItemCount(): Int = listMovie.size
}