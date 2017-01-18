package com.github.javaparser.metamodel;

import java.util.Optional;

public class ThisExprMetaModel extends ClassMetaModel {

    ThisExprMetaModel(JavaParserMetaModel parent, Optional<ClassMetaModel> superClassMetaModel) {
        super(superClassMetaModel, parent, com.github.javaparser.ast.expr.ThisExpr.class, "ThisExpr", "com.github.javaparser.ast.expr.ThisExpr", "com.github.javaparser.ast.expr", false);
        fieldMetaModels.add(new FieldMetaModel(this, "getClassExpr", "setClassExpr", "classExpr", int.class, null, true, true, false, false));
    }
}

