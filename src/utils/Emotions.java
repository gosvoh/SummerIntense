package utils;

public enum Emotions {
    ANGER("Злость"),
    SURPRISE("Удивление"),
    FEAR("Страх"),
    NEUTRAL("Нейтральное");

    private final String emotion;

    Emotions(String emotion) {
        this.emotion = emotion;
    }

    @Override
    public String toString() {
        return emotion;
    }
}
