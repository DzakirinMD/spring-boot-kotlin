package net.springbootkotlin.configuration

import net.springbootkotlin.model.Articles
import net.springbootkotlin.model.Users
import net.springbootkotlin.repositories.ArticleRepository
import net.springbootkotlin.repositories.UserRepository
import org.springframework.boot.ApplicationRunner
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class BlogConfiguration {

    @Bean
    fun databaseInitializer(userRepository: UserRepository, articleRepository: ArticleRepository) = ApplicationRunner{

        val user1 = userRepository.save(Users("MrZack", "mr","zack"))

        // 1st Article Notice the usage of named parameters to make the code more readable.
        articleRepository.save(Articles(
            title = "Reactor Bismuth is out",
            headline = "1st article",
            content = "dolor sit amet",
            author = user1
        ))

        // 2nd Article
        articleRepository.save(Articles(
            title = "Reactor Aluminium has landed",
            headline = "2nd article",
            content = "dolor sit amet",
            author = user1
        ))
    }
}