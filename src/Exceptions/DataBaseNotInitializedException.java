package Exceptions;

public class DataBaseNotInitializedException extends Exception{
    //Compile time exception got created
    public DataBaseNotInitializedException(String message){
        super(message);
    }
}
