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
import org.processus.ecleek.leek.ArrayLiteral;
import org.processus.ecleek.leek.Different;
import org.processus.ecleek.leek.Div;
import org.processus.ecleek.leek.EachIterator;
import org.processus.ecleek.leek.EmptyStatement;
import org.processus.ecleek.leek.Equals;
import org.processus.ecleek.leek.For;
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
import org.processus.ecleek.leek.ParameterDeclaration;
import org.processus.ecleek.leek.Plus;
import org.processus.ecleek.leek.RealLiteral;
import org.processus.ecleek.leek.Return;
import org.processus.ecleek.leek.Script;
import org.processus.ecleek.leek.StatementBlock;
import org.processus.ecleek.leek.StringLiteral;
import org.processus.ecleek.leek.TypedDifferent;
import org.processus.ecleek.leek.TypedEquals;
import org.processus.ecleek.leek.VariableDeclaration;
import org.processus.ecleek.leek.VariableIterator;
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
				   context == grammarAccess.getStatementRule() ||
				   context == grammarAccess.getToplevelStatementRule()) {
					sequence_Affectation(context, (Affectation) semanticObject); 
					return; 
				}
				else break;
			case LeekPackage.ARRAY_LITERAL:
				if(context == grammarAccess.getAdditionRule() ||
				   context == grammarAccess.getAdditionAccess().getMinusLeftAction_1_0_1_0() ||
				   context == grammarAccess.getAdditionAccess().getPlusLeftAction_1_0_0_0() ||
				   context == grammarAccess.getAndRule() ||
				   context == grammarAccess.getAndAccess().getTypedEqualsLeftAction_1_0_0() ||
				   context == grammarAccess.getArrayLiteralRule() ||
				   context == grammarAccess.getComparisonRule() ||
				   context == grammarAccess.getComparisonAccess().getDifferentLeftAction_1_0_3_0() ||
				   context == grammarAccess.getComparisonAccess().getEqualsLeftAction_1_0_1_0() ||
				   context == grammarAccess.getComparisonAccess().getLessOrEqualsLeftAction_1_0_4_0() ||
				   context == grammarAccess.getComparisonAccess().getLessLeftAction_1_0_5_0() ||
				   context == grammarAccess.getComparisonAccess().getMoreOrEqualsLeftAction_1_0_6_0() ||
				   context == grammarAccess.getComparisonAccess().getMoreLeftAction_1_0_7_0() ||
				   context == grammarAccess.getComparisonAccess().getTypedDifferentLeftAction_1_0_2_0() ||
				   context == grammarAccess.getComparisonAccess().getTypedEqualsLeftAction_1_0_0_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getMultiplicationRule() ||
				   context == grammarAccess.getMultiplicationAccess().getDivLeftAction_1_0_1_0() ||
				   context == grammarAccess.getMultiplicationAccess().getMultiLeftAction_1_0_0_0() ||
				   context == grammarAccess.getOrRule() ||
				   context == grammarAccess.getOrAccess().getTypedEqualsLeftAction_1_0_0() ||
				   context == grammarAccess.getPrimaryExpressionRule()) {
					sequence_ArrayLiteral(context, (ArrayLiteral) semanticObject); 
					return; 
				}
				else break;
			case LeekPackage.DIFFERENT:
				if(context == grammarAccess.getAdditionRule() ||
				   context == grammarAccess.getAdditionAccess().getMinusLeftAction_1_0_1_0() ||
				   context == grammarAccess.getAdditionAccess().getPlusLeftAction_1_0_0_0() ||
				   context == grammarAccess.getAndRule() ||
				   context == grammarAccess.getAndAccess().getTypedEqualsLeftAction_1_0_0() ||
				   context == grammarAccess.getComparisonRule() ||
				   context == grammarAccess.getComparisonAccess().getDifferentLeftAction_1_0_3_0() ||
				   context == grammarAccess.getComparisonAccess().getEqualsLeftAction_1_0_1_0() ||
				   context == grammarAccess.getComparisonAccess().getLessOrEqualsLeftAction_1_0_4_0() ||
				   context == grammarAccess.getComparisonAccess().getLessLeftAction_1_0_5_0() ||
				   context == grammarAccess.getComparisonAccess().getMoreOrEqualsLeftAction_1_0_6_0() ||
				   context == grammarAccess.getComparisonAccess().getMoreLeftAction_1_0_7_0() ||
				   context == grammarAccess.getComparisonAccess().getTypedDifferentLeftAction_1_0_2_0() ||
				   context == grammarAccess.getComparisonAccess().getTypedEqualsLeftAction_1_0_0_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getMultiplicationRule() ||
				   context == grammarAccess.getMultiplicationAccess().getDivLeftAction_1_0_1_0() ||
				   context == grammarAccess.getMultiplicationAccess().getMultiLeftAction_1_0_0_0() ||
				   context == grammarAccess.getOrRule() ||
				   context == grammarAccess.getOrAccess().getTypedEqualsLeftAction_1_0_0() ||
				   context == grammarAccess.getPrimaryExpressionRule()) {
					sequence_Comparison(context, (Different) semanticObject); 
					return; 
				}
				else break;
			case LeekPackage.DIV:
				if(context == grammarAccess.getAdditionRule() ||
				   context == grammarAccess.getAdditionAccess().getMinusLeftAction_1_0_1_0() ||
				   context == grammarAccess.getAdditionAccess().getPlusLeftAction_1_0_0_0() ||
				   context == grammarAccess.getAndRule() ||
				   context == grammarAccess.getAndAccess().getTypedEqualsLeftAction_1_0_0() ||
				   context == grammarAccess.getComparisonRule() ||
				   context == grammarAccess.getComparisonAccess().getDifferentLeftAction_1_0_3_0() ||
				   context == grammarAccess.getComparisonAccess().getEqualsLeftAction_1_0_1_0() ||
				   context == grammarAccess.getComparisonAccess().getLessOrEqualsLeftAction_1_0_4_0() ||
				   context == grammarAccess.getComparisonAccess().getLessLeftAction_1_0_5_0() ||
				   context == grammarAccess.getComparisonAccess().getMoreOrEqualsLeftAction_1_0_6_0() ||
				   context == grammarAccess.getComparisonAccess().getMoreLeftAction_1_0_7_0() ||
				   context == grammarAccess.getComparisonAccess().getTypedDifferentLeftAction_1_0_2_0() ||
				   context == grammarAccess.getComparisonAccess().getTypedEqualsLeftAction_1_0_0_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getMultiplicationRule() ||
				   context == grammarAccess.getMultiplicationAccess().getDivLeftAction_1_0_1_0() ||
				   context == grammarAccess.getMultiplicationAccess().getMultiLeftAction_1_0_0_0() ||
				   context == grammarAccess.getOrRule() ||
				   context == grammarAccess.getOrAccess().getTypedEqualsLeftAction_1_0_0() ||
				   context == grammarAccess.getPrimaryExpressionRule()) {
					sequence_Multiplication(context, (Div) semanticObject); 
					return; 
				}
				else break;
			case LeekPackage.EACH_ITERATOR:
				if(context == grammarAccess.getEachIteratorRule() ||
				   context == grammarAccess.getForIteratorRule()) {
					sequence_EachIterator(context, (EachIterator) semanticObject); 
					return; 
				}
				else break;
			case LeekPackage.EMPTY_STATEMENT:
				if(context == grammarAccess.getStatementRule() ||
				   context == grammarAccess.getToplevelStatementRule()) {
					sequence_Statement(context, (EmptyStatement) semanticObject); 
					return; 
				}
				else break;
			case LeekPackage.EQUALS:
				if(context == grammarAccess.getAdditionRule() ||
				   context == grammarAccess.getAdditionAccess().getMinusLeftAction_1_0_1_0() ||
				   context == grammarAccess.getAdditionAccess().getPlusLeftAction_1_0_0_0() ||
				   context == grammarAccess.getAndRule() ||
				   context == grammarAccess.getAndAccess().getTypedEqualsLeftAction_1_0_0() ||
				   context == grammarAccess.getComparisonRule() ||
				   context == grammarAccess.getComparisonAccess().getDifferentLeftAction_1_0_3_0() ||
				   context == grammarAccess.getComparisonAccess().getEqualsLeftAction_1_0_1_0() ||
				   context == grammarAccess.getComparisonAccess().getLessOrEqualsLeftAction_1_0_4_0() ||
				   context == grammarAccess.getComparisonAccess().getLessLeftAction_1_0_5_0() ||
				   context == grammarAccess.getComparisonAccess().getMoreOrEqualsLeftAction_1_0_6_0() ||
				   context == grammarAccess.getComparisonAccess().getMoreLeftAction_1_0_7_0() ||
				   context == grammarAccess.getComparisonAccess().getTypedDifferentLeftAction_1_0_2_0() ||
				   context == grammarAccess.getComparisonAccess().getTypedEqualsLeftAction_1_0_0_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getMultiplicationRule() ||
				   context == grammarAccess.getMultiplicationAccess().getDivLeftAction_1_0_1_0() ||
				   context == grammarAccess.getMultiplicationAccess().getMultiLeftAction_1_0_0_0() ||
				   context == grammarAccess.getOrRule() ||
				   context == grammarAccess.getOrAccess().getTypedEqualsLeftAction_1_0_0() ||
				   context == grammarAccess.getPrimaryExpressionRule()) {
					sequence_Comparison(context, (Equals) semanticObject); 
					return; 
				}
				else break;
			case LeekPackage.FOR:
				if(context == grammarAccess.getForRule() ||
				   context == grammarAccess.getStatementRule() ||
				   context == grammarAccess.getToplevelStatementRule()) {
					sequence_For(context, (For) semanticObject); 
					return; 
				}
				else break;
			case LeekPackage.FUNCTION_CALL:
				if(context == grammarAccess.getAdditionRule() ||
				   context == grammarAccess.getAdditionAccess().getMinusLeftAction_1_0_1_0() ||
				   context == grammarAccess.getAdditionAccess().getPlusLeftAction_1_0_0_0() ||
				   context == grammarAccess.getAndRule() ||
				   context == grammarAccess.getAndAccess().getTypedEqualsLeftAction_1_0_0() ||
				   context == grammarAccess.getComparisonRule() ||
				   context == grammarAccess.getComparisonAccess().getDifferentLeftAction_1_0_3_0() ||
				   context == grammarAccess.getComparisonAccess().getEqualsLeftAction_1_0_1_0() ||
				   context == grammarAccess.getComparisonAccess().getLessOrEqualsLeftAction_1_0_4_0() ||
				   context == grammarAccess.getComparisonAccess().getLessLeftAction_1_0_5_0() ||
				   context == grammarAccess.getComparisonAccess().getMoreOrEqualsLeftAction_1_0_6_0() ||
				   context == grammarAccess.getComparisonAccess().getMoreLeftAction_1_0_7_0() ||
				   context == grammarAccess.getComparisonAccess().getTypedDifferentLeftAction_1_0_2_0() ||
				   context == grammarAccess.getComparisonAccess().getTypedEqualsLeftAction_1_0_0_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getFunctionCallRule() ||
				   context == grammarAccess.getMultiplicationRule() ||
				   context == grammarAccess.getMultiplicationAccess().getDivLeftAction_1_0_1_0() ||
				   context == grammarAccess.getMultiplicationAccess().getMultiLeftAction_1_0_0_0() ||
				   context == grammarAccess.getOrRule() ||
				   context == grammarAccess.getOrAccess().getTypedEqualsLeftAction_1_0_0() ||
				   context == grammarAccess.getPrimaryExpressionRule() ||
				   context == grammarAccess.getStatementRule() ||
				   context == grammarAccess.getToplevelStatementRule()) {
					sequence_FunctionCall(context, (FunctionCall) semanticObject); 
					return; 
				}
				else break;
			case LeekPackage.FUNCTION_DECLARATION:
				if(context == grammarAccess.getAdditionRule() ||
				   context == grammarAccess.getAdditionAccess().getMinusLeftAction_1_0_1_0() ||
				   context == grammarAccess.getAdditionAccess().getPlusLeftAction_1_0_0_0() ||
				   context == grammarAccess.getAndRule() ||
				   context == grammarAccess.getAndAccess().getTypedEqualsLeftAction_1_0_0() ||
				   context == grammarAccess.getComparisonRule() ||
				   context == grammarAccess.getComparisonAccess().getDifferentLeftAction_1_0_3_0() ||
				   context == grammarAccess.getComparisonAccess().getEqualsLeftAction_1_0_1_0() ||
				   context == grammarAccess.getComparisonAccess().getLessOrEqualsLeftAction_1_0_4_0() ||
				   context == grammarAccess.getComparisonAccess().getLessLeftAction_1_0_5_0() ||
				   context == grammarAccess.getComparisonAccess().getMoreOrEqualsLeftAction_1_0_6_0() ||
				   context == grammarAccess.getComparisonAccess().getMoreLeftAction_1_0_7_0() ||
				   context == grammarAccess.getComparisonAccess().getTypedDifferentLeftAction_1_0_2_0() ||
				   context == grammarAccess.getComparisonAccess().getTypedEqualsLeftAction_1_0_0_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getFunctionDeclarationRule() ||
				   context == grammarAccess.getMultiplicationRule() ||
				   context == grammarAccess.getMultiplicationAccess().getDivLeftAction_1_0_1_0() ||
				   context == grammarAccess.getMultiplicationAccess().getMultiLeftAction_1_0_0_0() ||
				   context == grammarAccess.getOrRule() ||
				   context == grammarAccess.getOrAccess().getTypedEqualsLeftAction_1_0_0() ||
				   context == grammarAccess.getPrimaryExpressionRule() ||
				   context == grammarAccess.getToplevelStatementRule()) {
					sequence_FunctionDeclaration(context, (FunctionDeclaration) semanticObject); 
					return; 
				}
				else break;
			case LeekPackage.GLOBAL_DECLARATION:
				if(context == grammarAccess.getGlobalDeclarationRule() ||
				   context == grammarAccess.getToplevelStatementRule()) {
					sequence_GlobalDeclaration(context, (GlobalDeclaration) semanticObject); 
					return; 
				}
				else break;
			case LeekPackage.IF:
				if(context == grammarAccess.getIfRule() ||
				   context == grammarAccess.getStatementRule() ||
				   context == grammarAccess.getToplevelStatementRule()) {
					sequence_If(context, (If) semanticObject); 
					return; 
				}
				else break;
			case LeekPackage.INCLUDE:
				if(context == grammarAccess.getIncludeRule() ||
				   context == grammarAccess.getToplevelStatementRule()) {
					sequence_Include(context, (Include) semanticObject); 
					return; 
				}
				else break;
			case LeekPackage.INT_LITERAL:
				if(context == grammarAccess.getAdditionRule() ||
				   context == grammarAccess.getAdditionAccess().getMinusLeftAction_1_0_1_0() ||
				   context == grammarAccess.getAdditionAccess().getPlusLeftAction_1_0_0_0() ||
				   context == grammarAccess.getAndRule() ||
				   context == grammarAccess.getAndAccess().getTypedEqualsLeftAction_1_0_0() ||
				   context == grammarAccess.getComparisonRule() ||
				   context == grammarAccess.getComparisonAccess().getDifferentLeftAction_1_0_3_0() ||
				   context == grammarAccess.getComparisonAccess().getEqualsLeftAction_1_0_1_0() ||
				   context == grammarAccess.getComparisonAccess().getLessOrEqualsLeftAction_1_0_4_0() ||
				   context == grammarAccess.getComparisonAccess().getLessLeftAction_1_0_5_0() ||
				   context == grammarAccess.getComparisonAccess().getMoreOrEqualsLeftAction_1_0_6_0() ||
				   context == grammarAccess.getComparisonAccess().getMoreLeftAction_1_0_7_0() ||
				   context == grammarAccess.getComparisonAccess().getTypedDifferentLeftAction_1_0_2_0() ||
				   context == grammarAccess.getComparisonAccess().getTypedEqualsLeftAction_1_0_0_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getMultiplicationRule() ||
				   context == grammarAccess.getMultiplicationAccess().getDivLeftAction_1_0_1_0() ||
				   context == grammarAccess.getMultiplicationAccess().getMultiLeftAction_1_0_0_0() ||
				   context == grammarAccess.getOrRule() ||
				   context == grammarAccess.getOrAccess().getTypedEqualsLeftAction_1_0_0() ||
				   context == grammarAccess.getPrimaryExpressionRule()) {
					sequence_PrimaryExpression(context, (IntLiteral) semanticObject); 
					return; 
				}
				else break;
			case LeekPackage.LESS:
				if(context == grammarAccess.getAdditionRule() ||
				   context == grammarAccess.getAdditionAccess().getMinusLeftAction_1_0_1_0() ||
				   context == grammarAccess.getAdditionAccess().getPlusLeftAction_1_0_0_0() ||
				   context == grammarAccess.getAndRule() ||
				   context == grammarAccess.getAndAccess().getTypedEqualsLeftAction_1_0_0() ||
				   context == grammarAccess.getComparisonRule() ||
				   context == grammarAccess.getComparisonAccess().getDifferentLeftAction_1_0_3_0() ||
				   context == grammarAccess.getComparisonAccess().getEqualsLeftAction_1_0_1_0() ||
				   context == grammarAccess.getComparisonAccess().getLessOrEqualsLeftAction_1_0_4_0() ||
				   context == grammarAccess.getComparisonAccess().getLessLeftAction_1_0_5_0() ||
				   context == grammarAccess.getComparisonAccess().getMoreOrEqualsLeftAction_1_0_6_0() ||
				   context == grammarAccess.getComparisonAccess().getMoreLeftAction_1_0_7_0() ||
				   context == grammarAccess.getComparisonAccess().getTypedDifferentLeftAction_1_0_2_0() ||
				   context == grammarAccess.getComparisonAccess().getTypedEqualsLeftAction_1_0_0_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getMultiplicationRule() ||
				   context == grammarAccess.getMultiplicationAccess().getDivLeftAction_1_0_1_0() ||
				   context == grammarAccess.getMultiplicationAccess().getMultiLeftAction_1_0_0_0() ||
				   context == grammarAccess.getOrRule() ||
				   context == grammarAccess.getOrAccess().getTypedEqualsLeftAction_1_0_0() ||
				   context == grammarAccess.getPrimaryExpressionRule()) {
					sequence_Comparison(context, (Less) semanticObject); 
					return; 
				}
				else break;
			case LeekPackage.LESS_OR_EQUALS:
				if(context == grammarAccess.getAdditionRule() ||
				   context == grammarAccess.getAdditionAccess().getMinusLeftAction_1_0_1_0() ||
				   context == grammarAccess.getAdditionAccess().getPlusLeftAction_1_0_0_0() ||
				   context == grammarAccess.getAndRule() ||
				   context == grammarAccess.getAndAccess().getTypedEqualsLeftAction_1_0_0() ||
				   context == grammarAccess.getComparisonRule() ||
				   context == grammarAccess.getComparisonAccess().getDifferentLeftAction_1_0_3_0() ||
				   context == grammarAccess.getComparisonAccess().getEqualsLeftAction_1_0_1_0() ||
				   context == grammarAccess.getComparisonAccess().getLessOrEqualsLeftAction_1_0_4_0() ||
				   context == grammarAccess.getComparisonAccess().getLessLeftAction_1_0_5_0() ||
				   context == grammarAccess.getComparisonAccess().getMoreOrEqualsLeftAction_1_0_6_0() ||
				   context == grammarAccess.getComparisonAccess().getMoreLeftAction_1_0_7_0() ||
				   context == grammarAccess.getComparisonAccess().getTypedDifferentLeftAction_1_0_2_0() ||
				   context == grammarAccess.getComparisonAccess().getTypedEqualsLeftAction_1_0_0_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getMultiplicationRule() ||
				   context == grammarAccess.getMultiplicationAccess().getDivLeftAction_1_0_1_0() ||
				   context == grammarAccess.getMultiplicationAccess().getMultiLeftAction_1_0_0_0() ||
				   context == grammarAccess.getOrRule() ||
				   context == grammarAccess.getOrAccess().getTypedEqualsLeftAction_1_0_0() ||
				   context == grammarAccess.getPrimaryExpressionRule()) {
					sequence_Comparison(context, (LessOrEquals) semanticObject); 
					return; 
				}
				else break;
			case LeekPackage.LOCAL_DECLARATION:
				if(context == grammarAccess.getLocalDeclarationRule() ||
				   context == grammarAccess.getStatementRule() ||
				   context == grammarAccess.getToplevelStatementRule()) {
					sequence_LocalDeclaration(context, (LocalDeclaration) semanticObject); 
					return; 
				}
				else break;
			case LeekPackage.MINUS:
				if(context == grammarAccess.getAdditionRule() ||
				   context == grammarAccess.getAdditionAccess().getMinusLeftAction_1_0_1_0() ||
				   context == grammarAccess.getAdditionAccess().getPlusLeftAction_1_0_0_0() ||
				   context == grammarAccess.getAndRule() ||
				   context == grammarAccess.getAndAccess().getTypedEqualsLeftAction_1_0_0() ||
				   context == grammarAccess.getComparisonRule() ||
				   context == grammarAccess.getComparisonAccess().getDifferentLeftAction_1_0_3_0() ||
				   context == grammarAccess.getComparisonAccess().getEqualsLeftAction_1_0_1_0() ||
				   context == grammarAccess.getComparisonAccess().getLessOrEqualsLeftAction_1_0_4_0() ||
				   context == grammarAccess.getComparisonAccess().getLessLeftAction_1_0_5_0() ||
				   context == grammarAccess.getComparisonAccess().getMoreOrEqualsLeftAction_1_0_6_0() ||
				   context == grammarAccess.getComparisonAccess().getMoreLeftAction_1_0_7_0() ||
				   context == grammarAccess.getComparisonAccess().getTypedDifferentLeftAction_1_0_2_0() ||
				   context == grammarAccess.getComparisonAccess().getTypedEqualsLeftAction_1_0_0_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getMultiplicationRule() ||
				   context == grammarAccess.getMultiplicationAccess().getDivLeftAction_1_0_1_0() ||
				   context == grammarAccess.getMultiplicationAccess().getMultiLeftAction_1_0_0_0() ||
				   context == grammarAccess.getOrRule() ||
				   context == grammarAccess.getOrAccess().getTypedEqualsLeftAction_1_0_0() ||
				   context == grammarAccess.getPrimaryExpressionRule()) {
					sequence_Addition(context, (Minus) semanticObject); 
					return; 
				}
				else break;
			case LeekPackage.MORE:
				if(context == grammarAccess.getAdditionRule() ||
				   context == grammarAccess.getAdditionAccess().getMinusLeftAction_1_0_1_0() ||
				   context == grammarAccess.getAdditionAccess().getPlusLeftAction_1_0_0_0() ||
				   context == grammarAccess.getAndRule() ||
				   context == grammarAccess.getAndAccess().getTypedEqualsLeftAction_1_0_0() ||
				   context == grammarAccess.getComparisonRule() ||
				   context == grammarAccess.getComparisonAccess().getDifferentLeftAction_1_0_3_0() ||
				   context == grammarAccess.getComparisonAccess().getEqualsLeftAction_1_0_1_0() ||
				   context == grammarAccess.getComparisonAccess().getLessOrEqualsLeftAction_1_0_4_0() ||
				   context == grammarAccess.getComparisonAccess().getLessLeftAction_1_0_5_0() ||
				   context == grammarAccess.getComparisonAccess().getMoreOrEqualsLeftAction_1_0_6_0() ||
				   context == grammarAccess.getComparisonAccess().getMoreLeftAction_1_0_7_0() ||
				   context == grammarAccess.getComparisonAccess().getTypedDifferentLeftAction_1_0_2_0() ||
				   context == grammarAccess.getComparisonAccess().getTypedEqualsLeftAction_1_0_0_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getMultiplicationRule() ||
				   context == grammarAccess.getMultiplicationAccess().getDivLeftAction_1_0_1_0() ||
				   context == grammarAccess.getMultiplicationAccess().getMultiLeftAction_1_0_0_0() ||
				   context == grammarAccess.getOrRule() ||
				   context == grammarAccess.getOrAccess().getTypedEqualsLeftAction_1_0_0() ||
				   context == grammarAccess.getPrimaryExpressionRule()) {
					sequence_Comparison(context, (More) semanticObject); 
					return; 
				}
				else break;
			case LeekPackage.MORE_OR_EQUALS:
				if(context == grammarAccess.getAdditionRule() ||
				   context == grammarAccess.getAdditionAccess().getMinusLeftAction_1_0_1_0() ||
				   context == grammarAccess.getAdditionAccess().getPlusLeftAction_1_0_0_0() ||
				   context == grammarAccess.getAndRule() ||
				   context == grammarAccess.getAndAccess().getTypedEqualsLeftAction_1_0_0() ||
				   context == grammarAccess.getComparisonRule() ||
				   context == grammarAccess.getComparisonAccess().getDifferentLeftAction_1_0_3_0() ||
				   context == grammarAccess.getComparisonAccess().getEqualsLeftAction_1_0_1_0() ||
				   context == grammarAccess.getComparisonAccess().getLessOrEqualsLeftAction_1_0_4_0() ||
				   context == grammarAccess.getComparisonAccess().getLessLeftAction_1_0_5_0() ||
				   context == grammarAccess.getComparisonAccess().getMoreOrEqualsLeftAction_1_0_6_0() ||
				   context == grammarAccess.getComparisonAccess().getMoreLeftAction_1_0_7_0() ||
				   context == grammarAccess.getComparisonAccess().getTypedDifferentLeftAction_1_0_2_0() ||
				   context == grammarAccess.getComparisonAccess().getTypedEqualsLeftAction_1_0_0_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getMultiplicationRule() ||
				   context == grammarAccess.getMultiplicationAccess().getDivLeftAction_1_0_1_0() ||
				   context == grammarAccess.getMultiplicationAccess().getMultiLeftAction_1_0_0_0() ||
				   context == grammarAccess.getOrRule() ||
				   context == grammarAccess.getOrAccess().getTypedEqualsLeftAction_1_0_0() ||
				   context == grammarAccess.getPrimaryExpressionRule()) {
					sequence_Comparison(context, (MoreOrEquals) semanticObject); 
					return; 
				}
				else break;
			case LeekPackage.MULTI:
				if(context == grammarAccess.getAdditionRule() ||
				   context == grammarAccess.getAdditionAccess().getMinusLeftAction_1_0_1_0() ||
				   context == grammarAccess.getAdditionAccess().getPlusLeftAction_1_0_0_0() ||
				   context == grammarAccess.getAndRule() ||
				   context == grammarAccess.getAndAccess().getTypedEqualsLeftAction_1_0_0() ||
				   context == grammarAccess.getComparisonRule() ||
				   context == grammarAccess.getComparisonAccess().getDifferentLeftAction_1_0_3_0() ||
				   context == grammarAccess.getComparisonAccess().getEqualsLeftAction_1_0_1_0() ||
				   context == grammarAccess.getComparisonAccess().getLessOrEqualsLeftAction_1_0_4_0() ||
				   context == grammarAccess.getComparisonAccess().getLessLeftAction_1_0_5_0() ||
				   context == grammarAccess.getComparisonAccess().getMoreOrEqualsLeftAction_1_0_6_0() ||
				   context == grammarAccess.getComparisonAccess().getMoreLeftAction_1_0_7_0() ||
				   context == grammarAccess.getComparisonAccess().getTypedDifferentLeftAction_1_0_2_0() ||
				   context == grammarAccess.getComparisonAccess().getTypedEqualsLeftAction_1_0_0_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getMultiplicationRule() ||
				   context == grammarAccess.getMultiplicationAccess().getDivLeftAction_1_0_1_0() ||
				   context == grammarAccess.getMultiplicationAccess().getMultiLeftAction_1_0_0_0() ||
				   context == grammarAccess.getOrRule() ||
				   context == grammarAccess.getOrAccess().getTypedEqualsLeftAction_1_0_0() ||
				   context == grammarAccess.getPrimaryExpressionRule()) {
					sequence_Multiplication(context, (Multi) semanticObject); 
					return; 
				}
				else break;
			case LeekPackage.PARAMETER_DECLARATION:
				if(context == grammarAccess.getParameterDeclarationRule() ||
				   context == grammarAccess.getVariableReferenceableRule()) {
					sequence_ParameterDeclaration(context, (ParameterDeclaration) semanticObject); 
					return; 
				}
				else break;
			case LeekPackage.PLUS:
				if(context == grammarAccess.getAdditionRule() ||
				   context == grammarAccess.getAdditionAccess().getMinusLeftAction_1_0_1_0() ||
				   context == grammarAccess.getAdditionAccess().getPlusLeftAction_1_0_0_0() ||
				   context == grammarAccess.getAndRule() ||
				   context == grammarAccess.getAndAccess().getTypedEqualsLeftAction_1_0_0() ||
				   context == grammarAccess.getComparisonRule() ||
				   context == grammarAccess.getComparisonAccess().getDifferentLeftAction_1_0_3_0() ||
				   context == grammarAccess.getComparisonAccess().getEqualsLeftAction_1_0_1_0() ||
				   context == grammarAccess.getComparisonAccess().getLessOrEqualsLeftAction_1_0_4_0() ||
				   context == grammarAccess.getComparisonAccess().getLessLeftAction_1_0_5_0() ||
				   context == grammarAccess.getComparisonAccess().getMoreOrEqualsLeftAction_1_0_6_0() ||
				   context == grammarAccess.getComparisonAccess().getMoreLeftAction_1_0_7_0() ||
				   context == grammarAccess.getComparisonAccess().getTypedDifferentLeftAction_1_0_2_0() ||
				   context == grammarAccess.getComparisonAccess().getTypedEqualsLeftAction_1_0_0_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getMultiplicationRule() ||
				   context == grammarAccess.getMultiplicationAccess().getDivLeftAction_1_0_1_0() ||
				   context == grammarAccess.getMultiplicationAccess().getMultiLeftAction_1_0_0_0() ||
				   context == grammarAccess.getOrRule() ||
				   context == grammarAccess.getOrAccess().getTypedEqualsLeftAction_1_0_0() ||
				   context == grammarAccess.getPrimaryExpressionRule()) {
					sequence_Addition(context, (Plus) semanticObject); 
					return; 
				}
				else break;
			case LeekPackage.REAL_LITERAL:
				if(context == grammarAccess.getAdditionRule() ||
				   context == grammarAccess.getAdditionAccess().getMinusLeftAction_1_0_1_0() ||
				   context == grammarAccess.getAdditionAccess().getPlusLeftAction_1_0_0_0() ||
				   context == grammarAccess.getAndRule() ||
				   context == grammarAccess.getAndAccess().getTypedEqualsLeftAction_1_0_0() ||
				   context == grammarAccess.getComparisonRule() ||
				   context == grammarAccess.getComparisonAccess().getDifferentLeftAction_1_0_3_0() ||
				   context == grammarAccess.getComparisonAccess().getEqualsLeftAction_1_0_1_0() ||
				   context == grammarAccess.getComparisonAccess().getLessOrEqualsLeftAction_1_0_4_0() ||
				   context == grammarAccess.getComparisonAccess().getLessLeftAction_1_0_5_0() ||
				   context == grammarAccess.getComparisonAccess().getMoreOrEqualsLeftAction_1_0_6_0() ||
				   context == grammarAccess.getComparisonAccess().getMoreLeftAction_1_0_7_0() ||
				   context == grammarAccess.getComparisonAccess().getTypedDifferentLeftAction_1_0_2_0() ||
				   context == grammarAccess.getComparisonAccess().getTypedEqualsLeftAction_1_0_0_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getMultiplicationRule() ||
				   context == grammarAccess.getMultiplicationAccess().getDivLeftAction_1_0_1_0() ||
				   context == grammarAccess.getMultiplicationAccess().getMultiLeftAction_1_0_0_0() ||
				   context == grammarAccess.getOrRule() ||
				   context == grammarAccess.getOrAccess().getTypedEqualsLeftAction_1_0_0() ||
				   context == grammarAccess.getPrimaryExpressionRule()) {
					sequence_PrimaryExpression(context, (RealLiteral) semanticObject); 
					return; 
				}
				else break;
			case LeekPackage.RETURN:
				if(context == grammarAccess.getReturnRule() ||
				   context == grammarAccess.getStatementRule() ||
				   context == grammarAccess.getToplevelStatementRule()) {
					sequence_Return(context, (Return) semanticObject); 
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
				   context == grammarAccess.getStatementBlockRule() ||
				   context == grammarAccess.getToplevelStatementRule()) {
					sequence_StatementBlock(context, (StatementBlock) semanticObject); 
					return; 
				}
				else break;
			case LeekPackage.STRING_LITERAL:
				if(context == grammarAccess.getAdditionRule() ||
				   context == grammarAccess.getAdditionAccess().getMinusLeftAction_1_0_1_0() ||
				   context == grammarAccess.getAdditionAccess().getPlusLeftAction_1_0_0_0() ||
				   context == grammarAccess.getAndRule() ||
				   context == grammarAccess.getAndAccess().getTypedEqualsLeftAction_1_0_0() ||
				   context == grammarAccess.getComparisonRule() ||
				   context == grammarAccess.getComparisonAccess().getDifferentLeftAction_1_0_3_0() ||
				   context == grammarAccess.getComparisonAccess().getEqualsLeftAction_1_0_1_0() ||
				   context == grammarAccess.getComparisonAccess().getLessOrEqualsLeftAction_1_0_4_0() ||
				   context == grammarAccess.getComparisonAccess().getLessLeftAction_1_0_5_0() ||
				   context == grammarAccess.getComparisonAccess().getMoreOrEqualsLeftAction_1_0_6_0() ||
				   context == grammarAccess.getComparisonAccess().getMoreLeftAction_1_0_7_0() ||
				   context == grammarAccess.getComparisonAccess().getTypedDifferentLeftAction_1_0_2_0() ||
				   context == grammarAccess.getComparisonAccess().getTypedEqualsLeftAction_1_0_0_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getMultiplicationRule() ||
				   context == grammarAccess.getMultiplicationAccess().getDivLeftAction_1_0_1_0() ||
				   context == grammarAccess.getMultiplicationAccess().getMultiLeftAction_1_0_0_0() ||
				   context == grammarAccess.getOrRule() ||
				   context == grammarAccess.getOrAccess().getTypedEqualsLeftAction_1_0_0() ||
				   context == grammarAccess.getPrimaryExpressionRule()) {
					sequence_PrimaryExpression(context, (StringLiteral) semanticObject); 
					return; 
				}
				else break;
			case LeekPackage.TYPED_DIFFERENT:
				if(context == grammarAccess.getAdditionRule() ||
				   context == grammarAccess.getAdditionAccess().getMinusLeftAction_1_0_1_0() ||
				   context == grammarAccess.getAdditionAccess().getPlusLeftAction_1_0_0_0() ||
				   context == grammarAccess.getAndRule() ||
				   context == grammarAccess.getAndAccess().getTypedEqualsLeftAction_1_0_0() ||
				   context == grammarAccess.getComparisonRule() ||
				   context == grammarAccess.getComparisonAccess().getDifferentLeftAction_1_0_3_0() ||
				   context == grammarAccess.getComparisonAccess().getEqualsLeftAction_1_0_1_0() ||
				   context == grammarAccess.getComparisonAccess().getLessOrEqualsLeftAction_1_0_4_0() ||
				   context == grammarAccess.getComparisonAccess().getLessLeftAction_1_0_5_0() ||
				   context == grammarAccess.getComparisonAccess().getMoreOrEqualsLeftAction_1_0_6_0() ||
				   context == grammarAccess.getComparisonAccess().getMoreLeftAction_1_0_7_0() ||
				   context == grammarAccess.getComparisonAccess().getTypedDifferentLeftAction_1_0_2_0() ||
				   context == grammarAccess.getComparisonAccess().getTypedEqualsLeftAction_1_0_0_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getMultiplicationRule() ||
				   context == grammarAccess.getMultiplicationAccess().getDivLeftAction_1_0_1_0() ||
				   context == grammarAccess.getMultiplicationAccess().getMultiLeftAction_1_0_0_0() ||
				   context == grammarAccess.getOrRule() ||
				   context == grammarAccess.getOrAccess().getTypedEqualsLeftAction_1_0_0() ||
				   context == grammarAccess.getPrimaryExpressionRule()) {
					sequence_Comparison(context, (TypedDifferent) semanticObject); 
					return; 
				}
				else break;
			case LeekPackage.TYPED_EQUALS:
				if(context == grammarAccess.getAdditionRule() ||
				   context == grammarAccess.getAdditionAccess().getMinusLeftAction_1_0_1_0() ||
				   context == grammarAccess.getAdditionAccess().getPlusLeftAction_1_0_0_0() ||
				   context == grammarAccess.getAndRule() ||
				   context == grammarAccess.getAndAccess().getTypedEqualsLeftAction_1_0_0() ||
				   context == grammarAccess.getComparisonRule() ||
				   context == grammarAccess.getComparisonAccess().getDifferentLeftAction_1_0_3_0() ||
				   context == grammarAccess.getComparisonAccess().getEqualsLeftAction_1_0_1_0() ||
				   context == grammarAccess.getComparisonAccess().getLessOrEqualsLeftAction_1_0_4_0() ||
				   context == grammarAccess.getComparisonAccess().getLessLeftAction_1_0_5_0() ||
				   context == grammarAccess.getComparisonAccess().getMoreOrEqualsLeftAction_1_0_6_0() ||
				   context == grammarAccess.getComparisonAccess().getMoreLeftAction_1_0_7_0() ||
				   context == grammarAccess.getComparisonAccess().getTypedDifferentLeftAction_1_0_2_0() ||
				   context == grammarAccess.getComparisonAccess().getTypedEqualsLeftAction_1_0_0_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getMultiplicationRule() ||
				   context == grammarAccess.getMultiplicationAccess().getDivLeftAction_1_0_1_0() ||
				   context == grammarAccess.getMultiplicationAccess().getMultiLeftAction_1_0_0_0() ||
				   context == grammarAccess.getOrRule() ||
				   context == grammarAccess.getOrAccess().getTypedEqualsLeftAction_1_0_0() ||
				   context == grammarAccess.getPrimaryExpressionRule()) {
					sequence_And_Comparison_Or(context, (TypedEquals) semanticObject); 
					return; 
				}
				else break;
			case LeekPackage.VARIABLE_DECLARATION:
				if(context == grammarAccess.getVariableDeclarationRule() ||
				   context == grammarAccess.getVariableReferenceableRule()) {
					sequence_VariableDeclaration(context, (VariableDeclaration) semanticObject); 
					return; 
				}
				else break;
			case LeekPackage.VARIABLE_ITERATOR:
				if(context == grammarAccess.getForIteratorRule() ||
				   context == grammarAccess.getVariableIteratorRule()) {
					sequence_VariableIterator(context, (VariableIterator) semanticObject); 
					return; 
				}
				else break;
			case LeekPackage.VARIABLE_REFERENCE:
				if(context == grammarAccess.getAdditionRule() ||
				   context == grammarAccess.getAdditionAccess().getMinusLeftAction_1_0_1_0() ||
				   context == grammarAccess.getAdditionAccess().getPlusLeftAction_1_0_0_0() ||
				   context == grammarAccess.getAndRule() ||
				   context == grammarAccess.getAndAccess().getTypedEqualsLeftAction_1_0_0() ||
				   context == grammarAccess.getComparisonRule() ||
				   context == grammarAccess.getComparisonAccess().getDifferentLeftAction_1_0_3_0() ||
				   context == grammarAccess.getComparisonAccess().getEqualsLeftAction_1_0_1_0() ||
				   context == grammarAccess.getComparisonAccess().getLessOrEqualsLeftAction_1_0_4_0() ||
				   context == grammarAccess.getComparisonAccess().getLessLeftAction_1_0_5_0() ||
				   context == grammarAccess.getComparisonAccess().getMoreOrEqualsLeftAction_1_0_6_0() ||
				   context == grammarAccess.getComparisonAccess().getMoreLeftAction_1_0_7_0() ||
				   context == grammarAccess.getComparisonAccess().getTypedDifferentLeftAction_1_0_2_0() ||
				   context == grammarAccess.getComparisonAccess().getTypedEqualsLeftAction_1_0_0_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getMultiplicationRule() ||
				   context == grammarAccess.getMultiplicationAccess().getDivLeftAction_1_0_1_0() ||
				   context == grammarAccess.getMultiplicationAccess().getMultiLeftAction_1_0_0_0() ||
				   context == grammarAccess.getOrRule() ||
				   context == grammarAccess.getOrAccess().getTypedEqualsLeftAction_1_0_0() ||
				   context == grammarAccess.getPrimaryExpressionRule() ||
				   context == grammarAccess.getVariableReferenceRule()) {
					sequence_VariableReference(context, (VariableReference) semanticObject); 
					return; 
				}
				else break;
			case LeekPackage.WHILE:
				if(context == grammarAccess.getStatementRule() ||
				   context == grammarAccess.getToplevelStatementRule() ||
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
	 *     (variable=VariableReference value=Expression)
	 */
	protected void sequence_Affectation(EObject context, Affectation semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, LeekPackage.Literals.AFFECTATION__VARIABLE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LeekPackage.Literals.AFFECTATION__VARIABLE));
			if(transientValues.isValueTransient(semanticObject, LeekPackage.Literals.AFFECTATION__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LeekPackage.Literals.AFFECTATION__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getAffectationAccess().getVariableVariableReferenceParserRuleCall_0_0(), semanticObject.getVariable());
		feeder.accept(grammarAccess.getAffectationAccess().getValueExpressionParserRuleCall_2_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     ((left=Or_TypedEquals_1_0_0 right=And) | (left=And_TypedEquals_1_0_0 right=Addition) | (left=Comparison_TypedEquals_1_0_0_0 right=Or))
	 */
	protected void sequence_And_Comparison_Or(EObject context, TypedEquals semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
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
	 *     (key=VariableDeclaration? value=VariableDeclaration array=Expression)
	 */
	protected void sequence_EachIterator(EObject context, EachIterator semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (iterator=ForIterator statement=Statement)
	 */
	protected void sequence_For(EObject context, For semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, LeekPackage.Literals.FOR__ITERATOR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LeekPackage.Literals.FOR__ITERATOR));
			if(transientValues.isValueTransient(semanticObject, LeekPackage.Literals.FOR__STATEMENT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LeekPackage.Literals.FOR__STATEMENT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getForAccess().getIteratorForIteratorParserRuleCall_2_0(), semanticObject.getIterator());
		feeder.accept(grammarAccess.getForAccess().getStatementStatementParserRuleCall_4_0(), semanticObject.getStatement());
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
	 *     (condition=Expression then=Statement else=Statement?)
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
	 *     (left=Multiplication_Div_1_0_1_0 right=PrimaryExpression)
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
		feeder.accept(grammarAccess.getMultiplicationAccess().getRightPrimaryExpressionParserRuleCall_1_1_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (left=Multiplication_Multi_1_0_0_0 right=PrimaryExpression)
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
		feeder.accept(grammarAccess.getMultiplicationAccess().getRightPrimaryExpressionParserRuleCall_1_1_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (byAdress?='@'? name=ID)
	 */
	protected void sequence_ParameterDeclaration(EObject context, ParameterDeclaration semanticObject) {
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
		feeder.accept(grammarAccess.getPrimaryExpressionAccess().getValueINTTerminalRuleCall_2_1_0(), semanticObject.getValue());
		feeder.finish();
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
		feeder.accept(grammarAccess.getPrimaryExpressionAccess().getValueREALTerminalRuleCall_1_1_0(), semanticObject.getValue());
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
		feeder.accept(grammarAccess.getPrimaryExpressionAccess().getValueSTRINGTerminalRuleCall_5_1_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     value=Expression
	 */
	protected void sequence_Return(EObject context, Return semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, LeekPackage.Literals.RETURN__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LeekPackage.Literals.RETURN__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getReturnAccess().getValueExpressionParserRuleCall_1_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     statements+=ToplevelStatement*
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
	 *     (name=ID value=Expression?)
	 */
	protected void sequence_VariableDeclaration(EObject context, VariableDeclaration semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (initialization=Affectation condition=Expression increment=Expression)
	 */
	protected void sequence_VariableIterator(EObject context, VariableIterator semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, LeekPackage.Literals.VARIABLE_ITERATOR__INITIALIZATION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LeekPackage.Literals.VARIABLE_ITERATOR__INITIALIZATION));
			if(transientValues.isValueTransient(semanticObject, LeekPackage.Literals.VARIABLE_ITERATOR__CONDITION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LeekPackage.Literals.VARIABLE_ITERATOR__CONDITION));
			if(transientValues.isValueTransient(semanticObject, LeekPackage.Literals.VARIABLE_ITERATOR__INCREMENT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LeekPackage.Literals.VARIABLE_ITERATOR__INCREMENT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getVariableIteratorAccess().getInitializationAffectationParserRuleCall_0_0(), semanticObject.getInitialization());
		feeder.accept(grammarAccess.getVariableIteratorAccess().getConditionExpressionParserRuleCall_2_0(), semanticObject.getCondition());
		feeder.accept(grammarAccess.getVariableIteratorAccess().getIncrementExpressionParserRuleCall_4_0(), semanticObject.getIncrement());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (variable=[VariableReferenceable|ID] dimensions+=Expression*)
	 */
	protected void sequence_VariableReference(EObject context, VariableReference semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (condition=Expression statement=Statement)
	 */
	protected void sequence_While(EObject context, While semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, LeekPackage.Literals.WHILE__CONDITION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LeekPackage.Literals.WHILE__CONDITION));
			if(transientValues.isValueTransient(semanticObject, LeekPackage.Literals.WHILE__STATEMENT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LeekPackage.Literals.WHILE__STATEMENT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getWhileAccess().getConditionExpressionParserRuleCall_2_0(), semanticObject.getCondition());
		feeder.accept(grammarAccess.getWhileAccess().getStatementStatementParserRuleCall_4_0(), semanticObject.getStatement());
		feeder.finish();
	}
}
