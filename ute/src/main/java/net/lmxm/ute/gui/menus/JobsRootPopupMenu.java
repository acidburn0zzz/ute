/**
 * Copyright (C) 2011 Shaun Johnson, LMXM LLC
 * 
 * This file is part of Universal Task Executer.
 * 
 * Universal Task Executer is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by the Free
 * Software Foundation, either version 3 of the License, or (at your option) any
 * later version.
 * 
 * Universal Task Executer is distributed in the hope that it will be useful, but
 * WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE. See the GNU General Public License for more
 * details.
 * 
 * You should have received a copy of the GNU General Public License along with
 * Universal Task Executer. If not, see <http://www.gnu.org/licenses/>.
 */
package net.lmxm.ute.gui.menus;

import java.awt.event.ActionListener;

import javax.swing.JMenuItem;

import net.lmxm.ute.gui.components.GuiComponentFactory;
import net.lmxm.ute.gui.components.GuiComponentMenuItem;

/**
 * The Class JobsRootPopupMenu.
 */
public final class JobsRootPopupMenu extends AbstractPopupMenu {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = -6615140435658896019L;

	/** The add job menu item. */
	private JMenuItem addJobMenuItem = null;

	/**
	 * Instantiates a new job popup menu.
	 * 
	 * @param actionListener the action listener
	 */
	public JobsRootPopupMenu(final ActionListener actionListener) {
		super(actionListener);

		add(getAddJobMenuItem());
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * net.lmxm.ute.gui.menus.AbstractPopupMenu#enableDisableMenuItems(java.
	 * lang.Object)
	 */
	@Override
	public void enableDisableMenuItems(final Object object) {

	}

	/**
	 * Gets the adds the job menu item.
	 * 
	 * @return the adds the job menu item
	 */
	private JMenuItem getAddJobMenuItem() {
		if (addJobMenuItem == null) {
			addJobMenuItem = GuiComponentFactory.createMenuItem(GuiComponentMenuItem.ADD_JOB, getActionListener());
			addJobMenuItem.setEnabled(false); // TODO not implemented
		}
		return addJobMenuItem;
	}
}
