package colors

import colors.Color
import colors.Color.*

fun main(args: Array<String>) {
    println(getMnemonic(Color.BLUE))
    println(getWarmth(Color.ORANGE))
    println(getWarmthNoQualifier(ORANGE))
    println(mix(Color.YELLOW, Color.RED))
    //println(mix(Color.BLUE, RED))
    println(mixOptimized(Color.BLUE, Color.YELLOW))
    println(mixOptimized(Color.RED, Color.BLUE))
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

fun getWarmthNoQualifier(color: Color) =
        when (color) {
            RED, ORANGE, YELLOW -> "warm"
            GREEN -> "neutral"
            BLUE, INDIGO, VIOLET -> "cold"
        }

fun mix( c1: Color, c2: Color ) =
        when( setOf (c1, c2)) {
            setOf(RED, YELLOW) -> ORANGE
            setOf(YELLOW, BLUE) -> GREEN
            setOf(BLUE, VIOLET) -> INDIGO
            else -> throw Exception("Dirty color")
        }


// more efficient than mix function
fun mixOptimized(c1: Color, c2: Color) =
        when {
            (c1 == RED && c2 == YELLOW) ||
                    (c1 == YELLOW && c2 == RED) -> ORANGE

            (c1 == YELLOW && c2 == BLUE) ||
                    (c1 == BLUE && c2 == YELLOW) -> GREEN

            (c1 == BLUE && c2 == VIOLET) ||
                    (c1 == VIOLET && c2 == BLUE) -> INDIGO

            else ->throw Exception ("Dirty color")
        }