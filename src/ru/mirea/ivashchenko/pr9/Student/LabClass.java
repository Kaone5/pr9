package ru.mirea.ivashchenko.pr9.Student;

import ru.mirea.ivashchenko.pr6.SortingStudentsByGPA;
import ru.mirea.ivashchenko.pr6.Student;
import ru.mirea.ivashchenko.pr6.Test;

public class LabClass {
    private Student[] students;
    LabClass() {
        students = new Student[7];
        students[0] = new Student("Tobio Kageyama", 9, 7);
        students[1] = new Student("Shoyo Hinata", 10, 15);
        students[2] = new Student("Kenma Kozume", 5, 95);
        students[3] = new Student("Toru Oikawa", 1, 69);
        students[4] = new Student("Hajime Iwaizumi", 4, 75);
        students[5] = new Student("Yu Nishinoya", 4, 40);
        students[6] = new Student("Atsumu Miya", 7, 70);
    }

    public String sort(){
        Test.insertSort(students);
        StringBuilder str = new StringBuilder();
        for (Student s : students)
            str.append(s.toString()).append('\n');
        return str.toString();
    }

    public String find(String name) throws StudentNotFoundException {
        for (Student s : students)
            if (s.getName().compareTo(name) == 0)
                return (s.toString());
        throw new StudentNotFoundException(name + " not found");
    }

}
