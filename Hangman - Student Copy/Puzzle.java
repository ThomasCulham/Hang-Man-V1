import java.util.ArrayList;
import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;

public class Puzzle{
    private String word = "eye" ;
    private boolean unsolved= true;
    private String o= "";
    private String w= " ";
    private int ca = 0;

    Puzzle(){

        for ( int i =0; i<word.length(); i++){
            o=o+" _";
        }
    }

    public boolean isUnsolved(){
        if(ca==word.length()){
            unsolved = false;
        }

        return unsolved;

    }

    public void show(){
        System.out.println(o);
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println(" Incorrect Choices:");
        System.out.println(w);
    }

    public String getWord(){
        return word;
    }

    public boolean makeGuess(String g){
        for(int i = 0; i<word.length(); i++){
            String index = ""+ word.substring(i,i+1); 
            if(index.equals(g)){
                int in = i*2;
                o = o.substring(0,in) + " " + g + o.substring(in+2, o.length());
                ca++;
            }
        }
        if(!word.contains(g)){
            w = w + g + " ";
        }
        return word.contains(g);
    }

}
