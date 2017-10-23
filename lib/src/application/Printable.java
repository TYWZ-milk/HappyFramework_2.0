package application;

public interface Printable {

    default String getMethodName() {
        StackTraceElement[] stacktrace = Thread.currentThread().getStackTrace();
        StackTraceElement e = stacktrace[3];
        return e.getMethodName();
    }

    default void print(String description){
        String className = this.getClass().toString();
        String methodName = this.getMethodName();
        System.out.println("<" + className +"> [method " + methodName +"]"+ " : " + description);
    }

}
