package hu.nive.ujratervezes.jurassic;

import java.util.ArrayList;
import java.util.List;

public class JurassicPark {

    private String dbUrl;
    private String dbUser;
    private String dbPassword;

    public JurassicPark(String dbUrl, String dbUser, String dbPassword) {
        this.dbUrl = dbUrl;
        this.dbUser = dbUser;
        this.dbPassword = dbPassword;
    }

    public List checkOverpopulation() {
        List<Object> dinosaur = new ArrayList<>();
        return dinosaur;
    }
}
