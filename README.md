# spring-boot-kotlin

1. [Spring Initializr](https://start.spring.io/#!type=maven-project&language=kotlin&platformVersion=2.7.5&packaging=jar&jvmVersion=1.8&groupId=net&artifactId=springbootkotlin&name=springbootkotlin&description=Demo%20project%20for%20Spring%20Boot%20with%20Kotlin&packageName=net.springbootkotlin&dependencies=web,mustache,data-jpa,h2,devtools)

<h1>Dependencies</h1>
3 Kotlin specific libraries are required for such Spring Boot web application and configured by default:

- kotlin-stdlib-jdk8 is the Java 8 variant of Kotlin standard library 
- kotlin-reflect is Kotlin reflection library (mandatory as of Spring Framework 5)
- jackson-module-kotlin adds support for serialization/deserialization of Kotlin classes and data classes (single constructor classes can be used automatically, and those with secondary constructors or static factories are also supported)