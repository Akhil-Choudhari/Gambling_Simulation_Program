package GamblingSimulation;

public class GamblingSimulation {

	static int TotalDayStake = 100;
	static int EachBit = 1;
	
	public static void main(String[] args) {
		
		System.out.println(" Welcome to the Gambling Simulation Program.");
		System.out.println("Total Stakes of a day is 100 $");
		System.out.println("Bit of Each Game is 1 $");
		
		int Win = 0;
		int Loose = 0;
		int counter = 1;
        double randNum = 0.0;
        
        while(counter <= TotalDayStake)
        {
            randNum = Math.random();
            System.out.print(counter + "\t");
             
            if(randNum < .5)
            {
                Win++;
                System.out.println("\t Wins");
            }
            else
            {
                Loose++;
                System.out.println("\t looses");
               }
            counter++;      
        }
        System.out.println();
        System.out.println("Total number of Wins = " + Win);
        System.out.println("Total money Wins in the game = " + Win+"$");
        System.out.println("Total number of Loose = " + Loose);
        System.out.println("Total money Looses in the game = " + Loose+"$");
	}

}
