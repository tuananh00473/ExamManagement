package com.ptit.exam.ui.view;

import org.springframework.stereotype.Component;

import javax.swing.*;
import java.awt.*;

/**
 * User: Anhnt
 * Date: 9/4/13
 * Time: 1:45 PM
 */
@Component
public class GioithieuGUI extends JPanel
{
    private JTextArea txtGioithieu;
    private JPanel gioithieuCard;

    {
// GUI initializer generated by IntelliJ IDEA GUI Designer
// >>> IMPORTANT!! <<<
// DO NOT EDIT OR ADD ANY CODE HERE!
        $$$setupUI$$$();
    }

    /**
     * Method generated by IntelliJ IDEA GUI Designer
     * >>> IMPORTANT!! <<<
     * DO NOT edit this method OR call it in your code!
     *
     * @noinspection ALL
     */
    private void $$$setupUI$$$()
    {
        gioithieuCard = new JPanel();
        gioithieuCard.setLayout(new BorderLayout(0, 0));
        final JLabel label1 = new JLabel();
        label1.setText("Hệ thống thi trắc nghiệm");
        gioithieuCard.add(label1, BorderLayout.NORTH);
        txtGioithieu = new JTextArea();
        txtGioithieu.setText("");
        gioithieuCard.add(txtGioithieu, BorderLayout.CENTER);
    }

    /**
     * @noinspection ALL
     */
    public JComponent $$$getRootComponent$$$()
    {
        return gioithieuCard;
    }
}
