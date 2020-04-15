package com.kotlin.Azul.Elements

class Bag() {
    private var stones = mutableListOf<Stone>()

    init {
        stones.addAll(listOf(
                Stone.BLUE, Stone.RED, Stone.YELLOW, Stone.BLACK, Stone.GREEN,
                Stone.BLUE, Stone.RED, Stone.YELLOW, Stone.BLACK, Stone.GREEN,
                Stone.BLUE, Stone.RED, Stone.YELLOW, Stone.BLACK, Stone.GREEN,
                Stone.BLUE, Stone.RED, Stone.YELLOW, Stone.BLACK, Stone.GREEN,
                Stone.BLUE, Stone.RED, Stone.YELLOW, Stone.BLACK, Stone.GREEN,
                Stone.BLUE, Stone.RED, Stone.YELLOW, Stone.BLACK, Stone.GREEN))
    }

    private fun containsAtLeastN(n: Int): Boolean = stones.size >= n

    fun shuffle() = stones.shuffle()

    fun pickN(n: Int): List<Stone>? {
        if (n < 0) {
            print("n may not be negative")
        } else {
            if (!containsAtLeastN(n)) {
                print("add stones from table first")
            } else {
                val picked = stones.take(n)
                stones = stones.drop(n) as MutableList<Stone>
                return picked
            }
        }
        return null
    }

    fun add(stonesToAdd: List<Stone>) {
        stones.addAll(stonesToAdd)
    }
}
