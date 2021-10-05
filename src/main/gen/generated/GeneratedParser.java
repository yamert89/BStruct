// This is a generated file. Not intended for manual editing.
package generated;

import com.intellij.lang.PsiBuilder;
import com.intellij.lang.PsiBuilder.Marker;
import static generated.GeneratedTypes.*;
import static com.intellij.lang.parser.GeneratedParserUtilBase.*;
import com.intellij.psi.tree.IElementType;
import com.intellij.lang.ASTNode;
import com.intellij.psi.tree.TokenSet;
import com.intellij.lang.PsiParser;
import com.intellij.lang.LightPsiParser;

@SuppressWarnings({"SimplifiableIfStatement", "UnusedAssignment"})
public class GeneratedParser implements PsiParser, LightPsiParser {

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
  // DIM | SUB | DECLARE
  public static boolean keyword(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "keyword")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, KEYWORD, "<keyword>");
    r = consumeToken(b, DIM);
    if (!r) r = consumeToken(b, SUB);
    if (!r) r = consumeToken(b, DECLARE);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // OP_EQ | OP_OR | OP_AND
  public static boolean symbolunit(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "symbolunit")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, SYMBOLUNIT, "<symbolunit>");
    r = consumeToken(b, OP_EQ);
    if (!r) r = consumeToken(b, OP_OR);
    if (!r) r = consumeToken(b, OP_AND);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // keyword | symbolunit
  static boolean top(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "top")) return false;
    boolean r;
    r = keyword(b, l + 1);
    if (!r) r = symbolunit(b, l + 1);
    return r;
  }

}
