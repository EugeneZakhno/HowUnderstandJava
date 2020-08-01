package io.github.eugenezakhno.javablog.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import java.io.Serializable;
import java.time.LocalDateTime;

@Data // adding getters and setters
@Builder  // adding pattern Builder
public class Post {

    private String title;
    private String body;

}