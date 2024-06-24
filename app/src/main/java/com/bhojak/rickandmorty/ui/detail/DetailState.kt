package com.bhojak.rickandmorty.ui.detail

import com.bhojak.rickandmorty.domain.model.Character

data class DetailState(
    val character: Character? = null,
    val isLoading: Boolean = false
)