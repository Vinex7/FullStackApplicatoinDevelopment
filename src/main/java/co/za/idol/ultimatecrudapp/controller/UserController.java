package co.za.idol.ultimatecrudapp.controller;

import co.za.idol.ultimatecrudapp.model.User;
import co.za.idol.ultimatecrudapp.service.UserService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

/**
 * REST controller for managing user-related endpoints.
 */
@RestController
@RequestMapping("/api/users")
@Validated
@Tag(name = "User Management System", description = "Operations pertaining to user in User Management System")
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    /**
     * Adds a new user.
     *
     * @param user the user to add
     * @return the added user
     */
    @Operation(summary = "Add a new user", description = "Creates a new user in the system")
    @PutMapping
    public User addUser(@Valid @RequestBody User user) {
        return userService.addUser(user);
    }

    /**
     * Updates an existing user.
     *
     * @param userId the ID of the user to update
     * @param user   the updated user information
     */
    @Operation(summary = "Update an existing user", description = "Updates the details of an existing user by their ID")
    @PostMapping("/{userId}")
    public User updateUser(@PathVariable int userId, @Valid @RequestBody User user) {
        userService.updateUser(userId, user);
        return user;
    }

    /**
     * Retrieves a user by their ID.
     *
     * @param userId the ID of the user to retrieve
     * @return the user with the specified ID, or null if no such user exists
     */
    @Operation(summary = "Retrieve a user by ID", description = "Fetches a user by their ID")
    @GetMapping("/{userId}")
    public User getUser(@PathVariable int userId) {
        return userService.getUser(userId);
    }

    /**
     * Deletes a user by their ID.
     *
     * @param userId the ID of the user to delete
     */
    @Operation(summary = "Delete a user by ID", description = "Deletes a user by their ID")
    @DeleteMapping("/{userId}")
    public void deleteUser(@PathVariable int userId) {
        userService.deleteUser(userId);
    }
}
