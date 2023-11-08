plugins {
    id("java")
}

group = "com.ezpc"
version = "0.0.1-SNAPSHOT"

java.sourceCompatibility = JavaVersion.VERSION_20
java.targetCompatibility = JavaVersion.VERSION_20

repositories {
    mavenCentral()
}

dependencies {

    compileOnly("org.jetbrains:annotations:24.0.0")
    implementation("org.springdoc:springdoc-openapi-starter-webmvc-ui:2.2.0")

    testImplementation("org.junit.jupiter:junit-jupiter-api:5.9.0")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.9.0")
}

tasks.getByName<Test>("test") {
    useJUnitPlatform()
}
