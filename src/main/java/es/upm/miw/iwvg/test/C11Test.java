package es.upm.miw.iwvg.test;

import static org.junit.Assert.*;

import org.junit.Test;

import es.upm.miw.iwvg.clase.C11;

public class C11Test {

    @Test
    public void testM1() {
        C11 c11= new C11();
        assertEquals("m1",c11.m1());
    }

    @Test
    public void testM2() {
        C11 c11= new C11();
        assertEquals("m2",c11.m2());
    }

}
