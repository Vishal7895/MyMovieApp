package com.example.mymovieapp.DTO

import com.example.mymovieapp.Enums.Status

data class Resource<out T>(val status: Status, val data: T?, val message: String?) {
    companion object {
        fun <T> success(data: T?,message: String?): Resource<T> {
            return Resource(Status.SUCCESS, data, message)
        }
        fun <T> error(msg: String?, data: T?, errorCode:String?): Resource<T> {
            return Resource(Status.ERROR, data, msg)
        }

        fun <T> loading(): Resource<T> {
            return Resource(Status.LOADING, null, null)
        }

        fun <T> empty(): Resource<T> {
            return Resource(Status.EMPTY, null, null)
        }
    }
}