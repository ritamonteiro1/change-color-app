package com.example.go4all;

public enum Colors {
    WHITE('0'),
    BLACK('1'),
    BLUE('2'),
    GREEN('3'),
    MAGENTA('4'),
    RED('5'),
    PURPLE('6'),
    YELLOW('7'),
    GRAY('8'),
    LILAC('9');

    private final char id;

    Colors(char id) {
        this.id = id;
    }

    public char getId() {
        return id;
    }

    public static Colors convertLetterToColor(char letter){
        if(letter == Colors.WHITE.getId()){
            return Colors.WHITE;
        } else if (letter == Colors.BLACK.getId()){
            return Colors.BLACK;
        } else if (letter == Colors.BLUE.getId()){
            return Colors.BLUE;
        } else if (letter == Colors.GREEN.getId()){
            return  Colors.GREEN;
        } else if (letter == Colors.MAGENTA.getId()){
            return Colors.MAGENTA;
        } else if (letter == Colors.RED.getId()){
            return Colors.RED;
        } else if (letter == Colors.PURPLE.getId()){
            return  Colors.PURPLE;
        } else if (letter == Colors.YELLOW.getId()){
            return Colors.YELLOW;
        } else if (letter == Colors.GRAY.getId()){
            return Colors.GRAY;
        } else if (letter == Colors.LILAC.getId()){
            return Colors.LILAC;
        }
    }
}
