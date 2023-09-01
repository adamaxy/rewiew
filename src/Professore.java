public class Professore {
    private String id;
    private String name;
    private String surName;
    private String materia;
    Student student;
    Professore(String id, String name,String surName, String materia){
        this.id=id;
        this.name= name;
        this.surName= surName;
        this.materia= materia;
    }
    Professore(String id, String name,String surName){
        this.id=id;
        this.name= name;
        this.surName= surName;

    }
///////getter
    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurName() {
        return surName;
    }

    public String getMateria() {
        return materia;
    }
    ///////setter
    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public void assignGrade(Student student, int grade){
        if ( grade >= 18 ) student.getElencoVoti().add(grade);
            else { System.out.println("HAI FALLITO! Ritenta sarai più fortunato");





        }
    }
}



