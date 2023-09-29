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
    @DisplayName("1.2 정씨 성을 갖는 인원들이 갖는 각 취미 별 수를 계산하여라.")
    void quiz2() throws IOException, CsvException {
        Map<String, Long> result = quiz.quiz2();
        log.info(String.valueOf(result));
//        assertThat(quiz.quiz2()).isEqualTo(answer.quiz2());
    }

    @DisplayName("1.3 소개 내용에 '좋아'가 몇번 등장하는지 계산하여라.")
    @Test
    void quiz3() throws IOException, CsvException {
        assertThat(quiz.quiz3()).isEqualTo(8);
    }

}