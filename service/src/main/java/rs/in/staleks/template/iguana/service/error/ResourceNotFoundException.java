package rs.in.staleks.template.iguana.service.error;

public class ResourceNotFoundException extends RuntimeException {
    public static final String RESOURCE_NOT_FOUND = "Resource with id: %s doesn't exist";

    public ResourceNotFoundException(final String message) {
        super(message);
    }
}
