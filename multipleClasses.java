import java.util.Scanner;

class ClassA{
    private int num1;
    private int num2;
    
    public void acceptNumber(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter First Number :");
        num1=scanner.nextInt();
         System.out.println("Enter Second Number :");
        num2=scanner.nextInt();
    }
    public int getNum1(){
        return num1;
    }
    public int getNum2(){
        return num2;
    }
}

class ClassB{

    private int lastDigitNum1;
    private int lastDigitNum2;
    
    public void fetchLastDigit(ClassA classA){
        lastDigitNum1=classA.getNum1()%10;
        lastDigitNum2=classA.getNum2()%10;
    }
    
    public int   getLastDigitNum1(){
        return   lastDigitNum1;
    }
    public int getLastDigitNum2(){
        return lastDigitNum2;
    }
}
class ClassC{
    public int multiplyLastDigit(ClassB classB){
         return classB.getLastDigitNum1()*classB.getLastDigitNum2();
    }
}

public class multipleClasses{
    public static void main(String[] args){
        ClassA classA=new ClassA();
         ClassB classB=new ClassB();
          ClassC classC=new ClassC();

          classA.acceptNumber();
          classB.fetchLastDigit(classA);
          int result=classC.multiplyLastDigit(classB);
          System.out.println("Result of multiplying last Digit :"+result);
    }
}
