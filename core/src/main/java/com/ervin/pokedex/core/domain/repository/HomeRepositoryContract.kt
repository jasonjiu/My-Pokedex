package com.ervin.pokedex.core.domain.repository

import com.ervin.pokedex.core.data.source.Resource
import com.ervin.pokedex.core.domain.model.Pokemon
import kotlinx.coroutines.flow.Flow

interface HomeRepositoryContract {
    fun getAllLocalPokemon(): Flow<Resource<List<Pokemon>>>
    suspend fun getSearchedPokemon(input: String): List<Pokemon>
    fun getAllFavoritePokemon(): Flow<Resource<List<Pokemon>>>
    fun getLocalPokemonSize(): Flow<Int>
    fun maybeGetRemoteElement(): Flow<Resource<Int>>
}