public class NEWPro {
    public static void main(String[] args){

        CalculateScore();

    }
    public static void CalculateScore(){
        boolean gameOver = true;
        int Score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        if(gameOver){
            int finalScore = Score+(levelCompleted*bonus);
            finalScore+=1000;
            System.out.println("Your final Score was "+ finalScore);

        }
    }
    
}
