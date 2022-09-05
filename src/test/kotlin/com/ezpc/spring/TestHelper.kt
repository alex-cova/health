package com.ezpc.spring

import org.junit.jupiter.api.Assertions
import org.springframework.http.HttpMethod
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity

fun String.post(dto: Any): ResponseEntity<String> {
    return RestHelper.handleBody(this, dto, HttpMethod.POST, String::class.java)
}

fun String.put(dto: Any): ResponseEntity<String> {
    return RestHelper.handleBody(this, dto, HttpMethod.PUT, String::class.java)
}

fun String.get(): ResponseEntity<String> {
    return RestHelper.handle(this, HttpMethod.GET, String::class.java)
}

fun <T> String.get(type: Class<T>): ResponseEntity<T> {
    return RestHelper.handle(this, HttpMethod.GET, type)
}

fun <T> ResponseEntity<T>.assertOk(): ResponseEntity<T> {
    if (this.statusCode != HttpStatus.OK) {
        Assertions.fail<Any>("Expected 200 but got $statusCode body: $body")
    }

    return this
}

fun <T> ResponseEntity<T>.assertCreated(): ResponseEntity<T> {
    if (this.statusCode != HttpStatus.CREATED) {
        Assertions.fail<Any>("Expected 200 but got $statusCode body: $body")
    }
    return this
}

fun <T> ResponseEntity<T>.assertStatus(status : HttpStatus): ResponseEntity<T> {
    if (this.statusCode != status) {
        Assertions.fail<Any>("Expected 200 but got $statusCode body: $body")
    }

    return this
}
