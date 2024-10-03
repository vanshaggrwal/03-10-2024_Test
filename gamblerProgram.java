
    import java.util.Random;

    public class gamblerProgram {
    public static void main(String[] args) {
        
        int stake = 10;  
        int goal = 20;   
        int numTrials = 1000;  

    
        simulateGambler(stake, goal, numTrials);
    }

    public static void simulateGambler(int stake, int goal, int numTrials) {
        int totalWins = 0;
        int totalBets = 0; 
        Random random = new Random();

        for (int i = 0; i < numTrials; i++) {
            int currentStake = stake; 
            int bets = 0; 

           
            while (currentStake > 0 && currentStake < goal) {
                bets++; 
                if (random.nextBoolean()) {
                    currentStake++; 
                } else {
                    currentStake--; 
                }
            }

            
            if (currentStake == goal) {
                totalWins++;
            }
            totalBets += bets; 
        }

        
        System.out.println("Total Wins: " + totalWins);
        System.out.println("Winning Percentage: " + (100.0 * totalWins / numTrials) + "%");
        System.out.println("Average Bets per Trial: " + (1.0 * totalBets / numTrials));
    }
}


