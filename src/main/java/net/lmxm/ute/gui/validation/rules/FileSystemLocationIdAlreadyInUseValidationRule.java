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
package net.lmxm.ute.gui.validation.rules;

import java.util.ArrayList;
import java.util.List;

import net.lmxm.ute.beans.configuration.Configuration;
import net.lmxm.ute.beans.locations.FileSystemLocation;
import net.lmxm.ute.configuration.ConfigurationHolder;
import net.lmxm.ute.configuration.ConfigurationUtils;
import net.lmxm.ute.resources.ResourcesUtils;
import net.lmxm.ute.resources.types.ValidatorResourceType;

import org.apache.commons.lang3.StringUtils;

/**
 * The Class FileSystemLocationIdAlreadyInUseValidationRule.
 */
public final class FileSystemLocationIdAlreadyInUseValidationRule extends AbstractTextComponentValidationRule {

	/** The configuration holder. */
	private final ConfigurationHolder configurationHolder;

	/** The error message. */
	private final String errorMessage;

	/** The file system location. */
	private final FileSystemLocation fileSystemLocation;

	/**
	 * Instantiates a new file system location id already in use validation rule.
	 * 
	 * @param fileSystemLocation the file system location
	 * @param configurationHolder the configuration holder
	 */
	public FileSystemLocationIdAlreadyInUseValidationRule(final FileSystemLocation fileSystemLocation,
			final ConfigurationHolder configurationHolder) {
		super();

		this.fileSystemLocation = fileSystemLocation;
		this.configurationHolder = configurationHolder;

		errorMessage = ResourcesUtils.getResourceMessage(ValidatorResourceType.FILE_SYSTEM_LOCATION_ID_ALREADY_USED);
	}

	/*
	 * (non-Javadoc)
	 * @see net.lmxm.ute.gui.validation.AbstractTextComponentValidationRule#validateText(java.lang.String)
	 */
	@Override
	public List<String> validateText(final String text) {
		final List<String> messages = new ArrayList<String>();

		if (StringUtils.isNotBlank(text)) {
			final Configuration configuration = configurationHolder.getConfiguration();
			final FileSystemLocation existingLocation = ConfigurationUtils.findFileSystemLocationById(configuration,
					text);
			if (existingLocation != null && fileSystemLocation != existingLocation) {
				messages.add(errorMessage);
			}
		}

		return messages;
	}
}
