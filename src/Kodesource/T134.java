package Kodesource;

import Kodesource.Resurses.NodeTest1;

import java.util.ArrayList;
import java.util.LinkedList;

public class T134 {


    public static void main(String[] args) {
        int target = 5;

        test(5, 0);
    }

    public static void test(int target, int numberStart) {
        ArrayList<ArrayList<Integer>> rezult = new ArrayList<>();

        class Step {
            int value;
            int step1 = 1;
            int step2 = 2;
            ArrayList<Integer> road = new ArrayList<>();

            public Step(int value) {
                this.value = value;
            }
//            public void setStep1(int step1) {
//                this.step1 = step1;
//            }
//
//            public void setStep2(int step2) {
//                this.step2 = step2;
//            }
            public ArrayList<Integer> getRoad() {
                return road;
            }
        }

        LinkedList<Step> stackStep = new LinkedList<>();
        Step start = new Step(numberStart);
        stackStep.add(start);

        while (stackStep.size() > 0) {
            Step currentStep = stackStep.removeFirst();
            if (currentStep.value == target) {
                rezult.add(currentStep.road);
                System.out.println(currentStep.road);
            }

            if (currentStep.value < target) {

                Step newStep = new Step(currentStep.value + currentStep.step1);
                newStep.getRoad().addAll(currentStep.getRoad());
                newStep.getRoad().add(newStep.step1);
                stackStep.addFirst(newStep);

                Step newStep2 = new Step(currentStep.value + currentStep.step2);
                newStep2.getRoad().addAll(currentStep.getRoad());
                newStep2.getRoad().add(newStep2.step2);
                stackStep.addLast(newStep2);

            }

        }

        System.out.println(rezult);

    }
}
