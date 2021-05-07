package grades;

import java.util.ArrayList;

public class Student {
    private String name;
    private ArrayList<Integer> grades;

    public static void main(String[] args) {
        Student nic = new Student("Nic");
        nic.addGrade(80);
        nic.addGrade(90);
        nic.addGrade(75);

        System.out.println(nic.getName() + " " + nic.getGradeAverage());
    }

    public Student(String name) {
        setName(name);
        this.grades = new ArrayList<>();
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void addGrade(int grade) {
        grades.add(grade);
    }

    public double getGradeAverage() {
        //average = ALL GRADES ADDED UP / HOW MANY GRADES THERE ARE;
        double sum = 0;

        for (int i = 0; i < grades.size(); i++) {
            sum += grades.get(i);
        }

        return sum / grades.size();
    }
}
