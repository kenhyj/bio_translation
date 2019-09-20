package exceptions;

public class InvalidInputString extends IllegalArgumentException{
    public InvalidInputString() {
    }
    public InvalidInputString(String illegalString) {
        super(illegalString);
    }
}
