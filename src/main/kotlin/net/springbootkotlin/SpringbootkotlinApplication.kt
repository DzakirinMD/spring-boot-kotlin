package net.springbootkotlin

import net.springbootkotlin.configuration.BlogProperties
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.context.properties.EnableConfigurationProperties
import org.springframework.boot.runApplication

@SpringBootApplication
@EnableConfigurationProperties(BlogProperties::class)
class SpringbootkotlinApplication

fun main(args: Array<String>) {
	runApplication<SpringbootkotlinApplication>(*args)
}
