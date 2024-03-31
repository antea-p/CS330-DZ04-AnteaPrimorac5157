package rs.ac.metropolitan.cs330_dz04_anteaprimorac5157.zadatak2

import rs.ac.metropolitan.cs330_dz04_anteaprimorac5157.zadatak2.characters.Bunny
import rs.ac.metropolitan.cs330_dz04_anteaprimorac5157.zadatak2.characters.GameCharacter
import rs.ac.metropolitan.cs330_dz04_anteaprimorac5157.zadatak2.characters.Player
import rs.ac.metropolitan.cs330_dz04_anteaprimorac5157.zadatak2.characters.SproutMole

// U ozbiljnijoj implementaciji, dosta funkcionalnosti bi bilo izdvojeno u zasebnu klasu.
fun main() {
    val player = Player("Omori", 100, 100)
    player.inventory.addItem(Item("Health Potion", ItemType.HEALTH_POTION, 20))

    val enemies = listOf(
        Bunny("Bun Bunny", 70),
        Bunny("Dust Bunny", 35),
        SproutMole("Dunce Sprout Mole", 30),
        SproutMole("Sprout Mole Mike", 60)
    )
    val enemy = enemies.random()

    println("A wild ${enemy.name} appears!")

    while (player.health > 0 && enemy.health > 0) {
        println("\n==================== NEW TURN ====================")
        println(player.toString())
        println()
        println(enemy.toString())
        println("==================================================\n")

        println("\nPlayer's turn. Choose action: 1. Attack 2. Use Item 3. Run Away\n")
        val choice = readlnOrNull()?.toIntOrNull() ?: 0
        when (choice) {
            1 -> player.attack(enemy)
            2 -> {
                player.inventory.listItems()
                if (!player.inventory.isEmpty()) {
                    println("Select the item number to use:")
                    val itemIndex = readlnOrNull()?.toIntOrNull()
                    if (itemIndex != null) {
                        player.useItemByIndex(itemIndex - 1)
                    } else {
                        println("Invalid input. Please enter a number corresponding to an item.")
                    }
                }
            }
            3 -> {
                player.runAway()
                println("You successfully escaped the battle.")
                return
            }
            else -> println("Invalid action. Please choose again.")
        }

        if (enemy.health <= 0) {
            println("Enemy defeated!")
            break
        }

        if ((1..100).random() <= 10) { // 10% šansa da će neprijatelj pobjeći
            enemy.runAway()
            break
        } else {
            println("\nEnemy's turn.")
            enemy.attack(player)
            if (player.health <= 0) {
                println("You were defeated.")
                break
            }
        }
    }

    if (player.health > 0) println("You won the battle!") else println("Game over.")
}
