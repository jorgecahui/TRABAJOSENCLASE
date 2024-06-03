/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.upeu.syscenterlife.modelo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author Lab-IoT
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
public class ComboBoxOption {

    String key;
    String value;

    @Override
    public String toString() {
        return value;
    }
}