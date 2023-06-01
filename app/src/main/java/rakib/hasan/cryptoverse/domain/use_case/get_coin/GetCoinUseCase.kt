package rakib.hasan.cryptoverse.domain.use_case.get_coin

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import rakib.hasan.cryptoverse.common.Resource
import rakib.hasan.cryptoverse.data.remote.dto.coin_detail_dto.toCoinDetail
import rakib.hasan.cryptoverse.data.remote.dto.toCoin
import rakib.hasan.cryptoverse.domain.model.Coin
import rakib.hasan.cryptoverse.domain.model.CoinDetail
import rakib.hasan.cryptoverse.domain.repository.CoinRepository
import retrofit2.HttpException
import java.io.IOException
import javax.inject.Inject

class GetCoinUseCase @Inject constructor(
    private val coinRepository: CoinRepository
) {
    operator fun invoke(coinId : String) : Flow<Resource<CoinDetail>> = flow {
        try {
            emit(Resource.Loading())
            val coins = coinRepository.getCoinById(coinId).toCoinDetail()
            emit(Resource.Success(coins))
        } catch (e: HttpException){
            emit(Resource.Error(e.localizedMessage ?: "An unexpected error occurred."))
        } catch (e: IOException){
            emit(Resource.Error("Couldn't reach to the server. Please, check your internet connection."))
        }
    }
}