package rs.in.staleks.template.iguana.service.management;

import rs.in.staleks.template.iguana.domain.management.User;

public interface UserPersistencePort {
    User getUserById(final Long id);
}
