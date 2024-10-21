package ie.atu.student;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity

public class Student {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private String id;

    @NotBlank (message = "Cannot be Blank")
    private String firstname;

    @NotBlank (message = "Cannot be Blank")
    private String lastname;

    @NotBlank (message = "Cannot be Blank")
    private String email;

    @NotBlank (message = "Cannot be Blank")
    private String dob;

}
