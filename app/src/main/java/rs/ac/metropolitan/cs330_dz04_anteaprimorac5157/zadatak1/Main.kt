package rs.ac.metropolitan.cs330_dz04_anteaprimorac5157.zadatak1

fun main() {
    val predmet1 = Predmet("CS330", "Razvoj mobilnih aplikacija", 8, 6, false)
    val predmet2 = Predmet("CS101", "Uvod u programiranje", 10, 1, true)
    val predmet3 = Predmet("CS103", "Algoritmi i strukture podataka", 8, 3, true)
    val predmet4 = Predmet("NT111", "Engleski 1", 4, 1, true)
    val predmet5 = Predmet("NT112", "Engleski 2", 4, 2, true)
    val predmet6 = Predmet("MA202", "Matematika 2", 8, 4, true)

    val predmeti = Predmeti().apply {
        addPredmeti(listOf(predmet1, predmet2, predmet3, predmet4, predmet5, predmet6))
    }

    val studenti = listOf(
        Student("001", "Pera", "Peric", listOf()),
        Student("002", "Mika", "Mikic", listOf()),
        Student("003", "Zika", "Zikic", listOf())
    )

    repeat(3) {
        val randomStudent = studenti.random()
        val randomPredmet = listOf(predmet1, predmet2, predmet3, predmet4, predmet5, predmet6).random()

        predmeti.prijavi(randomStudent, randomPredmet)
    }

    repeat(3) {
        val randomStudent = studenti.random()
        val randomPredmet = listOf(predmet1, predmet2, predmet3).random()

        predmeti.odjavi(randomStudent, randomPredmet)
    }
}
