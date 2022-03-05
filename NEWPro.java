public class NEWPro {
    public static void main(String[] args){

        CalculateScore(true,10000,8,200);

    }
    public static void CalculateScore(boolean gameOver,int Score,int levelCompleted,int bonus){
        if(gameOver){
            int finalScore = Score+(levelCompleted*bonus);
            finalScore+=1000;
            System.out.println("Your final Score was "+ finalScore);
         

        }
    }
    
}
