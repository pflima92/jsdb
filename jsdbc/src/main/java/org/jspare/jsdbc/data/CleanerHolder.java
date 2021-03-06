/*
 * Copyright 2016 JSpare.org.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.jspare.jsdbc.data;

import java.util.Optional;

import org.jspare.core.container.Component;

/**
 * The Interface CleanerHolder.
 *
 * @author pflima
 * @since 04/05/2016
 */
@Component
public interface CleanerHolder {

	/**
	 * Registry cleaner.
	 *
	 * @param cleaner
	 *            the cleaner
	 */
	void registryCleaner(FieldCleaner<?> cleaner);

	/**
	 * Gets the cleaner.
	 *
	 * @param cleanerClazz
	 *            the cleaner clazz
	 * @return the cleaner
	 */
	Optional<FieldCleaner<?>> getCleaner(Class<?> cleanerClazz);
}
