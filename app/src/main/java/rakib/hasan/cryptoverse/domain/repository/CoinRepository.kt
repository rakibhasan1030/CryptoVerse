package rakib.hasan.cryptoverse.domain.repository

import rakib.hasan.cryptoverse.data.remote.dto.CoinDto
import rakib.hasan.cryptoverse.data.remote.dto.coin_detail_dto.CoinDetailsDto

interface CoinRepository {
    suspend fun getCoin(): List<CoinDto>
    suspend fun getCoinById(coinId: String): CoinDetailsDto
}