package com.example.calculator;

import java.util.ArrayList;
import java.util.List;

public class CalculationHistory {
    private List<String> calculatorHistory = new ArrayList<>();


    public List<String> getCalculatorHistory() {
        return calculatorHistory;
    }

    public void saveHistory(String history) {
        calculatorHistory.add(history);
    }

    public void printHistory() {
        if (calculatorHistory.isEmpty()) {
            System.out.println("계산 기록이 없습니다.");
        } else {
            for(String history : calculatorHistory ){
                System.out.println(history);
            }
        }
    }

    public void clearHistory() {
        if (calculatorHistory.isEmpty()) {
            System.out.println("계산 기록이 없습니다.");
        } else {
            System.out.println(calculatorHistory.get(calculatorHistory.size()-1));
            System.out.println("삭제되었습니다.");
            calculatorHistory.remove(calculatorHistory.size()-1);
        }
    }
}
