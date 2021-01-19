package constructors;

public class Puppy {

    private String name = "none";

    public Puppy(){} // default constructor;
    // * It is there even if not written.
    // * Has no arguments (therefore is a default constructor)

    /**
     * Not a default constructor
     * @param name
     */
    public Puppy(String name){
        this.setName(name);
    }

    /**
     * Sets a name for a puppy
     *
     * @param name - name of a puppy
     * @throws RuntimeException in case if invalid name "less than 2 chars".
     */
    public void setName(String name){
        if(name == null || name.length() < 3 ){
            throw new RuntimeException("invalid name passed");
        }else {
            this.name = name;
        }
    }


    public String toString() {
        return "name: " + this.name;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
