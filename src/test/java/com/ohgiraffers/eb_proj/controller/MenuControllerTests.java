package com.ohgiraffers.eb_proj.controller;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get; // 올바른 import
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
class MenuControllerTests {
    @Autowired
    private MockMvc mockMvc;

    @DisplayName("상태 확인 테스트")
    @Test
    public void healthCheckTest() throws Exception { // 'throw' -> 'throws'로 수정
        mockMvc.perform(get("/health1")) // 올바른 URL 매핑 확인 필요
                .andExpect(status().isOk())
                .andDo(print()); // 세미콜론 추가
    }
}
