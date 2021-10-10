// This is a generated file. Not intended for manual editing.
package porokhin.bstruct;

import com.intellij.lang.PsiBuilder;
import com.intellij.lang.PsiBuilder.Marker;

import static com.intellij.lang.parser.GeneratedParserUtilBase.*;
import static porokhin.bstruct.BasicTypes.*;
import com.intellij.psi.tree.IElementType;
import com.intellij.lang.ASTNode;
import com.intellij.lang.PsiParser;
import com.intellij.lang.LightPsiParser;

@SuppressWarnings({"SimplifiableIfStatement", "UnusedAssignment"})
public class BasicParser implements PsiParser, LightPsiParser {

  public ASTNode parse(IElementType t, PsiBuilder b) {
    parseLight(t, b);
    return b.getTreeBuilt();
  }

  public void parseLight(IElementType t, PsiBuilder b) {
    boolean r;
    b = adapt_builder_(t, b, this, null);
    Marker m = enter_section_(b, 0, _COLLAPSE_, null);
    r = parse_root_(t, b);
    exit_section_(b, 0, m, t, r, true, TRUE_CONDITION);
  }

  protected boolean parse_root_(IElementType t, PsiBuilder b) {
    return parse_root_(t, b, 0);
  }

  static boolean parse_root_(IElementType t, PsiBuilder b, int l) {
    return basicUnit(b, l + 1);
  }

  /* ********************************************************** */
  // top*
  static boolean basicUnit(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "basicUnit")) return false;
    while (true) {
      int c = current_position_(b);
      if (!top(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "basicUnit", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // expr *
  public static boolean body(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "body")) return false;
    Marker m = enter_section_(b, l, _NONE_, BODY, "<body>");
    while (true) {
      int c = current_position_(b);
      if (!expr(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "body", c)) break;
    }
    exit_section_(b, l, m, true, false, null);
    return true;
  }

  /* ********************************************************** */
  // CALL (FUNCTION | SUB)
  public static boolean call_func(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "call_func")) return false;
    if (!nextTokenIs(b, CALL)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, CALL);
    r = r && call_func_1(b, l + 1);
    exit_section_(b, m, CALL_FUNC, r);
    return r;
  }

  // FUNCTION | SUB
  private static boolean call_func_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "call_func_1")) return false;
    boolean r;
    r = consumeToken(b, FUNCTION);
    if (!r) r = consumeToken(b, SUB);
    return r;
  }

  /* ********************************************************** */
  // DECLARE SUB NAME [LEFT_PAREN param+ RIGHT_PAREN] body END SUB
  public static boolean declare_sub(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "declare_sub")) return false;
    if (!nextTokenIs(b, DECLARE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, DECLARE, SUB, NAME);
    r = r && declare_sub_3(b, l + 1);
    r = r && body(b, l + 1);
    r = r && consumeTokens(b, 0, END, SUB);
    exit_section_(b, m, DECLARE_SUB, r);
    return r;
  }

  // [LEFT_PAREN param+ RIGHT_PAREN]
  private static boolean declare_sub_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "declare_sub_3")) return false;
    declare_sub_3_0(b, l + 1);
    return true;
  }

  // LEFT_PAREN param+ RIGHT_PAREN
  private static boolean declare_sub_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "declare_sub_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LEFT_PAREN);
    r = r && declare_sub_3_0_1(b, l + 1);
    r = r && consumeToken(b, RIGHT_PAREN);
    exit_section_(b, m, null, r);
    return r;
  }

  // param+
  private static boolean declare_sub_3_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "declare_sub_3_0_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = param(b, l + 1);
    while (r) {
      int c = current_position_(b);
      if (!param(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "declare_sub_3_0_1", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // DIM param
  public static boolean dim_value(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "dim_value")) return false;
    if (!nextTokenIs(b, DIM)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, DIM);
    r = r && param(b, l + 1);
    exit_section_(b, m, DIM_VALUE, r);
    return r;
  }

  /* ********************************************************** */
  // dim_value | val_init | call_func
  public static boolean expr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expr")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, EXPR, "<expr>");
    r = dim_value(b, l + 1);
    if (!r) r = val_init(b, l + 1);
    if (!r) r = call_func(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // INCLUDE
  public static boolean include(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "include")) return false;
    if (!nextTokenIs(b, INCLUDE1)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, INCLUDE1);
    exit_section_(b, m, INCLUDE1, r);
    return r;
  }

  /* ********************************************************** */
  // declare_sub | include
  public static boolean keyword(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "keyword")) return false;
    if (!nextTokenIs(b, "<keyword>", DECLARE, INCLUDE1)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, KEYWORD, "<keyword>");
    r = declare_sub(b, l + 1);
    if (!r) r = include(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // NAME AS type
  public static boolean param(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "param")) return false;
    if (!nextTokenIs(b, NAME)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, NAME, AS);
    r = r && type(b, l + 1);
    exit_section_(b, m, PARAM, r);
    return r;
  }

  /* ********************************************************** */
  // OP_EQ | OP_OR | OP_AND | LEFT_BRACKET | RIGHT_BRACKET | LEFT_PAREN | RIGHT_PAREN
  public static boolean symbol_unit(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "symbol_unit")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, SYMBOL_UNIT, "<symbol unit>");
    r = consumeToken(b, OP_EQ);
    if (!r) r = consumeToken(b, OP_OR);
    if (!r) r = consumeToken(b, OP_AND);
    if (!r) r = consumeToken(b, LEFT_BRACKET);
    if (!r) r = consumeToken(b, RIGHT_BRACKET);
    if (!r) r = consumeToken(b, LEFT_PAREN);
    if (!r) r = consumeToken(b, RIGHT_PAREN);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // keyword | symbol_unit | expr | LINE_COMMENT
  static boolean top(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "top")) return false;
    boolean r;
    r = keyword(b, l + 1);
    if (!r) r = symbol_unit(b, l + 1);
    if (!r) r = expr(b, l + 1);
    if (!r) r = consumeToken(b, LINE_COMMENT);
    return r;
  }

  /* ********************************************************** */
  // T_INTEGER | T_STRING
  public static boolean type(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type")) return false;
    if (!nextTokenIs(b, "<type>", T_INTEGER, T_STRING)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, TYPE, "<type>");
    r = consumeToken(b, T_INTEGER);
    if (!r) r = consumeToken(b, T_STRING);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // NAME OP_EQ value
  public static boolean val_init(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "val_init")) return false;
    if (!nextTokenIs(b, NAME)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, NAME, OP_EQ);
    r = r && value(b, l + 1);
    exit_section_(b, m, VAL_INIT, r);
    return r;
  }

  /* ********************************************************** */
  // "regexp:\d+" | STRING
  public static boolean value(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "value")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, VALUE, "<value>");
    r = consumeToken(b, "regexp:\\d+");
    if (!r) r = consumeToken(b, STRING);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

}
