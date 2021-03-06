package truckmanagementproject.web.models.documents;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.web.multipart.MultipartFile;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
public class AddVehicleDocumentModel {

    private String type;
    private MultipartFile picture;
    private String expiryDate;
    private String regNumber;

}
