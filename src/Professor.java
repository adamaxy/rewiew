class Professor {
    private int professorID;
    private String firstName;
    private String lastName;
    private String courseTaught;

    
    public Professor(int professorID, String firstName, String lastName, String courseTaught) {
        this.professorID = professorID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.courseTaught = courseTaught;
    }

    
    public Professor(int professorID, String firstName, String lastName) {
        this.professorID = professorID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.courseTaught = "";
    }

    public int getProfessorID() {
        return professorID;
    }

    public void setProfessorID(int professorID) {
        this.professorID = professorID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCourseTaught() {
        return courseTaught;
    }

    public void setCourseTaught(String courseTaught) {
        this.courseTaught = courseTaught;
    }

   
    public void assignGrade(Student student, int grade) {
        if (grade >= 18) {
            student.getGrades().add(grade);
        } else {
            System.out.println("Student " + student.getFirstName() + " " + student.getLastName() + " has failed.");
        }
    }
}



