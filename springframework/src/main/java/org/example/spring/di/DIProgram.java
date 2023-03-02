package org.example.spring.di;

import org.example.spring.di.entity.*;

public class DIProgram {
    public static void main(String[] args) {
        // 참조형은 인터페이스로 객체형식은 데이터 구현 객체로
        Exam exam = new RadnessExam();
        ExamConsole console = new InlineExamConsole(exam);  // DI
        ExamConsole console2 = new GridExamConsole(exam);

        // 소스를 수정하지 않고 설정을 뺴는 작업

        console.print();
        console2.print();

    }
}
