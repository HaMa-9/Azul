package com.kotlin.Azul.Elements

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
class BagTest {
    var bag = Bag()

    @Test
    fun containsAtLeastN() {
        Assertions.assertTrue(bag.containsAtLeastN(30))
        Assertions.assertFalse(bag.containsAtLeastN(31))
    }

    @Test
    fun pickN() {
        Assertions.assertTrue(bag.containsAtLeastN(30))
        Assertions.assertFalse(bag.containsAtLeastN(31))
        bag.pickN(5)
        Assertions.assertTrue(bag.containsAtLeastN(25))
        Assertions.assertFalse(bag.containsAtLeastN(26))
        bag.pickN(26)
        Assertions.assertTrue(bag.containsAtLeastN(25))
        Assertions.assertFalse(bag.containsAtLeastN(26))

        bag.pickN(-5)
        Assertions.assertTrue(bag.containsAtLeastN(25))
        Assertions.assertFalse(bag.containsAtLeastN(26))

    }

    @Test
    fun addAll() {
        val stones = mutableListOf<Stone>()
        Assertions.assertTrue(bag.containsAtLeastN(30))
        Assertions.assertFalse(bag.containsAtLeastN(31))
        stones.addAll(listOf(
                Stone.BLUE, Stone.RED, Stone.YELLOW, Stone.BLACK, Stone.GREEN,
                Stone.BLUE, Stone.RED, Stone.YELLOW, Stone.BLACK, Stone.GREEN))
        bag.add(stones)

        Assertions.assertTrue(bag.containsAtLeastN(40))
        Assertions.assertFalse(bag.containsAtLeastN(41))

    }


}