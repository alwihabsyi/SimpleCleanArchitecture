package com.alwihabsyi.simplecleanarchitecture.di

import com.alwihabsyi.simplecleanarchitecture.data.IMessageDataSource
import com.alwihabsyi.simplecleanarchitecture.data.MessageDataSource
import com.alwihabsyi.simplecleanarchitecture.data.MessageRepository
import com.alwihabsyi.simplecleanarchitecture.domain.IMessageRepository
import com.alwihabsyi.simplecleanarchitecture.domain.MessageInteractor
import com.alwihabsyi.simplecleanarchitecture.domain.MessageUseCase

object Injection {
    fun provideUseCase(): MessageUseCase {
        val messageRepository = provideRepository()
        return MessageInteractor(messageRepository)
    }

    private fun provideRepository(): IMessageRepository {
        val messageDataSource = provideDataSource()
        return MessageRepository(messageDataSource)
    }

    private fun provideDataSource(): IMessageDataSource {
        return MessageDataSource()
    }
}