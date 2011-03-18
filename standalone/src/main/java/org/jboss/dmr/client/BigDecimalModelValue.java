/*
 * JBoss, Home of Professional Open Source.
 * Copyright 2011, Red Hat, Inc., and individual contributors
 * as indicated by the @author tags. See the copyright.txt file in the
 * distribution for a full listing of individual contributors.
 *
 * This is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation; either version 2.1 of
 * the License, or (at your option) any later version.
 *
 * This software is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this software; if not, write to the Free
 * Software Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA
 * 02110-1301 USA, or see the FSF site: http://www.fsf.org.
 */

package org.jboss.dmr.client;

import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;

/**
 * @author <a href="mailto:david.lloyd@redhat.com">David M. Lloyd</a>
 */
final class BigDecimalModelValue extends ModelValue {

    private final BigDecimal value;

    BigDecimalModelValue(final BigDecimal value) {
        super(ModelType.BIG_DECIMAL);
        this.value = value;
    }

    BigDecimalModelValue(final DataInput in) throws IOException {
        super(ModelType.BIG_DECIMAL);
        value = new BigDecimal(in.readUTF());
    }

    @Override
    void writeExternal(final DataOutput out) throws IOException {
        final BigDecimal value = this.value;
        out.writeUTF(value.toString());
    }

    @Override
    long asLong() {
        return value.longValue();
    }

    @Override
    long asLong(final long defVal) {
        return value.longValue();
    }

    @Override
    int asInt() {
        return value.intValue();
    }

    @Override
    int asInt(final int defVal) {
        return value.intValue();
    }

    @Override
    boolean asBoolean() {
        return !value.equals(BigDecimal.ZERO);
    }

    @Override
    boolean asBoolean(final boolean defVal) {
        return !value.equals(BigDecimal.ZERO);
    }

    @Override
    double asDouble() {
        return value.doubleValue();
    }

    @Override
    double asDouble(final double defVal) {
        return value.doubleValue();
    }

    @Override
    BigDecimal asBigDecimal() {
        return value;
    }

    @Override
    BigInteger asBigInteger() {
        return value.toBigInteger();
    }

    @Override
    String asString() {
        return value.toString();
    }

    @Override
    void format(final StringBuilder target, final int indent, final boolean ignored) {
        target.append("big decimal ").append(value);
    }

    /**
     * Determine whether this object is equal to another.
     *
     * @param other the other object
     * @return {@code true} if they are equal, {@code false} otherwise
     */
    @Override
    public boolean equals(final Object other) {
        return other instanceof BigDecimalModelValue && equals((BigDecimalModelValue)other);
    }

    /**
     * Determine whether this object is equal to another.
     *
     * @param other the other object
     * @return {@code true} if they are equal, {@code false} otherwise
     */
    public boolean equals(final BigDecimalModelValue other) {
        return this == other || other != null && value.equals(other.value);
    }

    @Override
    public int hashCode() {
        return value.hashCode();
    }
}