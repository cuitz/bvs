package cc.cuitz.bvs.vo;

import lombok.Data;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;

@Data
@Valid
public class LoginParam {
    @NotBlank
    private String username;

    @NotBlank
    private String password;
}
