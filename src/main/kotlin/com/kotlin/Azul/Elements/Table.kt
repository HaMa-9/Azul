package com.kotlin.Azul.Elements

class Table(numPlaces: Int) {
    var center = mutableListOf<Stone>()
    var usedStones = mutableListOf<Stone>()
    var places = mutableListOf<Place>()

    fun addToCenter(stonesToAdd: List<Stone>) {
        center.addAll(stonesToAdd)
    }

    fun pickFromCenter(color: Stone, player: Player) {
        //todo: add to players hand
    }

    fun pickFromPlace (color: Stone, player: Player){
        place.pick(color, player)
    }
}