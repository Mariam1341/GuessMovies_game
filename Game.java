/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guessmovies;
import java.util.Scanner;
/**
 *
 * @author Vega Laptop
 */
public class Game {
    private int wrong = 0; 
    private char guessed;
    private String movieName;
    private int num = 0;
    private int noo = 0;
    private int lo = 0;
    private int check = 0;
    

 //   private  static String ar[];
   // String ar[] = new String[100];
    //String arr[] = new String[100];
    char[] arr = new char[50];
    char[] ar = new char[50];
    public Game(String movieName){
        this.movieName = movieName;

        for(int n = 0; n < movieName.length(); n++){
            
            arr[n] = movieName.charAt(n);
        }
           
        for(int n = 0; n < movieName.length(); n++){
            if(arr[n] == ' ' ){
                ar[n] =' ';
                check++;
                
            }else{
                ar[n] ='-';
            }
        }
        noo = check;
    }
    
    
    public void interFace(){
        Scanner input = new Scanner(System.in);
        System.out.println("\nYou are guessing:");
        System.out.println("You have guessed ("+wrong+")wrong letters");
        System.out.print("Guess a letter:");
        guessed = input.next().charAt(0);
    }
    
    public void game(){
        for(int n = 0; n < movieName.length(); n++){
            
           // int location = movieName.indexOf(guessed);
            if(arr[n] == guessed){
                ar[n] = guessed;
                num = 1;
                noo++;
            }
             
        }
        if (num == 0)
            wrong++;
        num =0; 
          
        for(int n = 0; n < movieName.length(); n++){
            System.out.print(ar[n]); 
        }
   
        if (noo == movieName.length()){
            System.out.print("\nyou win");
            lo = 1;
            
        }
         
    }

    public int getWrong() {
        return wrong;
    }

    public void setWrong(int wrong) {
        this.wrong = wrong;
    }

    public int getLo() {
        return lo;
    }

    public void setLo(int lo) {
        this.lo = lo;
    }
    
    
    
}
