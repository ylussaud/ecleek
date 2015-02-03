package org.processus.ecleek;

import org.eclipse.xtext.nodemodel.ICompositeNode;
import org.eclipse.xtext.nodemodel.ILeafNode;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;
import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;
import org.processus.ecleek.leek.FunctionDeclaration;
import org.processus.ecleek.leek.VariableDeclaration;

public final class LeekUtils {

	private LeekUtils() {
		// nothing to do here
	}

	public static String getComment(FunctionDeclaration declaration) {
		final String res;

		final ICompositeNode node = NodeModelUtils.getNode(declaration);
		if (node != null) {
			String comment = null;
			for (ILeafNode leaf : node.getLeafNodes()) {
				if (leaf.getText().startsWith("/*")) {
					comment  = leaf.getText();
					break;
				}
			}
			res = comment;
		} else {
			res = null;
		}

		return res;
	}

	public static String getComment(VariableDeclaration declaration) {
		final String res;

		final ICompositeNode node = NodeModelUtils.getNode(declaration).getParent().getParent();
		if (node != null) {
			String comment = null;
			for (ILeafNode leaf : node.getLeafNodes()) {
				if (leaf.getText().startsWith("/*")) {
					comment  = leaf.getText();
					break;
				}
			}
			res = comment;
		} else {
			res = null;
		}

		return res;
	}

}
