package org.jboss.jdk.util;

public class Utils {
    public static long getProcessID() {
        ProcessHandle currentProcess = ProcessHandle.current();
        return currentProcess.pid();
    }
    public static Class<?> getCallerClass() {
        StackWalker stackWalker = StackWalker.getInstance();
        return stackWalker.getCallerClass();
    }

}
