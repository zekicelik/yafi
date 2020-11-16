package com.eg.yafi.dto.in;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Positive;

public class UpdateThread {
    @Positive(message = "id must be positive")
    public long id;
    @NotBlank(message = "content can not be blank")
    public String content;
}
