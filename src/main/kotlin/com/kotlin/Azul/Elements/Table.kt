package com.kotlin.Azul.Elements

class Table(numPlaces: Int) {
    private var center = mutableListOf<Stone>()
    private var usedStones = mutableListOf<Stone>()
    var places = mutableListOf<Place>()

    fun addToCenter(stonesToAdd: List<Stone>) {
        center.addAll(stonesToAdd)
    }

    fun pickFromCenter(color: Stone): List<Stone>? {
        if (center.contains(color)) {
            val pickedStones = center.filter { color == it }
            center.removeAll(pickedStones)
            return pickedStones
        } else {
            println("this move is not possible")
            return null
        }
    }

    fun pickFromPlace(color: Stone, place: Place): List<Stone>? {
        val stones = place.getStones()
        if (stones != null) {
            if (stones.contains(color)) {
                val pickedStones = stones.filter { color == it }
                stones.removeAll(pickedStones)
                addToCenter(stones)
                place.removeAll()
                return pickedStones
            }
        }
        println("this move is not possible")
        return null

    }

    fun pickUpUsedStones(): List<Stone> {
        val pickedStones = usedStones
        usedStones.removeAll(usedStones)
        return pickedStones
    }
}