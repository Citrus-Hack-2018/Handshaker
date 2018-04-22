package com.github.citrus_hack_2018.handshaker;

import android.util.Log;

import org.junit.Test;

import java.util.Random;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    private static Random rng = new Random();

    @Test
    public void addition_isCorrect() {
        assertEquals(4, 2 + 2);
    }

    @Test
    public void testPattern() {
        Pattern a = new Pattern();
        Pattern b = new Pattern();

        fillPattern(a);
        fillPattern(b);

        Log.i("Pattern Test","Two different patterns with same values:\nPattern A\n" + a.toString()
                + "\nPattern B\n" + b.toString() + "\n(should be false almost all the time):" + a.equals(b));

        for (int i = 0; i < 3; i++) {
            a = new Pattern();
            b = new Pattern();

            randomPattern(a);
            randomPattern(b);

            Log.i("Pattern Test", "Two different patterns with random values:\nPattern A\n" + a.toString()
                    + "\nPattern B\n" + b.toString() + "\n(should be false almost all the time):" + a.equals(b));
        }
    }

    public void fillPattern(Pattern p) {
        for (int y = 0; y < 3; y++) {
            for (int x = 0; x < 3; x++) {
                p.getPattern().push(new Pip(x, y));
            }
        }
    }

    public void randomPattern(Pattern p) {
        for (int y = 0; y < 3; y++) {
            for (int x = 0; x < 3; x++) {
                p.getPattern().push(new Pip(rng.nextInt(3), rng.nextInt(3)));
            }
        }
    }
}