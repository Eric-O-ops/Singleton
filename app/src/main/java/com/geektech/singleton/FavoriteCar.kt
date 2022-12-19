package com.geektech.singleton

class FavoriteCar private constructor(){

    companion object {
        private var instance: FavoriteCar? = null

        operator fun invoke() = synchronized(this){
            if (instance == null) { instance = FavoriteCar()}
            instance
        }
    }
}