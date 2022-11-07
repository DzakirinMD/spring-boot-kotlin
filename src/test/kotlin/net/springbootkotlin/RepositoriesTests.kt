package net.springbootkotlin

import net.springbootkotlin.model.Articles
import net.springbootkotlin.model.Users
import net.springbootkotlin.repositories.ArticleRepository
import net.springbootkotlin.repositories.UserRepository
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager
import org.springframework.data.repository.findByIdOrNull

//import org.assertj.core.api.Assertions.assertThat
//import org.junit.jupiter.api.Test
//import org.springframework.beans.factory.annotation.Autowired
//import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest
//import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager
//import org.springframework.data.repository.findByIdOrNull

@DataJpaTest
class RepositoriesTests @Autowired constructor(
    val entityManager: TestEntityManager,
    val userRepository: UserRepository,
    val articleRepository: ArticleRepository)
{
    @Test
    fun `When findByIdOrNull then return Article`() {
        val juergen = Users("springjuergen", "Juergen", "Hoeller")
        entityManager.persist(juergen)

        val articles = Articles("Spring Framework 5.0 goes GA", "Dear Spring community ...", "Lorem ipsum", juergen)
        entityManager.persist(articles)
        entityManager.flush()

        val found = articleRepository.findByIdOrNull(articles.id!!)
        assertThat(found).isEqualTo(articles)
    }

    @Test
    fun `When findByLogin then return User`() {
        val juergen = Users("springjuergen", "Juergen", "Hoeller")
        entityManager.persist(juergen)
        entityManager.flush()

        val user = userRepository.findByLogin(juergen.login)
        assertThat(user).isEqualTo(juergen)
    }
}