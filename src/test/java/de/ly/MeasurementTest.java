package de.ly;

import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MeasurementTest {

    @Test
    void getters_returnConstructorValues() {
        LocalDateTime timestamp = LocalDateTime.of(2026, 11, 24, 15, 39);
        Measurement measurement = new Measurement(120, 80, 90, 38.5, timestamp);
        assertEquals(120, measurement.getSystolic());
        assertEquals(80, measurement.getDiastolic());
        assertEquals(90, measurement.getPulse());
        assertEquals(38.5, measurement.getTemperature(), 0.001);
        assertEquals(timestamp, measurement.getTimestamp());
    }
}
