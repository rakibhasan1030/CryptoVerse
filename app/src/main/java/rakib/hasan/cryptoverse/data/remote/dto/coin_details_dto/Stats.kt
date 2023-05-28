package rakib.hasan.cryptoverse.data.remote.dto.coin_details_dto


import com.google.gson.annotations.SerializedName

data class Stats(
    val contributors: Int,
    val followers: Int,
    val stars: Int,
    val subscribers: Int
)