package com.alwihabsyi.simplecleanarchitecture.data

import com.alwihabsyi.simplecleanarchitecture.domain.IMessageRepository
import com.alwihabsyi.simplecleanarchitecture.domain.MessageEntity

class MessageRepository(private val messageDataSource: IMessageDataSource): IMessageRepository {
    override fun getWelcomeMessage(name: String): MessageEntity {
        return messageDataSource.getMessageFromSource(name)
    }
}