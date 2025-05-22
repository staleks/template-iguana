package rs.in.staleks.template.iguana.adapters.persistence.management.adapter;

import rs.in.staleks.template.iguana.adapters.persistence.management.repository.JpaUserRepository;
import rs.in.staleks.template.iguana.domain.management.User;
import rs.in.staleks.template.iguana.service.error.ResourceNotFoundException;
import rs.in.staleks.template.iguana.service.management.UserPersistencePort;

import static java.lang.String.format;
import static rs.in.staleks.template.iguana.adapters.persistence.management.mapper.JpaUserMapper.USER_PERSISTENCE_MAPPER;
import static rs.in.staleks.template.iguana.service.error.ResourceNotFoundException.RESOURCE_NOT_FOUND;

public class UserPersistenceAdapter implements UserPersistencePort {

    private final JpaUserRepository userRepository;

    public UserPersistenceAdapter(JpaUserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User getUserById(final Long userId) {
        return userRepository.findById(userId).map(USER_PERSISTENCE_MAPPER::jpaEntityToDomain).orElseThrow(() -> new ResourceNotFoundException(format(RESOURCE_NOT_FOUND, userId.toString())));
    }

}
