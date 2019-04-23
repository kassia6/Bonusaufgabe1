import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CTRTest {
    Tools tools = new Tools();
    String chiffreText = tools.readChiffreText("src/main/resources/chiffre.txt");
    CTR ctr = new CTR(4,4,4,32,"00111010100101001101011000111111", chiffreText);

    @Test
    public void testDecipher() {
        assertEquals("Gut gemacht!",ctr.decipher());
    }


}
