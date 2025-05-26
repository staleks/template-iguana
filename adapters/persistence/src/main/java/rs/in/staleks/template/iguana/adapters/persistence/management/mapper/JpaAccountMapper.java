package rs.in.staleks.template.iguana.adapters.persistence.management.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

import rs.in.staleks.template.iguana.adapters.persistence.management.model.JpaAccount;
import rs.in.staleks.template.iguana.domain.management.Account;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface JpaAccountMapper {

    JpaAccountMapper ACCOUNT_PERSISTENCE_MAPPER = Mappers.getMapper(JpaAccountMapper.class);

    Account jpaEntityToDomain(final JpaAccount jpaAccount);

    JpaAccount domainToJpaEntity(final Account account);
    
}