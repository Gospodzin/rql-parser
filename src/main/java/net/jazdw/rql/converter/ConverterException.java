/*
 * Copyright (C) 2015 Jared Wiltshire (http://jazdw.net).
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the GNU Lesser General Public License
 * (LGPL) version 3 which accompanies this distribution, and is available at
 * https://www.gnu.org/licenses/lgpl.txt
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 */

package net.jazdw.rql.converter;

/**
 * @author Jared Wiltshire
 */
public class ConverterException extends Exception {
    private static final long serialVersionUID = 1L;

    public ConverterException(String message) {
        super(message);
    }

    public ConverterException(Throwable cause) {
        super(cause);
    }
}
