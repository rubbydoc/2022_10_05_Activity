public class ContainNumberException extends Exception {

    public ContainNumberException(String message) {
        super(message);

    }
    
    public static boolean containsNum(String password) throws ContainNumberException{
        boolean result = false;
        for(int j=0; j < password.length(); j++){
            if(Character.isDigit(password.charAt(j))){
                result=true;
            } 
        }
        if (result==false){
            throw new ContainNumberException("\n Error! Password should contain a digit");  
        }
        return result;

    }
}
