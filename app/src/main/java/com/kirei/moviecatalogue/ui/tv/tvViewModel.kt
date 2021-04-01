package com.kirei.moviecatalogue.ui.tv

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.kirei.moviecatalogue.BuildConfig
import com.kirei.moviecatalogue.model.tv.tvPopularItemResponse
import com.kirei.moviecatalogue.model.tv.tvPopularResponse
import com.kirei.moviecatalogue.network.RetrofitConfig
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class tvViewModel : ViewModel() {

    fun initPopularTv(page : Int){
        getPopularTv(page)
    }
    private val dataPopularTv = MutableLiveData<List<tvPopularItemResponse>>()

    private fun getPopularTv(page: Int) {
        RetrofitConfig().getApiService().getTvPopular(BuildConfig.API_KEY, page)
            .enqueue(object  : Callback<tvPopularResponse>{
                override fun onFailure(call: Call<tvPopularResponse>, t: Throwable) {
                    TODO("Not yet implemented")
                }

                override fun onResponse(
                    call: Call<tvPopularResponse>,
                    response: Response<tvPopularResponse>
                ) {
                    TODO("Not yet implemented")
                }
            })
    }

    fun getTvPopularData() : LiveData<List<tvPopularItemResponse>>{
        return dataPopularTv
    }

}