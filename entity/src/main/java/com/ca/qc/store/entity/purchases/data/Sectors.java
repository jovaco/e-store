package com.ca.qc.store.entity.purchases.data;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Business Sector
 */
public class Sectors {
    
    static {
        List<String> sectors = new ArrayList(
                Arrays.asList("Événements et festivals",
                        "Bien divers",
                        "Services divers",
                        "Marches en plein aire",
                        "Autre")
        );
    }
    
}
