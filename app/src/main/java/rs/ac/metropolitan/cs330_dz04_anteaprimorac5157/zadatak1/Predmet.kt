package rs.ac.metropolitan.cs330_dz04_anteaprimorac5157.zadatak1

data class Predmet(
    val sifra: String,
    val naziv: String,
    val espb: Int,
    val semestar: Int,
    val obavezan: Boolean
) {
    override fun toString(): String {
        val status = if (obavezan) "obavezan" else "izborni"
        return "$sifra-$naziv ESP:$espb semestar:$semestar ($status)"
    }
}
