package com.bhojak.rickandmorty.di

import com.bhojak.rickandmorty.data.repositories.CharacterRepositoryImpl
import com.bhojak.rickandmorty.domain.repositories.CharacterRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent

@Module
@InstallIn(ViewModelComponent::class)
abstract class RepositoriesModule {

    @Binds
    abstract fun bindCharacterRepository(impl: CharacterRepositoryImpl): CharacterRepository
}