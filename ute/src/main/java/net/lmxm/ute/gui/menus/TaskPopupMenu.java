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

import net.lmxm.ute.gui.components.GuiComponentMenuItem;

/**
 * The Class TaskPopupMenu.
 */
public final class TaskPopupMenu extends AbstractPopupMenu {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = -4016776722491013039L;

	/**
	 * Instantiates a new task popup menu.
	 * 
	 * @param actionListener the action listener
	 */
	public TaskPopupMenu(final ActionListener actionListener) {
		super(actionListener);

		addMenuItem(GuiComponentMenuItem.EXECUTE_TASK);
		addTaskAddMenu();
		addMenuItem(GuiComponentMenuItem.DELETE_TASK);
	}
}
