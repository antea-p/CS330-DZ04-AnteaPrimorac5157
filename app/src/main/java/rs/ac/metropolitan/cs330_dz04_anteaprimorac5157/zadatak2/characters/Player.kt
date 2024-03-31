package rs.ac.metropolitan.cs330_dz04_anteaprimorac5157.zadatak2.characters

import rs.ac.metropolitan.cs330_dz04_anteaprimorac5157.zadatak2.Inventory
import rs.ac.metropolitan.cs330_dz04_anteaprimorac5157.zadatak2.Item
import rs.ac.metropolitan.cs330_dz04_anteaprimorac5157.zadatak2.ItemType
import kotlin.random.Random

class Player(name: String, health: Int, private val maxHealth: Int) : GameCharacter(name, health) {
    val inventory = Inventory<Item>()

    init {
        attackStrategy = { target ->
            val damage = Random.nextInt(15, 35)
            target.health -= damage
            println("$name heroically swings at ${target.name}, dealing a whopping $damage damage!")
        }
    }

    override fun runAway() {
        println("$name decides that discretion is the better part of valor and makes a tactical retreat.")
    }

    private fun applyItemEffect(item: Item) {
        when (item.type) {
            ItemType.HEALTH_POTION -> {
                val potentialHealth = health + item.effect
                if (potentialHealth > maxHealth) {
                    println("$name's health is fully replenished to its max of $maxHealth!")
                    health = maxHealth
                } else {
                    health = potentialHealth
                    println("$name's health increased by ${item.effect}. New health: $health")
                }
            }

            // Izbacuje izuzetak NotImplemented. Funkcionalnost je izostavljena
            // zbog obima domaćeg zadatka, u kojem je poanta pokazati osnove Kotlina.
            ItemType.ATTACK_BOOST -> TODO()
        }
    }

    fun useItemByIndex(index: Int) {
        try {
            val item = inventory.getItem(index)
            applyItemEffect(item)
            println("$name used ${item.name}.")
            inventory.removeItem(item)
        } catch (e: IndexOutOfBoundsException) {
            println("Invalid item selection. Please try again.")
        }
    }
}

