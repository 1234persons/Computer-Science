

public class RandomWalk {
    public static void main(String[] args) {

        int startingPoint;
        double randomStep;
        int stepCount;
        int mostSteps = 0; 
        double averageSteps = 0;
        double totalSteps = 0;
        
        for (int trials = 0; trials < 50; trials++) {
            stepCount = 0;
            startingPoint = 0;
            while (Math.abs(startingPoint) != 4) {
                
                randomStep = (10-(-10)) * Math.random() + -10;
                stepCount += 1;
                
                if ((int)randomStep >= 0) {
                    startingPoint += 1;
                } else {
                    startingPoint -= 1;
                }

                if (mostSteps < stepCount) {
                    mostSteps = stepCount;
                }
                

            }
            totalSteps += stepCount;
        }
        averageSteps = totalSteps/50;
        System.out.println("The most steps taken was: " + mostSteps);
        System.out.println("The average amount of steps taken was: " + averageSteps);
    }
}
