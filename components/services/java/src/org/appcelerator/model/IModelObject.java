
/* 
 * Copyright 2006-2008 Appcelerator, Inc.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *    http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License. 
 */
package org.appcelerator.model;

/**
 * IModelObject is an interface for a model object that is to be persisted.
 *
 * @author <a href="mailto:jkashimba@appcelerator.com">Jeff Haynie</a>
 */
public interface IModelObject
{
    /**
     * get the identifier for this object
     *
     * @return the id
     */
    public Long getId();

    /**
     * set the identifier for this object
     *
     * @param id the identifier
     */
    public void setId(Long id);
}