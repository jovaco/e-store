package com.ca.qc.store.entity.purchases.data;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Business Activity
 */
public class Activities {
    static {
        List<String> sectors = new ArrayList(
        Arrays.asList("Alimentaire et boisson",
                "Beaute et soin",
                "Loisire et divertissement",
                "Maison et réparation",
                "Organisme caritatif, ...",
                "Sante et forme physique",
                "Service professionnel", 
                "Transport", 
                "Usage occasionnel")
        );
    }    
}
