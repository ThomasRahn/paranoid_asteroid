package game.ui.menu;

import game.Fonts;

import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class PageTitleLabel extends JLabel {
	private static final long serialVersionUID = 1L;
	
	private static final int PADDING = 10;
	
	public PageTitleLabel(String title) {
		super(title);
		
		this.setHorizontalAlignment(SwingConstants.CENTER);
		this.setBorder(BorderFactory.createEmptyBorder(PADDING, PADDING, PADDING, PADDING));
		this.setFont(Fonts.PANEL_TITLE_FONT.getFont());
		this.setForeground(new Color(0xF0F0F0));
	}
}
