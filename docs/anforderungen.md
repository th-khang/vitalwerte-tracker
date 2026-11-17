# Vitalwert-Tracker - Anforderungsdokument

## Zweckbestimmung

Das Programm nimmt die Vitalwerte Blutdruck, Puls und Körpertemperatur über manuelle Eingabe lokal durch die Konsole entgegen, bewertet diese anhand der entsprechenden Leitlinien und ordnet sie einem bestimmten Bereich zu.
Dieses Programm dient ausschließlich zur Demonstration und ist daher nicht dazu bestimmt, Krankheiten zu diagnostizieren, zu überwachen oder zu behandeln und ersetzt keine ärztliche Einschätzung.

## Begriffe

- **Messung:** ein zusammengehöriger Datensatz aus systolischem Blutdruck, diastolischem Blutdruck, Puls und Körpertemperatur mit Datum und Uhrzeit.
- **Vitalwert:** einer der vier Einzelwerte einer Messung.

## Anforderungen

### Eingabe

- REQ-001: Das System muss den systolischen Blutdruck als Ganzzahl in mmHg entgegennehmen.
- REQ-002: Das System muss den diastolischen Blutdruck als Ganzzahl in mmHg entgegennehmen.
- REQ-003: Das System muss den Puls als Ganzzahl in bpm entgegennehmen.
- REQ-004: Das System muss die Körpertemperatur als Ganzzahl oder Dezimalzahl in °C entgegennehmen.
- REQ-005: Das System muss jeder Messung automatisch Datum und Uhrzeit der Eingabe zuordnen.

### Plausibilitätsprüfung

- REQ-006: Das System muss eine Fehlermeldung ausgeben, wenn eine Eingabe keine Zahl ist.
- REQ-007: Das System muss eine Fehlermeldung ausgeben, wenn der systolische Blutdruck unter 60 mmHg oder über 260 mmHg liegt.
- REQ-008: Das System muss eine Fehlermeldung ausgeben, wenn der diastolische Blutdruck unter 30 mmHg oder über 150 mmHg liegt.
- REQ-009: Das System muss eine Fehlermeldung ausgeben, wenn der systolische minus den diastolischen Blutdruck unter 15 mmHg oder über 150 mmHg liegt.
- REQ-010: Das System muss eine Fehlermeldung ausgeben, wenn der Puls unter 30 bpm oder über 220 bpm liegt.
- REQ-011: Das System muss eine Fehlermeldung ausgeben, wenn die Körpertemperatur unter 34,0 °C oder über 42,0 °C liegt.
- REQ-012: Das System muss einen ungültigen Wert verwerfen und zur erneuten Eingabe auffordern.

### Bewertung

- REQ-013: Das System muss jeden gültigen Vitalwert einem der Bereiche „Normal“, „Auffällig“ oder „Kritisch“ zuordnen. Die Grenzwerte werden in einem eigenen Abschnitt festgelegt.

### Speicherung

- REQ-014: Das System muss gültige Messungen dauerhaft speichern, sodass sie nach einem Neustart des Programms weiterhin verfügbar sind.

### Anzeige

- REQ-015: Das System muss nach jeder gültigen Eingabe die Bewertung jedes Vitalwerts anzeigen.
- REQ-016: Das System muss alle gespeicherten Messungen chronologisch sortiert anzeigen.
