package rs.in.staleks.template.iguana.service;

import rs.in.staleks.template.iguana.domain.User;

public interface UserPersistencePort {
    User getUserById(final Long id);
}
