package hu.nive.ujratervezes.kepesitovizsga.jurassic;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class JurassicPark {

    private DataSource dataSource;

    public JurassicPark(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public List<String> checkOverpopulation() {

        List<String> overpopulatedDinosaurs = new ArrayList<>();

        try (Connection conn = dataSource.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery("SELECT `breed` FROM `dinosaur` WHERE `expected` < `actual` ORDER BY breed")) {

            addToList(overpopulatedDinosaurs, rs);
            return overpopulatedDinosaurs;

        } catch (SQLException sqle) {
            throw new IllegalArgumentException("Error by insert", sqle);
        }
    }

    private void addToList(List<String> overpopulatedDinosaurs, ResultSet rs) throws SQLException {
        while (rs.next()) {
            String breed = rs.getString("breed");
            overpopulatedDinosaurs.add(breed);
        }
    }
}
