package com.haris.week15.inheritance;

import java.util.stream.Stream;

public class Testing {
    public static void main(String[] args) {
        ConsultingService consultingService = new ConsultingService("Testing", 1000, 100);
        System.out.println(consultingService.calculateFee());

        StreamingService streamingService = new StreamingService("Test2", 1000, 100);
        System.out.println(streamingService.calculateFee());
    }
}
