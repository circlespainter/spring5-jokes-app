package guru.springframework.joke

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
class SpringBootJokesApplication

fun main(args: Array<String>) {
    SpringApplication.run(SpringBootJokesApplication::class.java, *args)
}
