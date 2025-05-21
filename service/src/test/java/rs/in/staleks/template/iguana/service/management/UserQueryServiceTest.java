package rs.in.staleks.template.iguana.service.management;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import rs.in.staleks.template.iguana.domain.management.User;
import rs.in.staleks.template.iguana.testdata.FakerUserData;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class UserQueryServiceTest {

    @Mock
    private UserPersistencePort userPersistencePort;

    //~ class under test
    @InjectMocks
    private UserQueryService userQueryService;

    @Test
    void testGetUserById_ok() {
        User testUser = FakerUserData.randomUser();
        when(userPersistencePort.getUserById(Mockito.anyLong())).thenReturn(testUser);

        var user = userQueryService.getUserById(1L);
        assertNotNull(user);
    }


}
