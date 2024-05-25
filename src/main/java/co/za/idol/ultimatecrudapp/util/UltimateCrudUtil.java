package co.za.idol.ultimatecrudapp.util;

import co.za.idol.ultimatecrudapp.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class UltimateCrudUtil {

    private static final Logger logger = LoggerFactory.getLogger(UserService.class);

    public static final String USER_ADDED_WITH_ID = "User added with ID: {}";
    public static final String USER_UPDATED_WITH_ID = "User updated with ID: {}";
    public static final String USER_WITH_ID_NOT_FOUND = "User with ID {} not found";
    public static final String USER_DELETED_WITH_ID = "User deleted with ID: {}";
    public static final String USER_WITH_ID_NOT_DELETED = "User deleted with ID: {} could not be deleted";
    public static final String USER_RETRIEVED_WITH_ID = "User retrieved with ID: {}";

    /**
     * Logs user if not found
     *
     * @param userId user identifier
     */
    public static void userNotFoundLogging(int userId){
        logger.warn(USER_WITH_ID_NOT_FOUND, userId);
    }

}
