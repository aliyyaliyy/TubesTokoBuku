/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package org.itenas.tubes.jdbc.crud;

import java.util.List;

/**
 *
 * @author MyBook Z Series
 */
public interface Crud<T> {
    boolean create(T object);
    List<T> showAll();
    /* public boolean update(T Object); */
    boolean delete(int object);
}
