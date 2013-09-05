package com.ptit.exam.ui.control;

import com.ptit.exam.ui.view.MainGUI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.swing.*;

/**
 * User: Anhnt
 * Date: 9/4/13
 * Time: 9:31 PM
 */
@Component
public class LoginController
{
    @Autowired
    MainGUI mainGUI;

    @Autowired
    MainController mainController;

    public boolean checkLogin()
    {
        if (mainGUI.getLoginGUI().getTxtUsername().getText().equals("sa") && mainGUI.getLoginGUI().getTxtPassword().getText().equals("sa"))
        {
            System.out.println("oki");
            return true;
        }
        else
        {
            System.out.println(" not oki");
            return false;
        }
    }

    public void doLogin()
    {
        if (checkLogin())
        {
            mainController.doShowLambaithicard();
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Username and/or Password ERROR !");
        }
    }
}
