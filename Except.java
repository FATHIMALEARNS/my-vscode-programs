//user defined exception
class UserException extends Exception{
    public UserException(){
        System.out.println("user defined exception");
    }
}
public class Except{
    public static void main(String[] args){
        try
        {
            throw new UserException();
        }
        catch(UserException e)
        {
            System.out.println("error:division by 0"+e);
        }
    }
}