package com.bhojak.rickandmorty.domain.repositories

import com.bhojak.rickandmorty.data.Result
import com.bhojak.rickandmorty.domain.model.Character
import com.bhojak.rickandmorty.domain.model.Characters
import kotlinx.coroutines.flow.Flow

interface CharacterRepository {

    fun getCharacters(page: Int): Flow<Result<List<Characters>>>

    suspend fun getCharacter(id: Int): Result<Character>
}