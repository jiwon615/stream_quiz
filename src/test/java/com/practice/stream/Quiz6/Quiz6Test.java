package com.practice.stream.Quiz6;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class Quiz6Test {

    private final Answer6 answer = new Answer6();
    private final Quiz6 quiz = new Quiz6();

    @DisplayName("6.1 stuArr에서 불합격(150점 미만)한 학생의 수를 남자(true)와 여자(false)로 구별하여라. (Boolean, List)")
    @Test
    void quiz1() {
        /**
         * {
         * false=[[안지미, 여, 1학년 2반,  50점 ],
         *     [황지미, 여, 1학년 3반, 100점 ],
         *     [안지미, 여, 2학년 2반,  50점 ],
         *     [황지미, 여, 2학년 3반, 100점 ]],
     *     true=[[남자바, 남, 1학년 2반, 100점 ],
         *     [남자바, 남, 2학년 2반, 100점 ]]
     *     }
         *
         */
        assertThat(quiz.quiz1()).isEqualTo(answer.quiz1());
    }

    @DisplayName("6.2 각 반별 총점을 학년 별로 나누어 구하여라 (Map<Integer, Map<Integer, Integer>>)")
    @Test
    void quiz2() {
        // 1={1=750, 2=300, 3=450}, 2={1=750, 2=300, 3=450}
        assertThat(quiz.quiz2()).isEqualTo(answer.quiz2());
    }

}