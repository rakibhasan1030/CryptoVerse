package rakib.hasan.cryptoverse.data.repository

import rakib.hasan.cryptoverse.data.remote.CoinPaprikaApi
import rakib.hasan.cryptoverse.data.remote.dto.CoinDto
import rakib.hasan.cryptoverse.data.remote.dto.coin_detail_dto.CoinDetailsDto
import rakib.hasan.cryptoverse.domain.repository.CoinRepository
import javax.inject.Inject

class CoinRepositoryImpl @Inject constructor(
    private val api: CoinPaprikaApi
) : CoinRepository{

    override suspend fun getCoin(): List<CoinDto> = api.getCoins()

    override suspend fun getCoinById(coinId: String): CoinDetailsDto = api.getCoinById(coinId)

}