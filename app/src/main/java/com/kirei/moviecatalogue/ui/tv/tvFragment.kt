package com.kirei.moviecatalogue.ui.tv

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.kirei.moviecatalogue.R
import com.kirei.moviecatalogue.adapter.PopularTvAdapter
import com.kirei.moviecatalogue.model.tv.tvPopularItemResponse
import kotlinx.android.synthetic.main.fragment_tv.rv_tv_popular
import kotlinx.android.synthetic.main.fragment_tv.view.*

class TvFragment : Fragment() {
    private lateinit var popularTvAdapter: PopularTvAdapter
    private lateinit var tvViewModel: tvViewModel

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val root = inflater.inflate(R.layout.fragment_tv, container, false)
        tvViewModel =
                ViewModelProvider(this).get(tvViewModel::class.java)

        tvViewModel.initPopularTv(1)
        tvViewModel.getTvPopularData().observe(viewLifecycleOwner, Observer { tvPopular -> getInitTvPopular(tvPopular)})
        return root
    }

    private fun getInitTvPopular(tvPopular: List<tvPopularItemResponse>) {
        rv_tv_popular.apply {
            layoutManager =  LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, true)
            popularTvAdapter = PopularTvAdapter(tvPopular)
            rv_tv_popular.adapter = popularTvAdapter
        }
    }
}