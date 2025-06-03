public class MiniRpg {

    static class Character {
        private final String name;
        private int health;
        private final int attack;

        Character(String name, int health, int attack) {
            // TODO
            throw new UnsupportedOperationException("Not yet implemented");
        }
        boolean isAlive() { return health > 0; }
        void attack(Character target) {
            // TODO
            throw new UnsupportedOperationException("Not yet implemented");
        }
        int getHealth() { return health; }
        String getName() { return name; }
    }

    /**
     * Conducts battle until one character is defeated.
     * Returns the winner's name.
     */
    public static String battle(Character a, Character b) {
        // TODO
        throw new UnsupportedOperationException("Not yet implemented");
    }
} 