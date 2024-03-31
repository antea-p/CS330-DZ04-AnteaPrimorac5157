package rs.ac.metropolitan.cs330_dz04_anteaprimorac5157.zadatak2

class Inventory<T> where T: Item {
    private val items = mutableListOf<T>()

    fun addItem(item: T) {
        items.add(item)
    }

    fun removeItem(item: T) {
        items.remove(item)
    }

    fun getItem(index: Int): T = items[index]

    fun findItemByName(name: String): T? = items.firstOrNull { it.name == name }

    fun isEmpty(): Boolean = items.isEmpty()

    fun listItems() {
        if (items.isEmpty()) {
            println("Inventory is empty.")
        } else {
            items.forEachIndexed { index, item ->
                println("${index + 1}. ${item.name}")
            }
        }
    }
}
