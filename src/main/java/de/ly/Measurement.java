package de.ly;

import java.time.LocalDateTime;

/**
 * Eine Messung: systolischer und diastolischer Blutdruck, Puls und Körpertemperatur
 * mit dem Zeitpunkt der Messung (siehe Begriff "Messung" im Anforderungsdokument).
 * Speichert die Werte aus REQ-001 bis REQ-004 und den Zeitpunkt aus REQ-005.
 * Eine Messung ist unveränderlich.
 *
 * @param systolic    Systolischer Blutdruck in mmHg
 * @param diastolic   Diastolischer Blutdruck in mmHg
 * @param pulse       Puls in bpm
 * @param temperature Körperkerntemperatur in °C
 * @param timestamp   Datum mit lokaler Uhrzeit zum Zeitpunkt der Messung
 */
public record Measurement(int systolic, int diastolic, int pulse, double temperature, LocalDateTime timestamp) {
}
