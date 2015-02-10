package org.processus.ecleek.ui;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.ui.editor.hover.html.DefaultEObjectHoverProvider;
import org.processus.ecleek.LeekUtils;
import org.processus.ecleek.leek.FunctionDeclaration;

public class LeekEObjectHoverProvider extends DefaultEObjectHoverProvider {

	@Override
	protected String getFirstLine(EObject o) {
		final String res;

		if (o instanceof FunctionDeclaration) {
			final int core = LeekUtils.getNbCore((FunctionDeclaration) o);
			final int level = LeekUtils.getLevel((FunctionDeclaration) o);
			res = "<b>" + ((FunctionDeclaration) o).getName()
					+ "</b> (level <b>" + level + "</b> core <b>" + core
					+ "</b>)";
		} else {
			res = super.getFirstLine(o);
		}

		return res;
	}

}
