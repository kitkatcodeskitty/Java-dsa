
    // import java.util.*;

    // public class firstClass {
    //     public static void main(String[] args){
    //         Scanner sc = new Scanner(System.in);
    //         String firstName = sc.next();
    //         String lastName = sc.next();
    //         System.out.println("name is " + firstName + lastName);

    //     }
    // }

    // import java.util.*;
    // public class firstClass {
    //     public static void main(String[] args) {
    //         Scanner sc = new Scanner(System.in);
    //         int age = sc.nextInt();

    //         if(age> 18){
    //             System.out.println("adult");

    //         }
    //         else{
    //             System.out.println("not adult");
    //         }
    //     }
    // }



    // import java.util.*;
    // class firstClass {
    //     public static void main(String[] args){
    //         int p = 10000;
    //         int t = 2;
    //         int r = 4;
    //         int simpleInterest = p * t * r;
    //         int SimpleInterestTotal = simpleInterest/100;
    //         System.out.println("Simple interest=" + SimpleInterestTotal);
    //     }
    // }


    // import java.util.*;

    // class firstClass {
    //     public static void main(String[] args){
    //         float pi = 22/7 f;
    //         float radius = 10;
    //         float AreaOfCircle = pi * radius * radius;
    //         System.out.println("Area of circle  = " + AreaOfCircle);
    //     }
    // }

// class firstClass {
//     public static void main (String[] args){
//         int var1 = 5;
//         int var2 = 6;
//         int var3;
//         var3=++var2*var1/var2+var2;
//         System.out.println(var3);
//     }
// }

// Wap to find odd and even

// import java.util.*;

// public class firstClass {
//     public static void main(String args[]){
//         Scanner sc =new Scanner(System.in);
//         int Number = sc.nextInt();

//         if(Number % 2 == 0){
//             System.out.print("Even");
//         }
//         else{
//             System.out.print("Odd");
//         }
//     }
// }\


// wap to compare two number by taking input from user 


// import java.util.*;

// public class firstClass{
//     public static void main (String args[]){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter first number:");
//         int numOne = sc.nextInt();
//         System.out.print("Enter Second number:");
//         int numTwo = sc.nextInt();

//         if(numOne==numTwo){
//             System.out.println("Both number is equal");
//         }
//         else if(numOne>numTwo){
//             System.out.println(numOne + " Is greater than" + numTwo);
//         }
//         else{
//             System.out.println(numTwo + " Is Greater");
//         }
//     }
// }


// // wap to take input 1 2 3 that shows hello, namaste and bonjure 

// import java.util.*;

// public class firstClass {
//     public static void main (String args[]){
//         Scanner sc = new Scanner(System.in);
//         int num = sc.nextInt();

//         switch(num){
//             case 1: 
//             System.out.println("Hello");
//             break;

//             case 2:
//             System.out.println("Namaste");
//             break;

//             case 3: 
//             System.out.println("Bonjure");
//             break;

//             default:
//             System.out.println("Invalid number input");
//         }
//     }
// }

// Make a Calculator. Take 2 numbers (a & b) from the user and an operation as follows : 
// 	1 : + (Addition) a + b
// 2 : - (Subtraction) a - b
// 3 : * (Multiplication) a * b
// 4 : / (Division) a / b
// 5 : % (Modulo or remainder) a % b
// Calculate the result according to the operation given and display it to the user.

// import java.util.*;

// public class firstClass{
//     public static void main(String args[]){

//         System.out.println("1 : + (Addition)");
//         System.out.println("2 : - (Subtraction)");
//         System.out.println("3 : * (Multiplication)");
//         System.out.println("4 : / (Division)");
//         System.out.println("5 : % (Modulo)");

//         Scanner sc = new Scanner(System.in);
//         int num = sc.nextInt();
//         System.out.println("Enter first Variable:");
//         int v1 = sc.nextInt();
//         System.out.println("Enter Second Variable:");
//         int v2 = sc.nextInt();

//         switch(num){
//             case 1:
//                 System.out.println("The sum of two number is : " +  v1+v2);
//                 break;
//             case 2:
//                 System.out.println("This sub of two number is: "+ (v1-v2));
//                 break;
//             case 3:
//                 System.out.println("The multiplication of two number is: "+ (v1*v2));
//                 break;
//             case 4:
//                 System.out.println("the division of two number  is: " + (v1/v2));
//                 break;
//             case 5:
//                 System.out.println("the modulo of two number is: " +(v1%v2));
//                 break;

//             default: 
//             System.out.println("Invalid input");
//         }
//     }
// }


// Ask the user to enter the number of the month & print the name of the month. For eg - For ‘1’ print ‘January’, ‘2’ print ‘February’ & so on.

import java.util.*;

public class firstClass {
    public static void main(String args[]){
        System.out.println("Enter Number");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        switch(num){
            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("February");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("June");
                break;
            case 7:
                System.out.println("July");
                break;
            case 8:
                System.out.println("August");
                break;
            case 9:
                System.out.println("September");
                break;
            case 10:
                System.out.println("October");
                break;
            default:
                System.out.println("Invalid input");
        }
    }
}