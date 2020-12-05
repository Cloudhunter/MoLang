package com.bedrockk.molang.parser.expression.binaryop;

import com.bedrockk.molang.parser.Expression;
import com.bedrockk.molang.parser.expression.BinaryOpExpression;
import com.bedrockk.molang.runtime.MoLangEnvironment;
import com.bedrockk.molang.runtime.MoScope;
import com.bedrockk.molang.runtime.value.DoubleValue;
import com.bedrockk.molang.runtime.value.MoValue;

public class GreaterExpression extends BinaryOpExpression {

    public GreaterExpression(Expression left, Expression right) {
        super(left, right);
    }

    @Override
    public String getSigil() {
        return ">";
    }

    @Override
    public MoValue evaluate(MoScope scope, MoLangEnvironment environment) {
        return new DoubleValue(left.evaluate(scope, environment).asDouble() > right.evaluate(scope, environment).asDouble());
    }
}