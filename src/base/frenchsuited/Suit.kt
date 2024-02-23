package base.cards.frenchsuited

enum class Suit() {
    CLUBS,       // '♣'
    DIAMONDS,    // '♦'
    HEARTS,      // '♥'
    SPADES;      // '♠'

    companion object {
        fun toChar(suit: Suit): Char {
            return when (suit) {
                CLUBS -> '♣'
                DIAMONDS -> '♦'
                HEARTS -> '♥'
                SPADES -> '♠'
            }
        }
    }
}
