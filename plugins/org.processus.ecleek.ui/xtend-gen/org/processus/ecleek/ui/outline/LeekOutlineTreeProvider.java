/**
 * generated by Xtext
 */
package org.processus.ecleek.ui.outline;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.ui.editor.outline.IOutlineNode;
import org.eclipse.xtext.ui.editor.outline.impl.DefaultOutlineTreeProvider;
import org.eclipse.xtext.ui.editor.outline.impl.DocumentRootNode;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;
import org.processus.ecleek.leek.FunctionDeclaration;
import org.processus.ecleek.leek.GlobalDeclaration;
import org.processus.ecleek.leek.LocalDeclaration;
import org.processus.ecleek.leek.Script;
import org.processus.ecleek.leek.Statement;
import org.processus.ecleek.leek.VariableDeclaration;

/**
 * Customization of the default outline structure.
 * 
 * see http://www.eclipse.org/Xtext/documentation.html#outline
 */
@SuppressWarnings("all")
public class LeekOutlineTreeProvider extends DefaultOutlineTreeProvider {
  public void _createChildren(final DocumentRootNode parentNode, final Script script) {
    EList<Statement> _statements = script.getStatements();
    for (final Statement statement : _statements) {
      if ((statement instanceof FunctionDeclaration)) {
        this.createNode(parentNode, statement);
      } else {
        if ((statement instanceof GlobalDeclaration)) {
          EList<VariableDeclaration> _variables = ((GlobalDeclaration)statement).getVariables();
          for (final VariableDeclaration variable : _variables) {
            this.createNode(parentNode, variable);
          }
        } else {
          if ((statement instanceof LocalDeclaration)) {
            EList<VariableDeclaration> _variables_1 = ((LocalDeclaration)statement).getVariables();
            for (final VariableDeclaration variable_1 : _variables_1) {
              this.createNode(parentNode, variable_1);
            }
          }
        }
      }
    }
  }
  
  public void _createChildren(final IOutlineNode parentNode, final FunctionDeclaration function) {
    TreeIterator<EObject> _eAllContents = function.eAllContents();
    Iterable<EObject> _iterable = IteratorExtensions.<EObject>toIterable(_eAllContents);
    for (final EObject eObj : _iterable) {
      if ((eObj instanceof LocalDeclaration)) {
        EList<VariableDeclaration> _variables = ((LocalDeclaration)eObj).getVariables();
        for (final VariableDeclaration variable : _variables) {
          this.createNode(parentNode, variable);
        }
      }
    }
  }
  
  public boolean _isLeaf(final VariableDeclaration modelElement) {
    return true;
  }
}
