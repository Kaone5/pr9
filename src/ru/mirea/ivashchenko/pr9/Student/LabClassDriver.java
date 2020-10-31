package ru.mirea.ivashchenko.pr9.Student;

import javax.swing.*;

public class LabClassDriver {
    public static void main(String[] args) {
        JFrame fr = new JFrame("Student");
        fr.setSize(500, 300);
        fr.setContentPane(new LabClassUI().rootPanel);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setVisible(true);
    }
}
