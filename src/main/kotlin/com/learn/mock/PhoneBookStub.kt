package com.learn.mock

class PhoneBookStub(private val number: String) : PhoneBook {

    override fun setNumber(name: String, number: String){
    }

    override fun getNumber(name: String) = number
}
