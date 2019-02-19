package net.miginfocom.examples;

import net.miginfocom.layout.CC;
import net.miginfocom.layout.ConstraintParser;
import net.miginfocom.layout.IDEUtil;
import net.miginfocom.layout.LayoutUtil;
import net.miginfocom.swing.MigLayout;

import javax.swing.*;
import java.awt.*;

/**
 * @author Mikael Grev, MiG InfoCom AB
 *         Date: Oct 13, 2010
 *         Time: 9:37:23 PM
 */
public class TestGap
{
	public static void main(String[] args) throws Exception
	{
		JFrame frame = new JFrame();
		frame.setLayout(new MigLayout("debug"));
		JComponent table = new JTable(10, 10);
		frame.add(new JScrollPane(table));
		frame.pack();
		frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		frame.setVisible(true);
	}
}