package rs.in.staleks.template.iguana.service.management;

import rs.in.staleks.template.iguana.domain.management.User;

public class UserQueryService implements UserQuery {

    private final UserPersistencePort userPersistencePort;

    public UserQueryService(UserPersistencePort userPersistencePort) {
        this.userPersistencePort = userPersistencePort;
    }

    @Override
    public User getUserById(final Long id) {
        return userPersistencePort.getUserById(id);
    }
}
