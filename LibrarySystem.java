package Assignment5;

import java.util.HashMap;
import java.util.Map;

public class LibrarySystem {
    private Map<String, Material> catalogue;  

    public LibrarySystem() {
        catalogue = new HashMap<>();
    }

    public void addMaterial(Material material) {
        catalogue.put(material.getItemReference(), material);
    }
}