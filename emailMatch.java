import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class emailMatch {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter Email Address");
        String email=scanner.nextLine();

        if(isValidEmail(email)){
            System.out.println("The Email is Valid");
        }
        else{
            System.out.println("The Email is Invalid");
        }
    }

    private static boolean isValidEmail(String email){
        String emailRegex="^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
        Pattern pattern =Pattern.compile(emailRegex);
        Matcher matcher=pattern.matcher(email);

        return matcher.matches();
    }
}
   