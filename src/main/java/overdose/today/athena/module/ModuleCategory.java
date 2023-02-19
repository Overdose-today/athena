package overdose.today.athena.module;

import java.awt.*;

public enum ModuleCategory {

    COMBAT("Combat", new Color(208, 33, 32)),
    MISCELLANEOUS("Miscellaneous", new Color(150, 149, 25)),
    MOVEMENT("Movement", new Color(138, 191, 125)),
    RENDER("Render", new Color(71, 132, 136));

    final String name;
    final Color color;

    ModuleCategory(String name, Color color) {
        this.name = name;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public Color getColor() {
        return color;
    }

}
