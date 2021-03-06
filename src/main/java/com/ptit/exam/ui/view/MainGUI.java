package com.ptit.exam.ui.view;

import com.intellij.uiDesigner.core.GridConstraints;
import com.intellij.uiDesigner.core.GridLayoutManager;
import com.ptit.exam.ui.control.LoginController;
import com.ptit.exam.ui.control.MainController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * User: Anhnt
 * Date: 9/4/13
 * Time: 10:04 PM
 */

@Component
public class MainGUI extends JFrame
{
    private JPanel mainPanel;
    private JLabel lbLogo;
    private JPanel cardPanel;
    private JButton btnGT;
    private JButton btnLamBaiThi;
    private JButton btnTaoDeThi;
    private JButton btnKetQuaThi;
    private JButton btnDapAn;
    private JButton btnLichThi;
    private JButton btnThongTin;
    private JButton btnHuongDan;

    private LoginGUI loginGUI;
    private GioithieuGUI gioithieuGUI;
    private LambaithiGUI lambaithiGUI;
    private TaodethiGUI taodethiGUI;

    private CardLayout cardLayout;

    @Autowired
    MainController mainController;

    @Autowired
    LoginController loginController;

    public MainGUI()
    {
        super("MainGUI");
        $$$setupUI$$$();
        setContentPane(mainPanel);
        setSize(600, 500);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        gioithieuGUI = new GioithieuGUI();
        cardPanel.add(gioithieuGUI.$$$getRootComponent$$$(), "gioithieuCard");
        loginGUI = new LoginGUI();
        cardPanel.add(loginGUI.$$$getRootComponent$$$(), "loginCard");
        lambaithiGUI = new LambaithiGUI();
        cardPanel.add(lambaithiGUI.$$$getRootComponent$$$(), "lambaithiCard");
        taodethiGUI = new TaodethiGUI();
        cardPanel.add(taodethiGUI.$$$getRootComponent$$$(), "taodethiCard");

        // ================ Gioi thieu===============================
        btnGT.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                mainController.doShowGioithieuCard();
            }
        });

        //=================== lam bai thi =========================
        btnLamBaiThi.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                mainController.doShowLoginCard();
            }
        });

        loginGUI.addLoginListenner(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                loginController.doLogin();
            }
        });

        //==================== tao de thi ==================
        btnTaoDeThi.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                mainController.doShowTaodethiCard();
            }
        });

        cardLayout = (CardLayout) cardPanel.getLayout();
    }

    public CardLayout getCardLayout()
    {
        return cardLayout;
    }

    public JPanel getCardPanel()
    {
        return cardPanel;
    }

    public LoginGUI getLoginGUI()
    {
        return loginGUI;
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
        mainPanel = new JPanel();
        mainPanel.setLayout(new GridLayoutManager(2, 1, new Insets(0, 0, 0, 0), -1, -1));
        mainPanel.setBackground(new Color(-16764109));
        lbLogo = new JLabel();
        lbLogo.setForeground(new Color(-1));
        lbLogo.setText("Logo");
        mainPanel.add(lbLogo, new GridConstraints(0, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final JPanel panel1 = new JPanel();
        panel1.setLayout(new BorderLayout(0, 0));
        mainPanel.add(panel1, new GridConstraints(1, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, null, null, null, 0, false));
        final JPanel panel2 = new JPanel();
        panel2.setLayout(new GridLayoutManager(8, 1, new Insets(0, 0, 0, 0), -1, -1));
        panel1.add(panel2, BorderLayout.WEST);
        panel2.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLoweredBevelBorder(), null, TitledBorder.DEFAULT_JUSTIFICATION, TitledBorder.DEFAULT_POSITION, new Font(panel2.getFont().getName(), panel2.getFont().getStyle(), panel2.getFont().getSize()), new Color(-16776961)));
        btnGT = new JButton();
        btnGT.setBackground(new Color(-1));
        btnGT.setHideActionText(false);
        btnGT.setHorizontalAlignment(0);
        btnGT.setHorizontalTextPosition(0);
        btnGT.setText("Giới thiệu");
        btnGT.putClientProperty("html.disable", Boolean.FALSE);
        btnGT.putClientProperty("hideActionText", Boolean.FALSE);
        panel2.add(btnGT, new GridConstraints(0, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        btnLamBaiThi = new JButton();
        btnLamBaiThi.setBackground(new Color(-1));
        btnLamBaiThi.setHideActionText(false);
        btnLamBaiThi.setOpaque(true);
        btnLamBaiThi.setRequestFocusEnabled(true);
        btnLamBaiThi.setRolloverEnabled(true);
        btnLamBaiThi.setText("Làm bài thi");
        panel2.add(btnLamBaiThi, new GridConstraints(1, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        btnTaoDeThi = new JButton();
        btnTaoDeThi.setBackground(new Color(-1));
        btnTaoDeThi.setHideActionText(false);
        btnTaoDeThi.setText("Tạo đề thi");
        panel2.add(btnTaoDeThi, new GridConstraints(2, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        btnKetQuaThi = new JButton();
        btnKetQuaThi.setAutoscrolls(false);
        btnKetQuaThi.setBackground(new Color(-1));
        btnKetQuaThi.setText("Kết quả thi");
        panel2.add(btnKetQuaThi, new GridConstraints(3, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        btnDapAn = new JButton();
        btnDapAn.setAutoscrolls(false);
        btnDapAn.setBackground(new Color(-1));
        btnDapAn.setText("Đáp án");
        panel2.add(btnDapAn, new GridConstraints(4, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        btnLichThi = new JButton();
        btnLichThi.setAutoscrolls(false);
        btnLichThi.setBackground(new Color(-1));
        btnLichThi.setText("Lịch thi");
        panel2.add(btnLichThi, new GridConstraints(5, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        btnThongTin = new JButton();
        btnThongTin.setAutoscrolls(false);
        btnThongTin.setBackground(new Color(-1));
        btnThongTin.setText("Thông tin");
        panel2.add(btnThongTin, new GridConstraints(6, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        btnHuongDan = new JButton();
        btnHuongDan.setAutoscrolls(false);
        btnHuongDan.setBackground(new Color(-1));
        btnHuongDan.setText("Hướng dẫn");
        panel2.add(btnHuongDan, new GridConstraints(7, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        cardPanel = new JPanel();
        cardPanel.setLayout(new CardLayout(0, 0));
        cardPanel.setBackground(new Color(-16711681));
        panel1.add(cardPanel, BorderLayout.CENTER);
        cardPanel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLoweredBevelBorder(), null, TitledBorder.DEFAULT_JUSTIFICATION, TitledBorder.DEFAULT_POSITION, null, new Color(-16776961)));
        final LoginGUI nestedForm1 = new LoginGUI();
        cardPanel.add(nestedForm1.$$$getRootComponent$$$(), "Card2");
        final TaodethiGUI nestedForm2 = new TaodethiGUI();
        cardPanel.add(nestedForm2.$$$getRootComponent$$$(), "Card3");
        final LambaithiGUI nestedForm3 = new LambaithiGUI();
        cardPanel.add(nestedForm3.$$$getRootComponent$$$(), "Card4");
        final GioithieuGUI nestedForm4 = new GioithieuGUI();
        cardPanel.add(nestedForm4.$$$getRootComponent$$$(), "Card1");
    }

    /**
     * @noinspection ALL
     */
    public JComponent $$$getRootComponent$$$()
    {
        return mainPanel;
    }
}
