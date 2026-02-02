package sait.mms.manager;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import sait.mms.problemdomain.Movie;

public class MovieManager {

    private List<Movie> movies;

    public void saveMovieListToFile() {
        String filePath = "res/movies.txt";

        try (PrintWriter pw = new PrintWriter(
                new BufferedWriter(new FileWriter(filePath, false)))) {

            for (Movie m : movies) {
                pw.println(m.getDuration() + "," +
                           m.getTitle() + "," +
                           m.getYear());
            }

        } catch (IOException e) {
            System.out.println("Error saving movies to file.");
        }
    }
}
