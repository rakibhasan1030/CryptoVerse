package rakib.hasan.cryptoverse.data.remote

import rakib.hasan.cryptoverse.data.remote.dto.CoinDto
import retrofit2.http.GET
import retrofit2.http.Path

interface CoinPaprikaApi {

    @GET("/v1/coins")
    suspend fun getCoins(): List<CoinDto>
}