package be.vives.ti;

import static org.junit.jupiter.api.Assertions.*;

class StringProcessorTest {

    @org.junit.jupiter.api.Test
    void appendIfMissing() {
        StringProcessor stringProcessor = new StringProcessor();
        String result = stringProcessor.appendIfMissing("hallo","o");
        assertEquals("hallo", result);
    }
}