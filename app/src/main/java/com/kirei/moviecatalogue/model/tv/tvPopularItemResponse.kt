package com.kirei.moviecatalogue.model.tv

import com.google.gson.annotations.SerializedName

data class tvPopularItemResponse(

@SerializedName("poster_path")
val poster_path:String,

@SerializedName("name", alternate = ["name"])
val name:String,

@SerializedName("popularity")
val popularity:Double,

@SerializedName("original_language")
val original_language:String

)
