package com.farez.composesubmission.data.repository

import com.farez.composesubmission.data.model.Messenger
import com.farez.composesubmission.data.model.MessengerList

class MessengerRepository {
    private val messenger = mutableListOf<Messenger>()
    fun getMessengers() : List<Messenger> = MessengerList.messengerList

    fun searchMessenger(q : String) : List<Messenger> =  MessengerList.messengerList.filter {
        it.name.contains(q, ignoreCase = true)
    }

    fun getMessengerById(messengerId: String): Messenger {
        return messenger.first {
                it.id == messengerId
        }
    }

    init {
        if (messenger.isEmpty()) {
            messenger.addAll(MessengerList.messengerList)
        }
    }

    companion object {
        @Volatile
        private var instance : MessengerRepository? = null
        fun getInstance() : MessengerRepository =
            instance ?: synchronized(this) {
                MessengerRepository().apply { instance = this }
            }

    }
}