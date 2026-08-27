package application.domain.models;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.UUID;

@Getter
@Setter

public class Binnacle {
     private String logId = UUID.randomUUID().toString();

    private String action;

    private String entityType;

    private String entityId;

    private String performedBy;

    private LocalDateTime timestamp = LocalDateTime.now();

    private String ipAddress;

    private String details;

    private boolean success;

    private String errorMessage;
    
}
