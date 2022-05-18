package com.example.kmmhelloprint

class Greeting {
    fun greeting(): String {
        return "Hello, from ${Platform().platform}!"
    }
}