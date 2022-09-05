import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    id("org.springframework.boot") version "2.7.3"
    id("io.spring.dependency-management") version "1.0.13.RELEASE"

    id("com.google.cloud.tools.jib") version "3.2.1"
    id("nu.studer.jooq") version "7.1.1"

    kotlin("jvm") version "1.6.21"
    kotlin("plugin.spring") version "1.6.21"
}

group = "com.ezpc"
version = "0.0.1-SNAPSHOT"
java.sourceCompatibility = JavaVersion.VERSION_17

repositories {
    mavenCentral()
}

dependencies {

    jooqGenerator("mysql:mysql-connector-java:8.0.30")
    jooqGenerator("jakarta.xml.bind:jakarta.xml.bind-api:4.0.0")

    implementation("org.springframework.boot:spring-boot-starter-jooq")
    implementation("org.springframework.boot:spring-boot-starter-web")
    implementation("org.springframework.boot:spring-boot-starter-actuator")
    implementation("org.springframework.boot:spring-boot-starter-security")

    implementation("io.micrometer:micrometer-registry-prometheus")

    implementation(project(":domain"))

    runtimeOnly("mysql:mysql-connector-java")
    compileOnly("org.jetbrains:annotations:23.0.0")

    implementation("com.fasterxml.jackson.module:jackson-module-kotlin")
    implementation("org.jetbrains.kotlin:kotlin-reflect")
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")

    implementation("org.springdoc:springdoc-openapi-ui:1.6.11")

    testImplementation("org.springframework.boot:spring-boot-starter-test")
}

tasks.withType<KotlinCompile> {
    kotlinOptions {
        freeCompilerArgs = listOf("-Xjsr305=strict")
        jvmTarget = "17"
    }
}

tasks.withType<Test> {
    useJUnitPlatform()
}


jooq {
    version.set("3.17.3")
    edition.set(nu.studer.gradle.jooq.JooqEdition.OSS)

    configurations {

        val DB_NAME = System.getenv("DB_NAME") ?: "spring"
        val DB_USER = System.getenv("DB_USER") ?: "root"
        val DB_PASS = System.getenv("DB_PASS") ?: "sinty"

        create("main") {
            generateSchemaSourceOnCompilation.set(false)

            jooqConfiguration.apply {
                logging = org.jooq.meta.jaxb.Logging.WARN

                jdbc.apply {
                    driver = "com.mysql.cj.jdbc.Driver"
                    url = "jdbc:mysql://127.0.0.1:3306/$DB_NAME"
                    user = DB_USER
                    password = DB_PASS
                }

                generator.apply {
                    name = "org.jooq.codegen.DefaultGenerator"
                    strategy.name = "org.jooq.codegen.DefaultGeneratorStrategy"

                    database.apply {
                        inputSchema = DB_NAME
                    }

                    generate.apply {
                        isJavaTimeTypes = true
                        isPojos = true
                    }

                    target.apply {
                        packageName = "com.ezpc.mysql"
                    }


                }
            }
        }
    }
}

jib {
    from {
        image = "amazoncorretto:18-alpine"
    }
    container {
        creationTime = "USE_CURRENT_TIMESTAMP"
    }
}
