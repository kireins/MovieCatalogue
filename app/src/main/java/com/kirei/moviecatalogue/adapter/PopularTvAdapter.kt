package com.kirei.moviecatalogue.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.kirei.moviecatalogue.R
import com.kirei.moviecatalogue.model.tv.tvPopularItemResponse

class PopularTvAdapter(var listTvPopular : List<tvPopularItemResponse>)
    : RecyclerView.Adapter<PopularTvAdapter.TvPopularViewHolder>( ){

    class TvPopularViewHolder(view : View) : RecyclerView.ViewHolder(view){

    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): PopularTvAdapter.TvPopularViewHolder {
        return TvPopularViewHolder(LayoutInflater.from(parent.context)
            .inflate((R.layout.item_tv_popular, parent, false))
    }

    override fun getItemCount(): Int {
        listTvPopular.size
    }

    override fun onBindViewHolder(holder: PopularTvAdapter.TvPopularViewHolder, position: Int) {
       fun bind(tvpopular: tvPopularItemResponse){
           with(itemView){View
               Glide.with(context).load(BuildConfig)
       }
    }

}