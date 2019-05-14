package digiovanna.wampus;

public class Wampus {
    //Wampus will wait 2 turns in each chamber before moving
    int WaitingPeriod = 2;
    // Wampus will pick a random room to move to. If you left his chamber without scaring him last turn, he will
    // follow you for 2 turns, ignoring the waiting period. Wampi will ignore all hazards.
    boolean isAggro = false;
    boolean isScared = false;
    Wampus() {
        //TODO: Add difficulty option
    }
}
