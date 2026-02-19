public class OOPSBannerApp {
    static class CharacterPatternMap {
        private final Character character;
        private final String[] pattern;

        public CharacterPatternMap(Character character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        public Character getCharacter() {
            return character;
        }

        public String[] getPattern() {
            return pattern;
        }
    }

        public static CharacterPatternMap[] createCharacterPatternMaps() {

        String[] O = {
            "  *****  ",
            " *     * ",
            "*       *",
            "*       *",
            "*       *",
            " *     * ",
            "  *****  "
        };

        String[] P = {
            "*******  ",
            "*      * ",
            "*      * ",
            "*******  ",
            "*        ",
            "*        ",
            "*        "
        };

        String[] S = {
            "  ****** ",
            " *       ",
            "*        ",
            " ******  ",
            "       * ",
            "       * ",
            " ******  "
        };

        String[] SPACE = {
            "   ",
            "   ",
            "   ",
            "   ",
            "   ",
            "   ",
            "   "
        };

        return new CharacterPatternMap[] {
            new CharacterPatternMap('O', O),
            new CharacterPatternMap('P', P),
            new CharacterPatternMap('S', S),
            new CharacterPatternMap(' ', SPACE)
        };
    }

        public static String[] getCharacterPattern(char ch, CharacterPatternMap[] charMaps) {
        char upper = Character.toUpperCase(ch);
        String[] space = null;

        for (CharacterPatternMap map : charMaps) {
            if (map.getCharacter() == ' ') {
                space = map.getPattern();
            }
            if (map.getCharacter() == upper) {
                return map.getPattern();
            }
        }
        return (space != null) ? space : new String[] {"", "", "", "", "", "", ""};
    }

        public static void printMessage(String message, CharacterPatternMap[] charMaps) {
        if (message == null || message.isEmpty()) return;

        final int HEIGHT = 7;
        for (int row = 0; row < HEIGHT; row++) {
            StringBuilder line = new StringBuilder();
            for (int i = 0; i < message.length(); i++) {
                String[] pat = getCharacterPattern(message.charAt(i), charMaps);
                line.append(pat[row]);
                if (i < message.length() - 1) line.append(" ");
            }
            System.out.println(line.toString());
        }
    }

        public static void main(String[] args) {
        CharacterPatternMap[] charMaps = createCharacterPatternMaps();
        String message = "OOPS";
        printMessage(message, charMaps);
    }
}