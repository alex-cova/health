plugins {
    id("java")
}

group = "com.ezpc"
version = "0.0.1-SNAPSHOT"

java.sourceCompatibility = JavaVersion.VERSION_17

repositories {
    mavenCentral()
}

dependencies {

    compileOnly("org.jetbrains:annotations:23.0.0")
    implementation("org.springdoc:springdoc-openapi-ui:1.6.11")

    testImplementation("org.junit.jupiter:junit-jupiter-api:5.9.0")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.9.0")
}

tasks.getByName<Test>("test") {
    useJUnitPlatform()
}
