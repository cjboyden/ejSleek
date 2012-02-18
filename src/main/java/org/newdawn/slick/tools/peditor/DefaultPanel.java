package org.newdawn.slick.tools.peditor;

import javax.swing.*;
import java.awt.*;

/**
 * A panel to get round the stupidity that disabling a JPanel doesn't disable
 * it's children.
 *
 * @author kevin
 */
public class DefaultPanel extends JPanel {
	/**
	 * @see javax.swing.JComponent#setEnabled(boolean)
	 */
	public void setEnabled(boolean enabled) {
		super.setEnabled(enabled);
		
		Component[] components = getComponents();
		for (int i=0;i<components.length;i++) {
			components[i].setEnabled(enabled);
		}
	}
}
