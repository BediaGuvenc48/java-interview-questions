package interview2;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class CheckStringOnlyDigits {

    public static void main(String[] args) {

        String x="sffA";

        System.out.println(x.matches("[0-9]+"));
    }
}
