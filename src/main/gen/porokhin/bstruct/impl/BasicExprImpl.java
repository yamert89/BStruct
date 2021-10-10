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

public class BasicExprImpl extends ASTWrapperPsiElement implements BasicExpr {

  public BasicExprImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull BasicVisitor visitor) {
    visitor.visitExpr(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof BasicVisitor) accept((BasicVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public BasicCallFunc getCallFunc() {
    return findChildByClass(BasicCallFunc.class);
  }

  @Override
  @Nullable
  public BasicDimValue getDimValue() {
    return findChildByClass(BasicDimValue.class);
  }

  @Override
  @Nullable
  public BasicValInit getValInit() {
    return findChildByClass(BasicValInit.class);
  }

}
