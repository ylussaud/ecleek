package org.processus.ecleek.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import org.processus.ecleek.leek.Affectation;
import org.processus.ecleek.leek.AffectationDecrement;
import org.processus.ecleek.leek.AffectationIncrement;
import org.processus.ecleek.leek.And;
import org.processus.ecleek.leek.ArrayLiteral;
import org.processus.ecleek.leek.BreakStatement;
import org.processus.ecleek.leek.Comparison;
import org.processus.ecleek.leek.ContinueStatement;
import org.processus.ecleek.leek.Different;
import org.processus.ecleek.leek.Div;
import org.processus.ecleek.leek.EmptyStatement;
import org.processus.ecleek.leek.Equals;
import org.processus.ecleek.leek.FalseLiteral;
import org.processus.ecleek.leek.For;
import org.processus.ecleek.leek.ForIn;
import org.processus.ecleek.leek.FunctionCall;
import org.processus.ecleek.leek.FunctionDeclaration;
import org.processus.ecleek.leek.GlobalDeclaration;
import org.processus.ecleek.leek.If;
import org.processus.ecleek.leek.Include;
import org.processus.ecleek.leek.IntLiteral;
import org.processus.ecleek.leek.LeekPackage;
import org.processus.ecleek.leek.Less;
import org.processus.ecleek.leek.LessOrEquals;
import org.processus.ecleek.leek.LocalDeclaration;
import org.processus.ecleek.leek.Minus;
import org.processus.ecleek.leek.More;
import org.processus.ecleek.leek.MoreOrEquals;
import org.processus.ecleek.leek.Multi;
import org.processus.ecleek.leek.Not;
import org.processus.ecleek.leek.NullLiteral;
import org.processus.ecleek.leek.Or;
import org.processus.ecleek.leek.Plus;
import org.processus.ecleek.leek.PostfixDecrement;
import org.processus.ecleek.leek.PostfixIncrement;
import org.processus.ecleek.leek.PrefixDecrement;
import org.processus.ecleek.leek.PrefixIncrement;
import org.processus.ecleek.leek.RealLiteral;
import org.processus.ecleek.leek.ReturnStatement;
import org.processus.ecleek.leek.Script;
import org.processus.ecleek.leek.StatementBlock;
import org.processus.ecleek.leek.StringLiteral;
import org.processus.ecleek.leek.TernaryIf;
import org.processus.ecleek.leek.TrueLiteral;
import org.processus.ecleek.leek.TypedDifferent;
import org.processus.ecleek.leek.UnitaryMinus;
import org.processus.ecleek.leek.VariableDeclaration;
import org.processus.ecleek.leek.VariableReference;
import org.processus.ecleek.leek.While;
import org.processus.ecleek.services.LeekGrammarAccess;

@SuppressWarnings("all")
public class LeekSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private LeekGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == LeekPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case LeekPackage.AFFECTATION:
				if(context == grammarAccess.getAffectationRule() ||
				   context == grammarAccess.getAffectationStatementRule() ||
				   context == grammarAccess.getForAffectationRule() ||
				   context == grammarAccess.getForInitializerRule() ||
				   context == grammarAccess.getIfConditionRule() ||
				   context == grammarAccess.getStatementRule()) {
					sequence_Affectation(context, (Affectation) semanticObject); 
					return; 
				}
				else break;
			case LeekPackage.AFFECTATION_DECREMENT:
				if(context == grammarAccess.getAffectationDecrementRule() ||
				   context == grammarAccess.getAffectationStatementRule() ||
				   context == grammarAccess.getStatementRule()) {
					sequence_AffectationDecrement(context, (AffectationDecrement) semanticObject); 
					return; 
				}
				else break;
			case LeekPackage.AFFECTATION_INCREMENT:
				if(context == grammarAccess.getAffectationIncrementRule() ||
				   context == grammarAccess.getAffectationStatementRule() ||
				   context == grammarAccess.getStatementRule()) {
					sequence_AffectationIncrement(context, (AffectationIncrement) semanticObject); 
					return; 
				}
				else break;
			case LeekPackage.AND:
				if(context == grammarAccess.getAdditionRule() ||
				   context == grammarAccess.getAdditionAccess().getMinusLeftAction_1_0_1_0() ||
				   context == grammarAccess.getAdditionAccess().getPlusLeftAction_1_0_0_0() ||
				   context == grammarAccess.getAndRule() ||
				   context == grammarAccess.getAndAccess().getAndLeftAction_1_0_0() ||
				   context == grammarAccess.getComparisonRule() ||
				   context == grammarAccess.getComparisonAccess().getComparisonLeftAction_1_0_0_0() ||
				   context == grammarAccess.getComparisonAccess().getDifferentLeftAction_1_0_3_0() ||
				   context == grammarAccess.getComparisonAccess().getEqualsLeftAction_1_0_1_0() ||
				   context == grammarAccess.getComparisonAccess().getLessOrEqualsLeftAction_1_0_4_0() ||
				   context == grammarAccess.getComparisonAccess().getLessLeftAction_1_0_5_0() ||
				   context == grammarAccess.getComparisonAccess().getMoreOrEqualsLeftAction_1_0_6_0() ||
				   context == grammarAccess.getComparisonAccess().getMoreLeftAction_1_0_7_0() ||
				   context == grammarAccess.getComparisonAccess().getTypedDifferentLeftAction_1_0_2_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getForAffectationRule() ||
				   context == grammarAccess.getIfConditionRule() ||
				   context == grammarAccess.getMultiplicationRule() ||
				   context == grammarAccess.getMultiplicationAccess().getDivLeftAction_1_0_1_0() ||
				   context == grammarAccess.getMultiplicationAccess().getMultiLeftAction_1_0_0_0() ||
				   context == grammarAccess.getOrRule() ||
				   context == grammarAccess.getOrAccess().getOrLeftAction_1_0_0() ||
				   context == grammarAccess.getPrimaryExpressionRule() ||
				   context == grammarAccess.getTernaryIfRule() ||
				   context == grammarAccess.getTernaryIfAccess().getTernaryIfLeftAction_1_0()) {
					sequence_And(context, (And) semanticObject); 
					return; 
				}
				else break;
			case LeekPackage.ARRAY_LITERAL:
				if(context == grammarAccess.getAdditionRule() ||
				   context == grammarAccess.getAdditionAccess().getMinusLeftAction_1_0_1_0() ||
				   context == grammarAccess.getAdditionAccess().getPlusLeftAction_1_0_0_0() ||
				   context == grammarAccess.getAndRule() ||
				   context == grammarAccess.getAndAccess().getAndLeftAction_1_0_0() ||
				   context == grammarAccess.getArrayLiteralRule() ||
				   context == grammarAccess.getComparisonRule() ||
				   context == grammarAccess.getComparisonAccess().getComparisonLeftAction_1_0_0_0() ||
				   context == grammarAccess.getComparisonAccess().getDifferentLeftAction_1_0_3_0() ||
				   context == grammarAccess.getComparisonAccess().getEqualsLeftAction_1_0_1_0() ||
				   context == grammarAccess.getComparisonAccess().getLessOrEqualsLeftAction_1_0_4_0() ||
				   context == grammarAccess.getComparisonAccess().getLessLeftAction_1_0_5_0() ||
				   context == grammarAccess.getComparisonAccess().getMoreOrEqualsLeftAction_1_0_6_0() ||
				   context == grammarAccess.getComparisonAccess().getMoreLeftAction_1_0_7_0() ||
				   context == grammarAccess.getComparisonAccess().getTypedDifferentLeftAction_1_0_2_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getForAffectationRule() ||
				   context == grammarAccess.getIfConditionRule() ||
				   context == grammarAccess.getMultiplicationRule() ||
				   context == grammarAccess.getMultiplicationAccess().getDivLeftAction_1_0_1_0() ||
				   context == grammarAccess.getMultiplicationAccess().getMultiLeftAction_1_0_0_0() ||
				   context == grammarAccess.getOrRule() ||
				   context == grammarAccess.getOrAccess().getOrLeftAction_1_0_0() ||
				   context == grammarAccess.getPrimaryExpressionRule() ||
				   context == grammarAccess.getTernaryIfRule() ||
				   context == grammarAccess.getTernaryIfAccess().getTernaryIfLeftAction_1_0()) {
					sequence_ArrayLiteral(context, (ArrayLiteral) semanticObject); 
					return; 
				}
				else break;
			case LeekPackage.BREAK_STATEMENT:
				if(context == grammarAccess.getBreakStatementRule() ||
				   context == grammarAccess.getStatementRule()) {
					sequence_BreakStatement(context, (BreakStatement) semanticObject); 
					return; 
				}
				else break;
			case LeekPackage.COMPARISON:
				if(context == grammarAccess.getAdditionRule() ||
				   context == grammarAccess.getAdditionAccess().getMinusLeftAction_1_0_1_0() ||
				   context == grammarAccess.getAdditionAccess().getPlusLeftAction_1_0_0_0() ||
				   context == grammarAccess.getAndRule() ||
				   context == grammarAccess.getAndAccess().getAndLeftAction_1_0_0() ||
				   context == grammarAccess.getComparisonRule() ||
				   context == grammarAccess.getComparisonAccess().getComparisonLeftAction_1_0_0_0() ||
				   context == grammarAccess.getComparisonAccess().getDifferentLeftAction_1_0_3_0() ||
				   context == grammarAccess.getComparisonAccess().getEqualsLeftAction_1_0_1_0() ||
				   context == grammarAccess.getComparisonAccess().getLessOrEqualsLeftAction_1_0_4_0() ||
				   context == grammarAccess.getComparisonAccess().getLessLeftAction_1_0_5_0() ||
				   context == grammarAccess.getComparisonAccess().getMoreOrEqualsLeftAction_1_0_6_0() ||
				   context == grammarAccess.getComparisonAccess().getMoreLeftAction_1_0_7_0() ||
				   context == grammarAccess.getComparisonAccess().getTypedDifferentLeftAction_1_0_2_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getForAffectationRule() ||
				   context == grammarAccess.getIfConditionRule() ||
				   context == grammarAccess.getMultiplicationRule() ||
				   context == grammarAccess.getMultiplicationAccess().getDivLeftAction_1_0_1_0() ||
				   context == grammarAccess.getMultiplicationAccess().getMultiLeftAction_1_0_0_0() ||
				   context == grammarAccess.getOrRule() ||
				   context == grammarAccess.getOrAccess().getOrLeftAction_1_0_0() ||
				   context == grammarAccess.getPrimaryExpressionRule() ||
				   context == grammarAccess.getTernaryIfRule() ||
				   context == grammarAccess.getTernaryIfAccess().getTernaryIfLeftAction_1_0()) {
					sequence_Comparison(context, (Comparison) semanticObject); 
					return; 
				}
				else break;
			case LeekPackage.CONTINUE_STATEMENT:
				if(context == grammarAccess.getContinueStatementRule() ||
				   context == grammarAccess.getStatementRule()) {
					sequence_ContinueStatement(context, (ContinueStatement) semanticObject); 
					return; 
				}
				else break;
			case LeekPackage.DIFFERENT:
				if(context == grammarAccess.getAdditionRule() ||
				   context == grammarAccess.getAdditionAccess().getMinusLeftAction_1_0_1_0() ||
				   context == grammarAccess.getAdditionAccess().getPlusLeftAction_1_0_0_0() ||
				   context == grammarAccess.getAndRule() ||
				   context == grammarAccess.getAndAccess().getAndLeftAction_1_0_0() ||
				   context == grammarAccess.getComparisonRule() ||
				   context == grammarAccess.getComparisonAccess().getComparisonLeftAction_1_0_0_0() ||
				   context == grammarAccess.getComparisonAccess().getDifferentLeftAction_1_0_3_0() ||
				   context == grammarAccess.getComparisonAccess().getEqualsLeftAction_1_0_1_0() ||
				   context == grammarAccess.getComparisonAccess().getLessOrEqualsLeftAction_1_0_4_0() ||
				   context == grammarAccess.getComparisonAccess().getLessLeftAction_1_0_5_0() ||
				   context == grammarAccess.getComparisonAccess().getMoreOrEqualsLeftAction_1_0_6_0() ||
				   context == grammarAccess.getComparisonAccess().getMoreLeftAction_1_0_7_0() ||
				   context == grammarAccess.getComparisonAccess().getTypedDifferentLeftAction_1_0_2_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getForAffectationRule() ||
				   context == grammarAccess.getIfConditionRule() ||
				   context == grammarAccess.getMultiplicationRule() ||
				   context == grammarAccess.getMultiplicationAccess().getDivLeftAction_1_0_1_0() ||
				   context == grammarAccess.getMultiplicationAccess().getMultiLeftAction_1_0_0_0() ||
				   context == grammarAccess.getOrRule() ||
				   context == grammarAccess.getOrAccess().getOrLeftAction_1_0_0() ||
				   context == grammarAccess.getPrimaryExpressionRule() ||
				   context == grammarAccess.getTernaryIfRule() ||
				   context == grammarAccess.getTernaryIfAccess().getTernaryIfLeftAction_1_0()) {
					sequence_Comparison(context, (Different) semanticObject); 
					return; 
				}
				else break;
			case LeekPackage.DIV:
				if(context == grammarAccess.getAdditionRule() ||
				   context == grammarAccess.getAdditionAccess().getMinusLeftAction_1_0_1_0() ||
				   context == grammarAccess.getAdditionAccess().getPlusLeftAction_1_0_0_0() ||
				   context == grammarAccess.getAndRule() ||
				   context == grammarAccess.getAndAccess().getAndLeftAction_1_0_0() ||
				   context == grammarAccess.getComparisonRule() ||
				   context == grammarAccess.getComparisonAccess().getComparisonLeftAction_1_0_0_0() ||
				   context == grammarAccess.getComparisonAccess().getDifferentLeftAction_1_0_3_0() ||
				   context == grammarAccess.getComparisonAccess().getEqualsLeftAction_1_0_1_0() ||
				   context == grammarAccess.getComparisonAccess().getLessOrEqualsLeftAction_1_0_4_0() ||
				   context == grammarAccess.getComparisonAccess().getLessLeftAction_1_0_5_0() ||
				   context == grammarAccess.getComparisonAccess().getMoreOrEqualsLeftAction_1_0_6_0() ||
				   context == grammarAccess.getComparisonAccess().getMoreLeftAction_1_0_7_0() ||
				   context == grammarAccess.getComparisonAccess().getTypedDifferentLeftAction_1_0_2_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getForAffectationRule() ||
				   context == grammarAccess.getIfConditionRule() ||
				   context == grammarAccess.getMultiplicationRule() ||
				   context == grammarAccess.getMultiplicationAccess().getDivLeftAction_1_0_1_0() ||
				   context == grammarAccess.getMultiplicationAccess().getMultiLeftAction_1_0_0_0() ||
				   context == grammarAccess.getOrRule() ||
				   context == grammarAccess.getOrAccess().getOrLeftAction_1_0_0() ||
				   context == grammarAccess.getPrimaryExpressionRule() ||
				   context == grammarAccess.getTernaryIfRule() ||
				   context == grammarAccess.getTernaryIfAccess().getTernaryIfLeftAction_1_0()) {
					sequence_Multiplication(context, (Div) semanticObject); 
					return; 
				}
				else break;
			case LeekPackage.EMPTY_STATEMENT:
				if(context == grammarAccess.getStatementRule()) {
					sequence_Statement(context, (EmptyStatement) semanticObject); 
					return; 
				}
				else break;
			case LeekPackage.EQUALS:
				if(context == grammarAccess.getAdditionRule() ||
				   context == grammarAccess.getAdditionAccess().getMinusLeftAction_1_0_1_0() ||
				   context == grammarAccess.getAdditionAccess().getPlusLeftAction_1_0_0_0() ||
				   context == grammarAccess.getAndRule() ||
				   context == grammarAccess.getAndAccess().getAndLeftAction_1_0_0() ||
				   context == grammarAccess.getComparisonRule() ||
				   context == grammarAccess.getComparisonAccess().getComparisonLeftAction_1_0_0_0() ||
				   context == grammarAccess.getComparisonAccess().getDifferentLeftAction_1_0_3_0() ||
				   context == grammarAccess.getComparisonAccess().getEqualsLeftAction_1_0_1_0() ||
				   context == grammarAccess.getComparisonAccess().getLessOrEqualsLeftAction_1_0_4_0() ||
				   context == grammarAccess.getComparisonAccess().getLessLeftAction_1_0_5_0() ||
				   context == grammarAccess.getComparisonAccess().getMoreOrEqualsLeftAction_1_0_6_0() ||
				   context == grammarAccess.getComparisonAccess().getMoreLeftAction_1_0_7_0() ||
				   context == grammarAccess.getComparisonAccess().getTypedDifferentLeftAction_1_0_2_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getForAffectationRule() ||
				   context == grammarAccess.getIfConditionRule() ||
				   context == grammarAccess.getMultiplicationRule() ||
				   context == grammarAccess.getMultiplicationAccess().getDivLeftAction_1_0_1_0() ||
				   context == grammarAccess.getMultiplicationAccess().getMultiLeftAction_1_0_0_0() ||
				   context == grammarAccess.getOrRule() ||
				   context == grammarAccess.getOrAccess().getOrLeftAction_1_0_0() ||
				   context == grammarAccess.getPrimaryExpressionRule() ||
				   context == grammarAccess.getTernaryIfRule() ||
				   context == grammarAccess.getTernaryIfAccess().getTernaryIfLeftAction_1_0()) {
					sequence_Comparison(context, (Equals) semanticObject); 
					return; 
				}
				else break;
			case LeekPackage.FALSE_LITERAL:
				if(context == grammarAccess.getAdditionRule() ||
				   context == grammarAccess.getAdditionAccess().getMinusLeftAction_1_0_1_0() ||
				   context == grammarAccess.getAdditionAccess().getPlusLeftAction_1_0_0_0() ||
				   context == grammarAccess.getAndRule() ||
				   context == grammarAccess.getAndAccess().getAndLeftAction_1_0_0() ||
				   context == grammarAccess.getComparisonRule() ||
				   context == grammarAccess.getComparisonAccess().getComparisonLeftAction_1_0_0_0() ||
				   context == grammarAccess.getComparisonAccess().getDifferentLeftAction_1_0_3_0() ||
				   context == grammarAccess.getComparisonAccess().getEqualsLeftAction_1_0_1_0() ||
				   context == grammarAccess.getComparisonAccess().getLessOrEqualsLeftAction_1_0_4_0() ||
				   context == grammarAccess.getComparisonAccess().getLessLeftAction_1_0_5_0() ||
				   context == grammarAccess.getComparisonAccess().getMoreOrEqualsLeftAction_1_0_6_0() ||
				   context == grammarAccess.getComparisonAccess().getMoreLeftAction_1_0_7_0() ||
				   context == grammarAccess.getComparisonAccess().getTypedDifferentLeftAction_1_0_2_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getForAffectationRule() ||
				   context == grammarAccess.getIfConditionRule() ||
				   context == grammarAccess.getMultiplicationRule() ||
				   context == grammarAccess.getMultiplicationAccess().getDivLeftAction_1_0_1_0() ||
				   context == grammarAccess.getMultiplicationAccess().getMultiLeftAction_1_0_0_0() ||
				   context == grammarAccess.getOrRule() ||
				   context == grammarAccess.getOrAccess().getOrLeftAction_1_0_0() ||
				   context == grammarAccess.getPrimaryExpressionRule() ||
				   context == grammarAccess.getTernaryIfRule() ||
				   context == grammarAccess.getTernaryIfAccess().getTernaryIfLeftAction_1_0()) {
					sequence_PrimaryExpression(context, (FalseLiteral) semanticObject); 
					return; 
				}
				else break;
			case LeekPackage.FOR:
				if(context == grammarAccess.getForRule() ||
				   context == grammarAccess.getIterationRule() ||
				   context == grammarAccess.getStatementRule()) {
					sequence_For(context, (For) semanticObject); 
					return; 
				}
				else break;
			case LeekPackage.FOR_IN:
				if(context == grammarAccess.getForInRule() ||
				   context == grammarAccess.getIterationRule() ||
				   context == grammarAccess.getStatementRule()) {
					sequence_ForIn(context, (ForIn) semanticObject); 
					return; 
				}
				else break;
			case LeekPackage.FUNCTION_CALL:
				if(context == grammarAccess.getAdditionRule() ||
				   context == grammarAccess.getAdditionAccess().getMinusLeftAction_1_0_1_0() ||
				   context == grammarAccess.getAdditionAccess().getPlusLeftAction_1_0_0_0() ||
				   context == grammarAccess.getAndRule() ||
				   context == grammarAccess.getAndAccess().getAndLeftAction_1_0_0() ||
				   context == grammarAccess.getComparisonRule() ||
				   context == grammarAccess.getComparisonAccess().getComparisonLeftAction_1_0_0_0() ||
				   context == grammarAccess.getComparisonAccess().getDifferentLeftAction_1_0_3_0() ||
				   context == grammarAccess.getComparisonAccess().getEqualsLeftAction_1_0_1_0() ||
				   context == grammarAccess.getComparisonAccess().getLessOrEqualsLeftAction_1_0_4_0() ||
				   context == grammarAccess.getComparisonAccess().getLessLeftAction_1_0_5_0() ||
				   context == grammarAccess.getComparisonAccess().getMoreOrEqualsLeftAction_1_0_6_0() ||
				   context == grammarAccess.getComparisonAccess().getMoreLeftAction_1_0_7_0() ||
				   context == grammarAccess.getComparisonAccess().getTypedDifferentLeftAction_1_0_2_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getForAffectationRule() ||
				   context == grammarAccess.getFunctionCallRule() ||
				   context == grammarAccess.getIfConditionRule() ||
				   context == grammarAccess.getMultiplicationRule() ||
				   context == grammarAccess.getMultiplicationAccess().getDivLeftAction_1_0_1_0() ||
				   context == grammarAccess.getMultiplicationAccess().getMultiLeftAction_1_0_0_0() ||
				   context == grammarAccess.getOrRule() ||
				   context == grammarAccess.getOrAccess().getOrLeftAction_1_0_0() ||
				   context == grammarAccess.getPrimaryExpressionRule() ||
				   context == grammarAccess.getStatementRule() ||
				   context == grammarAccess.getTernaryIfRule() ||
				   context == grammarAccess.getTernaryIfAccess().getTernaryIfLeftAction_1_0()) {
					sequence_FunctionCall(context, (FunctionCall) semanticObject); 
					return; 
				}
				else break;
			case LeekPackage.FUNCTION_DECLARATION:
				if(context == grammarAccess.getAdditionRule() ||
				   context == grammarAccess.getAdditionAccess().getMinusLeftAction_1_0_1_0() ||
				   context == grammarAccess.getAdditionAccess().getPlusLeftAction_1_0_0_0() ||
				   context == grammarAccess.getAndRule() ||
				   context == grammarAccess.getAndAccess().getAndLeftAction_1_0_0() ||
				   context == grammarAccess.getComparisonRule() ||
				   context == grammarAccess.getComparisonAccess().getComparisonLeftAction_1_0_0_0() ||
				   context == grammarAccess.getComparisonAccess().getDifferentLeftAction_1_0_3_0() ||
				   context == grammarAccess.getComparisonAccess().getEqualsLeftAction_1_0_1_0() ||
				   context == grammarAccess.getComparisonAccess().getLessOrEqualsLeftAction_1_0_4_0() ||
				   context == grammarAccess.getComparisonAccess().getLessLeftAction_1_0_5_0() ||
				   context == grammarAccess.getComparisonAccess().getMoreOrEqualsLeftAction_1_0_6_0() ||
				   context == grammarAccess.getComparisonAccess().getMoreLeftAction_1_0_7_0() ||
				   context == grammarAccess.getComparisonAccess().getTypedDifferentLeftAction_1_0_2_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getForAffectationRule() ||
				   context == grammarAccess.getFunctionDeclarationRule() ||
				   context == grammarAccess.getIfConditionRule() ||
				   context == grammarAccess.getMultiplicationRule() ||
				   context == grammarAccess.getMultiplicationAccess().getDivLeftAction_1_0_1_0() ||
				   context == grammarAccess.getMultiplicationAccess().getMultiLeftAction_1_0_0_0() ||
				   context == grammarAccess.getOrRule() ||
				   context == grammarAccess.getOrAccess().getOrLeftAction_1_0_0() ||
				   context == grammarAccess.getPrimaryExpressionRule() ||
				   context == grammarAccess.getStatementRule() ||
				   context == grammarAccess.getTernaryIfRule() ||
				   context == grammarAccess.getTernaryIfAccess().getTernaryIfLeftAction_1_0()) {
					sequence_FunctionDeclaration(context, (FunctionDeclaration) semanticObject); 
					return; 
				}
				else break;
			case LeekPackage.GLOBAL_DECLARATION:
				if(context == grammarAccess.getGlobalDeclarationRule() ||
				   context == grammarAccess.getStatementRule()) {
					sequence_GlobalDeclaration(context, (GlobalDeclaration) semanticObject); 
					return; 
				}
				else break;
			case LeekPackage.IF:
				if(context == grammarAccess.getIfRule() ||
				   context == grammarAccess.getStatementRule()) {
					sequence_If(context, (If) semanticObject); 
					return; 
				}
				else break;
			case LeekPackage.INCLUDE:
				if(context == grammarAccess.getIncludeRule() ||
				   context == grammarAccess.getStatementRule()) {
					sequence_Include(context, (Include) semanticObject); 
					return; 
				}
				else break;
			case LeekPackage.INT_LITERAL:
				if(context == grammarAccess.getAdditionRule() ||
				   context == grammarAccess.getAdditionAccess().getMinusLeftAction_1_0_1_0() ||
				   context == grammarAccess.getAdditionAccess().getPlusLeftAction_1_0_0_0() ||
				   context == grammarAccess.getAndRule() ||
				   context == grammarAccess.getAndAccess().getAndLeftAction_1_0_0() ||
				   context == grammarAccess.getComparisonRule() ||
				   context == grammarAccess.getComparisonAccess().getComparisonLeftAction_1_0_0_0() ||
				   context == grammarAccess.getComparisonAccess().getDifferentLeftAction_1_0_3_0() ||
				   context == grammarAccess.getComparisonAccess().getEqualsLeftAction_1_0_1_0() ||
				   context == grammarAccess.getComparisonAccess().getLessOrEqualsLeftAction_1_0_4_0() ||
				   context == grammarAccess.getComparisonAccess().getLessLeftAction_1_0_5_0() ||
				   context == grammarAccess.getComparisonAccess().getMoreOrEqualsLeftAction_1_0_6_0() ||
				   context == grammarAccess.getComparisonAccess().getMoreLeftAction_1_0_7_0() ||
				   context == grammarAccess.getComparisonAccess().getTypedDifferentLeftAction_1_0_2_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getForAffectationRule() ||
				   context == grammarAccess.getIfConditionRule() ||
				   context == grammarAccess.getMultiplicationRule() ||
				   context == grammarAccess.getMultiplicationAccess().getDivLeftAction_1_0_1_0() ||
				   context == grammarAccess.getMultiplicationAccess().getMultiLeftAction_1_0_0_0() ||
				   context == grammarAccess.getOrRule() ||
				   context == grammarAccess.getOrAccess().getOrLeftAction_1_0_0() ||
				   context == grammarAccess.getPrimaryExpressionRule() ||
				   context == grammarAccess.getTernaryIfRule() ||
				   context == grammarAccess.getTernaryIfAccess().getTernaryIfLeftAction_1_0()) {
					sequence_PrimaryExpression(context, (IntLiteral) semanticObject); 
					return; 
				}
				else break;
			case LeekPackage.LESS:
				if(context == grammarAccess.getAdditionRule() ||
				   context == grammarAccess.getAdditionAccess().getMinusLeftAction_1_0_1_0() ||
				   context == grammarAccess.getAdditionAccess().getPlusLeftAction_1_0_0_0() ||
				   context == grammarAccess.getAndRule() ||
				   context == grammarAccess.getAndAccess().getAndLeftAction_1_0_0() ||
				   context == grammarAccess.getComparisonRule() ||
				   context == grammarAccess.getComparisonAccess().getComparisonLeftAction_1_0_0_0() ||
				   context == grammarAccess.getComparisonAccess().getDifferentLeftAction_1_0_3_0() ||
				   context == grammarAccess.getComparisonAccess().getEqualsLeftAction_1_0_1_0() ||
				   context == grammarAccess.getComparisonAccess().getLessOrEqualsLeftAction_1_0_4_0() ||
				   context == grammarAccess.getComparisonAccess().getLessLeftAction_1_0_5_0() ||
				   context == grammarAccess.getComparisonAccess().getMoreOrEqualsLeftAction_1_0_6_0() ||
				   context == grammarAccess.getComparisonAccess().getMoreLeftAction_1_0_7_0() ||
				   context == grammarAccess.getComparisonAccess().getTypedDifferentLeftAction_1_0_2_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getForAffectationRule() ||
				   context == grammarAccess.getIfConditionRule() ||
				   context == grammarAccess.getMultiplicationRule() ||
				   context == grammarAccess.getMultiplicationAccess().getDivLeftAction_1_0_1_0() ||
				   context == grammarAccess.getMultiplicationAccess().getMultiLeftAction_1_0_0_0() ||
				   context == grammarAccess.getOrRule() ||
				   context == grammarAccess.getOrAccess().getOrLeftAction_1_0_0() ||
				   context == grammarAccess.getPrimaryExpressionRule() ||
				   context == grammarAccess.getTernaryIfRule() ||
				   context == grammarAccess.getTernaryIfAccess().getTernaryIfLeftAction_1_0()) {
					sequence_Comparison(context, (Less) semanticObject); 
					return; 
				}
				else break;
			case LeekPackage.LESS_OR_EQUALS:
				if(context == grammarAccess.getAdditionRule() ||
				   context == grammarAccess.getAdditionAccess().getMinusLeftAction_1_0_1_0() ||
				   context == grammarAccess.getAdditionAccess().getPlusLeftAction_1_0_0_0() ||
				   context == grammarAccess.getAndRule() ||
				   context == grammarAccess.getAndAccess().getAndLeftAction_1_0_0() ||
				   context == grammarAccess.getComparisonRule() ||
				   context == grammarAccess.getComparisonAccess().getComparisonLeftAction_1_0_0_0() ||
				   context == grammarAccess.getComparisonAccess().getDifferentLeftAction_1_0_3_0() ||
				   context == grammarAccess.getComparisonAccess().getEqualsLeftAction_1_0_1_0() ||
				   context == grammarAccess.getComparisonAccess().getLessOrEqualsLeftAction_1_0_4_0() ||
				   context == grammarAccess.getComparisonAccess().getLessLeftAction_1_0_5_0() ||
				   context == grammarAccess.getComparisonAccess().getMoreOrEqualsLeftAction_1_0_6_0() ||
				   context == grammarAccess.getComparisonAccess().getMoreLeftAction_1_0_7_0() ||
				   context == grammarAccess.getComparisonAccess().getTypedDifferentLeftAction_1_0_2_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getForAffectationRule() ||
				   context == grammarAccess.getIfConditionRule() ||
				   context == grammarAccess.getMultiplicationRule() ||
				   context == grammarAccess.getMultiplicationAccess().getDivLeftAction_1_0_1_0() ||
				   context == grammarAccess.getMultiplicationAccess().getMultiLeftAction_1_0_0_0() ||
				   context == grammarAccess.getOrRule() ||
				   context == grammarAccess.getOrAccess().getOrLeftAction_1_0_0() ||
				   context == grammarAccess.getPrimaryExpressionRule() ||
				   context == grammarAccess.getTernaryIfRule() ||
				   context == grammarAccess.getTernaryIfAccess().getTernaryIfLeftAction_1_0()) {
					sequence_Comparison(context, (LessOrEquals) semanticObject); 
					return; 
				}
				else break;
			case LeekPackage.LOCAL_DECLARATION:
				if(context == grammarAccess.getLocalDeclarationRule() ||
				   context == grammarAccess.getStatementRule()) {
					sequence_LocalDeclaration(context, (LocalDeclaration) semanticObject); 
					return; 
				}
				else break;
			case LeekPackage.MINUS:
				if(context == grammarAccess.getAdditionRule() ||
				   context == grammarAccess.getAdditionAccess().getMinusLeftAction_1_0_1_0() ||
				   context == grammarAccess.getAdditionAccess().getPlusLeftAction_1_0_0_0() ||
				   context == grammarAccess.getAndRule() ||
				   context == grammarAccess.getAndAccess().getAndLeftAction_1_0_0() ||
				   context == grammarAccess.getComparisonRule() ||
				   context == grammarAccess.getComparisonAccess().getComparisonLeftAction_1_0_0_0() ||
				   context == grammarAccess.getComparisonAccess().getDifferentLeftAction_1_0_3_0() ||
				   context == grammarAccess.getComparisonAccess().getEqualsLeftAction_1_0_1_0() ||
				   context == grammarAccess.getComparisonAccess().getLessOrEqualsLeftAction_1_0_4_0() ||
				   context == grammarAccess.getComparisonAccess().getLessLeftAction_1_0_5_0() ||
				   context == grammarAccess.getComparisonAccess().getMoreOrEqualsLeftAction_1_0_6_0() ||
				   context == grammarAccess.getComparisonAccess().getMoreLeftAction_1_0_7_0() ||
				   context == grammarAccess.getComparisonAccess().getTypedDifferentLeftAction_1_0_2_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getForAffectationRule() ||
				   context == grammarAccess.getIfConditionRule() ||
				   context == grammarAccess.getMultiplicationRule() ||
				   context == grammarAccess.getMultiplicationAccess().getDivLeftAction_1_0_1_0() ||
				   context == grammarAccess.getMultiplicationAccess().getMultiLeftAction_1_0_0_0() ||
				   context == grammarAccess.getOrRule() ||
				   context == grammarAccess.getOrAccess().getOrLeftAction_1_0_0() ||
				   context == grammarAccess.getPrimaryExpressionRule() ||
				   context == grammarAccess.getTernaryIfRule() ||
				   context == grammarAccess.getTernaryIfAccess().getTernaryIfLeftAction_1_0()) {
					sequence_Addition(context, (Minus) semanticObject); 
					return; 
				}
				else break;
			case LeekPackage.MORE:
				if(context == grammarAccess.getAdditionRule() ||
				   context == grammarAccess.getAdditionAccess().getMinusLeftAction_1_0_1_0() ||
				   context == grammarAccess.getAdditionAccess().getPlusLeftAction_1_0_0_0() ||
				   context == grammarAccess.getAndRule() ||
				   context == grammarAccess.getAndAccess().getAndLeftAction_1_0_0() ||
				   context == grammarAccess.getComparisonRule() ||
				   context == grammarAccess.getComparisonAccess().getComparisonLeftAction_1_0_0_0() ||
				   context == grammarAccess.getComparisonAccess().getDifferentLeftAction_1_0_3_0() ||
				   context == grammarAccess.getComparisonAccess().getEqualsLeftAction_1_0_1_0() ||
				   context == grammarAccess.getComparisonAccess().getLessOrEqualsLeftAction_1_0_4_0() ||
				   context == grammarAccess.getComparisonAccess().getLessLeftAction_1_0_5_0() ||
				   context == grammarAccess.getComparisonAccess().getMoreOrEqualsLeftAction_1_0_6_0() ||
				   context == grammarAccess.getComparisonAccess().getMoreLeftAction_1_0_7_0() ||
				   context == grammarAccess.getComparisonAccess().getTypedDifferentLeftAction_1_0_2_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getForAffectationRule() ||
				   context == grammarAccess.getIfConditionRule() ||
				   context == grammarAccess.getMultiplicationRule() ||
				   context == grammarAccess.getMultiplicationAccess().getDivLeftAction_1_0_1_0() ||
				   context == grammarAccess.getMultiplicationAccess().getMultiLeftAction_1_0_0_0() ||
				   context == grammarAccess.getOrRule() ||
				   context == grammarAccess.getOrAccess().getOrLeftAction_1_0_0() ||
				   context == grammarAccess.getPrimaryExpressionRule() ||
				   context == grammarAccess.getTernaryIfRule() ||
				   context == grammarAccess.getTernaryIfAccess().getTernaryIfLeftAction_1_0()) {
					sequence_Comparison(context, (More) semanticObject); 
					return; 
				}
				else break;
			case LeekPackage.MORE_OR_EQUALS:
				if(context == grammarAccess.getAdditionRule() ||
				   context == grammarAccess.getAdditionAccess().getMinusLeftAction_1_0_1_0() ||
				   context == grammarAccess.getAdditionAccess().getPlusLeftAction_1_0_0_0() ||
				   context == grammarAccess.getAndRule() ||
				   context == grammarAccess.getAndAccess().getAndLeftAction_1_0_0() ||
				   context == grammarAccess.getComparisonRule() ||
				   context == grammarAccess.getComparisonAccess().getComparisonLeftAction_1_0_0_0() ||
				   context == grammarAccess.getComparisonAccess().getDifferentLeftAction_1_0_3_0() ||
				   context == grammarAccess.getComparisonAccess().getEqualsLeftAction_1_0_1_0() ||
				   context == grammarAccess.getComparisonAccess().getLessOrEqualsLeftAction_1_0_4_0() ||
				   context == grammarAccess.getComparisonAccess().getLessLeftAction_1_0_5_0() ||
				   context == grammarAccess.getComparisonAccess().getMoreOrEqualsLeftAction_1_0_6_0() ||
				   context == grammarAccess.getComparisonAccess().getMoreLeftAction_1_0_7_0() ||
				   context == grammarAccess.getComparisonAccess().getTypedDifferentLeftAction_1_0_2_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getForAffectationRule() ||
				   context == grammarAccess.getIfConditionRule() ||
				   context == grammarAccess.getMultiplicationRule() ||
				   context == grammarAccess.getMultiplicationAccess().getDivLeftAction_1_0_1_0() ||
				   context == grammarAccess.getMultiplicationAccess().getMultiLeftAction_1_0_0_0() ||
				   context == grammarAccess.getOrRule() ||
				   context == grammarAccess.getOrAccess().getOrLeftAction_1_0_0() ||
				   context == grammarAccess.getPrimaryExpressionRule() ||
				   context == grammarAccess.getTernaryIfRule() ||
				   context == grammarAccess.getTernaryIfAccess().getTernaryIfLeftAction_1_0()) {
					sequence_Comparison(context, (MoreOrEquals) semanticObject); 
					return; 
				}
				else break;
			case LeekPackage.MULTI:
				if(context == grammarAccess.getAdditionRule() ||
				   context == grammarAccess.getAdditionAccess().getMinusLeftAction_1_0_1_0() ||
				   context == grammarAccess.getAdditionAccess().getPlusLeftAction_1_0_0_0() ||
				   context == grammarAccess.getAndRule() ||
				   context == grammarAccess.getAndAccess().getAndLeftAction_1_0_0() ||
				   context == grammarAccess.getComparisonRule() ||
				   context == grammarAccess.getComparisonAccess().getComparisonLeftAction_1_0_0_0() ||
				   context == grammarAccess.getComparisonAccess().getDifferentLeftAction_1_0_3_0() ||
				   context == grammarAccess.getComparisonAccess().getEqualsLeftAction_1_0_1_0() ||
				   context == grammarAccess.getComparisonAccess().getLessOrEqualsLeftAction_1_0_4_0() ||
				   context == grammarAccess.getComparisonAccess().getLessLeftAction_1_0_5_0() ||
				   context == grammarAccess.getComparisonAccess().getMoreOrEqualsLeftAction_1_0_6_0() ||
				   context == grammarAccess.getComparisonAccess().getMoreLeftAction_1_0_7_0() ||
				   context == grammarAccess.getComparisonAccess().getTypedDifferentLeftAction_1_0_2_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getForAffectationRule() ||
				   context == grammarAccess.getIfConditionRule() ||
				   context == grammarAccess.getMultiplicationRule() ||
				   context == grammarAccess.getMultiplicationAccess().getDivLeftAction_1_0_1_0() ||
				   context == grammarAccess.getMultiplicationAccess().getMultiLeftAction_1_0_0_0() ||
				   context == grammarAccess.getOrRule() ||
				   context == grammarAccess.getOrAccess().getOrLeftAction_1_0_0() ||
				   context == grammarAccess.getPrimaryExpressionRule() ||
				   context == grammarAccess.getTernaryIfRule() ||
				   context == grammarAccess.getTernaryIfAccess().getTernaryIfLeftAction_1_0()) {
					sequence_Multiplication(context, (Multi) semanticObject); 
					return; 
				}
				else break;
			case LeekPackage.NOT:
				if(context == grammarAccess.getAdditionRule() ||
				   context == grammarAccess.getAdditionAccess().getMinusLeftAction_1_0_1_0() ||
				   context == grammarAccess.getAdditionAccess().getPlusLeftAction_1_0_0_0() ||
				   context == grammarAccess.getAndRule() ||
				   context == grammarAccess.getAndAccess().getAndLeftAction_1_0_0() ||
				   context == grammarAccess.getComparisonRule() ||
				   context == grammarAccess.getComparisonAccess().getComparisonLeftAction_1_0_0_0() ||
				   context == grammarAccess.getComparisonAccess().getDifferentLeftAction_1_0_3_0() ||
				   context == grammarAccess.getComparisonAccess().getEqualsLeftAction_1_0_1_0() ||
				   context == grammarAccess.getComparisonAccess().getLessOrEqualsLeftAction_1_0_4_0() ||
				   context == grammarAccess.getComparisonAccess().getLessLeftAction_1_0_5_0() ||
				   context == grammarAccess.getComparisonAccess().getMoreOrEqualsLeftAction_1_0_6_0() ||
				   context == grammarAccess.getComparisonAccess().getMoreLeftAction_1_0_7_0() ||
				   context == grammarAccess.getComparisonAccess().getTypedDifferentLeftAction_1_0_2_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getForAffectationRule() ||
				   context == grammarAccess.getIfConditionRule() ||
				   context == grammarAccess.getMultiplicationRule() ||
				   context == grammarAccess.getMultiplicationAccess().getDivLeftAction_1_0_1_0() ||
				   context == grammarAccess.getMultiplicationAccess().getMultiLeftAction_1_0_0_0() ||
				   context == grammarAccess.getOrRule() ||
				   context == grammarAccess.getOrAccess().getOrLeftAction_1_0_0() ||
				   context == grammarAccess.getPrimaryExpressionRule() ||
				   context == grammarAccess.getTernaryIfRule() ||
				   context == grammarAccess.getTernaryIfAccess().getTernaryIfLeftAction_1_0()) {
					sequence_PrimaryExpression(context, (Not) semanticObject); 
					return; 
				}
				else break;
			case LeekPackage.NULL_LITERAL:
				if(context == grammarAccess.getAdditionRule() ||
				   context == grammarAccess.getAdditionAccess().getMinusLeftAction_1_0_1_0() ||
				   context == grammarAccess.getAdditionAccess().getPlusLeftAction_1_0_0_0() ||
				   context == grammarAccess.getAndRule() ||
				   context == grammarAccess.getAndAccess().getAndLeftAction_1_0_0() ||
				   context == grammarAccess.getComparisonRule() ||
				   context == grammarAccess.getComparisonAccess().getComparisonLeftAction_1_0_0_0() ||
				   context == grammarAccess.getComparisonAccess().getDifferentLeftAction_1_0_3_0() ||
				   context == grammarAccess.getComparisonAccess().getEqualsLeftAction_1_0_1_0() ||
				   context == grammarAccess.getComparisonAccess().getLessOrEqualsLeftAction_1_0_4_0() ||
				   context == grammarAccess.getComparisonAccess().getLessLeftAction_1_0_5_0() ||
				   context == grammarAccess.getComparisonAccess().getMoreOrEqualsLeftAction_1_0_6_0() ||
				   context == grammarAccess.getComparisonAccess().getMoreLeftAction_1_0_7_0() ||
				   context == grammarAccess.getComparisonAccess().getTypedDifferentLeftAction_1_0_2_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getForAffectationRule() ||
				   context == grammarAccess.getIfConditionRule() ||
				   context == grammarAccess.getMultiplicationRule() ||
				   context == grammarAccess.getMultiplicationAccess().getDivLeftAction_1_0_1_0() ||
				   context == grammarAccess.getMultiplicationAccess().getMultiLeftAction_1_0_0_0() ||
				   context == grammarAccess.getOrRule() ||
				   context == grammarAccess.getOrAccess().getOrLeftAction_1_0_0() ||
				   context == grammarAccess.getPrimaryExpressionRule() ||
				   context == grammarAccess.getTernaryIfRule() ||
				   context == grammarAccess.getTernaryIfAccess().getTernaryIfLeftAction_1_0()) {
					sequence_PrimaryExpression(context, (NullLiteral) semanticObject); 
					return; 
				}
				else break;
			case LeekPackage.OR:
				if(context == grammarAccess.getAdditionRule() ||
				   context == grammarAccess.getAdditionAccess().getMinusLeftAction_1_0_1_0() ||
				   context == grammarAccess.getAdditionAccess().getPlusLeftAction_1_0_0_0() ||
				   context == grammarAccess.getAndRule() ||
				   context == grammarAccess.getAndAccess().getAndLeftAction_1_0_0() ||
				   context == grammarAccess.getComparisonRule() ||
				   context == grammarAccess.getComparisonAccess().getComparisonLeftAction_1_0_0_0() ||
				   context == grammarAccess.getComparisonAccess().getDifferentLeftAction_1_0_3_0() ||
				   context == grammarAccess.getComparisonAccess().getEqualsLeftAction_1_0_1_0() ||
				   context == grammarAccess.getComparisonAccess().getLessOrEqualsLeftAction_1_0_4_0() ||
				   context == grammarAccess.getComparisonAccess().getLessLeftAction_1_0_5_0() ||
				   context == grammarAccess.getComparisonAccess().getMoreOrEqualsLeftAction_1_0_6_0() ||
				   context == grammarAccess.getComparisonAccess().getMoreLeftAction_1_0_7_0() ||
				   context == grammarAccess.getComparisonAccess().getTypedDifferentLeftAction_1_0_2_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getForAffectationRule() ||
				   context == grammarAccess.getIfConditionRule() ||
				   context == grammarAccess.getMultiplicationRule() ||
				   context == grammarAccess.getMultiplicationAccess().getDivLeftAction_1_0_1_0() ||
				   context == grammarAccess.getMultiplicationAccess().getMultiLeftAction_1_0_0_0() ||
				   context == grammarAccess.getOrRule() ||
				   context == grammarAccess.getOrAccess().getOrLeftAction_1_0_0() ||
				   context == grammarAccess.getPrimaryExpressionRule() ||
				   context == grammarAccess.getTernaryIfRule() ||
				   context == grammarAccess.getTernaryIfAccess().getTernaryIfLeftAction_1_0()) {
					sequence_Or(context, (Or) semanticObject); 
					return; 
				}
				else break;
			case LeekPackage.PLUS:
				if(context == grammarAccess.getAdditionRule() ||
				   context == grammarAccess.getAdditionAccess().getMinusLeftAction_1_0_1_0() ||
				   context == grammarAccess.getAdditionAccess().getPlusLeftAction_1_0_0_0() ||
				   context == grammarAccess.getAndRule() ||
				   context == grammarAccess.getAndAccess().getAndLeftAction_1_0_0() ||
				   context == grammarAccess.getComparisonRule() ||
				   context == grammarAccess.getComparisonAccess().getComparisonLeftAction_1_0_0_0() ||
				   context == grammarAccess.getComparisonAccess().getDifferentLeftAction_1_0_3_0() ||
				   context == grammarAccess.getComparisonAccess().getEqualsLeftAction_1_0_1_0() ||
				   context == grammarAccess.getComparisonAccess().getLessOrEqualsLeftAction_1_0_4_0() ||
				   context == grammarAccess.getComparisonAccess().getLessLeftAction_1_0_5_0() ||
				   context == grammarAccess.getComparisonAccess().getMoreOrEqualsLeftAction_1_0_6_0() ||
				   context == grammarAccess.getComparisonAccess().getMoreLeftAction_1_0_7_0() ||
				   context == grammarAccess.getComparisonAccess().getTypedDifferentLeftAction_1_0_2_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getForAffectationRule() ||
				   context == grammarAccess.getIfConditionRule() ||
				   context == grammarAccess.getMultiplicationRule() ||
				   context == grammarAccess.getMultiplicationAccess().getDivLeftAction_1_0_1_0() ||
				   context == grammarAccess.getMultiplicationAccess().getMultiLeftAction_1_0_0_0() ||
				   context == grammarAccess.getOrRule() ||
				   context == grammarAccess.getOrAccess().getOrLeftAction_1_0_0() ||
				   context == grammarAccess.getPrimaryExpressionRule() ||
				   context == grammarAccess.getTernaryIfRule() ||
				   context == grammarAccess.getTernaryIfAccess().getTernaryIfLeftAction_1_0()) {
					sequence_Addition(context, (Plus) semanticObject); 
					return; 
				}
				else break;
			case LeekPackage.POSTFIX_DECREMENT:
				if(context == grammarAccess.getAffectationPostfixStatementRule() ||
				   context == grammarAccess.getAffectationStatementRule() ||
				   context == grammarAccess.getStatementRule()) {
					sequence_AffectationPostfixStatement(context, (PostfixDecrement) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getAdditionRule() ||
				   context == grammarAccess.getAdditionAccess().getMinusLeftAction_1_0_1_0() ||
				   context == grammarAccess.getAdditionAccess().getPlusLeftAction_1_0_0_0() ||
				   context == grammarAccess.getAndRule() ||
				   context == grammarAccess.getAndAccess().getAndLeftAction_1_0_0() ||
				   context == grammarAccess.getComparisonRule() ||
				   context == grammarAccess.getComparisonAccess().getComparisonLeftAction_1_0_0_0() ||
				   context == grammarAccess.getComparisonAccess().getDifferentLeftAction_1_0_3_0() ||
				   context == grammarAccess.getComparisonAccess().getEqualsLeftAction_1_0_1_0() ||
				   context == grammarAccess.getComparisonAccess().getLessOrEqualsLeftAction_1_0_4_0() ||
				   context == grammarAccess.getComparisonAccess().getLessLeftAction_1_0_5_0() ||
				   context == grammarAccess.getComparisonAccess().getMoreOrEqualsLeftAction_1_0_6_0() ||
				   context == grammarAccess.getComparisonAccess().getMoreLeftAction_1_0_7_0() ||
				   context == grammarAccess.getComparisonAccess().getTypedDifferentLeftAction_1_0_2_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getForAffectationRule() ||
				   context == grammarAccess.getIfConditionRule() ||
				   context == grammarAccess.getMultiplicationRule() ||
				   context == grammarAccess.getMultiplicationAccess().getDivLeftAction_1_0_1_0() ||
				   context == grammarAccess.getMultiplicationAccess().getMultiLeftAction_1_0_0_0() ||
				   context == grammarAccess.getOrRule() ||
				   context == grammarAccess.getOrAccess().getOrLeftAction_1_0_0() ||
				   context == grammarAccess.getPostfixRule() ||
				   context == grammarAccess.getPrimaryExpressionRule() ||
				   context == grammarAccess.getTernaryIfRule() ||
				   context == grammarAccess.getTernaryIfAccess().getTernaryIfLeftAction_1_0()) {
					sequence_Postfix(context, (PostfixDecrement) semanticObject); 
					return; 
				}
				else break;
			case LeekPackage.POSTFIX_INCREMENT:
				if(context == grammarAccess.getAffectationPostfixStatementRule() ||
				   context == grammarAccess.getAffectationStatementRule() ||
				   context == grammarAccess.getStatementRule()) {
					sequence_AffectationPostfixStatement(context, (PostfixIncrement) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getAdditionRule() ||
				   context == grammarAccess.getAdditionAccess().getMinusLeftAction_1_0_1_0() ||
				   context == grammarAccess.getAdditionAccess().getPlusLeftAction_1_0_0_0() ||
				   context == grammarAccess.getAndRule() ||
				   context == grammarAccess.getAndAccess().getAndLeftAction_1_0_0() ||
				   context == grammarAccess.getComparisonRule() ||
				   context == grammarAccess.getComparisonAccess().getComparisonLeftAction_1_0_0_0() ||
				   context == grammarAccess.getComparisonAccess().getDifferentLeftAction_1_0_3_0() ||
				   context == grammarAccess.getComparisonAccess().getEqualsLeftAction_1_0_1_0() ||
				   context == grammarAccess.getComparisonAccess().getLessOrEqualsLeftAction_1_0_4_0() ||
				   context == grammarAccess.getComparisonAccess().getLessLeftAction_1_0_5_0() ||
				   context == grammarAccess.getComparisonAccess().getMoreOrEqualsLeftAction_1_0_6_0() ||
				   context == grammarAccess.getComparisonAccess().getMoreLeftAction_1_0_7_0() ||
				   context == grammarAccess.getComparisonAccess().getTypedDifferentLeftAction_1_0_2_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getForAffectationRule() ||
				   context == grammarAccess.getIfConditionRule() ||
				   context == grammarAccess.getMultiplicationRule() ||
				   context == grammarAccess.getMultiplicationAccess().getDivLeftAction_1_0_1_0() ||
				   context == grammarAccess.getMultiplicationAccess().getMultiLeftAction_1_0_0_0() ||
				   context == grammarAccess.getOrRule() ||
				   context == grammarAccess.getOrAccess().getOrLeftAction_1_0_0() ||
				   context == grammarAccess.getPostfixRule() ||
				   context == grammarAccess.getPrimaryExpressionRule() ||
				   context == grammarAccess.getTernaryIfRule() ||
				   context == grammarAccess.getTernaryIfAccess().getTernaryIfLeftAction_1_0()) {
					sequence_Postfix(context, (PostfixIncrement) semanticObject); 
					return; 
				}
				else break;
			case LeekPackage.PREFIX_DECREMENT:
				if(context == grammarAccess.getAffectationPrefixStatementRule() ||
				   context == grammarAccess.getAffectationStatementRule() ||
				   context == grammarAccess.getStatementRule()) {
					sequence_AffectationPrefixStatement(context, (PrefixDecrement) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getAdditionRule() ||
				   context == grammarAccess.getAdditionAccess().getMinusLeftAction_1_0_1_0() ||
				   context == grammarAccess.getAdditionAccess().getPlusLeftAction_1_0_0_0() ||
				   context == grammarAccess.getAndRule() ||
				   context == grammarAccess.getAndAccess().getAndLeftAction_1_0_0() ||
				   context == grammarAccess.getComparisonRule() ||
				   context == grammarAccess.getComparisonAccess().getComparisonLeftAction_1_0_0_0() ||
				   context == grammarAccess.getComparisonAccess().getDifferentLeftAction_1_0_3_0() ||
				   context == grammarAccess.getComparisonAccess().getEqualsLeftAction_1_0_1_0() ||
				   context == grammarAccess.getComparisonAccess().getLessOrEqualsLeftAction_1_0_4_0() ||
				   context == grammarAccess.getComparisonAccess().getLessLeftAction_1_0_5_0() ||
				   context == grammarAccess.getComparisonAccess().getMoreOrEqualsLeftAction_1_0_6_0() ||
				   context == grammarAccess.getComparisonAccess().getMoreLeftAction_1_0_7_0() ||
				   context == grammarAccess.getComparisonAccess().getTypedDifferentLeftAction_1_0_2_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getForAffectationRule() ||
				   context == grammarAccess.getIfConditionRule() ||
				   context == grammarAccess.getMultiplicationRule() ||
				   context == grammarAccess.getMultiplicationAccess().getDivLeftAction_1_0_1_0() ||
				   context == grammarAccess.getMultiplicationAccess().getMultiLeftAction_1_0_0_0() ||
				   context == grammarAccess.getOrRule() ||
				   context == grammarAccess.getOrAccess().getOrLeftAction_1_0_0() ||
				   context == grammarAccess.getPrefixRule() ||
				   context == grammarAccess.getPrimaryExpressionRule() ||
				   context == grammarAccess.getTernaryIfRule() ||
				   context == grammarAccess.getTernaryIfAccess().getTernaryIfLeftAction_1_0()) {
					sequence_Prefix(context, (PrefixDecrement) semanticObject); 
					return; 
				}
				else break;
			case LeekPackage.PREFIX_INCREMENT:
				if(context == grammarAccess.getAffectationPrefixStatementRule() ||
				   context == grammarAccess.getAffectationStatementRule() ||
				   context == grammarAccess.getStatementRule()) {
					sequence_AffectationPrefixStatement(context, (PrefixIncrement) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getAdditionRule() ||
				   context == grammarAccess.getAdditionAccess().getMinusLeftAction_1_0_1_0() ||
				   context == grammarAccess.getAdditionAccess().getPlusLeftAction_1_0_0_0() ||
				   context == grammarAccess.getAndRule() ||
				   context == grammarAccess.getAndAccess().getAndLeftAction_1_0_0() ||
				   context == grammarAccess.getComparisonRule() ||
				   context == grammarAccess.getComparisonAccess().getComparisonLeftAction_1_0_0_0() ||
				   context == grammarAccess.getComparisonAccess().getDifferentLeftAction_1_0_3_0() ||
				   context == grammarAccess.getComparisonAccess().getEqualsLeftAction_1_0_1_0() ||
				   context == grammarAccess.getComparisonAccess().getLessOrEqualsLeftAction_1_0_4_0() ||
				   context == grammarAccess.getComparisonAccess().getLessLeftAction_1_0_5_0() ||
				   context == grammarAccess.getComparisonAccess().getMoreOrEqualsLeftAction_1_0_6_0() ||
				   context == grammarAccess.getComparisonAccess().getMoreLeftAction_1_0_7_0() ||
				   context == grammarAccess.getComparisonAccess().getTypedDifferentLeftAction_1_0_2_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getForAffectationRule() ||
				   context == grammarAccess.getIfConditionRule() ||
				   context == grammarAccess.getMultiplicationRule() ||
				   context == grammarAccess.getMultiplicationAccess().getDivLeftAction_1_0_1_0() ||
				   context == grammarAccess.getMultiplicationAccess().getMultiLeftAction_1_0_0_0() ||
				   context == grammarAccess.getOrRule() ||
				   context == grammarAccess.getOrAccess().getOrLeftAction_1_0_0() ||
				   context == grammarAccess.getPrefixRule() ||
				   context == grammarAccess.getPrimaryExpressionRule() ||
				   context == grammarAccess.getTernaryIfRule() ||
				   context == grammarAccess.getTernaryIfAccess().getTernaryIfLeftAction_1_0()) {
					sequence_Prefix(context, (PrefixIncrement) semanticObject); 
					return; 
				}
				else break;
			case LeekPackage.REAL_LITERAL:
				if(context == grammarAccess.getAdditionRule() ||
				   context == grammarAccess.getAdditionAccess().getMinusLeftAction_1_0_1_0() ||
				   context == grammarAccess.getAdditionAccess().getPlusLeftAction_1_0_0_0() ||
				   context == grammarAccess.getAndRule() ||
				   context == grammarAccess.getAndAccess().getAndLeftAction_1_0_0() ||
				   context == grammarAccess.getComparisonRule() ||
				   context == grammarAccess.getComparisonAccess().getComparisonLeftAction_1_0_0_0() ||
				   context == grammarAccess.getComparisonAccess().getDifferentLeftAction_1_0_3_0() ||
				   context == grammarAccess.getComparisonAccess().getEqualsLeftAction_1_0_1_0() ||
				   context == grammarAccess.getComparisonAccess().getLessOrEqualsLeftAction_1_0_4_0() ||
				   context == grammarAccess.getComparisonAccess().getLessLeftAction_1_0_5_0() ||
				   context == grammarAccess.getComparisonAccess().getMoreOrEqualsLeftAction_1_0_6_0() ||
				   context == grammarAccess.getComparisonAccess().getMoreLeftAction_1_0_7_0() ||
				   context == grammarAccess.getComparisonAccess().getTypedDifferentLeftAction_1_0_2_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getForAffectationRule() ||
				   context == grammarAccess.getIfConditionRule() ||
				   context == grammarAccess.getMultiplicationRule() ||
				   context == grammarAccess.getMultiplicationAccess().getDivLeftAction_1_0_1_0() ||
				   context == grammarAccess.getMultiplicationAccess().getMultiLeftAction_1_0_0_0() ||
				   context == grammarAccess.getOrRule() ||
				   context == grammarAccess.getOrAccess().getOrLeftAction_1_0_0() ||
				   context == grammarAccess.getPrimaryExpressionRule() ||
				   context == grammarAccess.getTernaryIfRule() ||
				   context == grammarAccess.getTernaryIfAccess().getTernaryIfLeftAction_1_0()) {
					sequence_PrimaryExpression(context, (RealLiteral) semanticObject); 
					return; 
				}
				else break;
			case LeekPackage.RETURN_STATEMENT:
				if(context == grammarAccess.getReturnStatementRule() ||
				   context == grammarAccess.getStatementRule()) {
					sequence_ReturnStatement(context, (ReturnStatement) semanticObject); 
					return; 
				}
				else break;
			case LeekPackage.SCRIPT:
				if(context == grammarAccess.getScriptRule()) {
					sequence_Script(context, (Script) semanticObject); 
					return; 
				}
				else break;
			case LeekPackage.STATEMENT_BLOCK:
				if(context == grammarAccess.getStatementRule() ||
				   context == grammarAccess.getStatementBlockRule()) {
					sequence_StatementBlock(context, (StatementBlock) semanticObject); 
					return; 
				}
				else break;
			case LeekPackage.STRING_LITERAL:
				if(context == grammarAccess.getAdditionRule() ||
				   context == grammarAccess.getAdditionAccess().getMinusLeftAction_1_0_1_0() ||
				   context == grammarAccess.getAdditionAccess().getPlusLeftAction_1_0_0_0() ||
				   context == grammarAccess.getAndRule() ||
				   context == grammarAccess.getAndAccess().getAndLeftAction_1_0_0() ||
				   context == grammarAccess.getComparisonRule() ||
				   context == grammarAccess.getComparisonAccess().getComparisonLeftAction_1_0_0_0() ||
				   context == grammarAccess.getComparisonAccess().getDifferentLeftAction_1_0_3_0() ||
				   context == grammarAccess.getComparisonAccess().getEqualsLeftAction_1_0_1_0() ||
				   context == grammarAccess.getComparisonAccess().getLessOrEqualsLeftAction_1_0_4_0() ||
				   context == grammarAccess.getComparisonAccess().getLessLeftAction_1_0_5_0() ||
				   context == grammarAccess.getComparisonAccess().getMoreOrEqualsLeftAction_1_0_6_0() ||
				   context == grammarAccess.getComparisonAccess().getMoreLeftAction_1_0_7_0() ||
				   context == grammarAccess.getComparisonAccess().getTypedDifferentLeftAction_1_0_2_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getForAffectationRule() ||
				   context == grammarAccess.getIfConditionRule() ||
				   context == grammarAccess.getMultiplicationRule() ||
				   context == grammarAccess.getMultiplicationAccess().getDivLeftAction_1_0_1_0() ||
				   context == grammarAccess.getMultiplicationAccess().getMultiLeftAction_1_0_0_0() ||
				   context == grammarAccess.getOrRule() ||
				   context == grammarAccess.getOrAccess().getOrLeftAction_1_0_0() ||
				   context == grammarAccess.getPrimaryExpressionRule() ||
				   context == grammarAccess.getTernaryIfRule() ||
				   context == grammarAccess.getTernaryIfAccess().getTernaryIfLeftAction_1_0()) {
					sequence_PrimaryExpression(context, (StringLiteral) semanticObject); 
					return; 
				}
				else break;
			case LeekPackage.TERNARY_IF:
				if(context == grammarAccess.getAdditionRule() ||
				   context == grammarAccess.getAdditionAccess().getMinusLeftAction_1_0_1_0() ||
				   context == grammarAccess.getAdditionAccess().getPlusLeftAction_1_0_0_0() ||
				   context == grammarAccess.getAndRule() ||
				   context == grammarAccess.getAndAccess().getAndLeftAction_1_0_0() ||
				   context == grammarAccess.getComparisonRule() ||
				   context == grammarAccess.getComparisonAccess().getComparisonLeftAction_1_0_0_0() ||
				   context == grammarAccess.getComparisonAccess().getDifferentLeftAction_1_0_3_0() ||
				   context == grammarAccess.getComparisonAccess().getEqualsLeftAction_1_0_1_0() ||
				   context == grammarAccess.getComparisonAccess().getLessOrEqualsLeftAction_1_0_4_0() ||
				   context == grammarAccess.getComparisonAccess().getLessLeftAction_1_0_5_0() ||
				   context == grammarAccess.getComparisonAccess().getMoreOrEqualsLeftAction_1_0_6_0() ||
				   context == grammarAccess.getComparisonAccess().getMoreLeftAction_1_0_7_0() ||
				   context == grammarAccess.getComparisonAccess().getTypedDifferentLeftAction_1_0_2_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getForAffectationRule() ||
				   context == grammarAccess.getIfConditionRule() ||
				   context == grammarAccess.getMultiplicationRule() ||
				   context == grammarAccess.getMultiplicationAccess().getDivLeftAction_1_0_1_0() ||
				   context == grammarAccess.getMultiplicationAccess().getMultiLeftAction_1_0_0_0() ||
				   context == grammarAccess.getOrRule() ||
				   context == grammarAccess.getOrAccess().getOrLeftAction_1_0_0() ||
				   context == grammarAccess.getPrimaryExpressionRule() ||
				   context == grammarAccess.getTernaryIfRule() ||
				   context == grammarAccess.getTernaryIfAccess().getTernaryIfLeftAction_1_0()) {
					sequence_TernaryIf(context, (TernaryIf) semanticObject); 
					return; 
				}
				else break;
			case LeekPackage.TRUE_LITERAL:
				if(context == grammarAccess.getAdditionRule() ||
				   context == grammarAccess.getAdditionAccess().getMinusLeftAction_1_0_1_0() ||
				   context == grammarAccess.getAdditionAccess().getPlusLeftAction_1_0_0_0() ||
				   context == grammarAccess.getAndRule() ||
				   context == grammarAccess.getAndAccess().getAndLeftAction_1_0_0() ||
				   context == grammarAccess.getComparisonRule() ||
				   context == grammarAccess.getComparisonAccess().getComparisonLeftAction_1_0_0_0() ||
				   context == grammarAccess.getComparisonAccess().getDifferentLeftAction_1_0_3_0() ||
				   context == grammarAccess.getComparisonAccess().getEqualsLeftAction_1_0_1_0() ||
				   context == grammarAccess.getComparisonAccess().getLessOrEqualsLeftAction_1_0_4_0() ||
				   context == grammarAccess.getComparisonAccess().getLessLeftAction_1_0_5_0() ||
				   context == grammarAccess.getComparisonAccess().getMoreOrEqualsLeftAction_1_0_6_0() ||
				   context == grammarAccess.getComparisonAccess().getMoreLeftAction_1_0_7_0() ||
				   context == grammarAccess.getComparisonAccess().getTypedDifferentLeftAction_1_0_2_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getForAffectationRule() ||
				   context == grammarAccess.getIfConditionRule() ||
				   context == grammarAccess.getMultiplicationRule() ||
				   context == grammarAccess.getMultiplicationAccess().getDivLeftAction_1_0_1_0() ||
				   context == grammarAccess.getMultiplicationAccess().getMultiLeftAction_1_0_0_0() ||
				   context == grammarAccess.getOrRule() ||
				   context == grammarAccess.getOrAccess().getOrLeftAction_1_0_0() ||
				   context == grammarAccess.getPrimaryExpressionRule() ||
				   context == grammarAccess.getTernaryIfRule() ||
				   context == grammarAccess.getTernaryIfAccess().getTernaryIfLeftAction_1_0()) {
					sequence_PrimaryExpression(context, (TrueLiteral) semanticObject); 
					return; 
				}
				else break;
			case LeekPackage.TYPED_DIFFERENT:
				if(context == grammarAccess.getAdditionRule() ||
				   context == grammarAccess.getAdditionAccess().getMinusLeftAction_1_0_1_0() ||
				   context == grammarAccess.getAdditionAccess().getPlusLeftAction_1_0_0_0() ||
				   context == grammarAccess.getAndRule() ||
				   context == grammarAccess.getAndAccess().getAndLeftAction_1_0_0() ||
				   context == grammarAccess.getComparisonRule() ||
				   context == grammarAccess.getComparisonAccess().getComparisonLeftAction_1_0_0_0() ||
				   context == grammarAccess.getComparisonAccess().getDifferentLeftAction_1_0_3_0() ||
				   context == grammarAccess.getComparisonAccess().getEqualsLeftAction_1_0_1_0() ||
				   context == grammarAccess.getComparisonAccess().getLessOrEqualsLeftAction_1_0_4_0() ||
				   context == grammarAccess.getComparisonAccess().getLessLeftAction_1_0_5_0() ||
				   context == grammarAccess.getComparisonAccess().getMoreOrEqualsLeftAction_1_0_6_0() ||
				   context == grammarAccess.getComparisonAccess().getMoreLeftAction_1_0_7_0() ||
				   context == grammarAccess.getComparisonAccess().getTypedDifferentLeftAction_1_0_2_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getForAffectationRule() ||
				   context == grammarAccess.getIfConditionRule() ||
				   context == grammarAccess.getMultiplicationRule() ||
				   context == grammarAccess.getMultiplicationAccess().getDivLeftAction_1_0_1_0() ||
				   context == grammarAccess.getMultiplicationAccess().getMultiLeftAction_1_0_0_0() ||
				   context == grammarAccess.getOrRule() ||
				   context == grammarAccess.getOrAccess().getOrLeftAction_1_0_0() ||
				   context == grammarAccess.getPrimaryExpressionRule() ||
				   context == grammarAccess.getTernaryIfRule() ||
				   context == grammarAccess.getTernaryIfAccess().getTernaryIfLeftAction_1_0()) {
					sequence_Comparison(context, (TypedDifferent) semanticObject); 
					return; 
				}
				else break;
			case LeekPackage.UNITARY_MINUS:
				if(context == grammarAccess.getAdditionRule() ||
				   context == grammarAccess.getAdditionAccess().getMinusLeftAction_1_0_1_0() ||
				   context == grammarAccess.getAdditionAccess().getPlusLeftAction_1_0_0_0() ||
				   context == grammarAccess.getAndRule() ||
				   context == grammarAccess.getAndAccess().getAndLeftAction_1_0_0() ||
				   context == grammarAccess.getComparisonRule() ||
				   context == grammarAccess.getComparisonAccess().getComparisonLeftAction_1_0_0_0() ||
				   context == grammarAccess.getComparisonAccess().getDifferentLeftAction_1_0_3_0() ||
				   context == grammarAccess.getComparisonAccess().getEqualsLeftAction_1_0_1_0() ||
				   context == grammarAccess.getComparisonAccess().getLessOrEqualsLeftAction_1_0_4_0() ||
				   context == grammarAccess.getComparisonAccess().getLessLeftAction_1_0_5_0() ||
				   context == grammarAccess.getComparisonAccess().getMoreOrEqualsLeftAction_1_0_6_0() ||
				   context == grammarAccess.getComparisonAccess().getMoreLeftAction_1_0_7_0() ||
				   context == grammarAccess.getComparisonAccess().getTypedDifferentLeftAction_1_0_2_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getForAffectationRule() ||
				   context == grammarAccess.getIfConditionRule() ||
				   context == grammarAccess.getMultiplicationRule() ||
				   context == grammarAccess.getMultiplicationAccess().getDivLeftAction_1_0_1_0() ||
				   context == grammarAccess.getMultiplicationAccess().getMultiLeftAction_1_0_0_0() ||
				   context == grammarAccess.getOrRule() ||
				   context == grammarAccess.getOrAccess().getOrLeftAction_1_0_0() ||
				   context == grammarAccess.getPrimaryExpressionRule() ||
				   context == grammarAccess.getTernaryIfRule() ||
				   context == grammarAccess.getTernaryIfAccess().getTernaryIfLeftAction_1_0()) {
					sequence_PrimaryExpression(context, (UnitaryMinus) semanticObject); 
					return; 
				}
				else break;
			case LeekPackage.VARIABLE_DECLARATION:
				if(context == grammarAccess.getParameterDeclarationRule()) {
					sequence_ParameterDeclaration(context, (VariableDeclaration) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getForInVariableReferenceRule() ||
				   context == grammarAccess.getVariableDeclarationUnitializedRule()) {
					sequence_VariableDeclarationUnitialized(context, (VariableDeclaration) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getForInitializerRule() ||
				   context == grammarAccess.getVariableDeclarationWithValueRule()) {
					sequence_VariableDeclarationWithValue(context, (VariableDeclaration) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getVariableDeclarationRule()) {
					sequence_VariableDeclaration_VariableDeclarationUnitialized_VariableDeclarationWithValue(context, (VariableDeclaration) semanticObject); 
					return; 
				}
				else break;
			case LeekPackage.VARIABLE_REFERENCE:
				if(context == grammarAccess.getVariableReferenceArrayRule()) {
					sequence_VariableReferenceArray(context, (VariableReference) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getForInVariableReferenceRule() ||
				   context == grammarAccess.getVariableReferenceSimpleRule()) {
					sequence_VariableReferenceSimple(context, (VariableReference) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getAdditionRule() ||
				   context == grammarAccess.getAdditionAccess().getMinusLeftAction_1_0_1_0() ||
				   context == grammarAccess.getAdditionAccess().getPlusLeftAction_1_0_0_0() ||
				   context == grammarAccess.getAffectationPostfixStatementAccess().getPostfixDecrementValueAction_1_0_0() ||
				   context == grammarAccess.getAffectationPostfixStatementAccess().getPostfixIncrementValueAction_1_1_0() ||
				   context == grammarAccess.getAndRule() ||
				   context == grammarAccess.getAndAccess().getAndLeftAction_1_0_0() ||
				   context == grammarAccess.getComparisonRule() ||
				   context == grammarAccess.getComparisonAccess().getComparisonLeftAction_1_0_0_0() ||
				   context == grammarAccess.getComparisonAccess().getDifferentLeftAction_1_0_3_0() ||
				   context == grammarAccess.getComparisonAccess().getEqualsLeftAction_1_0_1_0() ||
				   context == grammarAccess.getComparisonAccess().getLessOrEqualsLeftAction_1_0_4_0() ||
				   context == grammarAccess.getComparisonAccess().getLessLeftAction_1_0_5_0() ||
				   context == grammarAccess.getComparisonAccess().getMoreOrEqualsLeftAction_1_0_6_0() ||
				   context == grammarAccess.getComparisonAccess().getMoreLeftAction_1_0_7_0() ||
				   context == grammarAccess.getComparisonAccess().getTypedDifferentLeftAction_1_0_2_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getForAffectationRule() ||
				   context == grammarAccess.getIfConditionRule() ||
				   context == grammarAccess.getMultiplicationRule() ||
				   context == grammarAccess.getMultiplicationAccess().getDivLeftAction_1_0_1_0() ||
				   context == grammarAccess.getMultiplicationAccess().getMultiLeftAction_1_0_0_0() ||
				   context == grammarAccess.getOrRule() ||
				   context == grammarAccess.getOrAccess().getOrLeftAction_1_0_0() ||
				   context == grammarAccess.getPostfixRule() ||
				   context == grammarAccess.getPostfixAccess().getPostfixDecrementValueAction_1_0_0() ||
				   context == grammarAccess.getPostfixAccess().getPostfixIncrementValueAction_1_1_0() ||
				   context == grammarAccess.getPrimaryExpressionRule() ||
				   context == grammarAccess.getTernaryIfRule() ||
				   context == grammarAccess.getTernaryIfAccess().getTernaryIfLeftAction_1_0() ||
				   context == grammarAccess.getVariableReferenceRule()) {
					sequence_VariableReference_VariableReferenceArray_VariableReferenceSimple(context, (VariableReference) semanticObject); 
					return; 
				}
				else break;
			case LeekPackage.WHILE:
				if(context == grammarAccess.getIterationRule() ||
				   context == grammarAccess.getStatementRule() ||
				   context == grammarAccess.getWhileRule()) {
					sequence_While(context, (While) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (left=Addition_Minus_1_0_1_0 right=Multiplication)
	 */
	protected void sequence_Addition(EObject context, Minus semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, LeekPackage.Literals.MINUS__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LeekPackage.Literals.MINUS__LEFT));
			if(transientValues.isValueTransient(semanticObject, LeekPackage.Literals.MINUS__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LeekPackage.Literals.MINUS__RIGHT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getAdditionAccess().getMinusLeftAction_1_0_1_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getAdditionAccess().getRightMultiplicationParserRuleCall_1_1_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (left=Addition_Plus_1_0_0_0 right=Multiplication)
	 */
	protected void sequence_Addition(EObject context, Plus semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, LeekPackage.Literals.PLUS__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LeekPackage.Literals.PLUS__LEFT));
			if(transientValues.isValueTransient(semanticObject, LeekPackage.Literals.PLUS__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LeekPackage.Literals.PLUS__RIGHT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getAdditionAccess().getPlusLeftAction_1_0_0_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getAdditionAccess().getRightMultiplicationParserRuleCall_1_1_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (variable=VariableReference decrement=Expression)
	 */
	protected void sequence_AffectationDecrement(EObject context, AffectationDecrement semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, LeekPackage.Literals.AFFECTATION_DECREMENT__VARIABLE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LeekPackage.Literals.AFFECTATION_DECREMENT__VARIABLE));
			if(transientValues.isValueTransient(semanticObject, LeekPackage.Literals.AFFECTATION_DECREMENT__DECREMENT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LeekPackage.Literals.AFFECTATION_DECREMENT__DECREMENT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getAffectationDecrementAccess().getVariableVariableReferenceParserRuleCall_0_0(), semanticObject.getVariable());
		feeder.accept(grammarAccess.getAffectationDecrementAccess().getDecrementExpressionParserRuleCall_2_0(), semanticObject.getDecrement());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (variable=VariableReference increment=Expression)
	 */
	protected void sequence_AffectationIncrement(EObject context, AffectationIncrement semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, LeekPackage.Literals.AFFECTATION_INCREMENT__VARIABLE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LeekPackage.Literals.AFFECTATION_INCREMENT__VARIABLE));
			if(transientValues.isValueTransient(semanticObject, LeekPackage.Literals.AFFECTATION_INCREMENT__INCREMENT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LeekPackage.Literals.AFFECTATION_INCREMENT__INCREMENT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getAffectationIncrementAccess().getVariableVariableReferenceParserRuleCall_0_0(), semanticObject.getVariable());
		feeder.accept(grammarAccess.getAffectationIncrementAccess().getIncrementExpressionParserRuleCall_2_0(), semanticObject.getIncrement());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     value=AffectationPostfixStatement_PostfixDecrement_1_0_0
	 */
	protected void sequence_AffectationPostfixStatement(EObject context, PostfixDecrement semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, LeekPackage.Literals.POSTFIX_DECREMENT__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LeekPackage.Literals.POSTFIX_DECREMENT__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getAffectationPostfixStatementAccess().getPostfixDecrementValueAction_1_0_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     value=AffectationPostfixStatement_PostfixIncrement_1_1_0
	 */
	protected void sequence_AffectationPostfixStatement(EObject context, PostfixIncrement semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, LeekPackage.Literals.POSTFIX_INCREMENT__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LeekPackage.Literals.POSTFIX_INCREMENT__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getAffectationPostfixStatementAccess().getPostfixIncrementValueAction_1_1_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     right=VariableReference
	 */
	protected void sequence_AffectationPrefixStatement(EObject context, PrefixDecrement semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, LeekPackage.Literals.PREFIX_DECREMENT__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LeekPackage.Literals.PREFIX_DECREMENT__RIGHT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getAffectationPrefixStatementAccess().getRightVariableReferenceParserRuleCall_1_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     right=VariableReference
	 */
	protected void sequence_AffectationPrefixStatement(EObject context, PrefixIncrement semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, LeekPackage.Literals.PREFIX_INCREMENT__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LeekPackage.Literals.PREFIX_INCREMENT__RIGHT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getAffectationPrefixStatementAccess().getRightVariableReferenceParserRuleCall_1_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (variable=VariableReference value=Expression)
	 */
	protected void sequence_Affectation(EObject context, Affectation semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, LeekPackage.Literals.FOR_INITIALIZER__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LeekPackage.Literals.FOR_INITIALIZER__VALUE));
			if(transientValues.isValueTransient(semanticObject, LeekPackage.Literals.AFFECTATION__VARIABLE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LeekPackage.Literals.AFFECTATION__VARIABLE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getAffectationAccess().getVariableVariableReferenceParserRuleCall_0_0(), semanticObject.getVariable());
		feeder.accept(grammarAccess.getAffectationAccess().getValueExpressionParserRuleCall_2_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (left=And_And_1_0_0 right=Addition)
	 */
	protected void sequence_And(EObject context, And semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, LeekPackage.Literals.AND__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LeekPackage.Literals.AND__LEFT));
			if(transientValues.isValueTransient(semanticObject, LeekPackage.Literals.AND__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LeekPackage.Literals.AND__RIGHT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getAndAccess().getAndLeftAction_1_0_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getAndAccess().getRightAdditionParserRuleCall_1_1_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     ((values+=Expression values+=Expression*)?)
	 */
	protected void sequence_ArrayLiteral(EObject context, ArrayLiteral semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     {BreakStatement}
	 */
	protected void sequence_BreakStatement(EObject context, BreakStatement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (left=Comparison_Comparison_1_0_0_0 right=Or)
	 */
	protected void sequence_Comparison(EObject context, Comparison semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, LeekPackage.Literals.COMPARISON__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LeekPackage.Literals.COMPARISON__LEFT));
			if(transientValues.isValueTransient(semanticObject, LeekPackage.Literals.COMPARISON__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LeekPackage.Literals.COMPARISON__RIGHT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getComparisonAccess().getComparisonLeftAction_1_0_0_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getComparisonAccess().getRightOrParserRuleCall_1_1_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (left=Comparison_Different_1_0_3_0 right=Or)
	 */
	protected void sequence_Comparison(EObject context, Different semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, LeekPackage.Literals.DIFFERENT__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LeekPackage.Literals.DIFFERENT__LEFT));
			if(transientValues.isValueTransient(semanticObject, LeekPackage.Literals.DIFFERENT__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LeekPackage.Literals.DIFFERENT__RIGHT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getComparisonAccess().getDifferentLeftAction_1_0_3_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getComparisonAccess().getRightOrParserRuleCall_1_1_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (left=Comparison_Equals_1_0_1_0 right=Or)
	 */
	protected void sequence_Comparison(EObject context, Equals semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, LeekPackage.Literals.EQUALS__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LeekPackage.Literals.EQUALS__LEFT));
			if(transientValues.isValueTransient(semanticObject, LeekPackage.Literals.EQUALS__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LeekPackage.Literals.EQUALS__RIGHT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getComparisonAccess().getEqualsLeftAction_1_0_1_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getComparisonAccess().getRightOrParserRuleCall_1_1_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (left=Comparison_Less_1_0_5_0 right=Or)
	 */
	protected void sequence_Comparison(EObject context, Less semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, LeekPackage.Literals.LESS__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LeekPackage.Literals.LESS__LEFT));
			if(transientValues.isValueTransient(semanticObject, LeekPackage.Literals.LESS__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LeekPackage.Literals.LESS__RIGHT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getComparisonAccess().getLessLeftAction_1_0_5_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getComparisonAccess().getRightOrParserRuleCall_1_1_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (left=Comparison_LessOrEquals_1_0_4_0 right=Or)
	 */
	protected void sequence_Comparison(EObject context, LessOrEquals semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, LeekPackage.Literals.LESS_OR_EQUALS__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LeekPackage.Literals.LESS_OR_EQUALS__LEFT));
			if(transientValues.isValueTransient(semanticObject, LeekPackage.Literals.LESS_OR_EQUALS__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LeekPackage.Literals.LESS_OR_EQUALS__RIGHT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getComparisonAccess().getLessOrEqualsLeftAction_1_0_4_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getComparisonAccess().getRightOrParserRuleCall_1_1_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (left=Comparison_More_1_0_7_0 right=Or)
	 */
	protected void sequence_Comparison(EObject context, More semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, LeekPackage.Literals.MORE__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LeekPackage.Literals.MORE__LEFT));
			if(transientValues.isValueTransient(semanticObject, LeekPackage.Literals.MORE__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LeekPackage.Literals.MORE__RIGHT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getComparisonAccess().getMoreLeftAction_1_0_7_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getComparisonAccess().getRightOrParserRuleCall_1_1_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (left=Comparison_MoreOrEquals_1_0_6_0 right=Or)
	 */
	protected void sequence_Comparison(EObject context, MoreOrEquals semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, LeekPackage.Literals.MORE_OR_EQUALS__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LeekPackage.Literals.MORE_OR_EQUALS__LEFT));
			if(transientValues.isValueTransient(semanticObject, LeekPackage.Literals.MORE_OR_EQUALS__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LeekPackage.Literals.MORE_OR_EQUALS__RIGHT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getComparisonAccess().getMoreOrEqualsLeftAction_1_0_6_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getComparisonAccess().getRightOrParserRuleCall_1_1_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (left=Comparison_TypedDifferent_1_0_2_0 right=Or)
	 */
	protected void sequence_Comparison(EObject context, TypedDifferent semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, LeekPackage.Literals.TYPED_DIFFERENT__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LeekPackage.Literals.TYPED_DIFFERENT__LEFT));
			if(transientValues.isValueTransient(semanticObject, LeekPackage.Literals.TYPED_DIFFERENT__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LeekPackage.Literals.TYPED_DIFFERENT__RIGHT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getComparisonAccess().getTypedDifferentLeftAction_1_0_2_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getComparisonAccess().getRightOrParserRuleCall_1_1_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     {ContinueStatement}
	 */
	protected void sequence_ContinueStatement(EObject context, ContinueStatement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (key=ForInVariableReference? value=ForInVariableReference array=Expression statement=Statement)
	 */
	protected void sequence_ForIn(EObject context, ForIn semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (initializer=ForInitializer condition=Expression increment=ForAffectation statement=Statement)
	 */
	protected void sequence_For(EObject context, For semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, LeekPackage.Literals.ITERATION__STATEMENT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LeekPackage.Literals.ITERATION__STATEMENT));
			if(transientValues.isValueTransient(semanticObject, LeekPackage.Literals.FOR__INITIALIZER) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LeekPackage.Literals.FOR__INITIALIZER));
			if(transientValues.isValueTransient(semanticObject, LeekPackage.Literals.FOR__CONDITION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LeekPackage.Literals.FOR__CONDITION));
			if(transientValues.isValueTransient(semanticObject, LeekPackage.Literals.FOR__INCREMENT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LeekPackage.Literals.FOR__INCREMENT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getForAccess().getInitializerForInitializerParserRuleCall_2_0(), semanticObject.getInitializer());
		feeder.accept(grammarAccess.getForAccess().getConditionExpressionParserRuleCall_4_0(), semanticObject.getCondition());
		feeder.accept(grammarAccess.getForAccess().getIncrementForAffectationParserRuleCall_6_0(), semanticObject.getIncrement());
		feeder.accept(grammarAccess.getForAccess().getStatementStatementParserRuleCall_8_0(), semanticObject.getStatement());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (function=[FunctionDeclaration|ID] (args+=Expression args+=Expression*)?)
	 */
	protected void sequence_FunctionCall(EObject context, FunctionCall semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID (parameters+=ParameterDeclaration parameters+=ParameterDeclaration*)? body=StatementBlock)
	 */
	protected void sequence_FunctionDeclaration(EObject context, FunctionDeclaration semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (variables+=VariableDeclaration variables+=VariableDeclaration*)
	 */
	protected void sequence_GlobalDeclaration(EObject context, GlobalDeclaration semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (condition=IfCondition then=Statement else=Statement?)
	 */
	protected void sequence_If(EObject context, If semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     importURI=STRING
	 */
	protected void sequence_Include(EObject context, Include semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, LeekPackage.Literals.INCLUDE__IMPORT_URI) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LeekPackage.Literals.INCLUDE__IMPORT_URI));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getIncludeAccess().getImportURISTRINGTerminalRuleCall_2_0(), semanticObject.getImportURI());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (variables+=VariableDeclaration variables+=VariableDeclaration*)
	 */
	protected void sequence_LocalDeclaration(EObject context, LocalDeclaration semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (left=Multiplication_Div_1_0_1_0 right=TernaryIf)
	 */
	protected void sequence_Multiplication(EObject context, Div semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, LeekPackage.Literals.DIV__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LeekPackage.Literals.DIV__LEFT));
			if(transientValues.isValueTransient(semanticObject, LeekPackage.Literals.DIV__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LeekPackage.Literals.DIV__RIGHT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getMultiplicationAccess().getDivLeftAction_1_0_1_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getMultiplicationAccess().getRightTernaryIfParserRuleCall_1_1_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (left=Multiplication_Multi_1_0_0_0 right=TernaryIf)
	 */
	protected void sequence_Multiplication(EObject context, Multi semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, LeekPackage.Literals.MULTI__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LeekPackage.Literals.MULTI__LEFT));
			if(transientValues.isValueTransient(semanticObject, LeekPackage.Literals.MULTI__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LeekPackage.Literals.MULTI__RIGHT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getMultiplicationAccess().getMultiLeftAction_1_0_0_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getMultiplicationAccess().getRightTernaryIfParserRuleCall_1_1_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (left=Or_Or_1_0_0 right=And)
	 */
	protected void sequence_Or(EObject context, Or semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, LeekPackage.Literals.OR__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LeekPackage.Literals.OR__LEFT));
			if(transientValues.isValueTransient(semanticObject, LeekPackage.Literals.OR__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LeekPackage.Literals.OR__RIGHT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getOrAccess().getOrLeftAction_1_0_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getOrAccess().getRightAndParserRuleCall_1_1_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (byAdress?='@'? name=ID)
	 */
	protected void sequence_ParameterDeclaration(EObject context, VariableDeclaration semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     value=Postfix_PostfixDecrement_1_0_0
	 */
	protected void sequence_Postfix(EObject context, PostfixDecrement semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, LeekPackage.Literals.POSTFIX_DECREMENT__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LeekPackage.Literals.POSTFIX_DECREMENT__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getPostfixAccess().getPostfixDecrementValueAction_1_0_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     value=Postfix_PostfixIncrement_1_1_0
	 */
	protected void sequence_Postfix(EObject context, PostfixIncrement semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, LeekPackage.Literals.POSTFIX_INCREMENT__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LeekPackage.Literals.POSTFIX_INCREMENT__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getPostfixAccess().getPostfixIncrementValueAction_1_1_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     right=VariableReference
	 */
	protected void sequence_Prefix(EObject context, PrefixDecrement semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, LeekPackage.Literals.PREFIX_DECREMENT__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LeekPackage.Literals.PREFIX_DECREMENT__RIGHT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getPrefixAccess().getRightVariableReferenceParserRuleCall_1_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     right=VariableReference
	 */
	protected void sequence_Prefix(EObject context, PrefixIncrement semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, LeekPackage.Literals.PREFIX_INCREMENT__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LeekPackage.Literals.PREFIX_INCREMENT__RIGHT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getPrefixAccess().getRightVariableReferenceParserRuleCall_1_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     {FalseLiteral}
	 */
	protected void sequence_PrimaryExpression(EObject context, FalseLiteral semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     value=INT
	 */
	protected void sequence_PrimaryExpression(EObject context, IntLiteral semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, LeekPackage.Literals.INT_LITERAL__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LeekPackage.Literals.INT_LITERAL__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getPrimaryExpressionAccess().getValueINTTerminalRuleCall_4_1_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     expression=PrimaryExpression
	 */
	protected void sequence_PrimaryExpression(EObject context, Not semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, LeekPackage.Literals.NOT__EXPRESSION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LeekPackage.Literals.NOT__EXPRESSION));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getPrimaryExpressionAccess().getExpressionPrimaryExpressionParserRuleCall_2_2_0(), semanticObject.getExpression());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     {NullLiteral}
	 */
	protected void sequence_PrimaryExpression(EObject context, NullLiteral semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     value=REAL
	 */
	protected void sequence_PrimaryExpression(EObject context, RealLiteral semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, LeekPackage.Literals.REAL_LITERAL__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LeekPackage.Literals.REAL_LITERAL__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getPrimaryExpressionAccess().getValueREALTerminalRuleCall_3_1_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     value=STRING
	 */
	protected void sequence_PrimaryExpression(EObject context, StringLiteral semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, LeekPackage.Literals.STRING_LITERAL__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LeekPackage.Literals.STRING_LITERAL__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getPrimaryExpressionAccess().getValueSTRINGTerminalRuleCall_8_1_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     {TrueLiteral}
	 */
	protected void sequence_PrimaryExpression(EObject context, TrueLiteral semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     expression=PrimaryExpression
	 */
	protected void sequence_PrimaryExpression(EObject context, UnitaryMinus semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, LeekPackage.Literals.UNITARY_MINUS__EXPRESSION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LeekPackage.Literals.UNITARY_MINUS__EXPRESSION));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getPrimaryExpressionAccess().getExpressionPrimaryExpressionParserRuleCall_1_2_0(), semanticObject.getExpression());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (value=Expression?)
	 */
	protected void sequence_ReturnStatement(EObject context, ReturnStatement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     statements+=Statement*
	 */
	protected void sequence_Script(EObject context, Script semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (statements+=Statement*)
	 */
	protected void sequence_StatementBlock(EObject context, StatementBlock semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     {EmptyStatement}
	 */
	protected void sequence_Statement(EObject context, EmptyStatement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (left=TernaryIf_TernaryIf_1_0 then=PrimaryExpression else=PrimaryExpression)
	 */
	protected void sequence_TernaryIf(EObject context, TernaryIf semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, LeekPackage.Literals.TERNARY_IF__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LeekPackage.Literals.TERNARY_IF__LEFT));
			if(transientValues.isValueTransient(semanticObject, LeekPackage.Literals.TERNARY_IF__THEN) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LeekPackage.Literals.TERNARY_IF__THEN));
			if(transientValues.isValueTransient(semanticObject, LeekPackage.Literals.TERNARY_IF__ELSE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LeekPackage.Literals.TERNARY_IF__ELSE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getTernaryIfAccess().getTernaryIfLeftAction_1_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getTernaryIfAccess().getThenPrimaryExpressionParserRuleCall_1_2_0(), semanticObject.getThen());
		feeder.accept(grammarAccess.getTernaryIfAccess().getElsePrimaryExpressionParserRuleCall_1_4_0(), semanticObject.getElse());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_VariableDeclarationUnitialized(EObject context, VariableDeclaration semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID value=Expression)
	 */
	protected void sequence_VariableDeclarationWithValue(EObject context, VariableDeclaration semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((name=ID value=Expression) | name=ID)
	 */
	protected void sequence_VariableDeclaration_VariableDeclarationUnitialized_VariableDeclarationWithValue(EObject context, VariableDeclaration semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (variable=[VariableDeclaration|ID] dimensions+=Expression+)
	 */
	protected void sequence_VariableReferenceArray(EObject context, VariableReference semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     variable=[VariableDeclaration|ID]
	 */
	protected void sequence_VariableReferenceSimple(EObject context, VariableReference semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((variable=[VariableDeclaration|ID] dimensions+=Expression+) | variable=[VariableDeclaration|ID])
	 */
	protected void sequence_VariableReference_VariableReferenceArray_VariableReferenceSimple(EObject context, VariableReference semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (condition=Expression statement=Statement)
	 */
	protected void sequence_While(EObject context, While semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, LeekPackage.Literals.ITERATION__STATEMENT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LeekPackage.Literals.ITERATION__STATEMENT));
			if(transientValues.isValueTransient(semanticObject, LeekPackage.Literals.WHILE__CONDITION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LeekPackage.Literals.WHILE__CONDITION));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getWhileAccess().getConditionExpressionParserRuleCall_2_0(), semanticObject.getCondition());
		feeder.accept(grammarAccess.getWhileAccess().getStatementStatementParserRuleCall_4_0(), semanticObject.getStatement());
		feeder.finish();
	}
}
