package com.learn.mock

interface PhoneBook {

    fun setNumber(name: String, number: String)

    fun getNumber(name: String): String
}
