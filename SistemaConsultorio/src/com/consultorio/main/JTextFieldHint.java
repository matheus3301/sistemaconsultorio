/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.consultorio.main;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Insets;
import java.awt.RenderingHints;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.border.Border;

/**
 *
 * @author otavi
 */
public class JTextFieldHint extends JTextField implements FocusListener {

    private JTextField jtf;
    private Icon icon;
    private String hint;
    private Insets dummyInsets;

    public JTextFieldHint(JTextField jtf, String icon, String hint) {
        this.jtf = jtf;
        ImageIcon img1 = new ImageIcon("icons/"+icon+".png");
        setIcon(img1);
        this.hint = hint;

        Border border = UIManager.getBorder("TextField.border");
        
        JTextField dummy = new JTextField();
        this.dummyInsets = border.getBorderInsets(dummy);

        addFocusListener(this);
    }

    public void setIcon(ImageIcon imageIcon) {
        this.icon = imageIcon;
    }
    
    public void setIcon(Icon newIcon) {
        this.icon = newIcon;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        int textX = 2;

        if (this.icon != null) {
            int iconWidth = icon.getIconWidth();
            int iconHeight = icon.getIconHeight();
            int x = dummyInsets.left + 5;
            textX = x + iconWidth + 2;
            int y = (this.getHeight() - iconHeight) / 2;
            icon.paintIcon(this, g, x, y);
        }

        setMargin(new Insets(2, textX, 2, 2));

        if (this.getText().equals("")) {
            int width = this.getWidth();
            int height = this.getHeight();
            Font prev = g.getFont();
            Font italic = prev.deriveFont(Font.ITALIC);
            Color prevColor = g.getColor();
            g.setFont(italic);
            g.setColor(UIManager.getColor("textInactiveText"));
            int h = g.getFontMetrics().getHeight();
            int textBottom = (height - h) / 2 + h - 4;
            int x = this.getInsets().left;
            Graphics2D g2d = (Graphics2D) g;
            RenderingHints hints = g2d.getRenderingHints();
            g2d.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
            g2d.drawString(hint, x, textBottom);
            g2d.setRenderingHints(hints);
            g.setFont(prev);
            g.setColor(prevColor);
        }

    }

    protected ImageIcon createImageIcon(String path, String description) {
        java.net.URL imgURL = getClass().getResource(path);
        if (imgURL != null) {
            return new ImageIcon(imgURL, description);
        } else {
            System.err.println("Couldn't find file: " + path);
            return null;
        }
    }

    @Override
    public void focusGained(FocusEvent arg0) {
        this.repaint();
    }

    @Override
    public void focusLost(FocusEvent arg0) {
        this.repaint();
    }

}
