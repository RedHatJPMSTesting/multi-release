package test;

import org.jboss.jdk.util.Utils;
import org.junit.Test;

public class PidTest {
    @Test
    public void printPID() {
        System.out.printf("Utils=%s, PID=%d\n", Utils.class.getProtectionDomain().getCodeSource(), Utils.getProcessID());
    }
}
