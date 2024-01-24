package Exceptions;

public class IdDoesnotExistException extends RuntimeException{
    //If doctor Id or patient id doesnot exist in db at that moment we will throw this kind of exception
    public IdDoesnotExistException(String message){
        super(message);
    }
}
