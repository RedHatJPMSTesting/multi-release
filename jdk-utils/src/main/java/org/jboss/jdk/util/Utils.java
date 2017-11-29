package org.jboss.jdk.util;


public class Utils {

    public static long getProcessID() {
        String processName =
                java.lang.management.ManagementFactory.getRuntimeMXBean().getName();
        // See if this is of the form pid@host
        String[] parts = processName.split("@");
        long pid = 0;
        if (parts != null && parts.length == 2) {
            try {
                pid = Long.parseLong(parts[0]);
            } catch (NumberFormatException e) {
                // Ignore
            }
        }
        return pid;
    }
    public static Class<?> getCallerClass() {
        Class<?> caller = new SecurityManager() {
            public Class<?> getCaller() {
                return getClassContext()[2];
            }
        }.getCaller();
        return caller;
    }
}
