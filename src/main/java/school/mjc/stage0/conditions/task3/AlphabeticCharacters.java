package school.mjc.stage0.conditions.task3;

public class AlphabeticCharacters {
    public void vowelDeterminer(char character) {
        if(character == 'A' || character == 'a' ||
           character == 'E' || character == 'e' ||  
           character == 'Y' || character == 'y' ||
           character == 'U' || character == 'u' ||   
           character == 'I' || character == 'i' ||
           character == 'O' || character == 'o') {
           System.out.println("Vowel");
        } else if(character == 'Q' || character == 'q' ||
                  character == 'W' || character == 'w' ||  
                  character == 'R' || character == 'r' ||
                  character == 'T' || character == 't' ||   
                  character == 'P' || character == 'p' ||
                  character == 'S' || character == 's' ||
                  character == 'D' || character == 'd' ||
                  character == 'F' || character == 'f' ||
                  character == 'G' || character == 'g' ||
                  character == 'H' || character == 'h' ||
                  character == 'J' || character == 'j' ||
                  character == 'K' || character == 'k' ||
                  character == 'L' || character == 'l' ||
                  character == 'Z' || character == 'z' ||
                  character == 'X' || character == 'x' ||  
                  character == 'C' || character == 'c' ||
                  character == 'V' || character == 'v' ||   
                  character == 'B' || character == 'b' ||   
                  character == 'N' || character == 'n' ||
                  character == 'M' || character == 'm'){
           System.out.println("Consonant");
        } else {
           System.out.println("wrong alphabet!");
        }
    }
}
