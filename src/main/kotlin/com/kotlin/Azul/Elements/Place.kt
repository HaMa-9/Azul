package com.kotlin.Azul.Elements

class Place {
    private var stones = mutableListOf<Stone>()

    private fun isEmpty(): Boolean = stones.isEmpty()

    fun pick(color: Stone): List<Stone>? {
        if (!stones.contains(color)) {
            print("this move is not possible")
        } else {
            //todo: move all stones of this color to players hand
            //todo: move all other stones to center
        }
        return null
    }

    fun add(stonesToAdd: List<Stone>) {
        stones.addAll(stonesToAdd)
    }

    override fun toString(): String {
        return "- " + stones.size + " - " + stones.toString()
    }
}