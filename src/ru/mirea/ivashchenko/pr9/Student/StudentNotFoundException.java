package ru.mirea.ivashchenko.pr9.Student;

public class StudentNotFoundException extends Exception {
    public StudentNotFoundException(String errorMessage) {
        super(errorMessage);
    }
}
