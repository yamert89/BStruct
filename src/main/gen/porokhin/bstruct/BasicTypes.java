// This is a generated file. Not intended for manual editing.
package porokhin.bstruct;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import porokhin.bstruct.impl.*;

public interface BasicTypes {

  IElementType BODY = new BasicTokenType("BODY");
  IElementType CALL_FUNC = new BasicTokenType("CALL_FUNC");
  IElementType DECLARE_SUB = new BasicTokenType("DECLARE_SUB");
  IElementType DIM_VALUE = new BasicTokenType("DIM_VALUE");
  IElementType EXPR = new BasicTokenType("EXPR");
  IElementType INCLUDE = new BasicTokenType("INCLUDE");
  IElementType KEYWORD = new BasicTokenType("KEYWORD");
  IElementType PARAM = new BasicTokenType("PARAM");
  IElementType SYMBOL_UNIT = new BasicTokenType("SYMBOL_UNIT");
  IElementType TYPE = new BasicTokenType("TYPE");
  IElementType VALUE = new BasicTokenType("VALUE");
  IElementType VAL_INIT = new BasicTokenType("VAL_INIT");

  IElementType AS = new BasicTokenType("as");
  IElementType CALL = new BasicTokenType("call");
  IElementType DECLARE = new BasicTokenType("declare");
  IElementType DIM = new BasicTokenType("dim");
  IElementType END = new BasicTokenType("end");
  IElementType EXIT = new BasicTokenType("exit");
  IElementType FUNCTION = new BasicTokenType("function");
  IElementType IF = new BasicTokenType("if");
  IElementType INCLUDE1 = new BasicTokenType("INCLUDE");
  IElementType LEFT_BRACE = new BasicTokenType("{");
  IElementType LEFT_BRACKET = new BasicTokenType("[");
  IElementType LEFT_PAREN = new BasicTokenType("(");
  IElementType LINE_COMMENT = new BasicTokenType("LINE_COMMENT");
  IElementType NAME = new BasicTokenType("NAME");
  IElementType NUMBER = new BasicTokenType("NUMBER");
  IElementType OP_AND = new BasicTokenType("&");
  IElementType OP_EQ = new BasicTokenType("=");
  IElementType OP_NOT = new BasicTokenType("!");
  IElementType OP_ONEMORE = new BasicTokenType("+");
  IElementType OP_OPT = new BasicTokenType("?");
  IElementType OP_OR = new BasicTokenType("|");
  IElementType OP_ZEROMORE = new BasicTokenType("*");
  IElementType RIGHT_BRACE = new BasicTokenType("}");
  IElementType RIGHT_BRACKET = new BasicTokenType("]");
  IElementType RIGHT_PAREN = new BasicTokenType(")");
  IElementType STRING = new BasicTokenType("STRING");
  IElementType SUB = new BasicTokenType("sub");
  IElementType T_INTEGER = new BasicTokenType("T_INTEGER");
  IElementType T_STRING = new BasicTokenType("string");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
      if (type == BODY) {
        return new BasicBodyImpl(node);
      }
      else if (type == CALL_FUNC) {
        return new BasicCallFuncImpl(node);
      }
      else if (type == DECLARE_SUB) {
        return new BasicDeclareSubImpl(node);
      }
      else if (type == DIM_VALUE) {
        return new BasicDimValueImpl(node);
      }
      else if (type == EXPR) {
        return new BasicExprImpl(node);
      }
      else if (type == INCLUDE1) {
        return new BasicIncludeImpl(node);
      }
      else if (type == KEYWORD) {
        return new BasicKeywordImpl(node);
      }
      else if (type == PARAM) {
        return new BasicParamImpl(node);
      }
      else if (type == SYMBOL_UNIT) {
        return new BasicSymbolUnitImpl(node);
      }
      else if (type == TYPE) {
        return new BasicTypeImpl(node);
      }
      else if (type == VALUE) {
        return new BasicValueImpl(node);
      }
      else if (type == VAL_INIT) {
        return new BasicValInitImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
