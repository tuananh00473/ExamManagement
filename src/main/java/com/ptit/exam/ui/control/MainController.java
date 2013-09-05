package com.ptit.exam.ui.control;

import com.ptit.exam.ui.view.MainGUI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * User: Anhnt
 * Date: 9/4/13
 * Time: 9:28 PM
 */

@Component
public class MainController
{
    @Autowired
    private MainGUI mainGUI;

    public void doShowLambaithicard()
    {
        showCard("lambaithiCard");
    }

    public void doShowLoginCard()
    {
        showCard("loginCard");
    }

    public void doShowGioithieuCard()
    {
        showCard("gioithieuCard");
    }

    public void doShowTaodethiCard()
    {
        showCard("taodethiCard");
    }

    public void showCard(String nameCard)
    {
        mainGUI.getCardLayout().show(mainGUI.getCardPanel(), nameCard);
    }

    public void showMainGui()
    {
        doShowGioithieuCard();
        mainGUI.show();
    }
}
