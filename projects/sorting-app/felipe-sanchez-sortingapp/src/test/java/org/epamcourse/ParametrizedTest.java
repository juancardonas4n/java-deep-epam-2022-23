package org.epamcourse;


import org.apache.commons.io.FileUtils;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class ParametrizedTest {
    private ByteArrayOutputStream sinkError;
    private ByteArrayOutputStream sinkOut;
    private PrintStream controlledErrorOut;
    private PrintStream controlledOut;
    private PrintStream defaultOut;
    private PrintStream defaultOutError;

    private String path;
    private Integer[] expected;
    private boolean error;

    public ParametrizedTest(String path, Integer[] expected,boolean error) {
        this.expected = expected;
        this.path = path;
        this.error=error;
    }


    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {"src/test/resources/testCaseA.txt", new Integer[]{1, 2, 11, 22, 25, 84},false},
                {"src/test/resources/testCaseB.txt", new Integer[]{-525,-51,36,85,515,522,562,584,676262611},false},
                {"src/test/resources/testCaseZero.txt", new Integer[]{},false},
                {"src/test/resources/testCaseTen.txt",new Integer[]{1,2,5,5,6,8,11,23,26,54},false},
                {"src/test/resources/testCaseMoreTen.txt",new Integer[]{-854,-51,-15,8,52,55,81,221,2335,5111},false},
                {"src/test/resources/testCaseOne.txt",new Integer[]{1000},false},
                {"src/test/resources/testCaseErrorNotInteger.txt",null,true}

        });
    }
    @Test
    public void test() {
        try {
            List<String> lines= FileUtils.readLines(new File(this.path), StandardCharsets.UTF_8);
            for (String line: lines){
                String[]args=line.replaceAll("\\s+"," ").split(" ");
                setControlledOut();
                setControlledErr();
                App.main(args);
                if(this.error){
                    assertEquals("not allowed not integers arguments",sinkError.toString().trim());
                }else{
                    assertEquals(stringify(this.expected),sinkOut.toString().trim());
                }


                setStandardOut();
                setStandardErr();


            }

        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            setStandardOut();
            setStandardErr();
        }


    }


    private void setControlledOut() {
        sinkOut = new ByteArrayOutputStream();
        controlledOut = new PrintStream(sinkOut);
        defaultOut = System.out;

        System.setOut(controlledOut);
    }
    private void setControlledErr() {
        sinkError = new ByteArrayOutputStream();
        controlledErrorOut = new PrintStream(sinkError);
        defaultOutError = System.err;

        System.setErr(controlledErrorOut);
    }

    private void setStandardOut() {
        System.setOut(defaultOut);
    }

    private void setStandardErr(){
        System.setErr(defaultOutError);
    }


    private static String  stringify (Integer[] ar){
        StringBuilder sb=new StringBuilder();
        for(Integer a:ar)
            sb.append(a).append(" ");

        return sb.toString().trim();
    }


}
