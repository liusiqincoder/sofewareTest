package project_001;


import junit.framework.TestCase;

import static org.junit.Assert.assertEquals;

/**
 * @program: 软件测试
 * * @description: 软件测试实验1
 * * @author: liusiqinCoder
 * * @create: 2019-02-27 16:47
 **/
public class TestThatWeGetHelloWorldPrompt extends TestCase {
    public TestThatWeGetHelloWorldPrompt( String name) {
        super(name);
    }
    @org.junit.Test
    public void testSay() {
        HelloWorld hi = new HelloWorld();
        assertEquals("Hello World!", hi.say());
    }
    public static void main(String[] args) {
        junit.textui.TestRunner.run(TestThatWeGetHelloWorldPrompt.class);
    }

}
