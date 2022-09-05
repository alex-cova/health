package com.ezpc.spring

import com.ezpc.country.CountryDto
import org.jooq.DSLContext
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Order
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.boot.test.web.client.TestRestTemplate
import org.springframework.test.context.junit.jupiter.SpringExtension
import java.util.*

@ExtendWith(SpringExtension::class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class CountryTests {

    @Autowired
    val testRestTemplate: TestRestTemplate? = null

    @Autowired
    val dsl: DSLContext? = null

    @BeforeEach
    fun setUp() {
        RestHelper.testRestTemplate = testRestTemplate
        dsl?.execute("DELETE FROM country")
    }

    @Test
     fun testRestTemplate() {
        assertNotNull(testRestTemplate)
    }

    @Order(1)
    @Test
    fun `create a new country`() {

        val id = UUID.randomUUID()

        "/country/".post(CountryDto(id, "México"))
            .assertOk();

        val country = "/country/$id".get(CountryDto::class.java)
            .assertOk()
            .body

        assertNotNull(country)
        assertEquals(country?.name, "México")

    }


}

