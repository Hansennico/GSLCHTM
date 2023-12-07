package Repository;

public class TeamRepository implements Repository {
@Override
    public ArrayList<Team> find(String column, String[] conditions, Boolean join, String joinTable, Connection conn) {
        // implementation goes here
    }

    @Override
    public Team findOne(String column, String[] conditions, Boolean join, String joinTable, Connection conn) {
        // implementation goes here
    }

    @Override
    public Team insert(String[] data, Connection conn) {
        // implementation goes here
    }
}
}
