/*
 * FreeHost3270 a suite of terminal 3270 access utilities.
 * Copyright (C) 1998, 2001  Art Gillespie
 * Copyright (2) 2005 the http://FreeHost3270.Sourceforge.net
 *                        Project Contributors.
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA
 */


package net.sf.freehost3270.application;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class AboutFrame extends JFrame {
    public AboutFrame() {
        super("About");

        setLayout(new BorderLayout());
        add("North", new JLabel("RightHost 3270, (c)1998", JLabel.CENTER));
        add("Center", new JLabel("Licensed to the CIT Group", JLabel.CENTER));

        JPanel p = new JPanel();
        p.setLayout(new FlowLayout());
        p.add(new JButton(new AbstractAction("OK") {
                public void actionPerformed(ActionEvent evt) {
                    AboutFrame.this.dispose();
                }
            }));
        add("South", p);
        setSize(200, 200);

        Dimension screen_size;
        Dimension dlg;
        screen_size = Toolkit.getDefaultToolkit().getScreenSize();
        dlg = this.getSize();
        setLocation((screen_size.width - dlg.width) / 2,
            (screen_size.height - dlg.height) / 2);
    }
}
