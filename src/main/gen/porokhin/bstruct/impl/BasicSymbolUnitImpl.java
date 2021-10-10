// This is a generated file. Not intended for manual editing.
package porokhin.bstruct.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static porokhin.bstruct.BasicTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import porokhin.bstruct.psi.*;

public class BasicSymbolUnitImpl extends ASTWrapperPsiElement implements BasicSymbolUnit {

  public BasicSymbolUnitImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull BasicVisitor visitor) {
    visitor.visitSymbolUnit(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof BasicVisitor) accept((BasicVisitor)visitor);
    else super.accept(visitor);
  }

}
