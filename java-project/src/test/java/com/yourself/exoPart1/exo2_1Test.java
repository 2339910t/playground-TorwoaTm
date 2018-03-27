package com.yourself.exoPart1;

import org.junit.Assert;
import org.junit.Test;

import java.io.FileNotFoundException;

/**
 * Created by richard on 27/03/2018.
 */
//a - 1 -> 2
//b - 2 -> 3
//c - 3 -> 1
public class exo2_1Test {
    @Test
    public void test() throws FileNotFoundException {
        try {

            Assert.assertEquals("a ", 2, exo2_1.a);
            Assert.assertEquals("b ", 3, exo2_1.a);
            Assert.assertEquals("c ", 1, exo2_1.a);

        } catch (AssertionError ae) {
            success(false);
            msg("Oops! 🐞", ae.getMessage());
            msg("Hint 💡", " 🤔");
        }
    }
    private static void msg(String channel, String msg) {
        System.out.println(String.format("TECHIO> message --channel \"%s\" \"%s\"", channel, msg));
    }

    private static void success(boolean success) {
        System.out.println(String.format("TECHIO> success %s", success));
    }

}
