/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Factory;

import Business.Entities.Classroom;

/**
 *
 * @author ketanmalik
 */
public class ClassroomFactory {

    public Classroom getObj(String id, int capacity) {
        return new Classroom(id, capacity);
    }
}
