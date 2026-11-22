package de.ly;

public class PlausibilityChecker {
    static final int MAX_SYSTOLIC = 260;
    static final int MIN_SYSTOLIC = 60;
    static final int MAX_DIASTOLIC = 150;
    static final int MIN_DIASTOLIC = 30;
    static final int MAX_PULSE_PRESSURE = 150;
    static final int MIN_PULSE_PRESSURE = 15;
    static final int MAX_PULSE = 220;
    static final int MIN_PULSE = 30;
    static final double MAX_TEMPERATURE = 42.0;
    static final double MIN_TEMPERATURE = 34.0;

    /**
     * Prüft, ob der systolische Blutdruck im plausiblen Bereich liegt.
     * Umsetzung von REQ-007.
     *
     * @param systolic systolischer Blutdruck in mmHg
     * @return true, wenn der Wert zwischen MIN_SYSTOLIC und MAX_SYSTOLIC liegt (Grenzen eingeschlossen)
     */
    static boolean isSystolicValid(int systolic) {
        return systolic >= MIN_SYSTOLIC && systolic <= MAX_SYSTOLIC;
    }

    /**
     * Prüft, ob der diastolische Blutdruck im plausiblen Bereich liegt.
     * Umsetzung von REQ-008.
     *
     * @param diastolic diastolischer Blutdruck in mmHg
     * @return true, wenn der Wert zwischen MIN_DIASTOLIC und MAX_DIASTOLIC liegt (Grenzen eingeschlossen)
     */
    static boolean isDiastolicValid(int diastolic) {
        return diastolic >= MIN_DIASTOLIC && diastolic <= MAX_DIASTOLIC;
    }

    /**
     * Prüft, ob die Blutdruckamplitude (systolisch minus diastolisch) im plausiblen Bereich liegt.
     * Umsetzung von REQ-009.
     *
     * @param systolic  systolischer Blutdruck in mmHg
     * @param diastolic diastolischer Blutdruck in mmHg
     * @return true, wenn die Differenz zwischen MIN_PULSE_PRESSURE und MAX_PULSE_PRESSURE liegt (Grenzen eingeschlossen)
     */
    static boolean isPulsePressureValid(int systolic, int diastolic) {
        int pulsePressure = systolic - diastolic;
        return pulsePressure >= MIN_PULSE_PRESSURE && pulsePressure <= MAX_PULSE_PRESSURE;
    }

    /**
     * Prüft, ob der Puls im plausiblen Bereich liegt.
     * Umsetzung von REQ-010.
     *
     * @param pulse Puls in bpm
     * @return true, wenn der Wert zwischen MIN_PULSE und MAX_PULSE liegt (Grenzen eingeschlossen)
     */
    static boolean isPulseValid(int pulse) {
        return pulse >= MIN_PULSE && pulse <= MAX_PULSE;
    }

    /**
     * Prüft, ob die Körpertemperatur im plausiblen Bereich liegt.
     * Umsetzung von REQ-011.
     *
     * @param temperature Körpertemperatur in °C
     * @return true, wenn der Wert zwischen MIN_TEMPERATURE und MAX_TEMPERATURE liegt (Grenzen eingeschlossen)
     */
    static boolean isTemperatureValid(double temperature) {
        return temperature >= MIN_TEMPERATURE && temperature <= MAX_TEMPERATURE;
    }
}
