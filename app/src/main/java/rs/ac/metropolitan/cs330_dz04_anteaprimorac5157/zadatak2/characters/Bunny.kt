package rs.ac.metropolitan.cs330_dz04_anteaprimorac5157.zadatak2.characters

import kotlin.random.Random

class Bunny(name: String, health: Int) : GameCharacter(name, health) {
    init {
        attackStrategy = { target ->
            val damage = Random.nextInt(5, 40)
            target.health -= damage
            println("$name hops violently towards ${target.name}, kicking up a dust storm and dealing $damage damage!")
        }
    }

    override fun runAway() {
        println("$name makes a swift bunny hop into the nearest thicket. Good luck finding it.")
    }

    override fun toString(): String {
        return """
           (\(\ 
           (-.-)
           o_(")(") 
           HP: $health
        """.trimIndent()
    }
}
