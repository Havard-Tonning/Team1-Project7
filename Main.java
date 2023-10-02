import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Please, enter a four digit phone number!");
        String number=input.nextLine();
        if(number.length()!=4){
            System.out.println("The phone number is not long enough!");
            System.exit(0);
        } else{
            char number_one=number.charAt(0);
            char number_two=number.charAt(1);
            char number_three=number.charAt(2);
            char number_four=number.charAt(3);
            if((number_one=='8'||number_one=='9') && (number_four=='8'||number_four=='9') && (number_two==number_three)){
                System.out.println("Do not answer the call!");
            } else{
                System.out.println("Answer the call!");
            }

        }
        input.close();

    }
}