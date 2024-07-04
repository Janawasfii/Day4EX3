package com.company;
import java.util.Scanner;
import java.util.SortedMap;

public class Main {

    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
//EX1
    /*
        for(int i=1; i<=100;i++ ){
        if (i%15==0)
        {System.out.println("FizzBuzz");}
        else if(i%3==0)
        {System.out.println("Fizz");}
        else if(i%5==0)
        {System.out.println("Buzz");}
        else{System.out.println(i);}}*/
//EX2

        /*System.out.println("Please enter a sentence:");
        String sen =s.nextLine();
        String sen2=" ";
        for(int i=sen.length()-1; i>=1; i--){
        sen2= sen2+sen.charAt(i);
        }System.out.println("The reversed sentence is: "+sen2);*/

//EX3
        /*long fact = 1;
        int i = 1;
        System.out.println("Please enter a number:");
        int num =s.nextInt();
        do {
            fact *= i;
            i++;}
        while (i <= num);
        System.out.println("Factorial of " + num + " is: " + fact);*/

//EX4

        /*int i = 1;
        int result=1;
        System.out.println("Please enter a base number:");
        int baseNum =s.nextInt();
        System.out.println("Please enter a power number:");
        int powerNum =s.nextInt();
        do {
            result= result*baseNum;
           powerNum--;
            }
        while (powerNum!=0);
        System.out.println("The result is: " + result);*/
//EX5
       /* int evenCount=0;
        int oddCount=0;
        do{
            System.out.println("please enter your number(zero for stop):");
            int num = s.nextInt();
            if (num==0){
                break;
            }
            else if(num%2==0){
                evenCount++;}
            else{
                oddCount++;}


        } while(true);
        System.out.println("Total of even number:"+ evenCount);
        System.out.println("Total of negatives number:"+ oddCount);*/
//EX6

       /* int enterNum;
        do {System.out.print("Enter a positive integer: ");
        enterNum = s.nextInt();}
        while (enterNum <= 0);
        boolean prime = true;
        if (enterNum <= 1)
        {prime = false;}
        else {
        int i = 2;
        while (i * i <= enterNum) {
        if (enterNum % i == 0) {
        prime = false;
        break;}
        i++;}}
        System.out.println(enterNum + (prime ? " is a prime number." : " is not a prime number."));*/

 //EX7
        /*for (int weeks = 1; weeks <= 4; weeks++) {
            System.out.println("Week " + weeks);
            for (int days = 1; days <= 7; days++) {
                System.out.println("Day " + days);*/
 //EX8

        System.out.print("Please enter a word: ");
        String words = s.nextLine();
        boolean palindrome = true;
        if (words == null || words.isEmpty()) {
        palindrome = false;}
        else {
        words = words.toLowerCase();
        int left = 0;
        int right = words.length()-1;
        while (left < right) {
        if (words.charAt(left) != words.charAt(right)) {
        palindrome = false;
        break;}
        left++;
        right--;}}
        System.out.println(words + (palindrome ? " is a palindrome." : " is not a palindrome."));
    }}




