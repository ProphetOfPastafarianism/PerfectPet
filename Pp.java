import java.util.Scanner;
public class Pp
{
    public static void main(String[] args)
    {
        //ask user for info 
        //makes the scanner
    Scanner myObj = new Scanner(System.in);
    //makes the code look cool and interactive
    System.out.println("Favorite color:");
    //gets the color
    String color = myObj.nextLine();
    //makes the code look cool and interactive
    System.out.println("Favorite season:");
    //gets the season
    String season = myObj.nextLine();
    //same as before
    System.out.println("Your name:");
    //gets ur name
    String name = myObj.nextLine();
    if (color=="blue"){
        if (season=="fall"){    
        System.out.println("you get an alligator!");
        }
        if (season=="spring"){
        System.out.println("You get an ostrich!");    
        }
    
        //add and for rock in case
        if (season=="winter" && name.substring(0,1)==("A")){
        System.out.println("You get an axolotl!");
        }
        if (season=="summer"){
        System.out.println("You get a pony!");
        }
        if (season=="winter"){
        System.out.println("You get a rock!");    
        }
    }
    if (color=="green"){
        if (season=="winter"){
        System.out.println("You get a giraffe!");
        }
        if (season!="winter" && season!="fall"){
            System.out.println("You get a dog!");
        }
    
    }

    
    }
}

