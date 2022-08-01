package Crypto.src;

import org.junit.Assert;
import org.junit.Test;

import java.io.File;

public class ReadFileTest {
    ROT13 cipher = new ROT13('a', 'n');
    File file = new File("/Users/lloyd/Desktop/projects/SimpleCrypt/sonnet18.txt");

    @Test
    public void testCryptText() {
        //Arrange
        String A1 = "Shall I compare thee to a summer’s day?\n" +
                "Thou art more lovely and more temperate:\n" +
                "Rough winds do shake the darling buds of May,\n" +
                "And summer’s lease hath all too short a date;\n" +
                "Sometime too hot the eye of heaven shines,\n" +
                "And often is his gold complexion dimm'd;\n" +
                "And every fair from fair sometime declines,\n" +
                "By chance or nature’s changing course untrimm'd;\n" +
                "But thy eternal summer shall not fade,\n" +
                "Nor lose possession of that fair thou ow’st;\n" +
                "Nor shall death brag thou wander’st in his shade,\n" +
                "When in eternal lines to time thou grow’st:\n" +
                "   So long as men can breathe or eyes can see,\n" +
                "   So long lives this, and this gives life to thee.";
        String A2 = "Funyy V pbzcner gurr gb n fhzzre’f qnl?\n" +
                "Gubh neg zber ybiryl naq zber grzcrengr:\n" +
                "Ebhtu jvaqf qb funxr gur qneyvat ohqf bs Znl,\n" +
                "Naq fhzzre’f yrnfr ungu nyy gbb fubeg n qngr;\n" +
                "Fbzrgvzr gbb ubg gur rlr bs urnira fuvarf,\n" +
                "Naq bsgra vf uvf tbyq pbzcyrkvba qvzz'q;\n" +
                "Naq rirel snve sebz snve fbzrgvzr qrpyvarf,\n" +
                "Ol punapr be angher’f punatvat pbhefr hagevzz'q;\n" +
                "Ohg gul rgreany fhzzre funyy abg snqr,\n" +
                "Abe ybfr cbffrffvba bs gung snve gubh bj’fg;\n" +
                "Abe funyy qrngu oent gubh jnaqre’fg va uvf funqr,\n" +
                "Jura va rgreany yvarf gb gvzr gubh tebj’fg:\n" +
                "   Fb ybat nf zra pna oerngur be rlrf pna frr,\n" +
                "   Fb ybat yvirf guvf, naq guvf tvirf yvsr gb gurr.";
        //Act
        String actual = cipher.encrypt(A1);
        System.out.println(A1);
        System.out.println(A2);
        //Assert
        Assert.assertEquals(actual, A2);
    }
}
