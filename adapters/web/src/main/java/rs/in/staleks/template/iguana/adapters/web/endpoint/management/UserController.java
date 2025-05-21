package rs.in.staleks.template.iguana.adapters.web.endpoint.management;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import rs.in.staleks.template.iguana.domain.management.User;
import rs.in.staleks.template.iguana.service.management.UserQuery;

import static org.springframework.http.ResponseEntity.ok;

@RestController
public class UserController {
    private static final String ONE_USER_ENDPOINT = "/management/v1/users/{userId}";

    private final UserQuery userQuery;

    public UserController(final UserQuery userQuery) {
        this.userQuery = userQuery;
    }

    @GetMapping(path = ONE_USER_ENDPOINT, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<User> fetchOne(@PathVariable("userId") final Long userId) {
        return ok(userQuery.getUserById(userId));
    }

}
