package Repository;

public class UserRepository implements Repository{
@Override
    public ArrayList<User> find(String column, String[] conditions, Boolean join, String joinTable, Connection conn) {
        // implementation goes here
    }

    @Override
    public User findOne(String column, String[] conditions, Boolean join, String joinTable, Connection conn) {
        // implementation goes here
    }

    @Override
    public User insert(String[] data, Connection conn) {
        // implementation goes here
    }
}
}
