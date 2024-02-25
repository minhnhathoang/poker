package game.poker

enum class PokerHand(val value: Int) {
    HIGH_CARD       (0),
    PAIR            (1 shl 0),
    TWO_PAIR        (1 shl 1),
    TRIPS           (1 shl 2),
    FOUR            (1 shl 3),
    FULL_HOUSE      (1 shl 4),
    STRAIGHT        (1 shl 5),
    FLUSH           (1 shl 6),
    STRAIGHT_FLUSH  (STRAIGHT.value or FLUSH.value)
}