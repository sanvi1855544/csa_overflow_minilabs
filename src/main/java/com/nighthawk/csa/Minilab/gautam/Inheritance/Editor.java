package com.nighthawk.csa.Minilab.gautam.Inheritance;
// specialized staffer. editors do more and have more responsibility
public class Editor extends Staffer{
    public int daysTillDeadline;
    public String weeklyMoto;
    public boolean onTrack;

    public Editor(int a, String d, String b, boolean c) {
        super(d, 10);
        daysTillDeadline = a;
        weeklyMoto = b;
        onTrack = c;
    }

    public Editor() {
        super("Editor", 10);
        daysTillDeadline = 10;
        weeklyMoto = "Get it done!";
        onTrack = true;
    }

    public void setRole() { //polymorphism
        role = "Editor";
    }

    public int deadlineStatus() {
        return daysTillDeadline;
    }

    public String getWeeklyMoto() {
        return weeklyMoto;
    }

    public boolean isOnTrack() {
        return onTrack;
    }
}
