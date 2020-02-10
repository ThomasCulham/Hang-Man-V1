public class HangingMan {

    private int numWrongGuesses;
    String[] HangmanImage = {"+----+\n"+
            "|\n"+
            "|\n"+
            "|\n"+
            "/\\\n",

            "+----+\n"+
            "|    O\n"+
            "|\n"+
            "|\n"+
            "/\\\n",

            "+----+\n"+
            "|    O\n"+
            "|    +\n"+
            "|\n"+
            "/\\\n",

            "+----+\n"+
            "|    O\n"+
            "|    +-\n"+
            "|\n"+
            "/\\\n",

            "+----+\n"+
            "|    O\n"+
            "|   -+-\n"+
            "|\n"+
            "/\\\n",

            "+----+\n"+
            "|    O\n"+
            "|   -+-\n"+
            "|   / \n"+
            "/\\\n",

            "+----+\n"+
            "|    O\n"+
            "|   -+-\n"+
            "|   / \\\n"+
            "/\\\n",
        };
    private boolean alive = true;
    private int wg=0;
    HangingMan(){
    }

    public boolean isntDead(){
        return alive;
    }

    public void show(){
        System.out.println(HangmanImage[wg]);
    }

    public void dieSomeMore(){
        wg++;
        if(wg>=6){
            alive = false;
        }
    }
}
