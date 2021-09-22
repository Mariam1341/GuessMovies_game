/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guessmovies;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.nio.file.*;;
/**
 *
 * @author Vega Laptop
 */
public class GuessMovies {

    public static void main(String[] args) throws Exception {
        String movieName = null;
        int num = (int)(Math.random() * 25);
        File file = new File("C:\\Users\\Vega Laptop\\Documents\\note\\list of movies.txt");
        Scanner scanner = new Scanner(file);
              
        for (int i = 0; i < num; i++){
            if (scanner.hasNextLine()){
                movieName = scanner.nextLine();
            }
        }
        
        Game game = new Game(movieName);
        int check = game.getWrong();
        int ni = game.getLo();
        while(check < 10 && ni== 0){
        game.interFace();
        game.game();
        check = game.getWrong();
        ni = game.getLo();
        }
        if (check == 10){
            System.out.println("\nYou lose");
        }
        
        
    }
    
}
