package com.example.go4all;

public enum Colors {
    WHITE('0'),
    BLACK('1'),
    BLUE('2'),
    GREEN('3'),
    PINK('4'),
    RED('5'),
    PURPLE('6'),
    YELLOW('7'),
    GRAY('8'),
    LILAC('9'),
    ERROR_COLOR('#');

    private final char value;

    Colors(char value) {
        this.value = value;
    }

    public char getValue() {
        return value;
    }

    public static Colors convertLetterToColor(char letter) {
        if (letter == Colors.WHITE.getValue()) {
            return Colors.WHITE;
        } else if (letter == Colors.BLACK.getValue()) {
            return Colors.BLACK;
        } else if (letter == Colors.BLUE.getValue()) {
            return Colors.BLUE;
        } else if (letter == Colors.GREEN.getValue()) {
            return Colors.GREEN;
        } else if (letter == Colors.PINK.getValue()) {
            return Colors.PINK;
        } else if (letter == Colors.RED.getValue()) {
            return Colors.RED;
        } else if (letter == Colors.PURPLE.getValue()) {
            return Colors.PURPLE;
        } else if (letter == Colors.YELLOW.getValue()) {
            return Colors.YELLOW;
        } else if (letter == Colors.GRAY.getValue()) {
            return Colors.GRAY;
        } else if (letter == Colors.LILAC.getValue()) {
            return Colors.LILAC;
        } else {
            return Colors.ERROR_COLOR;
        }
    }
}
