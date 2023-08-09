package dataStructures;

public class DataTypes {

    public static void main(String[] args) {

        int num1 = 10 ;
        int num2 = 234;
        int sum = add(num1, num2);
        System.out.println("sum = " + sum);

        String s = "Hellow";
        char c = s.charAt(0);
        checkCharacter(c);



    }

    public static int add(int a , int b ){
        return a + b;
    }
    public static void checkCharacter(char c){
        if (Character.isUpperCase(c)){
            System.out.println("UpperCase Letter !");
        } else if (Character.isLowerCase(c)) {
            System.out.println("LowerCase Letter !");
        } else if (Character.isDigit(c)) {
            System.out.println("Digit");
        }else{
            System.out.println(c + "  = is a special character" );
        }
    }

}
