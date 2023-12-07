package Repository;

public class Repository {
ArrayList<Model> find(String column, String[] conditions, Boolean join, String joinTable, Connection conn);
    Model findOne(String column, String[] conditions, Boolean join, String joinTable, Connection conn);
    Model insert(String[] data, Connection conn);
    }
}
