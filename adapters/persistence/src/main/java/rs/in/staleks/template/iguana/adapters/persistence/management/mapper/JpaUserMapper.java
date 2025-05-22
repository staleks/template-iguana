package rs.in.staleks.template.iguana.adapters.persistence.management.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;
import rs.in.staleks.template.iguana.adapters.persistence.management.model.JpaUser;
import rs.in.staleks.template.iguana.domain.management.User;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface JpaUserMapper {
    JpaUserMapper USER_PERSISTENCE_MAPPER = Mappers.getMapper(JpaUserMapper.class);

    User jpaEntityToDomain(final JpaUser jpaUser);

    JpaUser domainToJpaEntity(final User user);
}
