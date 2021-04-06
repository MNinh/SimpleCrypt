import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MikeCryptTest {

    @Test
    public void rotateStringTest0() {
        // Given
        String s1 = "ABCDEF";
        String s2 = "ABCDEF";

        // When
        MikeCrypt cipher = new MikeCrypt();
        String actual = cipher.rotate(s1, 'A');

        // Then
        Assert.assertTrue(actual.equals(s2));
    }

    @Test
    public void rotateStringTest1() {
        // Given
        String s1 = "ABCDEF";
        String s2 = "DEFABC";

        // When
        MikeCrypt cipher = new MikeCrypt();
        String actual = cipher.rotate(s1, 'D');

        // Then
        Assert.assertTrue(actual.equals(s2));
    }

    @Test
    public void rotateStringTest2() {
        // Given
        String s1 = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String s2 = "NOPQRSTUVWXYZABCDEFGHIJKLM";

        // When
        MikeCrypt cipher = new MikeCrypt();
        String actual = cipher.rotate(s1, 'N');
        System.out.println(s1);
        System.out.println(actual);
        // Then
        Assert.assertTrue(actual.equals(s2));
    }

    @Test
    public void cryptTest1() {
        // Given
        MikeCrypt cipher = new MikeCrypt();

        String Q1 = "Why did the chicken cross the road?";
        String A1 = "Sdu zez pda ydeygaj ynkoo pda nkwz?";

        String Q2 = "Pk cap pk pda kpdan oeza!";
        String A2 = "To get to the other side!";
        // When
        String actual = cipher.encrypt(Q1);
        System.out.println(Q1);
        System.out.println(A1);
        // Then
//        Assert.assertTrue(actual.equals(A1));

        // When
        String actual2 = cipher.decrypt(Q2);
        System.out.println(Q2);
        System.out.println(A2);
        // Then
        Assert.assertTrue(actual2.equals(A2));
    }
    @Test
    public void cryptTest2() {
        // Given
        MikeCrypt cipher = new MikeCrypt();

        String Q1 = "Why did the chicken cross the road?";
        System.out.println(Q1);

        // When
        String encrypting = cipher.encrypt(Q1);
        String actual = cipher.decrypt(cipher.encrypt(Q1));
        System.out.println(actual);
        // Then
        Assert.assertTrue(actual.equals(Q1));
    }

    @Test
    public void cryptUpperTest() {
        // Given
        MikeCrypt cipher = new MikeCrypt();

        String Q1 = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        System.out.println(Q1);

        // When
        String encrypting = cipher.encrypt(Q1);
        System.out.println(encrypting);
        String actual = cipher.decrypt(encrypting);
        System.out.println(actual);
        // Then
        Assert.assertTrue(actual.equals(Q1));
    }

    @Test
    public void cryptLowerTest() {
        // Given
        MikeCrypt cipher = new MikeCrypt();

        String Q1 = "abcdefghijklmnopqrstuvwxyz";
        System.out.println(Q1);

        // When
        String encrypting = cipher.encrypt(Q1);
        System.out.println(encrypting);
        String actual = cipher.decrypt(encrypting);
        System.out.println(actual);
        // Then
        Assert.assertTrue(actual.equals(Q1));
    }

}