package java8Features.lambda.createThreadUsingLambdaExpressions;

class RandomPlayer {
 
    public void playGame(String gameName)
        throws InterruptedException
    {
 
        System.out.println(gameName + " game started");
 
        // Assuming game is being played for 500
        // milliseconds
        Thread.sleep(500); // this statement may throw
                           // interrupted exception, so
                           // throws declaration is added
 
        System.out.println(gameName + " game ended");
    }
 
    public void playMusic(String trackName)
        throws InterruptedException
    {
 
        System.out.println(trackName + " track started");
 
        // Assuming music is being played for 500
        // milliseconds
        Thread.sleep(500); // this statement may throw
                           // interrupted exception, so
                           // throws declaration is added
 
        System.out.println(trackName + " track ended");
    }
}