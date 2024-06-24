package com.bhojak.rickandmorty.domain.use_case

import com.bhojak.rickandmorty.data.Result
import com.bhojak.rickandmorty.domain.model.Character
import com.bhojak.rickandmorty.domain.repositories.CharacterRepository
import javax.inject.Inject

class GetCharacterUseCase @Inject constructor(
    private val repository: CharacterRepository
) {
    suspend operator fun invoke(id: Int): Result<Character> {
        return repository.getCharacter(id)
    }
}