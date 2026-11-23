package de.ly;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class PlausibilityCheckerTest {

    // ---------- REQ-007: systolischer Blutdruck (60 bis 260 mmHg) ----------

    /**
     * REQ-007: 59 mmHg liegt knapp unter der Untergrenze und ist damit ungültig.
     */
    @Test
    void isSystolicValid_returnsFalse_justBelowLowerLimit() {
        assertFalse(PlausibilityChecker.isSystolicValid(59));
    }

    /**
     * REQ-007: 60 mmHg ist die Untergrenze und damit gültig.
     */
    @Test
    void isSystolicValid_returnsTrue_atLowerLimit() {
        assertTrue(PlausibilityChecker.isSystolicValid(60));
    }

    /**
     * REQ-007: 260 mmHg ist die Obergrenze und damit gültig.
     */
    @Test
    void isSystolicValid_returnsTrue_atUpperLimit() {
        assertTrue(PlausibilityChecker.isSystolicValid(260));
    }

    /**
     * REQ-007: 261 mmHg liegt knapp über der Obergrenze und ist damit ungültig.
     */
    @Test
    void isSystolicValid_returnsFalse_justAboveUpperLimit() {
        assertFalse(PlausibilityChecker.isSystolicValid(261));
    }

    // ---------- REQ-008: diastolischer Blutdruck (30 bis 150 mmHg) ----------

    /**
     * REQ-008: 29 mmHg liegt knapp unter der Untergrenze und ist damit ungültig.
     */
    @Test
    void isDiastolicValid_returnsFalse_justBelowLowerLimit() {
        assertFalse(PlausibilityChecker.isDiastolicValid(29));
    }

    /**
     * REQ-008: 30 mmHg ist die Untergrenze und damit gültig.
     */
    @Test
    void isDiastolicValid_returnsTrue_atLowerLimit() {
        assertTrue(PlausibilityChecker.isDiastolicValid(30));
    }

    /**
     * REQ-008: 150 mmHg ist die Obergrenze und damit gültig.
     */
    @Test
    void isDiastolicValid_returnsTrue_atUpperLimit() {
        assertTrue(PlausibilityChecker.isDiastolicValid(150));
    }

    /**
     * REQ-008: 151 mmHg liegt knapp über der Obergrenze und ist damit ungültig.
     */
    @Test
    void isDiastolicValid_returnsFalse_justAboveUpperLimit() {
        assertFalse(PlausibilityChecker.isDiastolicValid(151));
    }

    // ---------- REQ-009: Blutdruckamplitude systolisch minus diastolisch (15 bis 150 mmHg) ----------
    // Die Einzelwerte sind jeweils für sich gültig, damit nur die Differenz über das Ergebnis entscheidet.

    /**
     * REQ-009: 100 minus 86 ergibt 14 mmHg, knapp unter der Untergrenze, und ist damit ungültig.
     */
    @Test
    void isPulsePressureValid_returnsFalse_justBelowLowerLimit() {
        assertFalse(PlausibilityChecker.isPulsePressureValid(100, 86));
    }

    /**
     * REQ-009: 100 minus 85 ergibt 15 mmHg, die Untergrenze, und ist damit gültig.
     */
    @Test
    void isPulsePressureValid_returnsTrue_atLowerLimit() {
        assertTrue(PlausibilityChecker.isPulsePressureValid(100, 85));
    }

    /**
     * REQ-009: 230 minus 80 ergibt 150 mmHg, die Obergrenze, und ist damit gültig.
     */
    @Test
    void isPulsePressureValid_returnsTrue_atUpperLimit() {
        assertTrue(PlausibilityChecker.isPulsePressureValid(230, 80));
    }

    /**
     * REQ-009: 231 minus 80 ergibt 151 mmHg, knapp über der Obergrenze, und ist damit ungültig.
     */
    @Test
    void isPulsePressureValid_returnsFalse_justAboveUpperLimit() {
        assertFalse(PlausibilityChecker.isPulsePressureValid(231, 80));
    }

    // ---------- REQ-010: Puls (30 bis 220 bpm) ----------

    /**
     * REQ-010: 29 bpm liegt knapp unter der Untergrenze und ist damit ungültig.
     */
    @Test
    void isPulseValid_returnsFalse_justBelowLowerLimit() {
        assertFalse(PlausibilityChecker.isPulseValid(29));
    }

    /**
     * REQ-010: 30 bpm ist die Untergrenze und damit gültig.
     */
    @Test
    void isPulseValid_returnsTrue_atLowerLimit() {
        assertTrue(PlausibilityChecker.isPulseValid(30));
    }

    /**
     * REQ-010: 220 bpm ist die Obergrenze und damit gültig.
     */
    @Test
    void isPulseValid_returnsTrue_atUpperLimit() {
        assertTrue(PlausibilityChecker.isPulseValid(220));
    }

    /**
     * REQ-010: 221 bpm liegt knapp über der Obergrenze und ist damit ungültig.
     */
    @Test
    void isPulseValid_returnsFalse_justAboveUpperLimit() {
        assertFalse(PlausibilityChecker.isPulseValid(221));
    }

    // ---------- REQ-011: Körpertemperatur (34,0 bis 42,0 °C) ----------

    /**
     * REQ-011: 33,9 °C liegt knapp unter der Untergrenze und ist damit ungültig.
     */
    @Test
    void isTemperatureValid_returnsFalse_justBelowLowerLimit() {
        assertFalse(PlausibilityChecker.isTemperatureValid(33.9));
    }

    /**
     * REQ-011: 34,0 °C ist die Untergrenze und damit gültig.
     */
    @Test
    void isTemperatureValid_returnsTrue_atLowerLimit() {
        assertTrue(PlausibilityChecker.isTemperatureValid(34.0));
    }

    /**
     * REQ-011: 42,0 °C ist die Obergrenze und damit gültig.
     */
    @Test
    void isTemperatureValid_returnsTrue_atUpperLimit() {
        assertTrue(PlausibilityChecker.isTemperatureValid(42.0));
    }

    /**
     * REQ-011: 42,1 °C liegt knapp über der Obergrenze und ist damit ungültig.
     */
    @Test
    void isTemperatureValid_returnsFalse_justAboveUpperLimit() {
        assertFalse(PlausibilityChecker.isTemperatureValid(42.1));
    }
}
