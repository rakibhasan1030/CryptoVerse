package rakib.hasan.cryptoverse.data.remote

import rakib.hasan.cryptoverse.data.remote.dto.CoinDto
import rakib.hasan.cryptoverse.data.remote.dto.coin_detail_dto.CoinDetailsDto
import retrofit2.http.GET
import retrofit2.http.Path

interface CoinPaprikaApi {

    @GET("/v1/coins")
    suspend fun getCoins(): List<CoinDto>

    @GET("v1/coins/{coinId}")
    suspend fun getCoinById(@Path("coinId") coinId: String) : CoinDetailsDto
}