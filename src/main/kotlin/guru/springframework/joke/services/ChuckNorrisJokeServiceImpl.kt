package guru.springframework.joke.services

import guru.springframework.norris.chuck.ChuckNorrisQuotes
import org.springframework.context.annotation.Primary
import org.springframework.stereotype.Service

@Service
@Primary
class ChuckNorrisJokeServiceImpl: JokeService {
    override val name = "chucknorris"

    override val nextJoke: String
        get() = quotesRepo.randomQuote

    private val quotesRepo = ChuckNorrisQuotes()
}
