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
package net.lmxm.ute.listeners;

import java.util.EventObject;

import net.lmxm.ute.beans.IdentifiableBean;

/**
 * The Class IdChangeEvent.
 */
public class IdChangeEvent extends EventObject {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 6131907335835511055L;

	/** The identifiable bean. */
	private final IdentifiableBean identifiableBean;

	/**
	 * Instantiates a new id change event.
	 * 
	 * @param source the source
	 * @param identifiableBean the identifiable bean
	 */
	public IdChangeEvent(final Object source, final IdentifiableBean identifiableBean) {
		super(source);

		this.identifiableBean = identifiableBean;
	}

	/**
	 * Gets the identifiable bean.
	 * 
	 * @return the identifiable bean
	 */
	public IdentifiableBean getIdentifiableBean() {
		return identifiableBean;
	}

}
