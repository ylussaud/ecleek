package org.processus.ecleek.ui;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.documentation.IEObjectDocumentationProvider;
import org.processus.ecleek.LeekUtils;
import org.processus.ecleek.leek.FunctionDeclaration;
import org.processus.ecleek.leek.VariableDeclaration;

public class LeekEObjectDocumentationProvider implements
		IEObjectDocumentationProvider {

	@Override
	public String getDocumentation(EObject o) {
		final String res;

		if (o instanceof FunctionDeclaration) {
			res = format(LeekUtils.getComment((FunctionDeclaration) o));
		} else if (o instanceof VariableDeclaration) {
			res = format(LeekUtils.getComment((VariableDeclaration) o));
		} else {
			res = null;
		}

		return res;
	}

	private String format(String comment) {
		String res;

		if (comment != null) {
			res = comment.replaceAll("\n", "<br>");
		} else {
			res = null;
		}

		return res;
	}
}
