package de.ly;

import java.time.LocalDateTime;

/**
 * Eine Messung: systolischer und diastolischer Blutdruck, Puls und Körpertemperatur
 * mit dem Zeitpunkt der Messung (siehe Begriff "Messung" im Anforderungsdokument).
 * Speichert die Werte aus REQ-001 bis REQ-004 und den Zeitpunkt aus REQ-005.
 * Eine Messung ist unveränderlich.
 */
public class Measurement {
    private final int systolic;
    private final int diastolic;
    private final int pulse;
    private final double temperature;
    private final LocalDateTime timestamp;

    public Measurement(int systolic, int diastolic, int pulse, double temperature, LocalDateTime timestamp) {
        this.systolic = systolic;
        this.diastolic = diastolic;
        this.pulse = pulse;
        this.temperature = temperature;
        this.timestamp = timestamp;
    }

    public int getSystolic() {
        return systolic;
    }

    public int getDiastolic() {
        return diastolic;
    }

    public int getPulse() {
        return pulse;
    }

    public double getTemperature() {
        return temperature;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }
}
