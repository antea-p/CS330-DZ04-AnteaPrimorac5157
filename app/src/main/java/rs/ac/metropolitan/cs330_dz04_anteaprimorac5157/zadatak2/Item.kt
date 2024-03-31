package rs.ac.metropolitan.cs330_dz04_anteaprimorac5157.zadatak2

enum class ItemType {
    HEALTH_POTION,
    ATTACK_BOOST
}

data class Item(val name: String, val type: ItemType, val effect: Int)
