public class Wilder {
    private String firstname;
    private boolean aware;

    //constructor
    public Wilder(String firstname, boolean aware) {
        this.firstname = firstname;
        this.aware = aware;
    }

    //getters
    public String getFirstname() {
        return firstname;
    }

    public boolean isAware() {
        return aware;
    }

    //setters

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setAware(boolean aware) {
        this.aware = aware;
    }

//methode
    public String  whoAmI(){
        if (isAware()==true){
            return "Je m'appelle "+getFirstname()+" et je suis aware";}
        else {
            return "Je m'appelle "+getFirstname()+" et je ne suis pas aware";
        }
    }
}
