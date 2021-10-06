// This is a generated file. Not intended for manual editing.
package generated;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import porokhin.bstruct.BasicTokenType;
import generated.psi.impl.*;

public interface GeneratedTypes {

  IElementType KEYWORD = new BasicTokenType("KEYWORD");
  IElementType SYMBOLUNIT = new BasicTokenType("SYMBOLUNIT");

  IElementType AS = new IElementType("as", null);
  IElementType DECLARE = new IElementType("declare", null);
  IElementType DIM = new IElementType("dim", null);
  IElementType END = new IElementType("end", null);
  IElementType EXIT = new IElementType("exit", null);
  IElementType ID = new IElementType("id", null);
  IElementType IF = new IElementType("if", null);
  IElementType INCLUDE = new IElementType("include", null);
  IElementType LEFT_BRACE = new IElementType("{", null);
  IElementType LEFT_BRACKET = new IElementType("[", null);
  IElementType LEFT_PAREN = new IElementType("(", null);
  IElementType LINE_COMMENT = new IElementType("line_comment", null);
  IElementType NUMBER = new IElementType("number", null);
  IElementType OP_AND = new IElementType("&", null);
  IElementType OP_EQ = new IElementType("=", null);
  IElementType OP_NOT = new IElementType("!", null);
  IElementType OP_ONEMORE = new IElementType("+", null);
  IElementType OP_OPT = new IElementType("?", null);
  IElementType OP_OR = new IElementType("|", null);
  IElementType OP_ZEROMORE = new IElementType("*", null);
  IElementType RIGHT_BRACE = new IElementType("}", null);
  IElementType RIGHT_BRACKET = new IElementType("]", null);
  IElementType RIGHT_PAREN = new IElementType(")", null);
  IElementType STRING = new IElementType("string", null);
  IElementType SUB = new IElementType("sub", null);
  IElementType T_INTEGER = new IElementType("integer", null);
  IElementType T_STRING = new IElementType("string", null);

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
      if (type == KEYWORD) {
        return new KeywordImpl(node);
      }
      else if (type == SYMBOLUNIT) {
        return new SymbolunitImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
