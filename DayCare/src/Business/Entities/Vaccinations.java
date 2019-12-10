/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Entities;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author ketanmalik
 */
public class Vaccinations {

    private String name;
    private Map<Integer, Integer> doseMap;

    public Vaccinations(String name) {
        this.name = name;
        this.doseMap = new HashMap<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Map<Integer, Integer> getDoseMap() {
        return doseMap;
    }

    public void setDoseMap(Map<Integer, Integer> doseMap) {
        this.doseMap = doseMap;
    }
}
