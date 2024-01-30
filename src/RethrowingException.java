import java.sql.SQLException;
import java.util.Random;

public class RethrowingException {
    public static void main(String[] args) throws Exception {
        registerUser("user");
    }

    static void registerUser(Object user) throws Exception {
        try {
            saveDB(user);
            sendEmail(user);
        } catch (SQLException e) {
            ApiException exception = new ApiException(e.getMessage());
            exception.initCause(e);
            throw exception;
        }

    }

    private static void saveDB(Object user) throws SQLException {
        if (new Random().nextBoolean()){
            throw new SQLException("Could not connect to database");
        }
    }

    private static void sendEmail(Object user) throws Exception {
        if (new Random().nextBoolean()){
            throw new Exception("Could not connect to smtp server");
        }
    }
}

class ApiException extends RuntimeException{
    public ApiException(String message){
        super(message);
    }
}
