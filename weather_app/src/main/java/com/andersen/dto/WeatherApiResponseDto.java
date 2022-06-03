package com.andersen.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.web.bind.annotation.GetMapping;

@Data
@AllArgsConstructor
@NoArgsConstructor
//создаем класс с полями которые соответствуют джейсону, чтобы спарсить и перевести  объект
public class WeatherApiResponseDto {
    //тут внутри jsona вложенный еще класс main, а в нем уже поле temp
    private Double temp;
    private WC main;

    public String getTemp() {
        return this.main.temp.toString();
    }

    @Getter
    @Setter
    @NoArgsConstructor
    class WC {
        private Double temp;
    }

}
