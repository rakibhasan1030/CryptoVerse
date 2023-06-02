package rakib.hasan.cryptoverse.presentation.coin_list

import rakib.hasan.cryptoverse.domain.model.Coin

data class CoinListState(
    val isLoading: Boolean = false,
    val coins: List<Coin> = emptyList(),
    val error: String = ""
)
