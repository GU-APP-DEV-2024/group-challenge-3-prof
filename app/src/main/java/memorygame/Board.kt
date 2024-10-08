package memorygame

import android.util.Log

class Board() {
    //Constructor to create board of different sizes.
    // Assign
    private val availableCard = arrayOf<Card>(Card('c', "a"), Card('h', "10"), Card('d', "3"))
    private var cards: Array<Card> = Array<Card>(6) {_ -> Card(' ', "")}

    init {
        for (i in 0..2) {
            Log.d("MemoryBoard", "${2*i}, ${(2*i)+1}")
            cards[2*i] = availableCard.random()
            cards[(2*i)+1] = cards[2*i]
        }
        cards.shuffle()
    }

    fun getValueAt(index:Int): Card {
        return cards[index]
    }

    data class Card(val suit: Char, val rank: String) {

    }
}