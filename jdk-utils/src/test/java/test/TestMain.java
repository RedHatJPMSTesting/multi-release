package test;

import java.net.URL;

import org.jboss.jdk.util.Utils;

public class TestMain {
    public static void main(String[] args) {
        URL url = Utils.class.getResource("/org/jboss/jdk/util/Utils.class");
        System.out.printf("Utils=%s, PID=%d\n", url, Utils.getProcessID());

        System.out.printf("CallerClass: %s\n", Utils.getCallerClass());
    }
}
