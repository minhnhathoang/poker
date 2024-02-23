package base.cards.frenchsuited

class Deck {
    val cards: List<Card> = Suit.values().flatMap { suit ->
        Rank.values().map { rank ->
            Card(rank, suit)
        }
    }

    fun shuffle() {
        cards.shuffled()
    }
}
