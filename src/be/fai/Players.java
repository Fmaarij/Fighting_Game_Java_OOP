package be.fai;

public class Players {
    //properties
    private String name = "Unknown";
    private String lastName;
    private int lifePoint = 100;
    private int punchPoint;
    private int kickPoint;
    private int specialAttack;

    //constructor no-args
    public Players() {
    }


    //constructor with name
    public Players(String PlayerName) {
        this.name = PlayerName;
    }

    //constructor with-args

    public Players(String name, String lastName, int lifePoint, int punchPoint, int kickPoint) {
        this.name = name;
        this.lastName = lastName;
        this.lifePoint = lifePoint;
        this.punchPoint = punchPoint;
        this.kickPoint = kickPoint;
    }

    //setter and getter

    public String getName() {
        return name;
    }

    public String setName(String name) {
        this.name = name;
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getLifePoint() {
        return lifePoint;
    }

    public void setLifePoint(int lifePoint) {
        this.lifePoint = lifePoint;
    }

    public int getPunchPoint() {
        return punchPoint;
    }

    public void setPunchPoint(int punchPoint) {
        this.punchPoint = punchPoint;
    }

    public int getKickPoint() {
        return kickPoint;
    }

    public void setKickPoint(int kickPoint) {
        this.kickPoint = kickPoint;
    }

    public int getSpecialAttack() {
        return specialAttack;
    }

    public void setSpecialAttack(int specialAttack) {
        this.specialAttack = specialAttack;
    }

    //Override
    @Override
    public String toString() {
        return "Name: " + this.name + " Last name: " + this.lastName + " Life point: " + this.lifePoint
                + " Punch Point: " + this.punchPoint + " Kick point: " + this.kickPoint + " Special attack: "
                + this.specialAttack;
    }

}
