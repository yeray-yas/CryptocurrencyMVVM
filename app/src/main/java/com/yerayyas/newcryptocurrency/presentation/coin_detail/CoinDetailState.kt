package com.yerayyas.newcryptocurrency.presentation.coin_detail

import com.yerayyas.newcryptocurrency.domain.model.CoinDetail

data class CoinDetailState(
    val isLoading: Boolean = false,
    val coin: CoinDetail? = null,
    val error: String = ""
)