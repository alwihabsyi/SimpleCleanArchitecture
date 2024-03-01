package com.alwihabsyi.simplecleanarchitecture.domain

interface MessageUseCase {
    fun getMessage(name: String): MessageEntity
}