package com.cloud.project.`for`.test.dployment.controller

import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseStatus
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("cloud")
class CloudController {

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    fun hello(): String {
        return "Hello world!"

    }
}