/*******************************************************************************
 * Copyright (c) 2017 the TeXlipse team and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     The TeXlipse team - initial API and implementation
 *******************************************************************************/
/* This file was generated by SableCC (http://www.sablecc.org/). */

package org.eclipse.texlipse.texparser.node;

import org.eclipse.texlipse.texparser.analysis.*;

@SuppressWarnings("nls")
public final class TStar extends Token
{
    public TStar()
    {
        super.setText("*");
    }

    public TStar(int line, int pos)
    {
        super.setText("*");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TStar(getLine(), getPos());
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTStar(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TStar text.");
    }
}