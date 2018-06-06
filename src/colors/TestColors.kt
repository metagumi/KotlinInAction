package colors

import colors.Color
import colors.Color.*

fun main(args: Array<String>) {
    println(getMnemonic(Color.BLUE))
    println(getWarmth(Color.ORANGE))
    println(mix(Color.YELLOW, RED))
    println(mix(Color.BLUE, RED))


}

fun getMnemonic(color: Color) =
        when (color) {
            Color.RED -> "Richard"
            Color.ORANGE -> "Of"
            Color.YELLOW -> "York"
            Color.GREEN -> "Gave"
            Color.BLUE -> "Battle"
            Color.INDIGO -> "In"
            Color.VIOLET -> "Vain"
        }

fun getWarmth(color: Color) =
        when (color) {
            Color.RED, Color.ORANGE, Color.YELLOW -> "warm"
            Color.GREEN -> "neutral"
            Color.BLUE, Color.INDIGO, Color.VIOLET -> "cold"
        }

fun mix( c1: Color, c2: Color ) =
        when( setOf (c1, c2)) {
            setOf(RED, YELLOW) -> ORANGE
            setOf(YELLOW, BLUE) -> GREEN
            setOf(BLUE, VIOLET) -> INDIGO
            else -> throw Exception("Dirty color")
        }