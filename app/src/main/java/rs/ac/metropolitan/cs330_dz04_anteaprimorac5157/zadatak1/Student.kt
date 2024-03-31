package rs.ac.metropolitan.cs330_dz04_anteaprimorac5157.zadatak1

data class Student(
    val index: String,
    val ime: String,
    val prezime: String,
        val predmeti: List<Predmet>
) {
    override fun toString(): String = "$index $ime $prezime"
}
