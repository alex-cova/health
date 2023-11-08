package com.ezpc.spring

import org.jooq.DSLContext
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.boot.test.web.client.TestRestTemplate
import org.springframework.test.context.junit.jupiter.SpringExtension

@ExtendWith(SpringExtension::class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class Tests {

    @Autowired
    val testRestTemplate: TestRestTemplate? = null

    @Autowired
    val dsl: DSLContext? = null

    @BeforeEach
    fun setUp() {
        RestHelper.testRestTemplate = testRestTemplate
    }

    @Test
    fun testRestTemplate() {
        assertNotNull(testRestTemplate)
    }


}

