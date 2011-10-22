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
 * The Class SubversionRepositoryLocationPopupMenu.
 */
public final class SubversionRepositoryLocationPopupMenu extends AbstractPopupMenu {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 7874408302989551017L;

	/** The add subversion repository location menu item. */
	private JMenuItem addSubversionRepositoryLocationMenuItem = null;

	/** The delete subversion repository location menu item. */
	private JMenuItem deleteSubversionRepositoryLocationMenuItem = null;

	/**
	 * Instantiates a new subversion repository location popup menu.
	 * 
	 * @param actionListener the action listener
	 */
	public SubversionRepositoryLocationPopupMenu(final ActionListener actionListener) {
		super(actionListener);

		add(getAddSubversionRepositoryLocationMenuItem());
		add(getDeleteSubversionRepositoryLocationMenuItem());
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
	 * Gets the adds the subversion repository location menu item.
	 * 
	 * @return the adds the subversion repository location menu item
	 */
	private JMenuItem getAddSubversionRepositoryLocationMenuItem() {
		if (addSubversionRepositoryLocationMenuItem == null) {
			addSubversionRepositoryLocationMenuItem = GuiComponentFactory.createMenuItem(
					GuiComponentMenuItem.ADD_SUBVERSION_REPOSITORY_LOCATION, getActionListener());
			addSubversionRepositoryLocationMenuItem.setEnabled(false); // TODO
																		// not
																		// implemented
		}
		return addSubversionRepositoryLocationMenuItem;
	}

	/**
	 * Gets the delete subversion repository location menu item.
	 * 
	 * @return the delete subversion repository location menu item
	 */
	private JMenuItem getDeleteSubversionRepositoryLocationMenuItem() {
		if (deleteSubversionRepositoryLocationMenuItem == null) {
			deleteSubversionRepositoryLocationMenuItem = GuiComponentFactory.createMenuItem(
					GuiComponentMenuItem.DELETE_SUBVERSION_REPOSITORY_LOCATION, getActionListener());
			deleteSubversionRepositoryLocationMenuItem.setEnabled(false); // TODO
																			// not
																			// implemented
		}
		return deleteSubversionRepositoryLocationMenuItem;
	}
}
