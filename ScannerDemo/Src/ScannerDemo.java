/*Application to demonstrate use of Scanner Class
        Create an Application to accept name, age,
        4-digit code, cpi, mobile no, passed and display these values
        to user in the given format
        Name : ABC XYZ
        Age : 23
        4-digit Code : 1122
        cpi : 6.6
        Mobile No : 97544XXXXX
        Passed Status : false
        */
import java.util.Scanner;
public class ScannerDemo{
    public static void main(String[] args){
        Scanner scanObj=new Scanner(System.in);
        System.out.println("Enter your full Name :- ");
        //declaring a String object to store name of user
        String name=scanObj.nextLine();
        System.out.println("Enter your age :- ");
        //declaring a byte type variable to store age of user
        //-128 to 127 occupy 1 byte of memory
        byte age=scanObj.nextByte();
        System.out.println("Enter 4-digit secret code :- ");
        //declaring a short type variable to store 4-digit code entered by user
        short code=scanObj.nextShort();
        System.out.println("Enter your CPI :-");
        //declaring a double type variable to store cpi
        //java treated floating values as double
        //if memory concern then declare float
        //float f=3.14f; and double f=3.14;
        double cpi=scanObj.nextDouble();
        System.out.println("Enter your Mobile Number :- ");
        //declaring long variable to store mobile number
        long mobileNumber=scanObj.nextLong();
        System.out.println("Enter your exams status as true for pass or false for fail");
        //declaring a boolean variable to store pass status
        boolean passStatus=scanObj.nextBoolean();

        //close scanner object to avoid memory leakage
        scanObj.close();

        //output
        System.out.println("Name :- "+name);
        System.out.println("Age :- "+age);
        System.out.println("4-digit code :- "+code);
        System.out.println("CPI :- "+cpi);
        System.out.println("Mobile no:- "+mobileNumber);
        System.out.println("Passed Status :- "+passStatus);
    }
}