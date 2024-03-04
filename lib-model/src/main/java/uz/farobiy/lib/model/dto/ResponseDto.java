package uz.farobiy.lib.model.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class ResponseDto<T> {
   private boolean success;
   private String message;
   private Integer code;
   private T data;
}
