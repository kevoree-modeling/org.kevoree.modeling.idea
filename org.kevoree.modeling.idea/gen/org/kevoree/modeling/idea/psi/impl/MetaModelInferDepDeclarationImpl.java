// This is a generated file. Not intended for manual editing.
package org.kevoree.modeling.idea.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static org.kevoree.modeling.idea.psi.MetaModelTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import org.kevoree.modeling.idea.psi.*;

public class MetaModelInferDepDeclarationImpl extends ASTWrapperPsiElement implements MetaModelInferDepDeclaration {

  public MetaModelInferDepDeclarationImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof MetaModelVisitor) ((MetaModelVisitor)visitor).visitInferDepDeclaration(this);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public MetaModelInferDepTimeDecl getInferDepTimeDecl() {
    return findChildByClass(MetaModelInferDepTimeDecl.class);
  }

  @Override
  @Nullable
  public MetaModelMultiplicityDeclaration getMultiplicityDeclaration() {
    return findChildByClass(MetaModelMultiplicityDeclaration.class);
  }

  @Override
  @NotNull
  public MetaModelTypeDeclaration getTypeDeclaration() {
    return findNotNullChildByClass(MetaModelTypeDeclaration.class);
  }

  @Override
  @NotNull
  public PsiElement getIdent() {
    return findNotNullChildByType(IDENT);
  }

}