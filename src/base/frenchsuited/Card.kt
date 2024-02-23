package base.cards.frenchsuited

class Card(val rank: Rank, val suit: Suit) {
    override fun toString(): String {
        return "${Rank.toChar(rank)}${Suit.toChar(suit)}"
    }
}