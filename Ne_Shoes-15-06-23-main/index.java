
import java.util.Scanner;

public class index {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // int age = sc.nextInt();
        // if(age>=18){
        //     System.out.println("Adult");
        //     System.out.println("You Can Vote");
        // }
        // else if(age >=13 && age <= 18){
        //     System.out.println("Teenager");
        // }
        // else{
        //     System.out.println("Minor");
        // }

        // int a = sc.nextInt();
        // int b=sc.nextInt();
        // if(a>b){
        //     System.out.println(a+" is greater");
        // }
        // else{
        //     System.out.println(b+" is greater");
        // }

        // long a = sc.nextLong();
        // if(a%2==0){
        //     System.out.println(" is even");
        // }
        // else{
        //     System.out.println(a+" is odd");
        // }

        // int income =sc.nextInt();
        // int tax;
        // if(income<500000){
        //     tax = 0;
        //     System.out.println(income);
        // }
        // else if(income>500000 && income<1000000){
        //     tax = (int)(income*0.2);
        //     System.out.println(tax);
        // }
        // else{
        //     tax = (int)(income*0.3);
        //     System.out.println(income*(30/100));
        // }
        // System.out.println("your tax is:"+tax);

    // int A = sc.nextInt();
    // int B = sc.nextInt();
    // int C = sc.nextInt();

    // if(A>B && A>C){
    //     System.out.println("A is greater");
    // }
    // else if(B>C){
    //         System.out.println("B is greater");   
    // }
    // else{
    //     System.out.println("C is greater");
    // }


    //ternary Operator

    // int number = sc.nextInt();
    // String type = ((number%2)==0) ? "even" : "odd";
    // System.out.println(type);

    // int marks=sc.nextInt();
    // String Result = marks>=33 ? "Pass" : "Fail";
    // System.out.println(Result);

//switch statements

    // int a=sc.nextInt();
    // int b=sc.nextInt();
    // char operator = sc.next().charAt(0);
    // switch(operator){
    //     case '+' : System.out.println(a+b);
    //         break;
    //     case '-' : System.out.println(a-b);
    //         break;
    //     case '*' : System.out.println(a*b);
    //         break;
    //     case '/' : System.out.println(a/b);
    //         break;
    //     case '%' : System.out.println(a%b);
    //         break;

    // }


//Q1

    // int a = sc.nextInt();
    // if(a>0){
    //     System.out.println("a is a positive integer");
    // }else{
    //     System.out.println("a is a negative number");
    // }

//Q2

    // double temp = sc.nextDouble();
    // if(temp>100){
    //     System.out.println("You have a fever");
    // }else{
    //     System.out.println("You don't have a fever");
    // }

//Q3

    // int day = sc.nextInt();
    // switch(day){
    //     case 1 : 
    //         System.out.println("Sunday");
    //         break;
    //     case 2 : 
    //         System.out.println("Monday");
    //         break;
    //     case 3 : 
    //         System.out.println("Tuesday");
    //         break;
    //     case 4 : 
    //         System.out.println("Wednesday");
    //         break;
    //     case 5 : 
    //         System.out.println("Thursday");
    //         break;
    //     case 6 : 
    //         System.out.println("Friday");
    //         break;
    //     case 7 : 
    //         System.out.println("Saturday");
    //         break;
    //     default : 
    //         System.out.println("You have entered wrong choice");
    //         break;
    // }

//Q5

    // int year = sc.nextInt();
    // if(year % 4 == 0){
    //     if(year % 100 == 0){
    //         if(year % 400 == 0){
    //             System.out.println("Leap Year");
    //         }
    //         else{
    //             System.out.println("Not a leap year");
    //         }
    //     }
    //     else{
    //             System.out.println("leap year");
    //         }

    // }
    // else{
    //             System.out.println("Not a leap year");
    //         }

    int year = sc.nextInt();
    boolean x = (year%4)==0;
    boolean y = (year%100) !=0;
    boolean z = ((year%100 == 0) && (year%400 == 0)); 

    if(x && (y || z)){
        System.out.println("leap year");
    }else{
        System.out.println("Not a leap year");
    }
}}