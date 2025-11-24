//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package io.diffblue;

public class Basic {

    public boolean isGreaterThanFive(int value) {
        return value > 5;
    }

    public String basicConditionCoverage(int in) {
        if (in < 15) {
            if (in % 2 == 0) {
                return "Even";
            }

            if (in % 2 > 0) {
                return "Odd";
            }
        } else if (in > 100) {
            return "greater than 100";
        }

        return "error - not allowed between 15 and 100";
    }
}
