package com.kirei.moviecatalogue.network

import com.kirei.moviecatalogue.model.movie.PopularResponse
import com.kirei.moviecatalogue.model.movie.UpcomingResponse
import com.kirei.moviecatalogue.model.tv.tvPopularResponse
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {
    @GET("/movie/popular")
    fun getPopular(
            @Query("api_key") apiKey: String,
            @Query("page") page: Int
    ): retrofit2.Call<PopularResponse>

    @GET("/movie/upcoming")
    fun getUpcoming(
            @Query("api_key") apiKey: String,
            @Query("page") page: Int
    ): retrofit2.Call<UpcomingResponse>

    @GET("tv/popular")
    fun getTvPopular(
        @Query("api_key") apiKey: String,
        @Query("page") page: Int
    ): retrofit2.Call<tvPopularResponse>



}