package com.kotlin.Azul.Elements

class Place {
    private var stones = mutableListOf<Stone>()

    private fun isEmpty(): Boolean = stones.isEmpty()

    fun getStones(): MutableList<Stone>? {
        if (isEmpty()) {
            print("this move is not possible")
        } else {
            return stones
        }
        return null
    }

    fun add(stonesToAdd: List<Stone>) {
        stones.addAll(stonesToAdd)
    }

    fun removeAll() {
        stones = mutableListOf()
    }

    override fun toString(): String {
        return "- " + stones.size + " - " + stones.toString()
    }
}