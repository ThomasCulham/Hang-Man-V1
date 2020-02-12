import java.util.ArrayList;
import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;

public class Puzzle{
    private String word = "" ;
    private boolean unsolved= true;
    private String o= "";
    private String w= " ";
    private int ca = 0;

    Puzzle(){

        ArrayList<String> words = new ArrayList<String>();

        try {
            File file = new File("words.txt");
            Scanner scanner = new Scanner(file);

            while (scanner.hasNext()) {
                String tempWord = scanner.next().toLowerCase();
                words.add(tempWord);
            }
            scanner.close();
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        
        int iw = (int)(Math.random()*words.size());
        System.out.println(iw);
        word += words.get(iw);
        
        
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
        System.out.println("Puzzle: " + o);
        System.out.println("");
        System.out.println("Guesses: " + w);
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
        w = w + g + ", ";
        return word.contains(g);
    }

}
