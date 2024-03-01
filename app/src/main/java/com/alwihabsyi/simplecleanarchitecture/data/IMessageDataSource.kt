package com.alwihabsyi.simplecleanarchitecture.data

import com.alwihabsyi.simplecleanarchitecture.domain.MessageEntity

interface IMessageDataSource {
    fun getMessageFromSource(name: String): MessageEntity
}