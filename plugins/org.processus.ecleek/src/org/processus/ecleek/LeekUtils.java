package org.processus.ecleek;

import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.nodemodel.ICompositeNode;
import org.eclipse.xtext.nodemodel.ILeafNode;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;
import org.processus.ecleek.leek.FunctionCall;
import org.processus.ecleek.leek.FunctionDeclaration;
import org.processus.ecleek.leek.VariableDeclaration;

public final class LeekUtils {

	/**
	 * API file name.
	 */
	public static final String API_FILE = "api.leek";

	/**
	 * {@link Pattern} to extract number of cores needed for a
	 * {@link FunctionDeclaration}.
	 */
	public static final Pattern CORE_FROM_API_COMMENT = Pattern
			.compile("@cores (\\d)");

	/**
	 * Group index in {@link Pattern} to extract number of cores needed for a
	 * {@link FunctionDeclaration}.
	 */
	public static final int CORE_FROM_API_COMMENT_GROUP = 1;

	/**
	 * {@link Pattern} to extract level needed for a {@link FunctionDeclaration}
	 * .
	 */
	public static final Pattern LEVEL_FROM_API_COMMENT = Pattern
			.compile("@level (\\d)");

	/**
	 * Group index in {@link Pattern} to extract level needed for a
	 * {@link FunctionDeclaration}.
	 */
	public static final int LEVEL_FROM_API_COMMENT_GROUP = 1;

	/**
	 * Constructor.
	 */
	private LeekUtils() {
		// nothing to do here
	}

	/**
	 * Gets the comment for the given {@link FunctionDeclaration}.
	 * 
	 * @param declaration
	 *            the {@link FunctionDeclaration}
	 * @return the comment for the given {@link FunctionDeclaration} if any,
	 *         <code>null</code> otherwise
	 */
	public static String getComment(FunctionDeclaration declaration) {
		final String res;

		final ICompositeNode node = NodeModelUtils.getNode(declaration);
		if (node != null) {
			String comment = null;
			for (ILeafNode leaf : node.getLeafNodes()) {
				if (leaf.getText().startsWith("/*")) {
					comment = leaf.getText();
					break;
				}
			}
			res = comment;
		} else {
			res = null;
		}

		return res;
	}

	/**
	 * Gets the comment for the given {@link VariableDeclaration}.
	 * 
	 * @param declaration
	 *            the {@link FunctionDeclaration}
	 * @return the comment for the given {@link VariableDeclaration} if any,
	 *         <code>null</code> otherwise
	 */
	public static String getComment(VariableDeclaration declaration) {
		final String res;

		final ICompositeNode node = NodeModelUtils.getNode(declaration)
				.getParent().getParent();
		if (node != null) {
			String comment = null;
			for (ILeafNode leaf : node.getLeafNodes()) {
				if (leaf.getText().startsWith("/*")) {
					comment = leaf.getText();
					break;
				}
			}
			res = comment;
		} else {
			res = null;
		}

		return res;
	}

	/**
	 * Gets the number of cores needed for the given {@link FunctionDeclaration}
	 * .
	 * 
	 * @param declaration
	 *            the {@link FunctionDeclaration}
	 * @return the number of cores needed for the given
	 *         {@link FunctionDeclaration}
	 */
	public static int getNbCore(FunctionDeclaration declaration) {
		int res = 0;

		if (API_FILE.equals(declaration.eResource().getURI().lastSegment())) {
			final String comment = getComment(declaration);
			if (comment != null) {
				final Matcher matcher = CORE_FROM_API_COMMENT.matcher(comment);
				if (matcher.find()) {
					res = Integer.valueOf(matcher.group(CORE_FROM_API_COMMENT_GROUP)).intValue();
				} else {
					// TODO log missing @core in API
				}
			} else {
				// TODO log missing comment in API
			}
		} else {
			final Iterator<EObject> it = declaration.eAllContents();
			while (it.hasNext()) {
				EObject eObj = it.next();
				if (eObj instanceof FunctionCall) {
					res = Math.max(res,
							getNbCore(((FunctionCall) eObj).getFunction()));
				}
			}
		}

		return res;
	}

	/**
	 * Gets the level needed for the given {@link FunctionDeclaration} .
	 * 
	 * @param declaration
	 *            the {@link FunctionDeclaration}
	 * @return the level needed for the given {@link FunctionDeclaration}
	 */
	public static int getLevel(FunctionDeclaration declaration) {
		int res = 0;

		if (API_FILE.equals(declaration.eResource().getURI().lastSegment())) {
			final String comment = getComment(declaration);
			if (comment != null) {
				final Matcher matcher = LEVEL_FROM_API_COMMENT.matcher(comment);
				if (matcher.find()) {
					res = Integer.valueOf(matcher.group(LEVEL_FROM_API_COMMENT_GROUP)).intValue();
				} else {
					// TODO log missing @level in API
				}
			} else {
				// TODO log missing comment in API
			}
		} else {
			final Iterator<EObject> it = declaration.eAllContents();
			while (it.hasNext()) {
				EObject eObj = it.next();
				if (eObj instanceof FunctionCall) {
					res = Math.max(res,
							getLevel(((FunctionCall) eObj).getFunction()));
				}
			}
		}

		return res;
	}

}
