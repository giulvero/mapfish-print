/*
 * Copyright (C) 2014  Camptocamp
 *
 * This file is part of MapFish Print
 *
 * MapFish Print is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * MapFish Print is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with MapFish Print.  If not, see <http://www.gnu.org/licenses/>.
 */

package org.mapfish.print.config;

import com.codahale.metrics.MetricRegistry;
import org.mapfish.print.attribute.PrimitiveAttribute;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.assertNotNull;

/**
 * Test Attribute.
 *
 * @author jesseeichar on 3/25/14.
 */
public class AttributeWithSpringInjection extends PrimitiveAttribute<Integer> {

    @Autowired
    private MetricRegistry registry;

    public void assertInjected() {
        assertNotNull(registry);
    }
    /**
     * Constructor.
     */
    public AttributeWithSpringInjection() {
        super(Integer.class);
    }
}
