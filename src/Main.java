public class Main {
    public static void main(String[] args) {
        // Create 4 students and 2 professors
        List<Student> students = new ArrayList<>();
        students.add(new Student(1, "Alice", "Smith", "1990-05-15"));
        students.add(new Student(2, "Bob", "Johnson", "1992-02-20"));
        students.add(new Student(3, "Charlie", "Brown", "1993-09-10"));
        students.add(new Student(4, "David", "Lee", "1991-07-25"));

        List<Professor> professors = new ArrayList<>();
        professors.add(new Professor(101, "Professor", "Smith", "Math"));
        professors.add(new Professor(102, "Professor", "Johnson", "Physics"));

        // Test the assignGrade() method
        professors.get(0).assignGrade(students.get(0), 25); // Should print a message that Alice has failed.
        professors.get(1).assignGrade(students.get(1), 20); // Should print a message that Bob has failed.
        professors.get(0).assignGrade(students.get(2), 30); // Should add the grade 30 to Charlie's grades list.
        professors.get(1).assignGrade(students.get(3), 18); // Should add the grade 18 to David's grades list.

        // Print the first names and last names of all excellent students
        System.out.println("Excellent Students:");
        for (Student student : students) {
            if (student.isExcellent()) {
                System.out.println(student.getFirstName() + " " + student.getLastName());
            }
        }

        // Print the first name and last name of the student with the highest grade average
        Student highestAverageStudent = students.get(0);
        for (Student student : students) {
            if (student.calculateGradeAverage() > highestAverageStudent.calculateGradeAverage()) {
                highestAverageStudent = student;
            }
        }
        System.out.println("Student with the highest grade average: " + highestAverageStudent.getFirstName() + " " + highestAverageStudent.getLastName());
    }
}
