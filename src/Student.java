import java.util.ArrayList;

public class Student {

    private String id;
    private String name;
    private String surName;
    private String dateOfBirth;
    private ArrayList<Integer> elencoVoti = new ArrayList<>();

    Student(String id, String name,String surName, String dateOfBirth) {
        this.id = id;
        this.name = name;
        this.surName = surName;
        this.dateOfBirth = dateOfBirth;
        this.elencoVoti = new ArrayList<>();

    }

    Student(Integer elencoVoti) {
        this.elencoVoti = new ArrayList<>();
    }

     {

    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurName() {
        return surName;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurName(String surnName) {
        this.surName = surnName;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public ArrayList<Integer> getElencoVoti() {
        return elencoVoti;
    }

    public void setElencoVoti(ArrayList<Integer> elencoVoti) {
        this.elencoVoti = elencoVoti;
    }

    private double calcolaGradeAverage() {
        if (elencoVoti.isEmpty()) {
            return 0.0;
        }
        double sum = 0.0;
        for (double grade : elencoVoti) {
            sum += grade;
        }

        return sum / elencoVoti.size();

    }
public double getCalcolaGradeAverange(){
        return calcolaGradeAverage();
}
    public boolean isExellent() {
        if (calcolaGradeAverage() >= 28) {
            return true;
        }

        return false;
    }
}