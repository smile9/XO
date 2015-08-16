package XO.model;

/**
 * Created by Samsung on 16.08.2015.
 */
public class Player {

    private final String name;

    private final Figure figure;

    public Player(final String name, final Figure figure) {
        this.name = name;
        this.figure = null;
    }
    public String getName()
    {
        return name;
    }

    public Figure getFigure(){
        return figure;
    }
}
