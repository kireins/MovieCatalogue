package com.kirei.moviecatalogue.model.tv

import com.google.gson.annotations.SerializedName

data class tvPopularResponse(
@SerializedName("page")
val page:Int,
@SerializedName("results")
val results: ArrayList<tvPopularItemResponse>
)