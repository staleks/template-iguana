package rs.in.staleks.template.iguana.service;

import rs.in.staleks.template.iguana.domain.User;

public interface UserQuery {
    User getUserById(final Long id);
}
