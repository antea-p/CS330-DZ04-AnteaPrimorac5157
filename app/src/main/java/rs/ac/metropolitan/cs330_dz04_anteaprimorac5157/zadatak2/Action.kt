package rs.ac.metropolitan.cs330_dz04_anteaprimorac5157.zadatak2

import rs.ac.metropolitan.cs330_dz04_anteaprimorac5157.zadatak2.characters.GameCharacter

interface Action {
    fun attack(target: GameCharacter)
    fun defend()
    fun use(item: Item)
}
