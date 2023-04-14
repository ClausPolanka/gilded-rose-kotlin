package com.gildedrose

import org.junit.jupiter.api.*
import org.junit.jupiter.api.Assertions.assertEquals

internal class GildedRoseTest {

    @Test
    fun foo() {
        val items = listOf(Item("foo", 0, 0))
        val app = GildedRose(items)
        app.updateQuality()
        assertEquals("fixme", app.items[0].name)
    }
}
