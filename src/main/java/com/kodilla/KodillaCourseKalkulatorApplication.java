package com.kodilla;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class KodillaCourseKalkulatorApplication {
    public void adding() {
        int c = 5 + 5;
        System.out.println(c);
    }
    public void substracting() {
        int c = 10 - 5;
        System.out.println(c);
    }
    public static void main(String[] args) {
        KodillaCourseKalkulatorApplication calculator = new KodillaCourseKalkulatorApplication();
        calculator.adding();
        calculator.substracting();
    }
}
