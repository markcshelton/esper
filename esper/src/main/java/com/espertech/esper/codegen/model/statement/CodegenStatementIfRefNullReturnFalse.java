/*
 ***************************************************************************************
 *  Copyright (C) 2006 EsperTech, Inc. All rights reserved.                            *
 *  http://www.espertech.com/esper                                                     *
 *  http://www.espertech.com                                                           *
 *  ---------------------------------------------------------------------------------- *
 *  The software in this package is published under the terms of the GPL license       *
 *  a copy of which has been included with this distribution in the license.txt file.  *
 ***************************************************************************************
 */
package com.espertech.esper.codegen.model.statement;

import com.espertech.esper.codegen.core.CodegenIndent;

import java.util.Map;
import java.util.Set;

public class CodegenStatementIfRefNullReturnFalse implements CodegenStatement {

    private final String var;

    public CodegenStatementIfRefNullReturnFalse(String var) {
        this.var = var;
    }

    public void render(StringBuilder builder, Map<Class, String> imports, boolean isInnerClass, int level, CodegenIndent indent) {
        builder.append("if (").append(var).append("== null) { return false;}\n");
    }

    public void mergeClasses(Set<Class> classes) {
    }
}
