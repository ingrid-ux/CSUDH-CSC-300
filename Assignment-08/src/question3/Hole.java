package question3;

public class Hole {
    // Implement a class Hole that has two integer instance variables
    // int par;
    // int score.
    private int par;
    private int score;
    // There is a single constructor that accepts the par and score.
    // The totals for each row are stored in the 19th hole.
    Hole(int par, int score){
        this.par = par;
        this.score = score;
    }
    // Include the standard getter and setter methods.

    public int getPar() {
        return par;
    }

    public void setPar(int par) {
        this.par = par;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    // Override the equals(Object obj) method that is
    // inherited from Object based on score.
    // Note that you won’t need to use equals( ) in this problem,
    // but it is good style to provide it in the class for other clients.

    @Override
    public boolean equals(Object obj){
        if (this == obj) return true;
        if (!(obj instanceof Hole)) return false;
        Hole other = (Hole) obj;
        return this.score == other.score;
    }



    // but it is good style to provide it in the class for other clients.
}
