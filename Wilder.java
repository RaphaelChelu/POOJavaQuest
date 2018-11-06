//CLASS

public class Wilder{
    private String firstname;
    private boolean aware;

//CONSTRUCTOR

    public Wilder(String firstname){
        this.firstname = firstname;
        this.aware = aware;
    }

//GETTERS AND SETTERS 

    public String getFirstname(){
        return this.firstname;
    }

    public void setFirstname(String firstname){
        this.firstname = firstname;
    }

    public boolean isAware() {
        return this.aware;
    }

    public void setAware(boolean aware) {
        this.aware = aware;
    }

//METHOD

    public String whoAmI(){
        if(this.aware != true){
            return "Je m'appelle " + this.getFirstname() + " et je ne suis pas aware.";
        } else {
            return "Je m'appelle " + this.getFirstname() + " et je suis aware.";
        }
    }
}
