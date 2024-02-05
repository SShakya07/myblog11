package com.myblog.myblog11.payload;

import javax.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data

public class CommentDto {

    private  long id;
    private String text;
    private String email;

}
