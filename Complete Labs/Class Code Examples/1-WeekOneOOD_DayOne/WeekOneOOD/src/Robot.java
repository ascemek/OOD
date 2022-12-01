public class Robot {
    private String robotName;
    private String bodyColor;
    private boolean faceMask;
    private String job;
    private int rank;
    public Robot(String robotName, String bodyColor, boolean faceMask, String job, int rank) {
        this.robotName = robotName;
        this.bodyColor = bodyColor;
        this.faceMask = faceMask;
        this.job = job;
        this.rank = rank;
    }
    public String getRobotName() {
        System.out.println("My name is: " + robotName);
        return robotName;
    }
    public void setRobotName(String robotName) {
        this.robotName = robotName;
    }S
    public String getBodyColor() {
        System.out.println("My color: " + bodyColor);
        return bodyColor;
    }

    public void setBodyColor(String bodyColor) {
        this.bodyColor = bodyColor;
    }
    public void setFaceMask(boolean faceMask) {
        this.faceMask = faceMask;
    }
    public boolean getFaceMask(){
        System.out.println("Wearing a face mask: " + job);
        return faceMask;
    }
    public String getJob() {
        System.out.println("Currently working: " + job);
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public int getRank() {
        System.out.println("Currently rank: " + rank);
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }


}
