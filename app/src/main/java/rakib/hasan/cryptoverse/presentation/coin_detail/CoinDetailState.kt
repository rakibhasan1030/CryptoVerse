package rakib.hasan.cryptoverse.presentation.coin_detail

import rakib.hasan.cryptoverse.domain.model.Coin
import rakib.hasan.cryptoverse.domain.model.CoinDetail

data class CoinDetailState(
    val isLoading: Boolean = false,
    val coins: CoinDetail? = null,
    val error: String = ""
)
