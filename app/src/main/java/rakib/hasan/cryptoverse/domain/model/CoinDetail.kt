package rakib.hasan.cryptoverse.domain.model

import rakib.hasan.cryptoverse.data.remote.dto.coin_detail_dto.TeamMember

data class CoinDetail(
    val coinId: String,
    val name: String,
    val description: String,
    val symbol: String,
    val isActive: Boolean,
    val tags: List<String>,
    val team: List<TeamMember>
)
