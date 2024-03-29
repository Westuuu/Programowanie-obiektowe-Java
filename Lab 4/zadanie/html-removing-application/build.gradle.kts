fun doFirst(function: () -> Unit) {

}

plugins {
    id("java")
    id("application")
}
application {
    mainClass = "org.example.Application"
}
group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.9.1"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    implementation(project(":html-remover"))
}
tasks.test {
    useJUnitPlatform()
}

