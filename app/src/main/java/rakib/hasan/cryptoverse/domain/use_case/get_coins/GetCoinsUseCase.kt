package rakib.hasan.cryptoverse.domain.use_case.get_coins

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import rakib.hasan.cryptoverse.common.Resource
import rakib.hasan.cryptoverse.data.remote.dto.toCoin
import rakib.hasan.cryptoverse.domain.model.Coin
import rakib.hasan.cryptoverse.domain.repository.CoinRepository
import retrofit2.HttpException
import java.io.IOException
import javax.inject.Inject

class GetCoinsUseCase @Inject constructor(
    private val repository: CoinRepository
) {
    operator fun invoke() : Flow<Resource<List<Coin>>> = flow {
        try {
            emit(Resource.Loading())
            val coins = repository.getCoin().map { it.toCoin() }
            emit(Resource.Success(coins))
        } catch (e: HttpException){
            emit(Resource.Error(e.localizedMessage ?: "An unexpected error occurred."))
        } catch (e: IOException){
            emit(Resource.Error("Couldn't reach to the server. Please, check your internet connection."))
        }
    }
}