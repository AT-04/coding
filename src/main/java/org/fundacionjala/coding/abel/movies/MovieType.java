package org.fundacionjala.coding.abel.movies;

/**
 * Created by AbelBarrientos on 5/31/2017.
 */
public class MovieType {

    private int type;
    private AbstractMovieType movieType;

    /**
     * The Constructor.
     * @param type Movie Type.
     * @param movieType The movie Type.
     */
    public MovieType(int type, AbstractMovieType movieType) {
        this.type = type;
        this.movieType = movieType;
    }

    /**
     * Getter for type.
     * @return int type.
     */
    public int getType() {
        return type;
    }

    /**
     * Getter for movie type.
     * @return AbstractMovieType type.
     */
    public AbstractMovieType getMovieType() {
        return movieType;
    }
}
