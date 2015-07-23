package org.kevoree.modeling.idea.structure;

import com.intellij.ide.structureView.StructureViewTreeElement;
import com.intellij.ide.util.treeView.smartTree.SortableTreeElement;
import com.intellij.ide.util.treeView.smartTree.TreeElement;
import com.intellij.navigation.ItemPresentation;
import com.intellij.openapi.editor.Editor;
import com.intellij.openapi.editor.ScrollType;
import com.intellij.util.PlatformIcons;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.kevoree.modeling.idea.psi.MetaModelAttributeDeclaration;
import org.kevoree.modeling.idea.psi.MetaModelInferWithDeclaration;

import javax.swing.*;

public class MetaModelStructureViewInferWithElement implements StructureViewTreeElement, SortableTreeElement {

    private MetaModelInferWithDeclaration attDecl;
    private Editor editor;
    private boolean id = false;
    private boolean contained = false;

    public MetaModelStructureViewInferWithElement(MetaModelInferWithDeclaration attDecl, Editor editor) {
        this.attDecl = attDecl;
        this.editor = editor;
    }

    public boolean isId() {
        return id;
    }

    public boolean isContained() {
        return contained;
    }

    @Override
    public Object getValue() {
        return attDecl;
    }

    @Override
    public void navigate(boolean b) {
        editor.getCaretModel().moveToOffset(attDecl.getTextOffset());
        editor.getScrollingModel().scrollToCaret(ScrollType.CENTER_UP);
    }


    @Override
    public boolean canNavigate() {
        return true;
    }

    @Override
    public boolean canNavigateToSource() {
        return true;
    }

    @NotNull
    @Override
    public ItemPresentation getPresentation() {
        return new ItemPresentation() {
            @Nullable
            @Override
            public String getPresentableText() {
                return attDecl.getText();
            }

            @Nullable
            @Override
            public String getLocationString() {
                return null;
            }

            @Nullable
            @Override
            public Icon getIcon(boolean b) {
                return PlatformIcons.ANALYZE;
            }
        };
    }

    @Override
    public TreeElement[] getChildren() {
        return EMPTY_ARRAY;
    }

    @NotNull
    @Override
    public String getAlphaSortKey() {
        return attDecl.getText();
    }
}
