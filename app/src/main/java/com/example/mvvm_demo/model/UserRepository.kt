package com.example.mvvm_demo.model

import kotlinx.coroutines.delay

class UserRepository {

    suspend fun fetchUserData() : UserData{
        delay(2000)
        return UserData("John",25)
    }
}