package rs.ac.metropolitan.cs330_dz04_anteaprimorac5157.zadatak2.characters

import kotlin.random.Random

class SproutMole(name: String, health: Int) : GameCharacter(name, health) {
    init {
        attackStrategy = { target ->
            if (Random.nextBoolean()) { // 50% šanse da neće uraditi ništa
                println("$name gets confused and attacks thin air!")
            } else {
                val damage = Random.nextInt(1, 15)
                target.health -= damage
                println("$name blindly swings at ${target.name}, dealing $damage damage.")
            }
        }
    }

    override fun runAway() {
        println("$name attempts to dig a hole with its hands and escape. It obviously fails.")
    }

    override fun toString(): String {
        return """
           @..@
         ( >__< )
         ^^ ~~ ^^
         HP: $health
        """.trimIndent()
    }
}