package truckmanagementproject.web.models.documents;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class DriverDocumentViewModel {

    private String id;
    private String type;
    private String picture;
    private String expiryDate;
    private String driverName;

}
