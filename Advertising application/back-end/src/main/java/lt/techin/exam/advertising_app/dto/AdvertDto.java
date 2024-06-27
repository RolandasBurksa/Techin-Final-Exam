package lt.techin.exam.advertising_app.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class AdvertDto {

    private Long id;
    private String title;
    private String description;
    private String comment;
    private Long categoryId;
}
