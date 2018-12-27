package com.stackroute.unittest.pe3;


import org.junit.After;
        import org.junit.Before;
        import org.junit.Test;

        import static org.junit.Assert.*;

public class VowelsRemovalTest {


    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void remVowel() {
        VowelsRemoval remVowels=new VowelsRemoval();
        assertEquals( "nd" ,remVowels.remVowel("india"));
    }



}
