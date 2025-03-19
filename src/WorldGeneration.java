import WorldRPG.World;

import javax.swing.*;
import java.awt.*;

public class WorldGeneration extends World {
    private final int grid_size = 400;
    private final int tile_size = 5;
    private static JPanel worldPanel;

    static class world {
        String title;
        int grid_size;
        int tile_size;
        boolean closeOperation;

        public world(int grid_size, int tile_size, boolean closeOperation) {
            this.grid_size = grid_size;
            this.tile_size = tile_size;
            this.closeOperation = false;
        }


        public void WorldGeneration() {
            
        }

        private void drawWorld(Graphics g) {
        }
    }
}
