
package com.khaled.exercises;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author knsa7
 */
public class LuckySevens {
    public static void main(String[] args){
      int sum = 0;
      int amount=0;
      int rolls=0;
      int winrolls=0;
      int winamount=0;
     Scanner myAmount= new Scanner(System.in);
     System.out.println(" How many dollars do you have?");
      amount= myAmount.nextInt();
     Random dice = new Random();
    while(sum <7 & amount !=0){
     for(int i=1 ; i <3 ; i++){
        int randomDice  = dice.nextInt(6);
        System.out.println(randomDice);
        sum += randomDice;
        
     }
     System.out.println(" the sumeation is "+ sum);
        if (sum == 7){
            amount +=4;
            winrolls +=rolls;
            winamount+=amount;}
            else{
            amount -=1;}
        System.out.println(" your amount now is  "+ amount);
        rolls += 1;   
        sum=0;
    }
       if(winrolls !=0){
          System.out.println(" You should have quit after  "+ winrolls+" rolls"
           +"when you had $"+winamount);}
       
       else if(amount == 0 ){ 
      System.out.println(" You are broke after  "+ rolls+" rolls");}
       //else{
      // System.out.println(" You should have quit after  "+ winrolls+" rolls"
      // +"when you had $"+amount);}
       }
      
}
      
    
    
        
