package com.bhojak.rickandmorty.data.source.remote.dto

data class Info(
    val count: Int,
    val next: String,
    val pages: Int,
    val prev: Any
)