package rs.ac.metropolitan.cs330_dz04_anteaprimorac5157.zadatak2.characters

import kotlin.random.Random

open class GameCharacter(val name: String, var health: Int) {
    // Lambda koja uzima objekt GameCharacter klase, i ne vraća ništa (Unit).
    var attackStrategy: (target: GameCharacter) -> Unit = { target ->
        // Defaultna strategija napada
        val damage = Random.nextInt(5, 15)
        target.health -= damage
        println("$name attacks ${target.name} for $damage damage.")
    }

    open fun attack(target: GameCharacter) {
        attackStrategy(target)
    }

    // Ozbiljnija implementacija bi imala metodu defend, ali ovdje nije implementirana zbog obima DZ-a.

    open fun runAway() {
        println("$name runs away.")
    }

    override fun toString(): String {
        return """
           O
          /|\
          / \
          HP: $health
        """.trimIndent()
    }
}

