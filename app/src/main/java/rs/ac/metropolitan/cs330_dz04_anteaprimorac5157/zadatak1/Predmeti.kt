package rs.ac.metropolitan.cs330_dz04_anteaprimorac5157.zadatak1

class Predmeti : Prijavljivanje {
    private val predmetiList: MutableList<Predmet> = mutableListOf()

    fun addPredmet(predmet: Predmet) {
        predmetiList.add(predmet)
    }

    fun addPredmeti(predmeti: List<Predmet>) {
        predmetiList.addAll(predmeti)
    }

    override fun prijavi(student: Student, predmet: Predmet) {
        println("Student ${student.ime} ${student.prezime} je uspesno prijavljen na predmet ${predmet.naziv}")
    }

    override fun odjavi(student: Student, predmet: Predmet) {
        println("Student ${student.ime} ${student.prezime} je uspesno odjavljen sa predmeta ${predmet.naziv}")
    }
}
