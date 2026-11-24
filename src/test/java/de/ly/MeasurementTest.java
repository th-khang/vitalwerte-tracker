package de.ly;

import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MeasurementTest {

    @Test
    void accessors_returnConstructorValues() {
        LocalDateTime timestamp = LocalDateTime.of(2026, 11, 24, 15, 39);
        Measurement measurement = new Measurement(120, 80, 90, 38.5, timestamp);
        assertEquals(120, measurement.systolic());
        assertEquals(80, measurement.diastolic());
        assertEquals(90, measurement.pulse());
        assertEquals(38.5, measurement.temperature(), 0.001);
        assertEquals(timestamp, measurement.timestamp());
    }
}
