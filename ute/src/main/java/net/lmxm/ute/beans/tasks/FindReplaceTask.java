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
package net.lmxm.ute.beans.tasks;

import java.util.ArrayList;
import java.util.List;

import net.lmxm.ute.beans.FindReplacePattern;
import net.lmxm.ute.beans.targets.FileSystemTarget;
import net.lmxm.ute.enums.Scope;

/**
 * The Class FindReplaceTask.
 */
public final class FindReplaceTask extends AbstractFilesTask {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = -4540300287061155288L;

	/** The patterns. */
	private List<FindReplacePattern> patterns;

	/** The scope. */
	private Scope scope;

	/** The target. */
	private FileSystemTarget target;

	/**
	 * Instantiates a new find replace task.
	 */
	public FindReplaceTask() {
		super();

		patterns = new ArrayList<FindReplacePattern>();
	}

	/**
	 * Gets the patterns.
	 * 
	 * @return the patterns
	 */
	public List<FindReplacePattern> getPatterns() {
		return patterns;
	}

	/**
	 * Gets the scope.
	 * 
	 * @return the scope
	 */
	public Scope getScope() {
		return scope;
	}

	/**
	 * Gets the target.
	 * 
	 * @return the target
	 */
	public FileSystemTarget getTarget() {
		return target;
	}

	/**
	 * Sets the patterns.
	 * 
	 * @param patterns the new patterns
	 */
	public void setPatterns(final List<FindReplacePattern> patterns) {
		this.patterns = patterns;
	}

	/**
	 * Sets the scope.
	 * 
	 * @param scope the new scope
	 */
	public void setScope(final Scope scope) {
		this.scope = scope;
	}

	/**
	 * Sets the target.
	 * 
	 * @param target the new target
	 */
	public void setTarget(final FileSystemTarget target) {
		this.target = target;
	}
}