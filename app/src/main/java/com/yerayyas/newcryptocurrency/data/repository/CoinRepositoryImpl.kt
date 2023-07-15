package com.yerayyas.newcryptocurrency.data.repository

import com.yerayyas.newcryptocurrency.data.remote.CoinPaprikaApi
import com.yerayyas.newcryptocurrency.data.remote.dto.CoinDetailDto
import com.yerayyas.newcryptocurrency.data.remote.dto.CoinDto
import com.yerayyas.newcryptocurrency.domain.repository.CoinRepository
import javax.inject.Inject


class CoinRepositoryImpl @Inject constructor(
    private val api: CoinPaprikaApi
) : CoinRepository {

    override suspend fun getCoins(): List<CoinDto> {
        return api.getCoins()
    }

    override suspend fun getCoinById(coinId: String): CoinDetailDto {
        return api.getCoinById(coinId)
    }
}