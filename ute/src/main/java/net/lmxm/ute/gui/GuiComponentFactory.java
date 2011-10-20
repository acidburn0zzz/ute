/**
 * Copyright (C) 2011 Shaun Johnson, LMXM LLC
 * 
 * This file is part of Universal Task Executor.
 * 
 * Universal Task Executor is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by the Free
 * Software Foundation, either version 3 of the License, or (at your option) any
 * later version.
 * 
 * Universal Task Executor is distributed in the hope that it will be useful, but
 * WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE. See the GNU General Public License for more
 * details.
 * 
 * You should have received a copy of the GNU General Public License along with
 * Universal Task Executor. If not, see <http://www.gnu.org/licenses/>.
 */
package net.lmxm.ute.gui;

import java.awt.event.ActionListener;

import javax.swing.AbstractButton;
import javax.swing.JButton;

import net.lmxm.ute.utils.ResourcesUtils;

import org.apache.commons.lang.StringUtils;

/**
 * A factory for creating GuiComponent objects.
 */
public class GuiComponentFactory {

	/** The Constant TEXT_SUFFIX. */
	private static final String TEXT_SUFFIX = "text";

	/** The Constant TOOL_TIP_TEXT_SUFFIX. */
	private static final String TOOL_TIP_TEXT_SUFFIX = "toolTipText";

	/**
	 * Builds the resource prefix.
	 * 
	 * @param guiComponentType the gui component type
	 * @return the string
	 */
	private static String buildResourcePrefix(final GuiComponentType guiComponentType) {
		final StringBuilder builder = new StringBuilder();
		builder.append(guiComponentType.getGuiComponentCategory().name());
		builder.append(".");
		builder.append(guiComponentType.name());
		builder.append(".");

		return builder.toString();
	}

	/**
	 * Creates a new GuiComponent object.
	 * 
	 * @param guiComponentType the gui component type
	 * @param actionListener the action listener
	 * @return the j button
	 */
	public static JButton createButton(final GuiComponentType guiComponentType, final ActionListener actionListener) {
		final JButton button = new JButton();

		setIconAndText(button, guiComponentType);
		setActionListener(button, guiComponentType, actionListener);

		return button;
	}

	/**
	 * Sets the action listener.
	 * 
	 * @param abstractButton the abstract button
	 * @param guiComponentType the gui component type
	 * @param actionListener the action listener
	 */
	private static void setActionListener(final AbstractButton abstractButton, final GuiComponentType guiComponentType,
			final ActionListener actionListener) {
		if (actionListener != null) {
			abstractButton.addActionListener(actionListener);
		}

		if (guiComponentType.getActionCommand() != null) {
			abstractButton.setActionCommand(guiComponentType.getActionCommand());
		}
	}

	/**
	 * Sets the icon and text.
	 * 
	 * @param abstractButton the abstract button
	 * @param guiComponentType the gui component type
	 */
	private static void setIconAndText(final AbstractButton abstractButton, final GuiComponentType guiComponentType) {
		final String resourcePrefix = buildResourcePrefix(guiComponentType);

		final String text = ResourcesUtils.getString(resourcePrefix + TEXT_SUFFIX);
		if (StringUtils.isNotBlank(text)) {
			abstractButton.setText(text);
		}

		final String toolTipText = ResourcesUtils.getString(resourcePrefix + TOOL_TIP_TEXT_SUFFIX);
		if (StringUtils.isNotBlank(toolTipText)) {
			abstractButton.setToolTipText(toolTipText);
		}

		if (guiComponentType.getIcon() != null) {
			abstractButton.setIcon(guiComponentType.getIcon());
		}
	}
}