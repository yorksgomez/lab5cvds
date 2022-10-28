package servlet;

import java.util.Random;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

@ManagedBean(name = "guessBean")
@ApplicationScoped
public class GuessBean {

    private int guessingNumer;
    private int currentTry;
    private int tries;
    private String gameState;

    public GuessBean() {
        start();
    }

    private void start() {
        currentTry = 0;
        tries = 0;
        gameState = "PLAYING";
        guessingNumer = new Random().nextInt(10);
    }

    public void restart() {
        start();
    }

    public void guess() {

        if(gameState == "WON" || gameState == "LOST")
            return;

        if(currentTry == guessingNumer)
            gameState = "WON";
        else
            tries++;

        if(tries >= 10)
            gameState = "LOST";

    }

    public int getGuessingNumer() {
        return guessingNumer;
    }
    
    public void setGuessingNumer(int guessingNumer) {
        this.guessingNumer = guessingNumer;
    }
    
    public int getTries() {
        return tries;
    }
    
    public void setTries(int tries) {
        this.tries = tries;
    }

    public String getGameState() {
        return gameState;
    }
    
    public void setGameState(String gameState) {
        this.gameState = gameState;
    }

    public int getCurrentPrize() {
        return 100000 - tries * 10000;
    }

    public int getCurrentTry() {
        return currentTry;
    }

    public void setCurrentTry(int currentTry) {
        this.currentTry = currentTry;
    }

}
