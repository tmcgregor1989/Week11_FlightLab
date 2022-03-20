public class Pilot extends Staff{

    private String licence;

    public Pilot(String name, Rank rank, String licence){
        super(name, rank);
        this.licence = licence;
    }

    public String getLicence() {
        return licence;
    }

    public void setLicence(String licence) {
        this.licence = licence;
    }

    public String flyPlane(){
        return "I can Fly!!!";
    }
}
