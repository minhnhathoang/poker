package base.cards.frenchsuited

enum class Rank {
    ACE,
    TWO,
    THREE,
    FOUR,
    FIVE,
    SIX,
    SEVEN,
    EIGHT,
    NINE,
    TEN,
    JACK,
    QUEEN,
    KING;

    companion object {
        fun toChar(rank: Rank): Char {
            return when (rank) {
                ACE -> 'A'
                TWO -> '2'
                THREE -> '3'
                FOUR -> '4'
                FIVE -> '5'
                SIX -> '6'
                SEVEN -> '7'
                EIGHT -> '8'
                NINE -> '9'
                TEN -> 'T'
                JACK -> 'J'
                QUEEN -> 'Q'
                KING -> 'K'
            }
        }
    }
}