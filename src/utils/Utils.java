package utils;

import models.UsuarioQsercon;

import javax.swing.*;

public class Utils {

    public static void setSelectedValue(JComboBox comboBox, String itemSearch)
    {
        for (int i = 0; i < comboBox.getItemCount(); i++)
        {
           String item = (String)comboBox.getItemAt(i);
            if (item.equalsIgnoreCase(itemSearch))
            {
                comboBox.setSelectedIndex(i);
                break;
            }
        }
    }
}
