import java.util.*;
import java.util.Scanner;
import java.lang.*;
import java.math.*;
import java.security.PublicKey;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.PriorityQueue;
import java.util.ArrayList;
import java.util.LinkedList;

public class TypingSpeedChecker{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter some text:");
        String text = input.nextLine();

        long startTime= System.currentTimeMillis();
        System.out.println("Type the text again:");

        String typedText= input.nextLine();
        long endTime= System.currentTimeMillis();

        if(text.equals(typedText)){
            long elapsedTime= endTime-startTime;
            double typingSpeed= (double) text.length()/ (elapsedTime/1000);
            System.out.println("your typing speed is:" + typingSpeed +"characters per second");

        }else{
            System.out.println("the text you entered does not match with original text");
        }
    }
}