// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Student student1 = new Student("000", "luca", "rossi", "02.09.1998");
        Student student2 = new Student("001", "fabio", "verdi", "07.02.1993");
        Student student3 = new Student("002", "adriano", "lodi", "17.04.1988");
        Student student4 = new Student("003", "giovanni", "empoli", "08.03.1996");
        Professore professore1 = new Professore("01", "marco", "paesan", "matematica");
        Professore professore2 = new Professore("02", "anna", "neri", "informatica");
        professore1.assignGrade(student1, 22);
        professore1.assignGrade(student2, 22);
        professore2.assignGrade(student3, 28);
        professore2.assignGrade(student4, 22);

        Student[] classe = {student1, student2, student3, student4};
        Professore[] insegnanti = {professore1, professore2};

        for (Student studente : classe) {
            if (studente.isExellent()) {
                System.out.println(studente.getName() + "\n" + studente.getSurName());
                ;
            }
            for (Professore professore : insegnanti) {
                if (studente.getCalcolaGradeAverange() >= 28) {
                    System.out.println(studente.getName() + " " + studente.getSurName());


                }


            }
        }
    }
}