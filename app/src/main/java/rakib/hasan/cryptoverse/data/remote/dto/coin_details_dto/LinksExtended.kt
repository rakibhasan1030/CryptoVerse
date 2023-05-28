package rakib.hasan.cryptoverse.data.remote.dto.coin_details_dto


import com.google.gson.annotations.SerializedName

data class LinksExtended(
    val stats: Stats,
    val type: String,
    val url: String
)