package com.yerayyas.newcryptocurrency.domain.repository

import com.yerayyas.newcryptocurrency.data.remote.dto.CoinDetailDto
import com.yerayyas.newcryptocurrency.data.remote.dto.CoinDto

interface CoinRepository {

    suspend fun getCoins(): List<CoinDto>

    suspend fun getCoinById(coinId: String): CoinDetailDto
}