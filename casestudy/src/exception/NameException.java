package exception;

public class NameException extends Exception{
    public NameException(){
        super("ký tự đầu tiên phải viết hoa");
    }
}
