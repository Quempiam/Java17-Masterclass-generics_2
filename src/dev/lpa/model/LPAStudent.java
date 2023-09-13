package dev.lpa.model;

public class LPAStudent extends Student {

    private double percentComplete;

    public LPAStudent() {
        percentComplete = random.nextDouble(0, 100.001);
    }

    @Override
    public String toString() {
        return "%s %8.1f%%".formatted(super.toString(), percentComplete);
    }

    public double getPercentComplete() {
        return percentComplete;
    }

    @Override
    public boolean matchFieldValue(String fieldName, String value) {
        return switch (fieldName.toUpperCase()) {
            case "PERCENT" -> percentComplete <= Double.parseDouble(value) ? true : false;
            default -> super.matchFieldValue(fieldName, value);
        };
    }
}
