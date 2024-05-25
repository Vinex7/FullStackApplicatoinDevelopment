package co.za.idol.ultimatecrudapp.service;

import co.za.idol.ultimatecrudapp.model.User;
import co.za.idol.ultimatecrudapp.util.UltimateCrudUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

/**
 * Service class for managing users.
 */
@Service
public class UserService {

    private static final Logger logger = LoggerFactory.getLogger(UserService.class);

    private final Map<Integer, User> users = new HashMap<>();

    /**
     * Adds a new user.
     *
     * @param user the user to add
     * @return the added user
     */
    public User addUser(User user) {
        int userId = users.size() + 1;
        users.put(userId, user);
        logger.info("User added with ID: {}", userId);
        return user;
    }

    /**
     * Updates an existing user.
     *
     * @param userId the ID of the user to update
     * @param user   the updated user information
     */
    public User updateUser(int userId, User user) {
        if (users.containsKey(userId)) {
            users.put(userId, user);
            logger.info(UltimateCrudUtil.USER_UPDATED_WITH_ID, userId);
            return user;
        } else {
            UltimateCrudUtil.userNotFoundLogging(userId);
            return null;
        }
    }

    /**
     * Retrieves a user by their ID.
     *
     * @param userId the ID of the user to retrieve
     * @return the user with the specified ID, or null if no such user exists
     */
    public User getUser(int userId) {
        User user = users.get(userId);
        if (user != null) {
            logger.info(UltimateCrudUtil.USER_RETRIEVED_WITH_ID, userId);
        } else {
            UltimateCrudUtil.userNotFoundLogging(userId);
        }
        return user;
    }

    /**
     * Deletes a user by their ID.
     *
     * @param userId the ID of the user to delete
     */
    public void deleteUser(int userId) {
        if (users.containsKey(userId)) {
            users.remove(userId);
            logger.info(UltimateCrudUtil.USER_DELETED_WITH_ID, userId);
        } else {
            logger.info(UltimateCrudUtil.USER_WITH_ID_NOT_DELETED, userId);
        }
    }


}
