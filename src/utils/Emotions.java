package utils;

public enum Emotions {
    ANGER("Злость"),
    SURPRISE("Удивление"),
    FEAR("Страх"),
    NEUTRAL("Нейтральное"),
    SUSPICIOUS("Подозрительность"),
    HAPPINESS("Радость");

    /**
     * Расшифровка эмоции в виде строки
     */
    private final String emotion;

    Emotions(String emotion) {
        this.emotion = emotion;
    }

    @Override
    public String toString() {
        return emotion;
    }
}
