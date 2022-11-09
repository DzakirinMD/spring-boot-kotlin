package net.springbootkotlin.repositories

import net.springbootkotlin.model.Articles
import net.springbootkotlin.model.Users
import org.springframework.data.repository.CrudRepository

interface ArticleRepository : CrudRepository<Articles, Long> {

    fun findBySlug(slug: String): Articles?

    fun findAllByOrderByAddedAtDesc(): Iterable<Articles>
}

interface UserRepository : CrudRepository<Users, Long> {

    fun findByLogin(login: String): Users?
}