package org.example.webservicekotlin.Service

import org.springframework.stereotype.Service

@Service
class UserService : UserServiceUtility {

    override fun test(stringTest: String): String { return "hehe" }

    override fun greetUserFromService(): String { return "hello from service class" }

}