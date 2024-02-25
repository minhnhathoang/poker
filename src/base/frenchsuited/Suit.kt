package base.cards.frenchsuited

enum class Suit(val value: Short) {
    CLUBS(16),      // '♣'
    DIAMONDS(32),   // '♦'
    HEARTS(64),     // '♥'
    SPADES(128);    // '♠'

    companion object {
        fun fromCode(code: Short): Suit {
            return when (code) {
                CLUBS.value -> CLUBS
                DIAMONDS.value -> DIAMONDS
                HEARTS.value -> HEARTS
                SPADES.value -> SPADES
                else -> throw IllegalArgumentException("Invalid suit code: $code")
            }
        }
    }
}
