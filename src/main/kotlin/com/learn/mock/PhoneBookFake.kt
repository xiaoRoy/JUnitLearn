package com.learn.mock

class PhoneBookFake : PhoneBook {

    private val contacts: MutableMap<String, String> = mutableMapOf()

    override fun setNumber(name: String, number: String) {
        contacts[name] = number
    }

    override fun getNumber(name: String): String = contacts.getOrDefault(name, "")

}
