package org.processus.ecleek.serializer;

import com.google.inject.Inject;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AlternativeAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;
import org.processus.ecleek.services.LeekGrammarAccess;

@SuppressWarnings("all")
public class LeekSyntacticSequencer extends AbstractSyntacticSequencer {

	protected LeekGrammarAccess grammarAccess;
	protected AbstractElementAlias match_And_AmpersandAmpersandKeyword_1_0_1_1_or_AndKeyword_1_0_1_0;
	protected AbstractElementAlias match_Or_OrKeyword_1_0_1_0_or_VerticalLineVerticalLineKeyword_1_0_1_1;
	protected AbstractElementAlias match_PrimaryExpression_LeftParenthesisKeyword_0_0_a;
	protected AbstractElementAlias match_PrimaryExpression_LeftParenthesisKeyword_0_0_p;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (LeekGrammarAccess) access;
		match_And_AmpersandAmpersandKeyword_1_0_1_1_or_AndKeyword_1_0_1_0 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getAndAccess().getAmpersandAmpersandKeyword_1_0_1_1()), new TokenAlias(false, false, grammarAccess.getAndAccess().getAndKeyword_1_0_1_0()));
		match_Or_OrKeyword_1_0_1_0_or_VerticalLineVerticalLineKeyword_1_0_1_1 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getOrAccess().getOrKeyword_1_0_1_0()), new TokenAlias(false, false, grammarAccess.getOrAccess().getVerticalLineVerticalLineKeyword_1_0_1_1()));
		match_PrimaryExpression_LeftParenthesisKeyword_0_0_a = new TokenAlias(true, true, grammarAccess.getPrimaryExpressionAccess().getLeftParenthesisKeyword_0_0());
		match_PrimaryExpression_LeftParenthesisKeyword_0_0_p = new TokenAlias(true, false, grammarAccess.getPrimaryExpressionAccess().getLeftParenthesisKeyword_0_0());
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		return "";
	}
	
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if(match_And_AmpersandAmpersandKeyword_1_0_1_1_or_AndKeyword_1_0_1_0.equals(syntax))
				emit_And_AmpersandAmpersandKeyword_1_0_1_1_or_AndKeyword_1_0_1_0(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Or_OrKeyword_1_0_1_0_or_VerticalLineVerticalLineKeyword_1_0_1_1.equals(syntax))
				emit_Or_OrKeyword_1_0_1_0_or_VerticalLineVerticalLineKeyword_1_0_1_1(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_PrimaryExpression_LeftParenthesisKeyword_0_0_a.equals(syntax))
				emit_PrimaryExpression_LeftParenthesisKeyword_0_0_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_PrimaryExpression_LeftParenthesisKeyword_0_0_p.equals(syntax))
				emit_PrimaryExpression_LeftParenthesisKeyword_0_0_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Syntax:
	 *     'and' | '&&'
	 */
	protected void emit_And_AmpersandAmpersandKeyword_1_0_1_1_or_AndKeyword_1_0_1_0(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'or' | '||'
	 */
	protected void emit_Or_OrKeyword_1_0_1_0_or_VerticalLineVerticalLineKeyword_1_0_1_1(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     '('*
	 */
	protected void emit_PrimaryExpression_LeftParenthesisKeyword_0_0_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     '('+
	 */
	protected void emit_PrimaryExpression_LeftParenthesisKeyword_0_0_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
