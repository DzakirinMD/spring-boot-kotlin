package net.springbootkotlin.model

import net.springbootkotlin.util.toSlug
import java.time.LocalDateTime
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id
import javax.persistence.ManyToOne

@Entity
class Article (

    // The Kotlin programming language uses the question mark (?) symbol for many of its null safety features.
    // Null safety is a feature of modern programming languages created to reduce (or eliminate) the danger of referencing null values in your source code.
    @Id @GeneratedValue var id: Long? = null,
    @ManyToOne var author: User,

    var title: String,
    var headline: String,
    var content: String,

    // A slug is a human-readable, unique identifier, used to identify a resource instead of a less human-readable identifier like an id
    var slug: String = title.toSlug(),
    var addedAt: LocalDateTime = LocalDateTime.now()

)

@Entity
class User (

    @Id @GeneratedValue var id: Long? = null,
    var login: String,
    var firstname: String,
    var lastname: String,
    var description: String? = null

)