/**
 * Copyright 2014 Telefonica Investigación y Desarrollo, S.A.U
 *
 * This file is part of fiware-connectors (FI-WARE project).
 *
 * cosmos-injector is free software: you can redistribute it and/or modify it under the terms of the GNU Affero General
 * Public License as published by the Free Software Foundation, either version 3 of the License, or (at your option) any
 * later version.
 * cosmos-injector is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied
 * warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU Affero General Public License for more
 * details.
 *
 * You should have received a copy of the GNU Affero General Public License along with fiware-connectors. If not, see
 * http://www.gnu.org/licenses/.
 *
 * For those usages not covered by the GNU Affero General Public License please contact with Francisco Romero
 * frb@tid.es
 */

package es.tid.fiware.fiwareconnectors.cygnus.backends.ckan;

import org.json.simple.JSONObject;

import javax.swing.text.html.parser.Entity;
import java.util.Objects;

/**
 * Class to store the <org, entity> pair, uses as key in the resourceId hashmap in the CKANBackendImpl class
 *
 * @author fermin
 */
public class EntityKey {

    private String entity;
    private String org;

    /**
     * Class constructor
     * @param org
     * @param entity
     */
    public EntityKey(String org, String entity) {
        this.org = org;
        this.entity = entity;
    } // EntityKey

    /**
     * @return entity
     */
    public String getEntity() {
        return entity;
    } // getEntity

    /**
     * @return org
     */
    public String getOrg() {
        return org;
    } // gettOrg

    /**
     * @param obj
     * @return true if obj is equals to the object
     */
    public boolean equals(Object obj) {
        return (obj instanceof EntityKey
                && ((EntityKey)obj).entity.equals(this.entity)
                && ((EntityKey)obj).org.equals(this.org));
    }

    /**
     *
      * @return hashcode for the object
     */
    public int hashCode() {
        /* Following the algorithm at http://stackoverflow.com/questions/113511/hash-code-implementation */
        return org.hashCode() + 37 * entity.hashCode();
    }

    /**
     *
     * @return String
     */
    public String toString() {
        return "<" + org +"," + entity + ">";
    } // toString

} // EntityKey
