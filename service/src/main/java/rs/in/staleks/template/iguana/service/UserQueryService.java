package rs.in.staleks.template.iguana.service;

import rs.in.staleks.template.iguana.domain.User;

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
