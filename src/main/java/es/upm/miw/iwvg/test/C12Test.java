package es.upm.miw.iwvg.test;

import static org.junit.Assert.*;

import org.junit.Test;

import es.upm.miw.iwvg.clase.C12;

public class C12Test {

    @Test
    public void testMA() {
        C12 c12 = new C12();
        assertEquals("mA",c12.mA());
    }

}
