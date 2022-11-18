package Enums;

import java.awt.*;

public enum ComboColor {
    RED("Rojo", Color.RED), GREEN("Verde", Color.GREEN), NEGRO("Negro",Color.black),AZUL("Azul",Color.blue),PINK("Rosado",Color.pink);

    private String text;
    private Color color;

    public String getText() {
        return text;
    }

    public Color getColor() {
        return color;
    }

    private ComboColor(String text, Color color) {
        this.text = text;
        this.color = color;
    }

    @Override
    public String toString() {
        return text;
    }
}

