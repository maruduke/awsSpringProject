package com.book.springboot.Dto;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class HelloResponseDtoTest {

    @Test
    public void 롬복_기능테스트() {
        //given
        String name = "test";
        int amount = 100;

        //when
        HelloResponseDto dto = new HelloResponseDto(name, amount);
        //then

        assertThat(dto.getName()).isEqualTo(name);
        assertThat(dto.getAmount()).isEqualTo(amount);
    }
}