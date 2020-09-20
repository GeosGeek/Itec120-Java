import java.lang.reflect.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;
import java.util.HashSet;
import java.util.Map;
import java.util.List;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.io.StringWriter;
import java.io.PrintWriter;
import java.util.function.Predicate;

        /*
        1. Rename the file as you wish, for instance for homework 3 you might choose HW3Test.java.
        2. Change the class name in the class declaration and within the main method immediately below.
        3. Remove the package statement at the top of this file.
        4. In order to not confuse students, you may wish to remove these comments.
        5. Write your tests in the main method below.
*/
public class TestLT8 {

public static boolean compareArrays(char[][] ch1, char[][] ch2) {
    return Arrays.deepEquals(ch1, ch2);
}

// For use as a standalone file.
public static void main(String[] args) {

    LT8Srv2 srv = new LT8Srv2();

    // --- weightedAve ----------------------------------------------------------------
    try {
        double precision = .01;
        int[] intArr = {80,90,60};
        double[] doubleArr = {.25,.25,.5};
        double expected = 72.5;
        TestLT8.doTest(srv, "weightedAve", new Object[]{intArr, doubleArr}, TestLT8.closeEnough(precision, expected),"should be " + expected);

        intArr = new int[] {70,60};
        doubleArr = new double[] {.3,.3};
        expected = 65;
        TestLT8.doTest(srv, "weightedAve", new Object[]{intArr, doubleArr}, TestLT8.closeEnough(precision, expected),"should be " + expected);

        intArr = new int[] {10,20,35,40,50};
        doubleArr = new double[] {.3,.3,.2,.1,.1};
        expected = 25;
        TestLT8.doTest(srv, "weightedAve", new Object[]{intArr, doubleArr}, TestLT8.closeEnough(precision, expected),"should be " + expected);

        intArr = new int[]       { 70, 90, 80, 86,86, 90};
        doubleArr = new double[] {.11,.15,.12,.06,.1,.17};
        expected = 84.309859;
        TestLT8.doTest(srv, "weightedAve", new Object[]{intArr, doubleArr}, TestLT8.closeEnough(precision, expected),"should be " + expected);

        intArr = new int[] {80,90};
        doubleArr = new double[] {.35,.45};
        expected = 85.625;
        TestLT8.doTest(srv, "weightedAve", new Object[]{intArr, doubleArr}, TestLT8.closeEnough(precision, expected),"should be " + expected);

        intArr = new int[] {80,90};
        doubleArr = new double[] {.25,.50};
        expected = 86.6666667;
        TestLT8.doTest(srv, "weightedAve", new Object[]{intArr, doubleArr}, TestLT8.closeEnough(precision, expected),"should be " + expected);

        intArr = new int[] {80,90};
        doubleArr = new double[] {.15,.62};
        expected = 88.051948;
        TestLT8.doTest(srv, "weightedAve", new Object[]{intArr, doubleArr}, TestLT8.closeEnough(precision, expected),"should be " + expected);

        intArr = new int[] {-24,-32,5,0};
        doubleArr = new double[] {.2,.23,.22,.14};
        expected = -14;
        TestLT8.doTest(srv, "weightedAve", new Object[]{intArr, doubleArr}, TestLT8.closeEnough(precision, expected),"should be " + expected);

        intArr = new int[] {};
        doubleArr = new double[] {};
        expected = 0;
        TestLT8.doTest(srv, "weightedAve", new Object[]{intArr, doubleArr}, TestLT8.closeEnough(precision, expected),"should be " + expected);

    } catch (Throwable tt) {
        TestLT8.printCachedMessages();
        throw tt;
    }
    TestLT8.printResults();

    // --- createCharArray -----------------------------------------------------------
    try {
        int rows = 3;
        int cols = 5;
        char ch = 'k';
        char[][] expected = { "kkkkk".toCharArray(), "kkkkk".toCharArray(), "kkkkk".toCharArray() };
        TestLT8.doTest(srv, "createCharArray", new Object[]{rows,cols,ch}, expected);

        rows = 6;
        cols = 1;
        ch = '%';
        expected = new char[][]{ "%".toCharArray(), "%".toCharArray(), "%".toCharArray(), "%".toCharArray(), "%".toCharArray(), "%".toCharArray()};
        TestLT8.doTest(srv, "createCharArray", new Object[]{rows,cols,ch}, expected);

        rows = 1;
        cols = 5;
        ch = '&';
        expected = new char[][] { "&&&&&".toCharArray() };
        TestLT8.doTest(srv, "createCharArray", new Object[]{rows,cols,ch}, expected);

        rows = 7;
        cols = 5;
        ch = '8';
        expected = new char[][]{ "88888".toCharArray(), "88888".toCharArray(), "88888".toCharArray(), "88888".toCharArray(),    
                                 "88888".toCharArray(), "88888".toCharArray(), "88888".toCharArray()     };
        TestLT8.doTest(srv, "createCharArray", new Object[]{rows,cols,ch}, expected);

        rows = 8;
        cols = 9;
        ch = ':';
        expected = new char[][]{ ":::::::::".toCharArray(),  ":::::::::".toCharArray(),  ":::::::::".toCharArray(),  ":::::::::".toCharArray(),  
                                 ":::::::::".toCharArray(),  ":::::::::".toCharArray(),  ":::::::::".toCharArray(),  ":::::::::".toCharArray(), };
        TestLT8.doTest(srv, "createCharArray", new Object[]{rows,cols,ch}, expected);

        rows = 0;
        cols = 0;
        ch = 'v';
        expected = new char[][]{};
        TestLT8.doTest(srv, "createCharArray", new Object[]{rows,cols,ch}, expected);

    } catch (Throwable tt) {
        TestLT8.printCachedMessages();
        throw tt;
    }
    TestLT8.printResults();

    // --- isJagged ------------------------------------------------------------
    try {
        char[][] ch = { "kkkkk".toCharArray(), "kkkkk".toCharArray(), "kkkkk".toCharArray() };
        boolean expected = false;
        TestLT8.doTest(srv, "isJagged", new Object[]{ch}, expected);

        ch = new char[][] { "this".toCharArray(), "is".toCharArray(), "jagged".toCharArray() };
        expected = true;
        TestLT8.doTest(srv, "isJagged", new Object[]{ch}, expected);

        ch = new char[][] { "boo".toCharArray(), "Y&^&*9876789".toCharArray(), "boo".toCharArray(), "boo".toCharArray() };
        expected = true;
        TestLT8.doTest(srv, "isJagged", new Object[]{ch}, expected);

        ch = new char[][] { "1".toCharArray(), "2".toCharArray(), "3".toCharArray(), "4".toCharArray(), "5".toCharArray() };
        expected = false;
        TestLT8.doTest(srv, "isJagged", new Object[]{ch}, expected);

        ch = new char[][] { "peach".toCharArray(), "lemon".toCharArray(), "apple".toCharArray() };
        expected = false;
        TestLT8.doTest(srv, "isJagged", new Object[]{ch}, expected);

        ch = new char[][] { "%".toCharArray(), "peach".toCharArray(), "lemon".toCharArray(), "apple".toCharArray() };
        expected = true;
        TestLT8.doTest(srv, "isJagged", new Object[]{ch}, expected);

        ch = new char[][] { "berry".toCharArray(), "$".toCharArray(), "peach".toCharArray(), "lemon".toCharArray(), "apple".toCharArray() };
        expected = true;
        TestLT8.doTest(srv, "isJagged", new Object[]{ch}, expected);

        ch = new char[][] { "berry".toCharArray(), "peach".toCharArray(), "pear".toCharArray(), "lemon".toCharArray(), "apple".toCharArray() };
        expected = true;
        TestLT8.doTest(srv, "isJagged", new Object[]{ch}, expected);

        ch = new char[][] {};
        expected = false;
        TestLT8.doTest(srv, "isJagged", new Object[]{ch}, expected);

    } catch (Throwable tt) {
        TestLT8.printCachedMessages();
        throw tt;
    }
    TestLT8.printResults();

    // --- allUpper -------------------------------------------------------------------
    try {
        char[][] ch = { "ABC".toCharArray(), "DE".toCharArray(), "FGHHHH".toCharArray() };
        boolean expected = true;
        TestLT8.doTest(srv, "allUpper", new Object[]{ch}, expected);

        ch = new char[][] { "ZZZZZZZZ".toCharArray(), "YYYYYYYYYY".toCharArray(), "AAAAAA".toCharArray() };
        expected = true;
        TestLT8.doTest(srv, "allUpper", new Object[]{ch}, expected);

        ch = new char[][] { "OIUYTREW".toCharArray(), "SDFGHJKL".toCharArray() };
        expected = true;
        TestLT8.doTest(srv, "allUpper", new Object[]{ch}, expected);

        ch = new char[][] { "XCVBNMQ".toCharArray() };
        expected = true;
        TestLT8.doTest(srv, "allUpper", new Object[]{ch}, expected);

        ch = new char[][]{ "VABNHYydikejhdJKL".toCharArray(), "ZZ".toCharArray(), "ZZ".toCharArray() };
        expected = false;
        TestLT8.doTest(srv, "allUpper", new Object[]{ch}, expected);

        ch = new char[][] { "ZYUDKZZ".toCharArray(), "EWDjIOK".toCharArray(), "WWSE".toCharArray() };
        expected = false;
        TestLT8.doTest(srv, "allUpper", new Object[]{ch}, expected);

        ch = new char[][]{ "DE[ZZ".toCharArray(), "RRR".toCharArray() };
        expected = false;
        TestLT8.doTest(srv, "allUpper", new Object[]{ch}, expected);

        ch = new char[][] { "DEZZ".toCharArray(), "R&RR".toCharArray() };
        expected = false;
        TestLT8.doTest(srv, "allUpper", new Object[]{ch}, expected);

        ch = new char[][] { "DEZZ".toCharArray(), "R6RR".toCharArray() };
        expected = false;
        TestLT8.doTest(srv, "allUpper", new Object[]{ch}, expected);

        ch = new char[][] { "EFGH".toCharArray(), "*IOK".toCharArray() };
        expected = false;
        TestLT8.doTest(srv, "allUpper", new Object[]{ch}, expected);

        ch = new char[][] { "EFGH".toCharArray(), "<IOK".toCharArray() };
        expected = false;
        TestLT8.doTest(srv, "allUpper", new Object[]{ch}, expected);

        ch = new char[][] { };
        expected = false;
        TestLT8.doTest(srv, "allUpper", new Object[]{ch}, expected);

    } catch (Throwable tt) {
        TestLT8.printCachedMessages();
        throw tt;
    }
    TestLT8.printResults();
    // --- remove -------------------------------------------------------------------
    try {
        TestLT8 arrSrv = new TestLT8();
        TestLT8.beginTesting("remove");
        char[][] ch = { "AAB".toCharArray(), "DEF".toCharArray(), "AAAAHH".toCharArray() };
        char remChar = 'A';
        srv.remove(ch, remChar);
        char[][] expected = { "B".toCharArray(), "DEF".toCharArray(), "HH".toCharArray() };
        TestLT8.doTest(arrSrv, "compareArrays", new Object[]{ch, expected}, true, "\n\t\t\t\tarray is " + Arrays.deepToString(ch) 
                                                                        + " but should be: " + Arrays.deepToString(expected)+"\n" );

        ch = new char[][] { "This".toCharArray(), "is".toCharArray(), "jagged.".toCharArray() };
        remChar = '$';
        srv.remove(ch, remChar);
        expected = new char[][] { "This".toCharArray(), "is".toCharArray(), "jagged.".toCharArray() };
        TestLT8.doTest(arrSrv, "compareArrays", new Object[]{ch, expected}, true, "\n\t\t\t\tarray is " + Arrays.deepToString(ch) 
                                                                        + " but should be: " + Arrays.deepToString(expected)+"\n" );

        ch = new char[][] { "This".toCharArray(), "is".toCharArray(), "jagged.".toCharArray() };
        remChar = 'i';
        srv.remove(ch, remChar);
        expected = new char[][] { "Ths".toCharArray(), "s".toCharArray(), "jagged.".toCharArray() };
        TestLT8.doTest(arrSrv, "compareArrays", new Object[]{ch, expected}, true, "\n\t\t\t\tarray is " + Arrays.deepToString(ch) 
                                                                        + " but should be: " + Arrays.deepToString(expected)+"\n" );

        ch = new char[][] { "Barry".toCharArray(), "rarely".toCharArray(), "revs".toCharArray(), "the".toCharArray(), "racer".toCharArray() };
        remChar = 'r';
        srv.remove(ch, remChar);
        expected = new char[][] { "Bay".toCharArray(), "aely".toCharArray(), "evs".toCharArray(), "the".toCharArray(), "ace".toCharArray() };
        TestLT8.doTest(arrSrv, "compareArrays", new Object[]{ch, expected}, true, "\n\t\t\t\tarray is " + Arrays.deepToString(ch) 
                                                                        + " but should be: " + Arrays.deepToString(expected)+"\n" );

        ch = new char[][] { "$$$$$$$".toCharArray(), "$".toCharArray(), "$$$".toCharArray(), "$$$$$$$".toCharArray() };
        remChar = '$';
        srv.remove(ch, remChar);
        expected = new char[][] { "".toCharArray(), "".toCharArray(), "".toCharArray(), "".toCharArray() };
        TestLT8.doTest(arrSrv, "compareArrays", new Object[]{ch, expected}, true, "\n\t\t\t\tarray is " + Arrays.deepToString(ch) 
                                                                        + " but should be: " + Arrays.deepToString(expected)+"\n" );

        ch = new char[][] { "foolish".toCharArray(), "buffoons".toCharArray() };
        remChar = 'o';
        srv.remove(ch, remChar);
        expected = new char[][] { "flish".toCharArray(), "buffns".toCharArray() };
        TestLT8.doTest(arrSrv, "compareArrays", new Object[]{ch, expected}, true, "\n\t\t\t\tarray is " + Arrays.deepToString(ch) 
                                                                        + " but should be: " + Arrays.deepToString(expected)+"\n" );

        ch = new char[][] { "myomumrm".toCharArray(), "remsumlmt".toCharArray(), "mhmermem".toCharArray() };
        remChar = 'm';
        srv.remove(ch, remChar);
        expected = new char[][] { "your".toCharArray(), "result".toCharArray(), "here".toCharArray() };
        TestLT8.doTest(arrSrv, "compareArrays", new Object[]{ch, expected}, true, "\n\t\t\t\tarray is " + Arrays.deepToString(ch) 
                                                                        + " but should be: " + Arrays.deepToString(expected)+"\n" );

        ch = new char[][] { "loop".toCharArray(), "oop".toCharArray(), "coop".toCharArray(), "oops".toCharArray() };
        remChar = 'p';
        srv.remove(ch, remChar);
        expected = new char[][] { "loo".toCharArray(), "oo".toCharArray(), "coo".toCharArray(), "oos".toCharArray() };
        TestLT8.doTest(arrSrv, "compareArrays", new Object[]{ch, expected}, true, "\n\t\t\t\tarray is " + Arrays.deepToString(ch) 
                                                                        + " but should be: " + Arrays.deepToString(expected)+"\n" );

        ch = new char[][] { "loo".toCharArray(), "oo".toCharArray(), "coo".toCharArray(), "oos".toCharArray() };
        remChar = 'o';
        srv.remove(ch, remChar);
        expected = new char[][] { "l".toCharArray(), "".toCharArray(), "c".toCharArray(), "s".toCharArray() };
        TestLT8.doTest(arrSrv, "compareArrays", new Object[]{ch, expected}, true, "\n\t\t\t\tarray is " + Arrays.deepToString(ch) 
                                                                        + " but should be: " + Arrays.deepToString(expected)+"\n" );

    } catch (Throwable tt) {
        TestLT8.printCachedMessages();
        throw tt;
    }
    TestLT8.printResults();

    // --- summary -------------------------------------------------------------------
    TestLT8.printSummary();
}

    private static final String MSG_PASS_TRUE  = "      ";
    private static final String MSG_PASS_FALSE = "FAIL: ";
    private static final String COMMENT_PREFIX = "      // ";
    private static final String SPACE_COMMENT = "#SPACE_COMMENT#";

    private static class Tt {
        private boolean didPass = false;

        protected void setPassed(boolean passed) {
            didPass = passed;
            if (didPass) {
                msgPass = MSG_PASS_TRUE;
            } else {
                msgPass = MSG_PASS_FALSE;
            }
        }

        protected boolean passed() { return didPass; }

        private boolean isComment = false;


        protected boolean threwException = false;
        protected String methodName;
        protected String msgPass = MSG_PASS_FALSE;
        protected String msgCall = "";
        protected String msgReturn = "";
        protected Object returnedObject;

        public String toString() {
            return "Tt: method: " + methodName + " didPass: " + didPass + " returnedObject: " + wrappedObjToString(returnedObject);
        }
    }

    // Use this Predicate factory to test if actualResult double is close enough to expectedResult double to be considered correct.
    public static Predicate<Object> closeEnough(double precision, double expectedResult) {
        return dd -> {
            double actualResult = ((Double) dd);
            return (Math.abs(actualResult - expectedResult) < precision);
        };
    }

    private static List<Tt> cachedComments = new ArrayList<Tt>();
    private static Map<String, List<Tt>> testMap = new LinkedHashMap<>();
    private static Map<String, List<String>> methodAlternateNamesMap = new LinkedHashMap<>();

    private final static Map<Class<?>, Class<?>> primitiveMap = new HashMap<Class<?>, Class<?>>();

    static {
        primitiveMap.put(Boolean.class, boolean.class);
        primitiveMap.put(Byte.class, byte.class);
        primitiveMap.put(Short.class, short.class);
        primitiveMap.put(Character.class, char.class);
        primitiveMap.put(Integer.class, int.class);
        primitiveMap.put(Long.class, long.class);
        primitiveMap.put(Float.class, float.class);
        primitiveMap.put(Double.class, double.class);
    }

    private static String currentTestSequenceName = null;
    private static int outLines = 3;

    public static void beginTesting(String testSequenceName) {
        beginTesting(testSequenceName, 3);
    }

    // if linesBetweeenSpacesInOutput is 0, you can manually add spaces by calling TestLT8.space().
    public static void beginTesting(String testSequenceName, int linesBetweenSpacesInOutput) {
        currentTestSequenceName = testSequenceName;
        outLines = linesBetweenSpacesInOutput;
        addLabelToMap(testSequenceName);
    }

    public static void finishTesting() {
        currentTestSequenceName = null;
    }

    // For use when method names collide.
    // Note that Tt's do not distinguish between methods with the same name but different signatures.
    // Use an alternate name in that case.
    // Assign the alternate name using this method, then use the alternate name in your call to the
    // doTest method.
    public static void addAlternateNameForMethod(String methodName, String alternate) {
        List<String> arr = methodAlternateNamesMap.get(methodName);
        if (arr == null) {
            arr = new ArrayList<>();
            methodAlternateNamesMap.put(methodName, arr);
        }
        arr.add(alternate);
    }

    public static void addAlternateNamesForMethod(String methodName, List<String> alternates) {
        List<String> arr = methodAlternateNamesMap.get(methodName);
        if (arr == null) {
            methodAlternateNamesMap.put(methodName, alternates);
        } else {
            arr.addAll(alternates);
        }
    }

    /**
        We invoke the method with name methodName on the srv object with the parameters found in params.

        For explanatory purposes, the call would look like this:

            actualResult = srv.methodName(params[0], params[1], ...);

        The expectedResult is then compared to the actual result.

        msgOnFail will be appended to the test's line of output if the test fails.  It could contain a useful diagnostic
            message to the method writer pointing out the reason for failure.
    */
    public static Tt doTest(Object srv,
                            String methodName,
                            Object[] params,
                            Object expectedResult,
                            String msgOnFail) {

        Predicate<Object> equalsExpected = obj -> {
            return wrappedObjsAreEqual(obj, expectedResult);
        };
        Tt test = doTest(srv, methodName, params, equalsExpected, msgOnFail);
        if (test != null && !test.passed()) {
            if (!test.threwException) {
                if (msgOnFail == null || msgOnFail.length() == 0) {
                    test.msgReturn += " (expected " + wrappedObjToString(expectedResult) + ")";
                } else {
                    int failMsgIdx = test.msgReturn.lastIndexOf(msgOnFail);
                    test.msgReturn = test.msgReturn.substring(0, failMsgIdx)
                                   + "expected " + wrappedObjToString(expectedResult)
                                   + " ("
                                   + test.msgReturn.substring(failMsgIdx)
                                   + "))";
                }
            }
        }
        return test;
    }

    public static Tt doTest(Object srv,
                            String methodName,
                            Object[] params,
                            Object expectedResult) {
        return doTest(srv, methodName, params, expectedResult, "");
    }


    /**
        We invoke the method with name methodName on the srv object with the parameters found in params.

        For explanatory purposes, the call would look like this:

            actualResult = srv.methodName(params[0], params[1], ...);

        The result is then tested using the tester Predicate.

        msgOnFail will be appended to the test's line of output if the test fails.  It could contain a useful diagnostic
            message to the method writer pointing out the reason for failure.
    */
    public static Tt doTest(Object srv,
                            String methodName,
                            Object[] params,
                            Predicate<Object> tester,
                            String msgOnFail) {
        return doTest(false, srv, methodName, params, tester, msgOnFail);
    }

    public static Tt doTest(Object srv,
                            String methodName,
                            Object[] params,
                            Predicate<Object> tester) {
        return doTest(false, srv, methodName, params, tester, "");
    }

    private static Tt doTest(boolean isAlternateMethodName,
                            Object srv,
                            String methodName,
                            Object[] params,
                            Predicate<Object> tester,
                            String msgOnFail) {

        if (currentTestSequenceName == null || currentTestSequenceName.length() == 0) {
            beginTesting(methodName);
        }

        Class<?> classSrv = srv.getClass();

        Class<?>[] paramClasses = new Class<?>[params.length];
        for (int ii = 0; ii < params.length; ii++) {
            paramClasses[ii] = params[ii].getClass();
            if (primitiveMap.containsKey(paramClasses[ii])) {
                paramClasses[ii] = primitiveMap.get(paramClasses[ii]);
            }
        }

        Tt out = new Tt();
        out.methodName = methodName;

        if (params.length == 0) {
            out.msgCall = methodName + "()";
        } else {
            out.msgCall = methodName + "(";
            for (int ii = 0; ii < params.length; ii++) {
                Object param = params[ii];
                out.msgCall += wrappedObjToString(param);
                if (ii < params.length - 1) {
                    out.msgCall += ", ";
                } else {
                    out.msgCall += ")";
                }
            }
        }

        Method method = null;
        try {
            method = classSrv.getMethod(methodName, paramClasses);
            out.returnedObject = method.invoke(srv, params);
        } catch(NoSuchMethodException exc) {
            if (isAlternateMethodName) {
                out.threwException = true;
                out.msgReturn = "--> ERROR: method <" + methodName + "> either doesn't exist or doesn't take the parameter or param types provided.";
                return out;
            }
            List<String> alternates = methodAlternateNamesMap.get(methodName);
            if (alternates != null) {
                int ii = 0;
                for (String altMethodName : alternates) {
                    Tt altOut = doTest(true, srv, altMethodName, params, tester, msgOnFail);
                    if (!altOut.threwException) {
                        return altOut;
                    }
                    ii++;
                }
            }
            out.threwException = true;
            out.msgReturn = "--> ERROR: method <" + methodName + "> either doesn't exist or doesn't take the parameter or param types provided.";
            addTestToMap(currentTestSequenceName, out);
            return out;
        } catch(InvocationTargetException exc) {
            StringWriter sw = new StringWriter();
            PrintWriter pw = new PrintWriter(sw);
            exc.getCause().printStackTrace(pw);

            out.threwException = true;
            out.msgReturn = "--> (Exception shown below)\n" + sw.toString();
            out.msgReturn = out.msgReturn.replaceAll("(?m)^", "      ");
            addTestToMap(currentTestSequenceName, out);
            return out;
        } catch(Exception exc) {
            System.err.println("ERROR: Unwrapped Exception during invocation.");
            exc.printStackTrace();
        }

        out.msgReturn = "--> ";
        out.msgReturn += wrappedObjToString(out.returnedObject);

        if (tester.test(out.returnedObject)) {
            out.setPassed(true);
        } else {
            if (msgOnFail != null && msgOnFail.length() > 0) {
                out.msgReturn += " (" + msgOnFail + ")";
            }
        }
        addTestToMap(currentTestSequenceName, out);
        return out;
    }

    // add a blank line to the output.  primarily for use when beginTesting's linesBetweenSpacesInOutput is 0.
    public static Tt space() {
        return comment(SPACE_COMMENT);
    }

    public static Tt space(int numberOfBlankLines) {
        for (int ii = 0; ii < numberOfBlankLines - 1; ii++) {
            comment(SPACE_COMMENT);
        }
        return comment(SPACE_COMMENT);
    }

    public static Tt comment(String comment) {
        Tt out = new Tt();
        out.isComment = true;
        out.msgCall = COMMENT_PREFIX + comment;
        addCommentToMap(out);
        return out;
    }

    public static void printCachedMessages() {
        System.out.println(rightPad("----- cached messages for <" + currentTestSequenceName + "> ", "-", 80) + "\n");
        printMsgs(currentTestSequenceName, true);
        finishTesting();
    }

    public static void printMsgs(String testSequenceName, boolean supressMsgIfAllTestsSame) {
        if (!testMap.containsKey(testSequenceName)) {
            System.err.println("Test array not created for  <" + testSequenceName + ">.");
            return;
        }
        List<Tt> arr = testMap.get(testSequenceName);
        if (arr.isEmpty()) {
            System.err.println("No <" + testSequenceName + "> tests have been run.");
            return;
        }

        String delimiterLeft = "<";
        String delimiterRight = ">";

        if (arr.get(0).returnedObject instanceof String) {
            delimiterLeft = "\"";
            delimiterRight = "\"";
        } else if (arr.get(0).returnedObject instanceof Character) {
            delimiterLeft = "'";
            delimiterRight = "'";
        }

        if (!allTestsThrewExceptions(testSequenceName)
                && allReturnedObjsAreEqualAndSomeFailsPresent(testSequenceName)
                && supressMsgIfAllTestsSame
                && countMethodsInTestSequence(testSequenceName) > 1) {
            System.out.println("   ==> <" + testSequenceName + "> not implemented: returns " + delimiterLeft
                                + wrappedObjToString(commonReturnedObject(testSequenceName, arr))
                                + delimiterRight + " for all tests.\n");
        } else {
            int lenMsgCallMax = 0;
            for (Tt out : arr) {
                if (!out.isComment) {
                    int lenMsgCall = out.msgCall.length();
                    if (lenMsgCall > lenMsgCallMax) lenMsgCallMax = lenMsgCall;
                }
            }
            int spacer = 0;
            for (int ii = 0; ii < arr.size(); ii++) {
                Tt out = arr.get(ii);
                if (out.isComment) {
                    if (!out.msgCall.contains(SPACE_COMMENT)) {
                        System.out.println(out.msgCall);
                    } else {
                        System.out.println();
                    }
                } else {
                    System.out.println(out.msgPass + rightPad(out.msgCall, " ", lenMsgCallMax) + " " + out.msgReturn);
                    spacer++;
                    if (outLines > 0) {
                        if (spacer%outLines == 0 && ii < arr.size() - 1) {
                            System.out.println();
                            spacer = 0;
                        }
                    }
                }
            }
        }
    }

    public static Object commonReturnedObject(String testSequenceName, List<Tt> arr) {
        Object oo = null;
        for (Tt tt : arr) {
            if (testSequenceName.equals(tt.methodName)) {
                return tt.returnedObject;
            }
        }
        return arr.get(0).returnedObject;
    }

    public static void printResults(boolean supressMsgIfAllTestsSame) {
        System.out.println(rightPad("----- <" + currentTestSequenceName + "> ", "-", 80) + "\n");
        printMsgs(currentTestSequenceName, supressMsgIfAllTestsSame);
        printTestSequenceSummary(currentTestSequenceName, supressMsgIfAllTestsSame);
        finishTesting();
    }

    public static void printResults() {
        printResults(false);
    }

    public static void printTestSequenceSummary(String testSequenceName, boolean supressMsgIfAllTestsSame) {
        if (!testMap.containsKey(testSequenceName)) {
            System.err.println("ERROR in test file: call to printTestSequenceSummary for test <" + testSequenceName + ">, but no calls to doTest for it.");
            return;
        }

        List<Tt> arr = testMap.get(testSequenceName);
        if (arr.isEmpty()) {
            System.out.println("   ==> No <" + testSequenceName + "> tests were performed. Is the appropriate method present and named correctly in your server?\n");
            return;
        }
        if (!supressMsgIfAllTestsSame || !allReturnedObjsAreEqualAndSomeFailsPresent(testSequenceName)) {
            int testsFailed = countTestsFailed(testSequenceName);
            if (testsFailed == 0) {
                System.out.println("\n   ==> All <" + testSequenceName + "> tests passed!\n");
            } else if (testsFailed == 1) {
                System.out.println("\n   ==> All <" + testSequenceName + "> tests passed except one- getting close!\n");
            } else {
                System.out.println("\n   ==> The <" + testSequenceName + "> tests failed " + testsFailed + " tests. More work to do...\n");
            }
        }
    }

    public static void printSummary() {
        String out = "";
        for (String testSequenceName : testMap.keySet()) {
            List<Tt> arr = testMap.get(testSequenceName);
            if (arr.isEmpty()) {
                if (out.length() > 0) { out += "\n"; }
                out += "    |  No <" + testSequenceName + "> tests were performed.";
            } else if (allReturnedObjsAreEqualAndSomeFailsPresent(testSequenceName)
                        && !allTestsThrewExceptions(testSequenceName)
                        && countMethodsInTestSequence(testSequenceName) > 1) {
                if (out.length() > 0) { out += "\n"; }
                String delimiterLeft = "<";
                String delimiterRight = ">";

                if (arr.get(0).returnedObject instanceof String) {
                    delimiterLeft = "\"";
                    delimiterRight = "\"";
                } else if (arr.get(0).returnedObject instanceof Character) {
                    delimiterLeft = "'";
                    delimiterRight = "'";
                }

                out += "    |  <" + testSequenceName + "> not implemented: returns " + delimiterLeft + wrappedObjToString(arr.get(0).returnedObject)
                                    + delimiterRight + " for all tests.";
            } else  {
                int fails = countTestsFailed(testSequenceName);
                if (fails > 0) {
                    if (out.length() > 0) { out += "\n"; }
                    out += "    |  <" + testSequenceName + "> failed " + fails + " test" + (fails > 1 ? "s" : "") + ".";
                }
                int excsThrown = countThrownExceptions(testSequenceName);
                if (excsThrown > 0) {
                    if (out.length() > 0) { out += "\n"; }
                    out += "    |      (<" + testSequenceName + "> threw Exception for " + excsThrown + " test" + (excsThrown > 1 ? "s" : "") + ".)";
                }
            }
        }
        if (out.length() == 0) {
            System.out.println("    +--------------------------------------+");
            System.out.println("    |    -* * *  W O O  H O O ! * * *-     |");
            System.out.println("    |    -All methods pass all tests!-     |");
            System.out.println("    +--------------------------------------+\n");
        } else {
            System.out.println(rightPad("    +", "-", 80));
            System.out.println(out);
            System.out.println(rightPad("    +", "-", 80) + "\n");
        }
    }

    public static void reset() {
        testMap = new LinkedHashMap<String, List<Tt>>();
    }

    private static String wrappedObjToString(Object obj) {
        if (obj == null) {
            return "null";
        }

        if (!isArray(obj)) {
            return obj.toString();
        }
        Class<?> cc = obj.getClass();

        String out = "";
        try {
            Method mm;
            if (!cc.getComponentType().isPrimitive()) {
                cc = Object[].class;
                mm = Arrays.class.getMethod("deepToString", cc);
            } else {
                mm = Arrays.class.getMethod("toString", cc);
            }
            out = (String)mm.invoke(null, obj);
        } catch(Exception exc) {
            exc.printStackTrace();
        }   
        return out;
    }

    private static boolean wrappedObjsAreEqual(Object obj1, Object obj2) {
        if (obj1 == null || obj2 == null) { return false; }
        return Arrays.deepEquals(new Object[] { obj1 }, new Object[] { obj2 });
    }

    private static boolean isArray(Object obj) {
        return (obj != null && obj.getClass().isArray());
    }

    private static String rightPad(String in, String ss, int totalLen) {
        while (in.length() < totalLen)
            in += ss;
        return in;
    }

    private static void addLabelToMap(String testSequenceName) {
        if (!testMap.containsKey(testSequenceName)) {
            List<Tt> arr = new ArrayList<>();
            testMap.put(testSequenceName, arr);
            addCachedCommentsToMap(testSequenceName);
        }
    }

    private static void addTestToMap(String testSequenceName, Tt test) {
        if (!testMap.containsKey(testSequenceName)) {
            addLabelToMap(testSequenceName);
        }
        List<Tt> arr = testMap.get(testSequenceName);
        arr.add(test);
    }

    private static void addCommentToMap(Tt comment) {
        if (currentTestSequenceName == null || currentTestSequenceName.length() == 0) {
            cachedComments.add(comment);
        } else {
            List<Tt> arr = testMap.get(currentTestSequenceName);
            arr.add(comment);
        }
    }

    private static void addCachedCommentsToMap(String testSequenceName) {
        if (!testMap.containsKey(testSequenceName)) {
            addLabelToMap(testSequenceName);
        }
        List<Tt> arr = testMap.get(testSequenceName);
        arr.addAll(cachedComments);
        cachedComments.clear();
    }

    private static int countThrownExceptions(String testSequenceName) {
        List<Tt> arr = testMap.get(testSequenceName);
        int excsThrown = 0;
        for (Tt test : arr) {
            if (test.threwException) {
                excsThrown++;
            }
        }
        return excsThrown;
    }

    private static boolean allTestsThrewExceptions(String testSequenceName) {
        List<Tt> arr = testMap.get(testSequenceName);
        boolean allThrew = true;
        for (Tt test : arr) {
            if (!test.isComment && !test.threwException) {
                allThrew = false;
            }
        }
        return allThrew;
    }

    private static int countTestsFailed(String testSequenceName) {
        List<Tt> arr = testMap.get(testSequenceName);
        int testsFailed = 0;
        for (Tt test : arr) {
            if (!test.isComment && !test.passed()) {
                testsFailed++;
            }
        }
        return testsFailed;
    }

    private static int countMethodsInTestSequence(String testSequenceName) {
        Set<String> methodNames = new HashSet<String>();
        List<Tt> arr = testMap.get(testSequenceName);
        for (Tt tt : arr) {
            methodNames.add(tt.methodName);
        }
        return arr.size();
    }

    private static boolean allReturnedObjsAreEqualAndSomeFailsPresent(String testSequenceName) {
        List<Tt> arr = testMap.get(testSequenceName);

        Map<String, List<Tt>> testsByMethod = new HashMap<>();
        for (Tt tt : arr) {
            List<Tt> tests = testsByMethod.get(tt.methodName);
            if (tests == null) {
                tests = new ArrayList<Tt>();
                testsByMethod.put(tt.methodName, tests);
            }
            tests.add(tt);
        }

        boolean allReturnedObjsAreEqual = true;
        boolean someFailsPresent = false;
        for (String methodName : testsByMethod.keySet()) {
            List<Tt> tests = testsByMethod.get(methodName);
            Object returnedObjPrev = null;
            for (Tt test : tests) {
                if (!test.isComment) {
                    if (!test.passed()) {
                        someFailsPresent = true;
                    }
                    if (returnedObjPrev != null) {
                        if (!wrappedObjsAreEqual(test.returnedObject, returnedObjPrev)) {
                            allReturnedObjsAreEqual = false;
                        }
                    }
                    returnedObjPrev = test.returnedObject;
                }
            }
        }
        // System.out.println("DEBUG: allRetObjsAreEqual: " + allReturnedObjsAreEqual + "  someFailsPresent: " + someFailsPresent);
        return allReturnedObjsAreEqual && someFailsPresent;
    }
}