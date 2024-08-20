package org.example.webservicekotlin.Controller

import org.example.webservicekotlin.Service.UserService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/greet")
class GreetingController(private val userService: UserService) {


    @GetMapping("/hello")
    fun greetUserWithWelcomeMessage(): String {
        return "hello utan params din madderfakker!"
    }

    @GetMapping("/hello/")
    fun greetUserWithWelcomeMessageAndItsOwnName(@RequestParam name: String): String {
        return "hello pårej din madderfakker $name"
    }

    @GetMapping("/helloservice")
    fun greetUserFromServiceClass(): String {
        return userService.greetUserFromService();
    }
}