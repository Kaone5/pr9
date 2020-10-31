package ru.mirea.ivashchenko.pr9.INN;

public class WrongINNException extends Exception{
    public WrongINNException(String errorMessage){
        super(errorMessage);
    }
}
