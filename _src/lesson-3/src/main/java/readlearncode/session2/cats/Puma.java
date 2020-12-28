package readlearncode.session2.cats;

/**
 * Source code github.com/readlearncode
 *
 * @author Alex Theedom www.readlearncode.com
 * @version 1.0
 */
public abstract class Puma implements Cat {

    public  String type() {
        return "Puma";
    }

    public void printParentType() {
        System.out.println("Parent type is: " + type());
    }

    public String lifeStyle = "Twilight";
    private String colour;

    public Puma(String colour) {
        this.colour = colour;
    }

}