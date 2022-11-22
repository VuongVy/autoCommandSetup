package dev.vuongvy.main

import org.bukkit.Location

data class Mine(val name: String, val a: Location, val b: Location) {
    val upper = name.uppercase()
    val lower = name.lowercase()
}

