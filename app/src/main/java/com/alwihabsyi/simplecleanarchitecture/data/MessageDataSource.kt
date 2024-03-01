package com.alwihabsyi.simplecleanarchitecture.data

import com.alwihabsyi.simplecleanarchitecture.domain.MessageEntity

class MessageDataSource: IMessageDataSource {
    override fun getMessageFromSource(name: String): MessageEntity {
        return MessageEntity("Hello $name Welcome to Clean Architecture")
    }
}