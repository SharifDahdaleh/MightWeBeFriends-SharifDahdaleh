/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week6;

import java.util.Scanner;
/**
 *
 * @author SharifDahdaleh
 */
public class MightWeBeFriends {
    public static void main(String[] args){
        //Initializing variables
        int compatScore = 0;
        int responseNum;
        //loopBreak and loopBreak1 are used to make sure the loops doesn't run Infinitely
        int loopBreak = 0;
        int loopBreak1 = 0;
        final int COMPATIBILITY_THRESHOLD = 200;
        String username;
        
        Scanner scanner = new Scanner(System.in);
        
        //Printing direction for the user
        System.out.println("Please enter your name:");
        username = scanner.nextLine();
        
        System.out.println("Welcome " + username + " please answer the questions to determine if we are compatible");
        
        System.out.println("Question 1: Do you like Video games?");
        System.out.println("Type 1 for yes and 2 for no");
        
        //Scanner
        responseNum = scanner.nextInt();
       
        //Testing with loops, if statements and switch statements
        while (loopBreak == 0) {
        if (responseNum ==1){
                System.out.println("Thank god you play video games!");
                compatScore = compatScore + 100;
                loopBreak = 1;
                
                System.out.println("Question 1.1: Out of these genres which is your favorite?");
                System.out.println("1: Shooters");
                System.out.println("2: MMOs");
                System.out.println("3: RPGs");
                System.out.println("4: Platformers");
                System.out.println("5: MOBAs");
                responseNum = scanner.nextInt();
                //Loop that is used to test onlt after choosing this option
                while (loopBreak1 == 0) {
                    //Switch statement to test multiple items without stacking too many if statements
                    switch (responseNum){
                        case 1:
                            System.out.println("Good choice, Shooters are my favorite");
                            compatScore = compatScore + 100;
                            loopBreak1 = 1;
                            break;
                        case 2:
                            System.out.println("Bad news, I never played any MMOs");
                            compatScore = compatScore -100;
                            loopBreak1 = 1;
                            break;
                        case 3:
                            System.out.println("I've played a few RPGs but not many, sorry.");
                            compatScore = compatScore + 10;
                            loopBreak1 = 1;
                            break;
                        case 4:
                            System.out.println("I have a soft spot for platformers, Especially Super Mario");
                            compatScore = compatScore + 80;
                            loopBreak1 = 1;
                            break;
                        case 5:
                            System.out.println("I like MOBAs as well but have not played many.");
                            compatScore = compatScore + 40;
                            loopBreak1 = 1;
                            break;
                        default:
                            System.out.println("Please choose one of these options");
                            responseNum = scanner.nextInt();
                            break;
                    } //end switch
                
                }//end loop
                loopBreak1 = 0;
                System.out.println("Question 1.2: Do you prefer single-player games or multiplayer games?");
                System.out.println("1 for Multiplayer 2 for single-player");
                responseNum = scanner.nextInt();
                //Loop that is used to test onlt after choosing this option
                while (loopBreak1 == 0) {
                    if (responseNum == 1) {
                        System.out.println("Multiplayer games great fun with friends");
                        compatScore = compatScore + 75;
                        loopBreak1 = 1;
                    } else if (responseNum == 2) {
                        System.out.println("I like Single-player games with good stories");
                        compatScore = compatScore + 50;
                        loopBreak1 = 1;
                    } else {
                        System.out.println("Please try again");
                        responseNum = scanner.nextInt();
                    }
                } //end loop
        } else if (responseNum == 2) {
                System.out.println("Dang that's unfortunate");
                compatScore = compatScore - 200;
                loopBreak = 1;
        } else {
                System.out.println("Please try again: ");
                responseNum = scanner.nextInt();
               
            } //end if
        } //end loop      
        
        System.out.println("Question 2: Do you play any instruments?");
        System.out.println("Type 1 for yes and 2 for no");
        loopBreak = 0;
        responseNum = scanner.nextInt();
        while (loopBreak == 0){
            if (responseNum == 1) {
               System.out.println("Nice! I like playing the drums");
               compatScore = compatScore + 200;
               loopBreak = 1;
            } else if (responseNum == 2) {
                System.out.println("No problem, maybe you should try sometime.");
                compatScore = compatScore - 10;
                loopBreak = 1;
            } else {
                System.out.println("Please try again");
                responseNum = scanner.nextInt();
            } //end if
        } //end loop
        
        System.out.println("Question 3: Do you like sports?");
        System.out.println("Type 1 for yes and 2 for no");
        loopBreak = 0;
        loopBreak1 = 0;
        responseNum = scanner.nextInt();
        while (loopBreak == 0){
            if (responseNum == 1) {
                System.out.println("I like sports as well!");
                compatScore = compatScore + 50;
                loopBreak = 1;
                
                System.out.println("Question 3.1: out of these sports which is your favorite?");
                System.out.println("1: Football");
                System.out.println("2: Soccer");
                System.out.println("3: BasketBall");
                System.out.println("4: Tennis");
                System.out.println("5: Baseball");
                responseNum = scanner.nextInt();
                while (loopBreak1 == 0) {
                    switch (responseNum){
                        case 1:
                          System.out.println("Sorry I never played nor watched football in my life");
                          compatScore = compatScore - 100;
                          loopBreak1 = 1;
                          break;
                        case 2:
                            System.out.println("I like watching soccer games from time to time");
                            compatScore = compatScore + 75;
                            loopBreak1 = 1;
                            break;
                        case 3:
                            System.out.println("I like playing basketball even though I'm terrible at it :)");
                            compatScore = compatScore + 50;
                            loopBreak1 = 1;
                            break;
                        case 4:
                            System.out.println("My favourite sport to play is Tennis.");
                            compatScore = compatScore + 100;
                            loopBreak1 = 1;
                            break;
                        case 5:
                            System.out.println("I think baseball is fun to watch but I don't follow it at all");
                            compatScore = compatScore - 50;
                            loopBreak1 = 1;
                            break;
                        default:
                            System.out.println("Please choose one of these options");
                            responseNum = scanner.nextInt();
                            break;
                    } //end switch
                } // end loop
            } else if (responseNum == 1) {
                System.out.println("Wow, not a sporty person");
                compatScore = compatScore - 50;
                loopBreak = 1;
            } else {
                System.out.println("Please try again");
                responseNum = scanner.nextInt(); 
            } //end if
        } //end loop
        
        System.out.println("Calculating...");
        
        if (compatScore >= COMPATIBILITY_THRESHOLD) {
            System.out.println("Yay, " + username + " Your score of " + compatScore + " is enough to be my friend :)");
        } else {
            System.out.println("Sorry " + username + " your score of " + compatScore + " is not enough to be my friend :(");
        }
        System.out.println("Thank you for playing ^-^");
    }
}
    

