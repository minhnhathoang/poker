package base.cards.frenchsuited

import kotlin.experimental.and
import kotlin.experimental.or

enum class Card(val value: Short) {
    JOKER(0),
    // clubs
    ACE_CLUBS(Rank.ACE.value or Suit.CLUBS.value),
    TWO_CLUBS(Rank.TWO.value or Suit.CLUBS.value),
    THREE_CLUBS(Rank.THREE.value or Suit.CLUBS.value),
    FOUR_CLUBS(Rank.FOUR.value or Suit.CLUBS.value),
    FIVE_CLUBS(Rank.FIVE.value or Suit.CLUBS.value),
    SIX_CLUBS(Rank.SIX.value or Suit.CLUBS.value),
    SEVEN_CLUBS(Rank.SEVEN.value or Suit.CLUBS.value),
    EIGHT_CLUBS(Rank.EIGHT.value or Suit.CLUBS.value),
    NINE_CLUBS(Rank.NINE.value or Suit.CLUBS.value),
    TEN_CLUBS(Rank.TEN.value or Suit.CLUBS.value),
    JACK_CLUBS(Rank.JACK.value or Suit.CLUBS.value),
    QUEEN_CLUBS(Rank.QUEEN.value or Suit.CLUBS.value),
    KING_CLUBS(Rank.KING.value or Suit.CLUBS.value),
    // diamonds
    ACE_DIAMONDS(Rank.ACE.value or Suit.DIAMONDS.value),
    TWO_DIAMONDS(Rank.TWO.value or Suit.DIAMONDS.value),
    THREE_DIAMONDS(Rank.THREE.value or Suit.DIAMONDS.value),
    FOUR_DIAMONDS(Rank.FOUR.value or Suit.DIAMONDS.value),
    FIVE_DIAMONDS(Rank.FIVE.value or Suit.DIAMONDS.value),
    SIX_DIAMONDS(Rank.SIX.value or Suit.DIAMONDS.value),
    SEVEN_DIAMONDS(Rank.SEVEN.value or Suit.DIAMONDS.value),
    EIGHT_DIAMONDS(Rank.EIGHT.value or Suit.DIAMONDS.value),
    NINE_DIAMONDS(Rank.NINE.value or Suit.DIAMONDS.value),
    TEN_DIAMONDS(Rank.TEN.value or Suit.DIAMONDS.value),
    JACK_DIAMONDS(Rank.JACK.value or Suit.DIAMONDS.value),
    QUEEN_DIAMONDS(Rank.QUEEN.value or Suit.DIAMONDS.value),
    KING_DIAMONDS(Rank.KING.value or Suit.DIAMONDS.value),
    // hearts
    ACE_HEARTS(Rank.ACE.value or Suit.HEARTS.value),
    TWO_HEARTS(Rank.TWO.value or Suit.HEARTS.value),
    THREE_HEARTS(Rank.THREE.value or Suit.HEARTS.value),
    FOUR_HEARTS(Rank.FOUR.value or Suit.HEARTS.value),
    FIVE_HEARTS(Rank.FIVE.value or Suit.HEARTS.value),
    SIX_HEARTS(Rank.SIX.value or Suit.HEARTS.value),
    SEVEN_HEARTS(Rank.SEVEN.value or Suit.HEARTS.value),
    EIGHT_HEARTS(Rank.EIGHT.value or Suit.HEARTS.value),
    NINE_HEARTS(Rank.NINE.value or Suit.HEARTS.value),
    TEN_HEARTS(Rank.TEN.value or Suit.HEARTS.value),
    JACK_HEARTS(Rank.JACK.value or Suit.HEARTS.value),
    QUEEN_HEARTS(Rank.QUEEN.value or Suit.HEARTS.value),
    KING_HEARTS(Rank.KING.value or Suit.HEARTS.value),
    // spades
    ACE_SPADES(Rank.ACE.value or Suit.SPADES.value),
    TWO_SPADES(Rank.TWO.value or Suit.SPADES.value),
    THREE_SPADES(Rank.THREE.value or Suit.SPADES.value),
    FOUR_SPADES(Rank.FOUR.value or Suit.SPADES.value),
    FIVE_SPADES(Rank.FIVE.value or Suit.SPADES.value),
    SIX_SPADES(Rank.SIX.value or Suit.SPADES.value),
    SEVEN_SPADES(Rank.SEVEN.value or Suit.SPADES.value),
    EIGHT_SPADES(Rank.EIGHT.value or Suit.SPADES.value),
    NINE_SPADES(Rank.NINE.value or Suit.SPADES.value),
    TEN_SPADES(Rank.TEN.value or Suit.SPADES.value),
    JACK_SPADES(Rank.JACK.value or Suit.SPADES.value),
    QUEEN_SPADES(Rank.QUEEN.value or Suit.SPADES.value),
    KING_SPADES(Rank.KING.value or Suit.SPADES.value);

    companion object {
        fun getSuit(card: Card): Suit {
            return Suit.fromCode(card.value and 0xF0);
        }

        fun getRank(card: Card): Rank {
            return Rank.fromCode(card.value and 0x0F);
        }
    }
}