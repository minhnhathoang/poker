package base.cards.frenchsuited

enum class Rank(val value: Short) {
    JOKER(0),
    ACE(1),
    TWO(2),
    THREE(3),
    FOUR(4),
    FIVE(5),
    SIX(6),
    SEVEN(7),
    EIGHT(8),
    NINE(9),
    TEN(10),
    JACK(11),
    QUEEN(12),
    KING(13);

    companion object {
        fun fromCode(code: Short): Rank {
            return when (code) {
                JOKER.value -> JOKER
                ACE.value -> ACE
                TWO.value -> TWO
                THREE.value -> THREE
                FOUR.value -> FOUR
                FIVE.value -> FIVE
                SIX.value -> SIX
                SEVEN.value -> SEVEN
                EIGHT.value -> EIGHT
                NINE.value -> NINE
                TEN.value -> TEN
                JACK.value -> JACK
                QUEEN.value -> QUEEN
                KING.value -> KING
                else -> throw IllegalArgumentException("Invalid rank code: $code")
            }
        }

        fun toChar(rank: Rank): String {
            return when (rank) {
                JOKER -> "Joker"
                ACE -> "A"
                TWO -> "2"
                THREE -> "3"
                FOUR -> "4"
                FIVE -> "5"
                SIX -> "6"
                SEVEN -> "7"
                EIGHT -> "8"
                NINE -> "9"
                TEN -> "T"
                JACK -> "J"
                QUEEN -> "Q"
                KING -> "K"
            }
        }
    }
}