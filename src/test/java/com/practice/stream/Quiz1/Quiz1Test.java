package com.practice.stream.Quiz1;

import com.opencsv.exceptions.CsvException;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;

@Slf4j
class Quiz1Test {

    private final Answer1 answer = new Answer1();
    private final Quiz1 quiz = new Quiz1();

    @DisplayName("1.1 각 취미를 선호하는 인원이 몇 명인지 계산하여라.")
    @Test
    void quiz1() throws IOException, CsvException {
        // 축구 3
        // 농구 2
        // 야구 2
        // 당구 1
        // 개발 3
        // 피아노 1
        // 스포츠댄스 1
        Map<String, Long> result = quiz.quiz1();
        log.info(String.valueOf(result));
    }

    @Test
    void quiz2() throws IOException, CsvException {
        assertThat(quiz.quiz2()).isEqualTo(answer.quiz2());
    }

    @Test
    void quiz3() throws IOException, CsvException {
        assertThat(quiz.quiz3()).isEqualTo(answer.quiz3());
    }

}