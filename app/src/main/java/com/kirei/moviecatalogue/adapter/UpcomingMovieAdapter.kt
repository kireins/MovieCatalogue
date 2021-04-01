package com.kirei.moviecatalogue.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.kirei.moviecatalogue.BuildConfig
import com.kirei.moviecatalogue.R
import com.kirei.moviecatalogue.model.movie.UpcomingResponse
import kotlinx.android.synthetic.main.item_upcoming_movie.view.*

class UpcomingMovieAdapter(val listUpcoming: List<UpcomingResponse>) : RecyclerView.Adapter<UpcomingMovieAdapter.UpcomingMovieViewHolder>() {
    class UpcomingMovieViewHolder(val view: View) : RecyclerView.ViewHolder(view) {
        fun bind(upcomingMovies : UpcomingResponse){
            with(itemView){
                Glide.with(context)
                    .load(BuildConfig.IMAGE_URL + upcomingMovies.poster_path)
                    .into(iv_upcoming)
                tv_title_upcoming.text = upcomingMovies.title
                tv_desc_upcoming.text = upcomingMovies.overview
                tv_date_upcoming.text = upcomingMovies.date

            }
        }

    }

    override fun onCreateViewHolder(
        parent: ViewGroup, viewType: Int
    ): UpcomingMovieViewHolder {
        return UpcomingMovieViewHolder(LayoutInflater.from(parent.context)
            .inflate(R.layout.item_upcoming_movie,parent,false))
    }

    override fun getItemCount(): Int = listUpcoming.size

    override fun onBindViewHolder(holder: UpcomingMovieViewHolder,
                                  position: Int) {

    }
    holder.bind(listUpcoming)


}