package org.processus.ecleek.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.processus.ecleek.services.LeekGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalLeekParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_REAL", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "';'", "'break'", "'continue'", "'{'", "'}'", "'='", "'-='", "'+='", "'if'", "'('", "')'", "'else'", "'while'", "'for'", "':'", "'in'", "'var'", "'function'", "','", "'@'", "'global'", "'==='", "'=='", "'!=='", "'!='", "'<='", "'<'", "'>='", "'>'", "'or'", "'||'", "'and'", "'&&'", "'+'", "'-'", "'*'", "'/'", "'null'", "'false'", "'true'", "'['", "']'", "'--'", "'++'", "'return'", "'include'"
    };
    public static final int RULE_ID=4;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=11;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int EOF=-1;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__19=19;
    public static final int T__57=57;
    public static final int T__51=51;
    public static final int T__16=16;
    public static final int T__52=52;
    public static final int T__15=15;
    public static final int T__53=53;
    public static final int T__18=18;
    public static final int T__54=54;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=6;
    public static final int RULE_REAL=5;
    public static final int T__50=50;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int RULE_SL_COMMENT=9;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int RULE_STRING=7;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int RULE_WS=10;

    // delegates
    // delegators


        public InternalLeekParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalLeekParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalLeekParser.tokenNames; }
    public String getGrammarFileName() { return "../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g"; }



     	private LeekGrammarAccess grammarAccess;
     	
        public InternalLeekParser(TokenStream input, LeekGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Script";	
       	}
       	
       	@Override
       	protected LeekGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleScript"
    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:67:1: entryRuleScript returns [EObject current=null] : iv_ruleScript= ruleScript EOF ;
    public final EObject entryRuleScript() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleScript = null;


        try {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:68:2: (iv_ruleScript= ruleScript EOF )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:69:2: iv_ruleScript= ruleScript EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getScriptRule()); 
            }
            pushFollow(FOLLOW_ruleScript_in_entryRuleScript75);
            iv_ruleScript=ruleScript();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleScript; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleScript85); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleScript"


    // $ANTLR start "ruleScript"
    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:76:1: ruleScript returns [EObject current=null] : ( (lv_statements_0_0= ruleStatement ) )* ;
    public final EObject ruleScript() throws RecognitionException {
        EObject current = null;

        EObject lv_statements_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:79:28: ( ( (lv_statements_0_0= ruleStatement ) )* )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:80:1: ( (lv_statements_0_0= ruleStatement ) )*
            {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:80:1: ( (lv_statements_0_0= ruleStatement ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_ID||(LA1_0>=12 && LA1_0<=15)||LA1_0==20||(LA1_0>=24 && LA1_0<=25)||(LA1_0>=28 && LA1_0<=29)||LA1_0==32||(LA1_0>=56 && LA1_0<=57)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:81:1: (lv_statements_0_0= ruleStatement )
            	    {
            	    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:81:1: (lv_statements_0_0= ruleStatement )
            	    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:82:3: lv_statements_0_0= ruleStatement
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getScriptAccess().getStatementsStatementParserRuleCall_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleStatement_in_ruleScript130);
            	    lv_statements_0_0=ruleStatement();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getScriptRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"statements",
            	              		lv_statements_0_0, 
            	              		"Statement");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleScript"


    // $ANTLR start "entryRuleStatement"
    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:106:1: entryRuleStatement returns [EObject current=null] : iv_ruleStatement= ruleStatement EOF ;
    public final EObject entryRuleStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatement = null;


        try {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:107:2: (iv_ruleStatement= ruleStatement EOF )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:108:2: iv_ruleStatement= ruleStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStatementRule()); 
            }
            pushFollow(FOLLOW_ruleStatement_in_entryRuleStatement166);
            iv_ruleStatement=ruleStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStatement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStatement176); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStatement"


    // $ANTLR start "ruleStatement"
    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:115:1: ruleStatement returns [EObject current=null] : ( (this_Include_0= ruleInclude otherlv_1= ';' ) | (this_GlobalDeclaration_2= ruleGlobalDeclaration otherlv_3= ';' ) | this_FunctionDeclaration_4= ruleFunctionDeclaration | (this_LocalDeclaration_5= ruleLocalDeclaration otherlv_6= ';' ) | (this_FunctionCall_7= ruleFunctionCall otherlv_8= ';' ) | this_Iteration_9= ruleIteration | this_If_10= ruleIf | (this_AffectationStatement_11= ruleAffectationStatement otherlv_12= ';' ) | this_StatementBlock_13= ruleStatementBlock | (this_ReturnStatement_14= ruleReturnStatement otherlv_15= ';' ) | (this_BreakStatement_16= ruleBreakStatement otherlv_17= ';' ) | (this_ContinueStatement_18= ruleContinueStatement otherlv_19= ';' ) | ( () otherlv_21= ';' ) ) ;
    public final EObject ruleStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_12=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        EObject this_Include_0 = null;

        EObject this_GlobalDeclaration_2 = null;

        EObject this_FunctionDeclaration_4 = null;

        EObject this_LocalDeclaration_5 = null;

        EObject this_FunctionCall_7 = null;

        EObject this_Iteration_9 = null;

        EObject this_If_10 = null;

        EObject this_AffectationStatement_11 = null;

        EObject this_StatementBlock_13 = null;

        EObject this_ReturnStatement_14 = null;

        EObject this_BreakStatement_16 = null;

        EObject this_ContinueStatement_18 = null;


         enterRule(); 
            
        try {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:118:28: ( ( (this_Include_0= ruleInclude otherlv_1= ';' ) | (this_GlobalDeclaration_2= ruleGlobalDeclaration otherlv_3= ';' ) | this_FunctionDeclaration_4= ruleFunctionDeclaration | (this_LocalDeclaration_5= ruleLocalDeclaration otherlv_6= ';' ) | (this_FunctionCall_7= ruleFunctionCall otherlv_8= ';' ) | this_Iteration_9= ruleIteration | this_If_10= ruleIf | (this_AffectationStatement_11= ruleAffectationStatement otherlv_12= ';' ) | this_StatementBlock_13= ruleStatementBlock | (this_ReturnStatement_14= ruleReturnStatement otherlv_15= ';' ) | (this_BreakStatement_16= ruleBreakStatement otherlv_17= ';' ) | (this_ContinueStatement_18= ruleContinueStatement otherlv_19= ';' ) | ( () otherlv_21= ';' ) ) )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:119:1: ( (this_Include_0= ruleInclude otherlv_1= ';' ) | (this_GlobalDeclaration_2= ruleGlobalDeclaration otherlv_3= ';' ) | this_FunctionDeclaration_4= ruleFunctionDeclaration | (this_LocalDeclaration_5= ruleLocalDeclaration otherlv_6= ';' ) | (this_FunctionCall_7= ruleFunctionCall otherlv_8= ';' ) | this_Iteration_9= ruleIteration | this_If_10= ruleIf | (this_AffectationStatement_11= ruleAffectationStatement otherlv_12= ';' ) | this_StatementBlock_13= ruleStatementBlock | (this_ReturnStatement_14= ruleReturnStatement otherlv_15= ';' ) | (this_BreakStatement_16= ruleBreakStatement otherlv_17= ';' ) | (this_ContinueStatement_18= ruleContinueStatement otherlv_19= ';' ) | ( () otherlv_21= ';' ) )
            {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:119:1: ( (this_Include_0= ruleInclude otherlv_1= ';' ) | (this_GlobalDeclaration_2= ruleGlobalDeclaration otherlv_3= ';' ) | this_FunctionDeclaration_4= ruleFunctionDeclaration | (this_LocalDeclaration_5= ruleLocalDeclaration otherlv_6= ';' ) | (this_FunctionCall_7= ruleFunctionCall otherlv_8= ';' ) | this_Iteration_9= ruleIteration | this_If_10= ruleIf | (this_AffectationStatement_11= ruleAffectationStatement otherlv_12= ';' ) | this_StatementBlock_13= ruleStatementBlock | (this_ReturnStatement_14= ruleReturnStatement otherlv_15= ';' ) | (this_BreakStatement_16= ruleBreakStatement otherlv_17= ';' ) | (this_ContinueStatement_18= ruleContinueStatement otherlv_19= ';' ) | ( () otherlv_21= ';' ) )
            int alt2=13;
            alt2 = dfa2.predict(input);
            switch (alt2) {
                case 1 :
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:119:2: (this_Include_0= ruleInclude otherlv_1= ';' )
                    {
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:119:2: (this_Include_0= ruleInclude otherlv_1= ';' )
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:120:5: this_Include_0= ruleInclude otherlv_1= ';'
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getStatementAccess().getIncludeParserRuleCall_0_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleInclude_in_ruleStatement224);
                    this_Include_0=ruleInclude();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Include_0; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    otherlv_1=(Token)match(input,12,FOLLOW_12_in_ruleStatement235); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getStatementAccess().getSemicolonKeyword_0_1());
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:133:6: (this_GlobalDeclaration_2= ruleGlobalDeclaration otherlv_3= ';' )
                    {
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:133:6: (this_GlobalDeclaration_2= ruleGlobalDeclaration otherlv_3= ';' )
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:134:5: this_GlobalDeclaration_2= ruleGlobalDeclaration otherlv_3= ';'
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getStatementAccess().getGlobalDeclarationParserRuleCall_1_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleGlobalDeclaration_in_ruleStatement265);
                    this_GlobalDeclaration_2=ruleGlobalDeclaration();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_GlobalDeclaration_2; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    otherlv_3=(Token)match(input,12,FOLLOW_12_in_ruleStatement276); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getStatementAccess().getSemicolonKeyword_1_1());
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:148:5: this_FunctionDeclaration_4= ruleFunctionDeclaration
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getStatementAccess().getFunctionDeclarationParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleFunctionDeclaration_in_ruleStatement305);
                    this_FunctionDeclaration_4=ruleFunctionDeclaration();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_FunctionDeclaration_4; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:157:6: (this_LocalDeclaration_5= ruleLocalDeclaration otherlv_6= ';' )
                    {
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:157:6: (this_LocalDeclaration_5= ruleLocalDeclaration otherlv_6= ';' )
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:158:5: this_LocalDeclaration_5= ruleLocalDeclaration otherlv_6= ';'
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getStatementAccess().getLocalDeclarationParserRuleCall_3_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleLocalDeclaration_in_ruleStatement333);
                    this_LocalDeclaration_5=ruleLocalDeclaration();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_LocalDeclaration_5; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    otherlv_6=(Token)match(input,12,FOLLOW_12_in_ruleStatement344); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getStatementAccess().getSemicolonKeyword_3_1());
                          
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:171:6: (this_FunctionCall_7= ruleFunctionCall otherlv_8= ';' )
                    {
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:171:6: (this_FunctionCall_7= ruleFunctionCall otherlv_8= ';' )
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:172:5: this_FunctionCall_7= ruleFunctionCall otherlv_8= ';'
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getStatementAccess().getFunctionCallParserRuleCall_4_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleFunctionCall_in_ruleStatement374);
                    this_FunctionCall_7=ruleFunctionCall();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_FunctionCall_7; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    otherlv_8=(Token)match(input,12,FOLLOW_12_in_ruleStatement385); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_8, grammarAccess.getStatementAccess().getSemicolonKeyword_4_1());
                          
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:186:5: this_Iteration_9= ruleIteration
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getStatementAccess().getIterationParserRuleCall_5()); 
                          
                    }
                    pushFollow(FOLLOW_ruleIteration_in_ruleStatement414);
                    this_Iteration_9=ruleIteration();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Iteration_9; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 7 :
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:196:5: this_If_10= ruleIf
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getStatementAccess().getIfParserRuleCall_6()); 
                          
                    }
                    pushFollow(FOLLOW_ruleIf_in_ruleStatement441);
                    this_If_10=ruleIf();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_If_10; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 8 :
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:205:6: (this_AffectationStatement_11= ruleAffectationStatement otherlv_12= ';' )
                    {
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:205:6: (this_AffectationStatement_11= ruleAffectationStatement otherlv_12= ';' )
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:206:5: this_AffectationStatement_11= ruleAffectationStatement otherlv_12= ';'
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getStatementAccess().getAffectationStatementParserRuleCall_7_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleAffectationStatement_in_ruleStatement469);
                    this_AffectationStatement_11=ruleAffectationStatement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_AffectationStatement_11; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    otherlv_12=(Token)match(input,12,FOLLOW_12_in_ruleStatement480); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_12, grammarAccess.getStatementAccess().getSemicolonKeyword_7_1());
                          
                    }

                    }


                    }
                    break;
                case 9 :
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:220:5: this_StatementBlock_13= ruleStatementBlock
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getStatementAccess().getStatementBlockParserRuleCall_8()); 
                          
                    }
                    pushFollow(FOLLOW_ruleStatementBlock_in_ruleStatement509);
                    this_StatementBlock_13=ruleStatementBlock();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_StatementBlock_13; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 10 :
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:229:6: (this_ReturnStatement_14= ruleReturnStatement otherlv_15= ';' )
                    {
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:229:6: (this_ReturnStatement_14= ruleReturnStatement otherlv_15= ';' )
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:230:5: this_ReturnStatement_14= ruleReturnStatement otherlv_15= ';'
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getStatementAccess().getReturnStatementParserRuleCall_9_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleReturnStatement_in_ruleStatement537);
                    this_ReturnStatement_14=ruleReturnStatement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_ReturnStatement_14; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    otherlv_15=(Token)match(input,12,FOLLOW_12_in_ruleStatement548); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_15, grammarAccess.getStatementAccess().getSemicolonKeyword_9_1());
                          
                    }

                    }


                    }
                    break;
                case 11 :
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:243:6: (this_BreakStatement_16= ruleBreakStatement otherlv_17= ';' )
                    {
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:243:6: (this_BreakStatement_16= ruleBreakStatement otherlv_17= ';' )
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:244:5: this_BreakStatement_16= ruleBreakStatement otherlv_17= ';'
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getStatementAccess().getBreakStatementParserRuleCall_10_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleBreakStatement_in_ruleStatement578);
                    this_BreakStatement_16=ruleBreakStatement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_BreakStatement_16; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    otherlv_17=(Token)match(input,12,FOLLOW_12_in_ruleStatement589); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_17, grammarAccess.getStatementAccess().getSemicolonKeyword_10_1());
                          
                    }

                    }


                    }
                    break;
                case 12 :
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:257:6: (this_ContinueStatement_18= ruleContinueStatement otherlv_19= ';' )
                    {
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:257:6: (this_ContinueStatement_18= ruleContinueStatement otherlv_19= ';' )
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:258:5: this_ContinueStatement_18= ruleContinueStatement otherlv_19= ';'
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getStatementAccess().getContinueStatementParserRuleCall_11_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleContinueStatement_in_ruleStatement619);
                    this_ContinueStatement_18=ruleContinueStatement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_ContinueStatement_18; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    otherlv_19=(Token)match(input,12,FOLLOW_12_in_ruleStatement630); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_19, grammarAccess.getStatementAccess().getSemicolonKeyword_11_1());
                          
                    }

                    }


                    }
                    break;
                case 13 :
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:271:6: ( () otherlv_21= ';' )
                    {
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:271:6: ( () otherlv_21= ';' )
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:271:7: () otherlv_21= ';'
                    {
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:271:7: ()
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:272:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getStatementAccess().getEmptyStatementAction_12_0(),
                                  current);
                          
                    }

                    }

                    otherlv_21=(Token)match(input,12,FOLLOW_12_in_ruleStatement659); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_21, grammarAccess.getStatementAccess().getSemicolonKeyword_12_1());
                          
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStatement"


    // $ANTLR start "entryRuleBreakStatement"
    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:289:1: entryRuleBreakStatement returns [EObject current=null] : iv_ruleBreakStatement= ruleBreakStatement EOF ;
    public final EObject entryRuleBreakStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBreakStatement = null;


        try {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:290:2: (iv_ruleBreakStatement= ruleBreakStatement EOF )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:291:2: iv_ruleBreakStatement= ruleBreakStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBreakStatementRule()); 
            }
            pushFollow(FOLLOW_ruleBreakStatement_in_entryRuleBreakStatement696);
            iv_ruleBreakStatement=ruleBreakStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBreakStatement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBreakStatement706); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBreakStatement"


    // $ANTLR start "ruleBreakStatement"
    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:298:1: ruleBreakStatement returns [EObject current=null] : ( () otherlv_1= 'break' ) ;
    public final EObject ruleBreakStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:301:28: ( ( () otherlv_1= 'break' ) )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:302:1: ( () otherlv_1= 'break' )
            {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:302:1: ( () otherlv_1= 'break' )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:302:2: () otherlv_1= 'break'
            {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:302:2: ()
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:303:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getBreakStatementAccess().getBreakStatementAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,13,FOLLOW_13_in_ruleBreakStatement752); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getBreakStatementAccess().getBreakKeyword_1());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBreakStatement"


    // $ANTLR start "entryRuleContinueStatement"
    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:320:1: entryRuleContinueStatement returns [EObject current=null] : iv_ruleContinueStatement= ruleContinueStatement EOF ;
    public final EObject entryRuleContinueStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContinueStatement = null;


        try {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:321:2: (iv_ruleContinueStatement= ruleContinueStatement EOF )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:322:2: iv_ruleContinueStatement= ruleContinueStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getContinueStatementRule()); 
            }
            pushFollow(FOLLOW_ruleContinueStatement_in_entryRuleContinueStatement788);
            iv_ruleContinueStatement=ruleContinueStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleContinueStatement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleContinueStatement798); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleContinueStatement"


    // $ANTLR start "ruleContinueStatement"
    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:329:1: ruleContinueStatement returns [EObject current=null] : ( () otherlv_1= 'continue' ) ;
    public final EObject ruleContinueStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:332:28: ( ( () otherlv_1= 'continue' ) )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:333:1: ( () otherlv_1= 'continue' )
            {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:333:1: ( () otherlv_1= 'continue' )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:333:2: () otherlv_1= 'continue'
            {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:333:2: ()
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:334:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getContinueStatementAccess().getContinueStatementAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,14,FOLLOW_14_in_ruleContinueStatement844); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getContinueStatementAccess().getContinueKeyword_1());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleContinueStatement"


    // $ANTLR start "entryRuleStatementBlock"
    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:351:1: entryRuleStatementBlock returns [EObject current=null] : iv_ruleStatementBlock= ruleStatementBlock EOF ;
    public final EObject entryRuleStatementBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatementBlock = null;


        try {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:352:2: (iv_ruleStatementBlock= ruleStatementBlock EOF )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:353:2: iv_ruleStatementBlock= ruleStatementBlock EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStatementBlockRule()); 
            }
            pushFollow(FOLLOW_ruleStatementBlock_in_entryRuleStatementBlock880);
            iv_ruleStatementBlock=ruleStatementBlock();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStatementBlock; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStatementBlock890); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStatementBlock"


    // $ANTLR start "ruleStatementBlock"
    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:360:1: ruleStatementBlock returns [EObject current=null] : (otherlv_0= '{' () ( (lv_statements_2_0= ruleStatement ) )* otherlv_3= '}' ) ;
    public final EObject ruleStatementBlock() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        EObject lv_statements_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:363:28: ( (otherlv_0= '{' () ( (lv_statements_2_0= ruleStatement ) )* otherlv_3= '}' ) )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:364:1: (otherlv_0= '{' () ( (lv_statements_2_0= ruleStatement ) )* otherlv_3= '}' )
            {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:364:1: (otherlv_0= '{' () ( (lv_statements_2_0= ruleStatement ) )* otherlv_3= '}' )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:364:3: otherlv_0= '{' () ( (lv_statements_2_0= ruleStatement ) )* otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,15,FOLLOW_15_in_ruleStatementBlock927); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getStatementBlockAccess().getLeftCurlyBracketKeyword_0());
                  
            }
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:368:1: ()
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:369:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getStatementBlockAccess().getStatementBlockAction_1(),
                          current);
                  
            }

            }

            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:374:2: ( (lv_statements_2_0= ruleStatement ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_ID||(LA3_0>=12 && LA3_0<=15)||LA3_0==20||(LA3_0>=24 && LA3_0<=25)||(LA3_0>=28 && LA3_0<=29)||LA3_0==32||(LA3_0>=56 && LA3_0<=57)) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:375:1: (lv_statements_2_0= ruleStatement )
            	    {
            	    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:375:1: (lv_statements_2_0= ruleStatement )
            	    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:376:3: lv_statements_2_0= ruleStatement
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getStatementBlockAccess().getStatementsStatementParserRuleCall_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleStatement_in_ruleStatementBlock957);
            	    lv_statements_2_0=ruleStatement();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getStatementBlockRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"statements",
            	              		lv_statements_2_0, 
            	              		"Statement");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            otherlv_3=(Token)match(input,16,FOLLOW_16_in_ruleStatementBlock970); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getStatementBlockAccess().getRightCurlyBracketKeyword_3());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStatementBlock"


    // $ANTLR start "entryRuleAffectationStatement"
    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:404:1: entryRuleAffectationStatement returns [EObject current=null] : iv_ruleAffectationStatement= ruleAffectationStatement EOF ;
    public final EObject entryRuleAffectationStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAffectationStatement = null;


        try {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:405:2: (iv_ruleAffectationStatement= ruleAffectationStatement EOF )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:406:2: iv_ruleAffectationStatement= ruleAffectationStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAffectationStatementRule()); 
            }
            pushFollow(FOLLOW_ruleAffectationStatement_in_entryRuleAffectationStatement1006);
            iv_ruleAffectationStatement=ruleAffectationStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAffectationStatement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAffectationStatement1016); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAffectationStatement"


    // $ANTLR start "ruleAffectationStatement"
    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:413:1: ruleAffectationStatement returns [EObject current=null] : ( ( ( ruleAffectationDecrement )=>this_AffectationDecrement_0= ruleAffectationDecrement ) | ( ( ruleAffectationIncrement )=>this_AffectationIncrement_1= ruleAffectationIncrement ) | this_Affectation_2= ruleAffectation ) ;
    public final EObject ruleAffectationStatement() throws RecognitionException {
        EObject current = null;

        EObject this_AffectationDecrement_0 = null;

        EObject this_AffectationIncrement_1 = null;

        EObject this_Affectation_2 = null;


         enterRule(); 
            
        try {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:416:28: ( ( ( ( ruleAffectationDecrement )=>this_AffectationDecrement_0= ruleAffectationDecrement ) | ( ( ruleAffectationIncrement )=>this_AffectationIncrement_1= ruleAffectationIncrement ) | this_Affectation_2= ruleAffectation ) )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:417:1: ( ( ( ruleAffectationDecrement )=>this_AffectationDecrement_0= ruleAffectationDecrement ) | ( ( ruleAffectationIncrement )=>this_AffectationIncrement_1= ruleAffectationIncrement ) | this_Affectation_2= ruleAffectation )
            {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:417:1: ( ( ( ruleAffectationDecrement )=>this_AffectationDecrement_0= ruleAffectationDecrement ) | ( ( ruleAffectationIncrement )=>this_AffectationIncrement_1= ruleAffectationIncrement ) | this_Affectation_2= ruleAffectation )
            int alt4=3;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_ID) ) {
                int LA4_1 = input.LA(2);

                if ( (synpred1_InternalLeek()) ) {
                    alt4=1;
                }
                else if ( (synpred2_InternalLeek()) ) {
                    alt4=2;
                }
                else if ( (true) ) {
                    alt4=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:417:2: ( ( ruleAffectationDecrement )=>this_AffectationDecrement_0= ruleAffectationDecrement )
                    {
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:417:2: ( ( ruleAffectationDecrement )=>this_AffectationDecrement_0= ruleAffectationDecrement )
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:417:3: ( ruleAffectationDecrement )=>this_AffectationDecrement_0= ruleAffectationDecrement
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAffectationStatementAccess().getAffectationDecrementParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleAffectationDecrement_in_ruleAffectationStatement1069);
                    this_AffectationDecrement_0=ruleAffectationDecrement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_AffectationDecrement_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:427:6: ( ( ruleAffectationIncrement )=>this_AffectationIncrement_1= ruleAffectationIncrement )
                    {
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:427:6: ( ( ruleAffectationIncrement )=>this_AffectationIncrement_1= ruleAffectationIncrement )
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:427:7: ( ruleAffectationIncrement )=>this_AffectationIncrement_1= ruleAffectationIncrement
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAffectationStatementAccess().getAffectationIncrementParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleAffectationIncrement_in_ruleAffectationStatement1103);
                    this_AffectationIncrement_1=ruleAffectationIncrement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_AffectationIncrement_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:438:5: this_Affectation_2= ruleAffectation
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAffectationStatementAccess().getAffectationParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleAffectation_in_ruleAffectationStatement1131);
                    this_Affectation_2=ruleAffectation();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Affectation_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAffectationStatement"


    // $ANTLR start "entryRuleAffectation"
    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:454:1: entryRuleAffectation returns [EObject current=null] : iv_ruleAffectation= ruleAffectation EOF ;
    public final EObject entryRuleAffectation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAffectation = null;


        try {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:455:2: (iv_ruleAffectation= ruleAffectation EOF )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:456:2: iv_ruleAffectation= ruleAffectation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAffectationRule()); 
            }
            pushFollow(FOLLOW_ruleAffectation_in_entryRuleAffectation1166);
            iv_ruleAffectation=ruleAffectation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAffectation; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAffectation1176); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAffectation"


    // $ANTLR start "ruleAffectation"
    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:463:1: ruleAffectation returns [EObject current=null] : ( ( (lv_variable_0_0= ruleVariableReference ) ) otherlv_1= '=' ( (lv_value_2_0= ruleExpression ) ) ) ;
    public final EObject ruleAffectation() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_variable_0_0 = null;

        EObject lv_value_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:466:28: ( ( ( (lv_variable_0_0= ruleVariableReference ) ) otherlv_1= '=' ( (lv_value_2_0= ruleExpression ) ) ) )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:467:1: ( ( (lv_variable_0_0= ruleVariableReference ) ) otherlv_1= '=' ( (lv_value_2_0= ruleExpression ) ) )
            {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:467:1: ( ( (lv_variable_0_0= ruleVariableReference ) ) otherlv_1= '=' ( (lv_value_2_0= ruleExpression ) ) )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:467:2: ( (lv_variable_0_0= ruleVariableReference ) ) otherlv_1= '=' ( (lv_value_2_0= ruleExpression ) )
            {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:467:2: ( (lv_variable_0_0= ruleVariableReference ) )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:468:1: (lv_variable_0_0= ruleVariableReference )
            {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:468:1: (lv_variable_0_0= ruleVariableReference )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:469:3: lv_variable_0_0= ruleVariableReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAffectationAccess().getVariableVariableReferenceParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleVariableReference_in_ruleAffectation1222);
            lv_variable_0_0=ruleVariableReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getAffectationRule());
              	        }
                     		set(
                     			current, 
                     			"variable",
                      		lv_variable_0_0, 
                      		"VariableReference");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_1=(Token)match(input,17,FOLLOW_17_in_ruleAffectation1234); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getAffectationAccess().getEqualsSignKeyword_1());
                  
            }
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:489:1: ( (lv_value_2_0= ruleExpression ) )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:490:1: (lv_value_2_0= ruleExpression )
            {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:490:1: (lv_value_2_0= ruleExpression )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:491:3: lv_value_2_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAffectationAccess().getValueExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpression_in_ruleAffectation1255);
            lv_value_2_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getAffectationRule());
              	        }
                     		set(
                     			current, 
                     			"value",
                      		lv_value_2_0, 
                      		"Expression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAffectation"


    // $ANTLR start "entryRuleAffectationDecrement"
    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:515:1: entryRuleAffectationDecrement returns [EObject current=null] : iv_ruleAffectationDecrement= ruleAffectationDecrement EOF ;
    public final EObject entryRuleAffectationDecrement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAffectationDecrement = null;


        try {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:516:2: (iv_ruleAffectationDecrement= ruleAffectationDecrement EOF )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:517:2: iv_ruleAffectationDecrement= ruleAffectationDecrement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAffectationDecrementRule()); 
            }
            pushFollow(FOLLOW_ruleAffectationDecrement_in_entryRuleAffectationDecrement1291);
            iv_ruleAffectationDecrement=ruleAffectationDecrement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAffectationDecrement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAffectationDecrement1301); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAffectationDecrement"


    // $ANTLR start "ruleAffectationDecrement"
    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:524:1: ruleAffectationDecrement returns [EObject current=null] : ( ( (lv_variable_0_0= ruleVariableReference ) ) otherlv_1= '-=' ( (lv_decrement_2_0= ruleExpression ) ) ) ;
    public final EObject ruleAffectationDecrement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_variable_0_0 = null;

        EObject lv_decrement_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:527:28: ( ( ( (lv_variable_0_0= ruleVariableReference ) ) otherlv_1= '-=' ( (lv_decrement_2_0= ruleExpression ) ) ) )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:528:1: ( ( (lv_variable_0_0= ruleVariableReference ) ) otherlv_1= '-=' ( (lv_decrement_2_0= ruleExpression ) ) )
            {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:528:1: ( ( (lv_variable_0_0= ruleVariableReference ) ) otherlv_1= '-=' ( (lv_decrement_2_0= ruleExpression ) ) )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:528:2: ( (lv_variable_0_0= ruleVariableReference ) ) otherlv_1= '-=' ( (lv_decrement_2_0= ruleExpression ) )
            {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:528:2: ( (lv_variable_0_0= ruleVariableReference ) )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:529:1: (lv_variable_0_0= ruleVariableReference )
            {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:529:1: (lv_variable_0_0= ruleVariableReference )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:530:3: lv_variable_0_0= ruleVariableReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAffectationDecrementAccess().getVariableVariableReferenceParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleVariableReference_in_ruleAffectationDecrement1347);
            lv_variable_0_0=ruleVariableReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getAffectationDecrementRule());
              	        }
                     		set(
                     			current, 
                     			"variable",
                      		lv_variable_0_0, 
                      		"VariableReference");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_1=(Token)match(input,18,FOLLOW_18_in_ruleAffectationDecrement1359); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getAffectationDecrementAccess().getHyphenMinusEqualsSignKeyword_1());
                  
            }
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:550:1: ( (lv_decrement_2_0= ruleExpression ) )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:551:1: (lv_decrement_2_0= ruleExpression )
            {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:551:1: (lv_decrement_2_0= ruleExpression )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:552:3: lv_decrement_2_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAffectationDecrementAccess().getDecrementExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpression_in_ruleAffectationDecrement1380);
            lv_decrement_2_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getAffectationDecrementRule());
              	        }
                     		set(
                     			current, 
                     			"decrement",
                      		lv_decrement_2_0, 
                      		"Expression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAffectationDecrement"


    // $ANTLR start "entryRuleAffectationIncrement"
    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:576:1: entryRuleAffectationIncrement returns [EObject current=null] : iv_ruleAffectationIncrement= ruleAffectationIncrement EOF ;
    public final EObject entryRuleAffectationIncrement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAffectationIncrement = null;


        try {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:577:2: (iv_ruleAffectationIncrement= ruleAffectationIncrement EOF )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:578:2: iv_ruleAffectationIncrement= ruleAffectationIncrement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAffectationIncrementRule()); 
            }
            pushFollow(FOLLOW_ruleAffectationIncrement_in_entryRuleAffectationIncrement1416);
            iv_ruleAffectationIncrement=ruleAffectationIncrement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAffectationIncrement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAffectationIncrement1426); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAffectationIncrement"


    // $ANTLR start "ruleAffectationIncrement"
    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:585:1: ruleAffectationIncrement returns [EObject current=null] : ( ( (lv_variable_0_0= ruleVariableReference ) ) otherlv_1= '+=' ( (lv_increment_2_0= ruleExpression ) ) ) ;
    public final EObject ruleAffectationIncrement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_variable_0_0 = null;

        EObject lv_increment_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:588:28: ( ( ( (lv_variable_0_0= ruleVariableReference ) ) otherlv_1= '+=' ( (lv_increment_2_0= ruleExpression ) ) ) )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:589:1: ( ( (lv_variable_0_0= ruleVariableReference ) ) otherlv_1= '+=' ( (lv_increment_2_0= ruleExpression ) ) )
            {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:589:1: ( ( (lv_variable_0_0= ruleVariableReference ) ) otherlv_1= '+=' ( (lv_increment_2_0= ruleExpression ) ) )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:589:2: ( (lv_variable_0_0= ruleVariableReference ) ) otherlv_1= '+=' ( (lv_increment_2_0= ruleExpression ) )
            {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:589:2: ( (lv_variable_0_0= ruleVariableReference ) )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:590:1: (lv_variable_0_0= ruleVariableReference )
            {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:590:1: (lv_variable_0_0= ruleVariableReference )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:591:3: lv_variable_0_0= ruleVariableReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAffectationIncrementAccess().getVariableVariableReferenceParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleVariableReference_in_ruleAffectationIncrement1472);
            lv_variable_0_0=ruleVariableReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getAffectationIncrementRule());
              	        }
                     		set(
                     			current, 
                     			"variable",
                      		lv_variable_0_0, 
                      		"VariableReference");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_1=(Token)match(input,19,FOLLOW_19_in_ruleAffectationIncrement1484); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getAffectationIncrementAccess().getPlusSignEqualsSignKeyword_1());
                  
            }
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:611:1: ( (lv_increment_2_0= ruleExpression ) )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:612:1: (lv_increment_2_0= ruleExpression )
            {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:612:1: (lv_increment_2_0= ruleExpression )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:613:3: lv_increment_2_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAffectationIncrementAccess().getIncrementExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpression_in_ruleAffectationIncrement1505);
            lv_increment_2_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getAffectationIncrementRule());
              	        }
                     		set(
                     			current, 
                     			"increment",
                      		lv_increment_2_0, 
                      		"Expression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAffectationIncrement"


    // $ANTLR start "entryRuleIf"
    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:637:1: entryRuleIf returns [EObject current=null] : iv_ruleIf= ruleIf EOF ;
    public final EObject entryRuleIf() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIf = null;


        try {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:638:2: (iv_ruleIf= ruleIf EOF )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:639:2: iv_ruleIf= ruleIf EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIfRule()); 
            }
            pushFollow(FOLLOW_ruleIf_in_entryRuleIf1541);
            iv_ruleIf=ruleIf();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIf; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIf1551); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIf"


    // $ANTLR start "ruleIf"
    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:646:1: ruleIf returns [EObject current=null] : (otherlv_0= 'if' otherlv_1= '(' ( (lv_condition_2_0= ruleExpression ) ) otherlv_3= ')' ( (lv_then_4_0= ruleStatement ) ) ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_else_6_0= ruleStatement ) ) )? ) ;
    public final EObject ruleIf() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_condition_2_0 = null;

        EObject lv_then_4_0 = null;

        EObject lv_else_6_0 = null;


         enterRule(); 
            
        try {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:649:28: ( (otherlv_0= 'if' otherlv_1= '(' ( (lv_condition_2_0= ruleExpression ) ) otherlv_3= ')' ( (lv_then_4_0= ruleStatement ) ) ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_else_6_0= ruleStatement ) ) )? ) )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:650:1: (otherlv_0= 'if' otherlv_1= '(' ( (lv_condition_2_0= ruleExpression ) ) otherlv_3= ')' ( (lv_then_4_0= ruleStatement ) ) ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_else_6_0= ruleStatement ) ) )? )
            {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:650:1: (otherlv_0= 'if' otherlv_1= '(' ( (lv_condition_2_0= ruleExpression ) ) otherlv_3= ')' ( (lv_then_4_0= ruleStatement ) ) ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_else_6_0= ruleStatement ) ) )? )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:650:3: otherlv_0= 'if' otherlv_1= '(' ( (lv_condition_2_0= ruleExpression ) ) otherlv_3= ')' ( (lv_then_4_0= ruleStatement ) ) ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_else_6_0= ruleStatement ) ) )?
            {
            otherlv_0=(Token)match(input,20,FOLLOW_20_in_ruleIf1588); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getIfAccess().getIfKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,21,FOLLOW_21_in_ruleIf1600); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getIfAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:658:1: ( (lv_condition_2_0= ruleExpression ) )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:659:1: (lv_condition_2_0= ruleExpression )
            {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:659:1: (lv_condition_2_0= ruleExpression )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:660:3: lv_condition_2_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getIfAccess().getConditionExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpression_in_ruleIf1621);
            lv_condition_2_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getIfRule());
              	        }
                     		set(
                     			current, 
                     			"condition",
                      		lv_condition_2_0, 
                      		"Expression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,22,FOLLOW_22_in_ruleIf1633); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getIfAccess().getRightParenthesisKeyword_3());
                  
            }
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:680:1: ( (lv_then_4_0= ruleStatement ) )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:681:1: (lv_then_4_0= ruleStatement )
            {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:681:1: (lv_then_4_0= ruleStatement )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:682:3: lv_then_4_0= ruleStatement
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getIfAccess().getThenStatementParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleStatement_in_ruleIf1654);
            lv_then_4_0=ruleStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getIfRule());
              	        }
                     		set(
                     			current, 
                     			"then",
                      		lv_then_4_0, 
                      		"Statement");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:698:2: ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_else_6_0= ruleStatement ) ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==23) ) {
                int LA5_1 = input.LA(2);

                if ( (synpred3_InternalLeek()) ) {
                    alt5=1;
                }
            }
            switch (alt5) {
                case 1 :
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:698:3: ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_else_6_0= ruleStatement ) )
                    {
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:698:3: ( ( 'else' )=>otherlv_5= 'else' )
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:698:4: ( 'else' )=>otherlv_5= 'else'
                    {
                    otherlv_5=(Token)match(input,23,FOLLOW_23_in_ruleIf1675); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getIfAccess().getElseKeyword_5_0());
                          
                    }

                    }

                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:703:2: ( (lv_else_6_0= ruleStatement ) )
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:704:1: (lv_else_6_0= ruleStatement )
                    {
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:704:1: (lv_else_6_0= ruleStatement )
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:705:3: lv_else_6_0= ruleStatement
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getIfAccess().getElseStatementParserRuleCall_5_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleStatement_in_ruleIf1697);
                    lv_else_6_0=ruleStatement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getIfRule());
                      	        }
                             		set(
                             			current, 
                             			"else",
                              		lv_else_6_0, 
                              		"Statement");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIf"


    // $ANTLR start "entryRuleIteration"
    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:729:1: entryRuleIteration returns [EObject current=null] : iv_ruleIteration= ruleIteration EOF ;
    public final EObject entryRuleIteration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIteration = null;


        try {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:730:2: (iv_ruleIteration= ruleIteration EOF )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:731:2: iv_ruleIteration= ruleIteration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIterationRule()); 
            }
            pushFollow(FOLLOW_ruleIteration_in_entryRuleIteration1735);
            iv_ruleIteration=ruleIteration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIteration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIteration1745); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIteration"


    // $ANTLR start "ruleIteration"
    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:738:1: ruleIteration returns [EObject current=null] : (this_While_0= ruleWhile | this_ForIn_1= ruleForIn | this_For_2= ruleFor ) ;
    public final EObject ruleIteration() throws RecognitionException {
        EObject current = null;

        EObject this_While_0 = null;

        EObject this_ForIn_1 = null;

        EObject this_For_2 = null;


         enterRule(); 
            
        try {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:741:28: ( (this_While_0= ruleWhile | this_ForIn_1= ruleForIn | this_For_2= ruleFor ) )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:742:1: (this_While_0= ruleWhile | this_ForIn_1= ruleForIn | this_For_2= ruleFor )
            {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:742:1: (this_While_0= ruleWhile | this_ForIn_1= ruleForIn | this_For_2= ruleFor )
            int alt6=3;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==24) ) {
                alt6=1;
            }
            else if ( (LA6_0==25) ) {
                int LA6_2 = input.LA(2);

                if ( (LA6_2==21) ) {
                    int LA6_3 = input.LA(3);

                    if ( (LA6_3==28) ) {
                        int LA6_4 = input.LA(4);

                        if ( (LA6_4==RULE_ID) ) {
                            int LA6_6 = input.LA(5);

                            if ( (LA6_6==17) ) {
                                alt6=3;
                            }
                            else if ( ((LA6_6>=26 && LA6_6<=27)) ) {
                                alt6=2;
                            }
                            else {
                                if (state.backtracking>0) {state.failed=true; return current;}
                                NoViableAltException nvae =
                                    new NoViableAltException("", 6, 6, input);

                                throw nvae;
                            }
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 6, 4, input);

                            throw nvae;
                        }
                    }
                    else if ( (LA6_3==RULE_ID) ) {
                        int LA6_5 = input.LA(4);

                        if ( (LA6_5==17||LA6_5==52) ) {
                            alt6=3;
                        }
                        else if ( ((LA6_5>=26 && LA6_5<=27)) ) {
                            alt6=2;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 6, 5, input);

                            throw nvae;
                        }
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 6, 3, input);

                        throw nvae;
                    }
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 2, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:743:5: this_While_0= ruleWhile
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getIterationAccess().getWhileParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleWhile_in_ruleIteration1792);
                    this_While_0=ruleWhile();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_While_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:753:5: this_ForIn_1= ruleForIn
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getIterationAccess().getForInParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleForIn_in_ruleIteration1819);
                    this_ForIn_1=ruleForIn();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_ForIn_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:763:5: this_For_2= ruleFor
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getIterationAccess().getForParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleFor_in_ruleIteration1846);
                    this_For_2=ruleFor();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_For_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIteration"


    // $ANTLR start "entryRuleWhile"
    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:779:1: entryRuleWhile returns [EObject current=null] : iv_ruleWhile= ruleWhile EOF ;
    public final EObject entryRuleWhile() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWhile = null;


        try {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:780:2: (iv_ruleWhile= ruleWhile EOF )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:781:2: iv_ruleWhile= ruleWhile EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getWhileRule()); 
            }
            pushFollow(FOLLOW_ruleWhile_in_entryRuleWhile1881);
            iv_ruleWhile=ruleWhile();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleWhile; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleWhile1891); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleWhile"


    // $ANTLR start "ruleWhile"
    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:788:1: ruleWhile returns [EObject current=null] : (otherlv_0= 'while' otherlv_1= '(' ( (lv_condition_2_0= ruleExpression ) ) otherlv_3= ')' ( (lv_statement_4_0= ruleStatement ) ) ) ;
    public final EObject ruleWhile() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_condition_2_0 = null;

        EObject lv_statement_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:791:28: ( (otherlv_0= 'while' otherlv_1= '(' ( (lv_condition_2_0= ruleExpression ) ) otherlv_3= ')' ( (lv_statement_4_0= ruleStatement ) ) ) )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:792:1: (otherlv_0= 'while' otherlv_1= '(' ( (lv_condition_2_0= ruleExpression ) ) otherlv_3= ')' ( (lv_statement_4_0= ruleStatement ) ) )
            {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:792:1: (otherlv_0= 'while' otherlv_1= '(' ( (lv_condition_2_0= ruleExpression ) ) otherlv_3= ')' ( (lv_statement_4_0= ruleStatement ) ) )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:792:3: otherlv_0= 'while' otherlv_1= '(' ( (lv_condition_2_0= ruleExpression ) ) otherlv_3= ')' ( (lv_statement_4_0= ruleStatement ) )
            {
            otherlv_0=(Token)match(input,24,FOLLOW_24_in_ruleWhile1928); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getWhileAccess().getWhileKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,21,FOLLOW_21_in_ruleWhile1940); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getWhileAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:800:1: ( (lv_condition_2_0= ruleExpression ) )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:801:1: (lv_condition_2_0= ruleExpression )
            {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:801:1: (lv_condition_2_0= ruleExpression )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:802:3: lv_condition_2_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getWhileAccess().getConditionExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpression_in_ruleWhile1961);
            lv_condition_2_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getWhileRule());
              	        }
                     		set(
                     			current, 
                     			"condition",
                      		lv_condition_2_0, 
                      		"Expression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,22,FOLLOW_22_in_ruleWhile1973); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getWhileAccess().getRightParenthesisKeyword_3());
                  
            }
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:822:1: ( (lv_statement_4_0= ruleStatement ) )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:823:1: (lv_statement_4_0= ruleStatement )
            {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:823:1: (lv_statement_4_0= ruleStatement )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:824:3: lv_statement_4_0= ruleStatement
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getWhileAccess().getStatementStatementParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleStatement_in_ruleWhile1994);
            lv_statement_4_0=ruleStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getWhileRule());
              	        }
                     		set(
                     			current, 
                     			"statement",
                      		lv_statement_4_0, 
                      		"Statement");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleWhile"


    // $ANTLR start "entryRuleFor"
    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:848:1: entryRuleFor returns [EObject current=null] : iv_ruleFor= ruleFor EOF ;
    public final EObject entryRuleFor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFor = null;


        try {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:849:2: (iv_ruleFor= ruleFor EOF )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:850:2: iv_ruleFor= ruleFor EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getForRule()); 
            }
            pushFollow(FOLLOW_ruleFor_in_entryRuleFor2030);
            iv_ruleFor=ruleFor();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFor; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFor2040); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFor"


    // $ANTLR start "ruleFor"
    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:857:1: ruleFor returns [EObject current=null] : (otherlv_0= 'for' otherlv_1= '(' ( (lv_initializer_2_0= ruleForInitializer ) ) otherlv_3= ';' ( (lv_condition_4_0= ruleExpression ) ) otherlv_5= ';' ( (lv_increment_6_0= ruleExpression ) ) otherlv_7= ')' ( (lv_statement_8_0= ruleStatement ) ) ) ;
    public final EObject ruleFor() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_initializer_2_0 = null;

        EObject lv_condition_4_0 = null;

        EObject lv_increment_6_0 = null;

        EObject lv_statement_8_0 = null;


         enterRule(); 
            
        try {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:860:28: ( (otherlv_0= 'for' otherlv_1= '(' ( (lv_initializer_2_0= ruleForInitializer ) ) otherlv_3= ';' ( (lv_condition_4_0= ruleExpression ) ) otherlv_5= ';' ( (lv_increment_6_0= ruleExpression ) ) otherlv_7= ')' ( (lv_statement_8_0= ruleStatement ) ) ) )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:861:1: (otherlv_0= 'for' otherlv_1= '(' ( (lv_initializer_2_0= ruleForInitializer ) ) otherlv_3= ';' ( (lv_condition_4_0= ruleExpression ) ) otherlv_5= ';' ( (lv_increment_6_0= ruleExpression ) ) otherlv_7= ')' ( (lv_statement_8_0= ruleStatement ) ) )
            {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:861:1: (otherlv_0= 'for' otherlv_1= '(' ( (lv_initializer_2_0= ruleForInitializer ) ) otherlv_3= ';' ( (lv_condition_4_0= ruleExpression ) ) otherlv_5= ';' ( (lv_increment_6_0= ruleExpression ) ) otherlv_7= ')' ( (lv_statement_8_0= ruleStatement ) ) )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:861:3: otherlv_0= 'for' otherlv_1= '(' ( (lv_initializer_2_0= ruleForInitializer ) ) otherlv_3= ';' ( (lv_condition_4_0= ruleExpression ) ) otherlv_5= ';' ( (lv_increment_6_0= ruleExpression ) ) otherlv_7= ')' ( (lv_statement_8_0= ruleStatement ) )
            {
            otherlv_0=(Token)match(input,25,FOLLOW_25_in_ruleFor2077); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getForAccess().getForKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,21,FOLLOW_21_in_ruleFor2089); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getForAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:869:1: ( (lv_initializer_2_0= ruleForInitializer ) )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:870:1: (lv_initializer_2_0= ruleForInitializer )
            {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:870:1: (lv_initializer_2_0= ruleForInitializer )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:871:3: lv_initializer_2_0= ruleForInitializer
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getForAccess().getInitializerForInitializerParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleForInitializer_in_ruleFor2110);
            lv_initializer_2_0=ruleForInitializer();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getForRule());
              	        }
                     		set(
                     			current, 
                     			"initializer",
                      		lv_initializer_2_0, 
                      		"ForInitializer");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_12_in_ruleFor2122); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getForAccess().getSemicolonKeyword_3());
                  
            }
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:891:1: ( (lv_condition_4_0= ruleExpression ) )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:892:1: (lv_condition_4_0= ruleExpression )
            {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:892:1: (lv_condition_4_0= ruleExpression )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:893:3: lv_condition_4_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getForAccess().getConditionExpressionParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpression_in_ruleFor2143);
            lv_condition_4_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getForRule());
              	        }
                     		set(
                     			current, 
                     			"condition",
                      		lv_condition_4_0, 
                      		"Expression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_5=(Token)match(input,12,FOLLOW_12_in_ruleFor2155); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getForAccess().getSemicolonKeyword_5());
                  
            }
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:913:1: ( (lv_increment_6_0= ruleExpression ) )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:914:1: (lv_increment_6_0= ruleExpression )
            {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:914:1: (lv_increment_6_0= ruleExpression )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:915:3: lv_increment_6_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getForAccess().getIncrementExpressionParserRuleCall_6_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpression_in_ruleFor2176);
            lv_increment_6_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getForRule());
              	        }
                     		set(
                     			current, 
                     			"increment",
                      		lv_increment_6_0, 
                      		"Expression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_7=(Token)match(input,22,FOLLOW_22_in_ruleFor2188); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_7, grammarAccess.getForAccess().getRightParenthesisKeyword_7());
                  
            }
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:935:1: ( (lv_statement_8_0= ruleStatement ) )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:936:1: (lv_statement_8_0= ruleStatement )
            {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:936:1: (lv_statement_8_0= ruleStatement )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:937:3: lv_statement_8_0= ruleStatement
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getForAccess().getStatementStatementParserRuleCall_8_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleStatement_in_ruleFor2209);
            lv_statement_8_0=ruleStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getForRule());
              	        }
                     		set(
                     			current, 
                     			"statement",
                      		lv_statement_8_0, 
                      		"Statement");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFor"


    // $ANTLR start "entryRuleForIn"
    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:961:1: entryRuleForIn returns [EObject current=null] : iv_ruleForIn= ruleForIn EOF ;
    public final EObject entryRuleForIn() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleForIn = null;


        try {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:962:2: (iv_ruleForIn= ruleForIn EOF )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:963:2: iv_ruleForIn= ruleForIn EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getForInRule()); 
            }
            pushFollow(FOLLOW_ruleForIn_in_entryRuleForIn2245);
            iv_ruleForIn=ruleForIn();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleForIn; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleForIn2255); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleForIn"


    // $ANTLR start "ruleForIn"
    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:970:1: ruleForIn returns [EObject current=null] : (otherlv_0= 'for' otherlv_1= '(' ( ( (lv_key_2_0= ruleForInVariableReference ) ) otherlv_3= ':' )? ( (lv_value_4_0= ruleForInVariableReference ) ) otherlv_5= 'in' ( (lv_array_6_0= ruleExpression ) ) otherlv_7= ')' ( (lv_statement_8_0= ruleStatement ) ) ) ;
    public final EObject ruleForIn() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_key_2_0 = null;

        EObject lv_value_4_0 = null;

        EObject lv_array_6_0 = null;

        EObject lv_statement_8_0 = null;


         enterRule(); 
            
        try {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:973:28: ( (otherlv_0= 'for' otherlv_1= '(' ( ( (lv_key_2_0= ruleForInVariableReference ) ) otherlv_3= ':' )? ( (lv_value_4_0= ruleForInVariableReference ) ) otherlv_5= 'in' ( (lv_array_6_0= ruleExpression ) ) otherlv_7= ')' ( (lv_statement_8_0= ruleStatement ) ) ) )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:974:1: (otherlv_0= 'for' otherlv_1= '(' ( ( (lv_key_2_0= ruleForInVariableReference ) ) otherlv_3= ':' )? ( (lv_value_4_0= ruleForInVariableReference ) ) otherlv_5= 'in' ( (lv_array_6_0= ruleExpression ) ) otherlv_7= ')' ( (lv_statement_8_0= ruleStatement ) ) )
            {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:974:1: (otherlv_0= 'for' otherlv_1= '(' ( ( (lv_key_2_0= ruleForInVariableReference ) ) otherlv_3= ':' )? ( (lv_value_4_0= ruleForInVariableReference ) ) otherlv_5= 'in' ( (lv_array_6_0= ruleExpression ) ) otherlv_7= ')' ( (lv_statement_8_0= ruleStatement ) ) )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:974:3: otherlv_0= 'for' otherlv_1= '(' ( ( (lv_key_2_0= ruleForInVariableReference ) ) otherlv_3= ':' )? ( (lv_value_4_0= ruleForInVariableReference ) ) otherlv_5= 'in' ( (lv_array_6_0= ruleExpression ) ) otherlv_7= ')' ( (lv_statement_8_0= ruleStatement ) )
            {
            otherlv_0=(Token)match(input,25,FOLLOW_25_in_ruleForIn2292); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getForInAccess().getForKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,21,FOLLOW_21_in_ruleForIn2304); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getForInAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:982:1: ( ( (lv_key_2_0= ruleForInVariableReference ) ) otherlv_3= ':' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==28) ) {
                int LA7_1 = input.LA(2);

                if ( (LA7_1==RULE_ID) ) {
                    int LA7_3 = input.LA(3);

                    if ( (LA7_3==26) ) {
                        alt7=1;
                    }
                }
            }
            else if ( (LA7_0==RULE_ID) ) {
                int LA7_2 = input.LA(2);

                if ( (LA7_2==26) ) {
                    alt7=1;
                }
            }
            switch (alt7) {
                case 1 :
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:982:2: ( (lv_key_2_0= ruleForInVariableReference ) ) otherlv_3= ':'
                    {
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:982:2: ( (lv_key_2_0= ruleForInVariableReference ) )
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:983:1: (lv_key_2_0= ruleForInVariableReference )
                    {
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:983:1: (lv_key_2_0= ruleForInVariableReference )
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:984:3: lv_key_2_0= ruleForInVariableReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getForInAccess().getKeyForInVariableReferenceParserRuleCall_2_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleForInVariableReference_in_ruleForIn2326);
                    lv_key_2_0=ruleForInVariableReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getForInRule());
                      	        }
                             		set(
                             			current, 
                             			"key",
                              		lv_key_2_0, 
                              		"ForInVariableReference");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_3=(Token)match(input,26,FOLLOW_26_in_ruleForIn2338); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getForInAccess().getColonKeyword_2_1());
                          
                    }

                    }
                    break;

            }

            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1004:3: ( (lv_value_4_0= ruleForInVariableReference ) )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1005:1: (lv_value_4_0= ruleForInVariableReference )
            {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1005:1: (lv_value_4_0= ruleForInVariableReference )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1006:3: lv_value_4_0= ruleForInVariableReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getForInAccess().getValueForInVariableReferenceParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleForInVariableReference_in_ruleForIn2361);
            lv_value_4_0=ruleForInVariableReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getForInRule());
              	        }
                     		set(
                     			current, 
                     			"value",
                      		lv_value_4_0, 
                      		"ForInVariableReference");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_5=(Token)match(input,27,FOLLOW_27_in_ruleForIn2373); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getForInAccess().getInKeyword_4());
                  
            }
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1026:1: ( (lv_array_6_0= ruleExpression ) )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1027:1: (lv_array_6_0= ruleExpression )
            {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1027:1: (lv_array_6_0= ruleExpression )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1028:3: lv_array_6_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getForInAccess().getArrayExpressionParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpression_in_ruleForIn2394);
            lv_array_6_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getForInRule());
              	        }
                     		set(
                     			current, 
                     			"array",
                      		lv_array_6_0, 
                      		"Expression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_7=(Token)match(input,22,FOLLOW_22_in_ruleForIn2406); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_7, grammarAccess.getForInAccess().getRightParenthesisKeyword_6());
                  
            }
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1048:1: ( (lv_statement_8_0= ruleStatement ) )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1049:1: (lv_statement_8_0= ruleStatement )
            {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1049:1: (lv_statement_8_0= ruleStatement )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1050:3: lv_statement_8_0= ruleStatement
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getForInAccess().getStatementStatementParserRuleCall_7_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleStatement_in_ruleForIn2427);
            lv_statement_8_0=ruleStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getForInRule());
              	        }
                     		set(
                     			current, 
                     			"statement",
                      		lv_statement_8_0, 
                      		"Statement");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleForIn"


    // $ANTLR start "entryRuleForInVariableReference"
    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1074:1: entryRuleForInVariableReference returns [EObject current=null] : iv_ruleForInVariableReference= ruleForInVariableReference EOF ;
    public final EObject entryRuleForInVariableReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleForInVariableReference = null;


        try {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1075:2: (iv_ruleForInVariableReference= ruleForInVariableReference EOF )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1076:2: iv_ruleForInVariableReference= ruleForInVariableReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getForInVariableReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleForInVariableReference_in_entryRuleForInVariableReference2463);
            iv_ruleForInVariableReference=ruleForInVariableReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleForInVariableReference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleForInVariableReference2473); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleForInVariableReference"


    // $ANTLR start "ruleForInVariableReference"
    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1083:1: ruleForInVariableReference returns [EObject current=null] : ( (otherlv_0= 'var' this_VariableDeclarationUnitialized_1= ruleVariableDeclarationUnitialized ) | this_VariableReferenceSimple_2= ruleVariableReferenceSimple ) ;
    public final EObject ruleForInVariableReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject this_VariableDeclarationUnitialized_1 = null;

        EObject this_VariableReferenceSimple_2 = null;


         enterRule(); 
            
        try {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1086:28: ( ( (otherlv_0= 'var' this_VariableDeclarationUnitialized_1= ruleVariableDeclarationUnitialized ) | this_VariableReferenceSimple_2= ruleVariableReferenceSimple ) )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1087:1: ( (otherlv_0= 'var' this_VariableDeclarationUnitialized_1= ruleVariableDeclarationUnitialized ) | this_VariableReferenceSimple_2= ruleVariableReferenceSimple )
            {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1087:1: ( (otherlv_0= 'var' this_VariableDeclarationUnitialized_1= ruleVariableDeclarationUnitialized ) | this_VariableReferenceSimple_2= ruleVariableReferenceSimple )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==28) ) {
                alt8=1;
            }
            else if ( (LA8_0==RULE_ID) ) {
                alt8=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1087:2: (otherlv_0= 'var' this_VariableDeclarationUnitialized_1= ruleVariableDeclarationUnitialized )
                    {
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1087:2: (otherlv_0= 'var' this_VariableDeclarationUnitialized_1= ruleVariableDeclarationUnitialized )
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1087:4: otherlv_0= 'var' this_VariableDeclarationUnitialized_1= ruleVariableDeclarationUnitialized
                    {
                    otherlv_0=(Token)match(input,28,FOLLOW_28_in_ruleForInVariableReference2511); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_0, grammarAccess.getForInVariableReferenceAccess().getVarKeyword_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getForInVariableReferenceAccess().getVariableDeclarationUnitializedParserRuleCall_0_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleVariableDeclarationUnitialized_in_ruleForInVariableReference2533);
                    this_VariableDeclarationUnitialized_1=ruleVariableDeclarationUnitialized();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_VariableDeclarationUnitialized_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1102:5: this_VariableReferenceSimple_2= ruleVariableReferenceSimple
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getForInVariableReferenceAccess().getVariableReferenceSimpleParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleVariableReferenceSimple_in_ruleForInVariableReference2561);
                    this_VariableReferenceSimple_2=ruleVariableReferenceSimple();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_VariableReferenceSimple_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleForInVariableReference"


    // $ANTLR start "entryRuleForInitializer"
    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1118:1: entryRuleForInitializer returns [EObject current=null] : iv_ruleForInitializer= ruleForInitializer EOF ;
    public final EObject entryRuleForInitializer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleForInitializer = null;


        try {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1119:2: (iv_ruleForInitializer= ruleForInitializer EOF )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1120:2: iv_ruleForInitializer= ruleForInitializer EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getForInitializerRule()); 
            }
            pushFollow(FOLLOW_ruleForInitializer_in_entryRuleForInitializer2596);
            iv_ruleForInitializer=ruleForInitializer();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleForInitializer; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleForInitializer2606); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleForInitializer"


    // $ANTLR start "ruleForInitializer"
    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1127:1: ruleForInitializer returns [EObject current=null] : ( (otherlv_0= 'var' this_VariableDeclarationWithValue_1= ruleVariableDeclarationWithValue ) | this_Affectation_2= ruleAffectation ) ;
    public final EObject ruleForInitializer() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject this_VariableDeclarationWithValue_1 = null;

        EObject this_Affectation_2 = null;


         enterRule(); 
            
        try {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1130:28: ( ( (otherlv_0= 'var' this_VariableDeclarationWithValue_1= ruleVariableDeclarationWithValue ) | this_Affectation_2= ruleAffectation ) )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1131:1: ( (otherlv_0= 'var' this_VariableDeclarationWithValue_1= ruleVariableDeclarationWithValue ) | this_Affectation_2= ruleAffectation )
            {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1131:1: ( (otherlv_0= 'var' this_VariableDeclarationWithValue_1= ruleVariableDeclarationWithValue ) | this_Affectation_2= ruleAffectation )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==28) ) {
                alt9=1;
            }
            else if ( (LA9_0==RULE_ID) ) {
                alt9=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1131:2: (otherlv_0= 'var' this_VariableDeclarationWithValue_1= ruleVariableDeclarationWithValue )
                    {
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1131:2: (otherlv_0= 'var' this_VariableDeclarationWithValue_1= ruleVariableDeclarationWithValue )
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1131:4: otherlv_0= 'var' this_VariableDeclarationWithValue_1= ruleVariableDeclarationWithValue
                    {
                    otherlv_0=(Token)match(input,28,FOLLOW_28_in_ruleForInitializer2644); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_0, grammarAccess.getForInitializerAccess().getVarKeyword_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getForInitializerAccess().getVariableDeclarationWithValueParserRuleCall_0_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleVariableDeclarationWithValue_in_ruleForInitializer2666);
                    this_VariableDeclarationWithValue_1=ruleVariableDeclarationWithValue();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_VariableDeclarationWithValue_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1146:5: this_Affectation_2= ruleAffectation
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getForInitializerAccess().getAffectationParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleAffectation_in_ruleForInitializer2694);
                    this_Affectation_2=ruleAffectation();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Affectation_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleForInitializer"


    // $ANTLR start "entryRuleFunctionDeclaration"
    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1162:1: entryRuleFunctionDeclaration returns [EObject current=null] : iv_ruleFunctionDeclaration= ruleFunctionDeclaration EOF ;
    public final EObject entryRuleFunctionDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionDeclaration = null;


        try {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1163:2: (iv_ruleFunctionDeclaration= ruleFunctionDeclaration EOF )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1164:2: iv_ruleFunctionDeclaration= ruleFunctionDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFunctionDeclarationRule()); 
            }
            pushFollow(FOLLOW_ruleFunctionDeclaration_in_entryRuleFunctionDeclaration2729);
            iv_ruleFunctionDeclaration=ruleFunctionDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFunctionDeclaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFunctionDeclaration2739); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFunctionDeclaration"


    // $ANTLR start "ruleFunctionDeclaration"
    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1171:1: ruleFunctionDeclaration returns [EObject current=null] : (otherlv_0= 'function' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_parameters_3_0= ruleParameterDeclaration ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameterDeclaration ) ) )* )? otherlv_6= ')' ( (lv_body_7_0= ruleStatementBlock ) ) ) ;
    public final EObject ruleFunctionDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_parameters_3_0 = null;

        EObject lv_parameters_5_0 = null;

        EObject lv_body_7_0 = null;


         enterRule(); 
            
        try {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1174:28: ( (otherlv_0= 'function' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_parameters_3_0= ruleParameterDeclaration ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameterDeclaration ) ) )* )? otherlv_6= ')' ( (lv_body_7_0= ruleStatementBlock ) ) ) )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1175:1: (otherlv_0= 'function' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_parameters_3_0= ruleParameterDeclaration ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameterDeclaration ) ) )* )? otherlv_6= ')' ( (lv_body_7_0= ruleStatementBlock ) ) )
            {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1175:1: (otherlv_0= 'function' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_parameters_3_0= ruleParameterDeclaration ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameterDeclaration ) ) )* )? otherlv_6= ')' ( (lv_body_7_0= ruleStatementBlock ) ) )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1175:3: otherlv_0= 'function' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_parameters_3_0= ruleParameterDeclaration ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameterDeclaration ) ) )* )? otherlv_6= ')' ( (lv_body_7_0= ruleStatementBlock ) )
            {
            otherlv_0=(Token)match(input,29,FOLLOW_29_in_ruleFunctionDeclaration2776); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getFunctionDeclarationAccess().getFunctionKeyword_0());
                  
            }
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1179:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1180:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1180:1: (lv_name_1_0= RULE_ID )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1181:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFunctionDeclaration2793); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_1_0, grammarAccess.getFunctionDeclarationAccess().getNameIDTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getFunctionDeclarationRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"ID");
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,21,FOLLOW_21_in_ruleFunctionDeclaration2810); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getFunctionDeclarationAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1201:1: ( ( (lv_parameters_3_0= ruleParameterDeclaration ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameterDeclaration ) ) )* )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_ID||LA11_0==31) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1201:2: ( (lv_parameters_3_0= ruleParameterDeclaration ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameterDeclaration ) ) )*
                    {
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1201:2: ( (lv_parameters_3_0= ruleParameterDeclaration ) )
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1202:1: (lv_parameters_3_0= ruleParameterDeclaration )
                    {
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1202:1: (lv_parameters_3_0= ruleParameterDeclaration )
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1203:3: lv_parameters_3_0= ruleParameterDeclaration
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getFunctionDeclarationAccess().getParametersParameterDeclarationParserRuleCall_3_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleParameterDeclaration_in_ruleFunctionDeclaration2832);
                    lv_parameters_3_0=ruleParameterDeclaration();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getFunctionDeclarationRule());
                      	        }
                             		add(
                             			current, 
                             			"parameters",
                              		lv_parameters_3_0, 
                              		"ParameterDeclaration");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1219:2: (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameterDeclaration ) ) )*
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0==30) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1219:4: otherlv_4= ',' ( (lv_parameters_5_0= ruleParameterDeclaration ) )
                    	    {
                    	    otherlv_4=(Token)match(input,30,FOLLOW_30_in_ruleFunctionDeclaration2845); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_4, grammarAccess.getFunctionDeclarationAccess().getCommaKeyword_3_1_0());
                    	          
                    	    }
                    	    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1223:1: ( (lv_parameters_5_0= ruleParameterDeclaration ) )
                    	    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1224:1: (lv_parameters_5_0= ruleParameterDeclaration )
                    	    {
                    	    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1224:1: (lv_parameters_5_0= ruleParameterDeclaration )
                    	    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1225:3: lv_parameters_5_0= ruleParameterDeclaration
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getFunctionDeclarationAccess().getParametersParameterDeclarationParserRuleCall_3_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleParameterDeclaration_in_ruleFunctionDeclaration2866);
                    	    lv_parameters_5_0=ruleParameterDeclaration();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getFunctionDeclarationRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"parameters",
                    	              		lv_parameters_5_0, 
                    	              		"ParameterDeclaration");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop10;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_6=(Token)match(input,22,FOLLOW_22_in_ruleFunctionDeclaration2882); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getFunctionDeclarationAccess().getRightParenthesisKeyword_4());
                  
            }
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1245:1: ( (lv_body_7_0= ruleStatementBlock ) )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1246:1: (lv_body_7_0= ruleStatementBlock )
            {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1246:1: (lv_body_7_0= ruleStatementBlock )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1247:3: lv_body_7_0= ruleStatementBlock
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getFunctionDeclarationAccess().getBodyStatementBlockParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleStatementBlock_in_ruleFunctionDeclaration2903);
            lv_body_7_0=ruleStatementBlock();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getFunctionDeclarationRule());
              	        }
                     		set(
                     			current, 
                     			"body",
                      		lv_body_7_0, 
                      		"StatementBlock");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFunctionDeclaration"


    // $ANTLR start "entryRuleParameterDeclaration"
    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1271:1: entryRuleParameterDeclaration returns [EObject current=null] : iv_ruleParameterDeclaration= ruleParameterDeclaration EOF ;
    public final EObject entryRuleParameterDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterDeclaration = null;


        try {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1272:2: (iv_ruleParameterDeclaration= ruleParameterDeclaration EOF )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1273:2: iv_ruleParameterDeclaration= ruleParameterDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getParameterDeclarationRule()); 
            }
            pushFollow(FOLLOW_ruleParameterDeclaration_in_entryRuleParameterDeclaration2939);
            iv_ruleParameterDeclaration=ruleParameterDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleParameterDeclaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleParameterDeclaration2949); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleParameterDeclaration"


    // $ANTLR start "ruleParameterDeclaration"
    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1280:1: ruleParameterDeclaration returns [EObject current=null] : ( ( (lv_byAdress_0_0= '@' ) )? ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleParameterDeclaration() throws RecognitionException {
        EObject current = null;

        Token lv_byAdress_0_0=null;
        Token lv_name_1_0=null;

         enterRule(); 
            
        try {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1283:28: ( ( ( (lv_byAdress_0_0= '@' ) )? ( (lv_name_1_0= RULE_ID ) ) ) )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1284:1: ( ( (lv_byAdress_0_0= '@' ) )? ( (lv_name_1_0= RULE_ID ) ) )
            {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1284:1: ( ( (lv_byAdress_0_0= '@' ) )? ( (lv_name_1_0= RULE_ID ) ) )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1284:2: ( (lv_byAdress_0_0= '@' ) )? ( (lv_name_1_0= RULE_ID ) )
            {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1284:2: ( (lv_byAdress_0_0= '@' ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==31) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1285:1: (lv_byAdress_0_0= '@' )
                    {
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1285:1: (lv_byAdress_0_0= '@' )
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1286:3: lv_byAdress_0_0= '@'
                    {
                    lv_byAdress_0_0=(Token)match(input,31,FOLLOW_31_in_ruleParameterDeclaration2992); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_byAdress_0_0, grammarAccess.getParameterDeclarationAccess().getByAdressCommercialAtKeyword_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getParameterDeclarationRule());
                      	        }
                             		setWithLastConsumed(current, "byAdress", true, "@");
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1299:3: ( (lv_name_1_0= RULE_ID ) )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1300:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1300:1: (lv_name_1_0= RULE_ID )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1301:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleParameterDeclaration3023); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_1_0, grammarAccess.getParameterDeclarationAccess().getNameIDTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getParameterDeclarationRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"ID");
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleParameterDeclaration"


    // $ANTLR start "entryRuleLocalDeclaration"
    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1325:1: entryRuleLocalDeclaration returns [EObject current=null] : iv_ruleLocalDeclaration= ruleLocalDeclaration EOF ;
    public final EObject entryRuleLocalDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLocalDeclaration = null;


        try {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1326:2: (iv_ruleLocalDeclaration= ruleLocalDeclaration EOF )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1327:2: iv_ruleLocalDeclaration= ruleLocalDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLocalDeclarationRule()); 
            }
            pushFollow(FOLLOW_ruleLocalDeclaration_in_entryRuleLocalDeclaration3064);
            iv_ruleLocalDeclaration=ruleLocalDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLocalDeclaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLocalDeclaration3074); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLocalDeclaration"


    // $ANTLR start "ruleLocalDeclaration"
    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1334:1: ruleLocalDeclaration returns [EObject current=null] : (otherlv_0= 'var' ( (lv_variables_1_0= ruleVariableDeclaration ) ) (otherlv_2= ',' ( (lv_variables_3_0= ruleVariableDeclaration ) ) )* ) ;
    public final EObject ruleLocalDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_variables_1_0 = null;

        EObject lv_variables_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1337:28: ( (otherlv_0= 'var' ( (lv_variables_1_0= ruleVariableDeclaration ) ) (otherlv_2= ',' ( (lv_variables_3_0= ruleVariableDeclaration ) ) )* ) )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1338:1: (otherlv_0= 'var' ( (lv_variables_1_0= ruleVariableDeclaration ) ) (otherlv_2= ',' ( (lv_variables_3_0= ruleVariableDeclaration ) ) )* )
            {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1338:1: (otherlv_0= 'var' ( (lv_variables_1_0= ruleVariableDeclaration ) ) (otherlv_2= ',' ( (lv_variables_3_0= ruleVariableDeclaration ) ) )* )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1338:3: otherlv_0= 'var' ( (lv_variables_1_0= ruleVariableDeclaration ) ) (otherlv_2= ',' ( (lv_variables_3_0= ruleVariableDeclaration ) ) )*
            {
            otherlv_0=(Token)match(input,28,FOLLOW_28_in_ruleLocalDeclaration3111); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getLocalDeclarationAccess().getVarKeyword_0());
                  
            }
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1342:1: ( (lv_variables_1_0= ruleVariableDeclaration ) )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1343:1: (lv_variables_1_0= ruleVariableDeclaration )
            {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1343:1: (lv_variables_1_0= ruleVariableDeclaration )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1344:3: lv_variables_1_0= ruleVariableDeclaration
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getLocalDeclarationAccess().getVariablesVariableDeclarationParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleVariableDeclaration_in_ruleLocalDeclaration3132);
            lv_variables_1_0=ruleVariableDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getLocalDeclarationRule());
              	        }
                     		add(
                     			current, 
                     			"variables",
                      		lv_variables_1_0, 
                      		"VariableDeclaration");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1360:2: (otherlv_2= ',' ( (lv_variables_3_0= ruleVariableDeclaration ) ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==30) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1360:4: otherlv_2= ',' ( (lv_variables_3_0= ruleVariableDeclaration ) )
            	    {
            	    otherlv_2=(Token)match(input,30,FOLLOW_30_in_ruleLocalDeclaration3145); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getLocalDeclarationAccess().getCommaKeyword_2_0());
            	          
            	    }
            	    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1364:1: ( (lv_variables_3_0= ruleVariableDeclaration ) )
            	    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1365:1: (lv_variables_3_0= ruleVariableDeclaration )
            	    {
            	    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1365:1: (lv_variables_3_0= ruleVariableDeclaration )
            	    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1366:3: lv_variables_3_0= ruleVariableDeclaration
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getLocalDeclarationAccess().getVariablesVariableDeclarationParserRuleCall_2_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleVariableDeclaration_in_ruleLocalDeclaration3166);
            	    lv_variables_3_0=ruleVariableDeclaration();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getLocalDeclarationRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"variables",
            	              		lv_variables_3_0, 
            	              		"VariableDeclaration");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLocalDeclaration"


    // $ANTLR start "entryRuleGlobalDeclaration"
    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1390:1: entryRuleGlobalDeclaration returns [EObject current=null] : iv_ruleGlobalDeclaration= ruleGlobalDeclaration EOF ;
    public final EObject entryRuleGlobalDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGlobalDeclaration = null;


        try {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1391:2: (iv_ruleGlobalDeclaration= ruleGlobalDeclaration EOF )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1392:2: iv_ruleGlobalDeclaration= ruleGlobalDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGlobalDeclarationRule()); 
            }
            pushFollow(FOLLOW_ruleGlobalDeclaration_in_entryRuleGlobalDeclaration3204);
            iv_ruleGlobalDeclaration=ruleGlobalDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGlobalDeclaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleGlobalDeclaration3214); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGlobalDeclaration"


    // $ANTLR start "ruleGlobalDeclaration"
    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1399:1: ruleGlobalDeclaration returns [EObject current=null] : (otherlv_0= 'global' ( (lv_variables_1_0= ruleVariableDeclaration ) ) (otherlv_2= ',' ( (lv_variables_3_0= ruleVariableDeclaration ) ) )* ) ;
    public final EObject ruleGlobalDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_variables_1_0 = null;

        EObject lv_variables_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1402:28: ( (otherlv_0= 'global' ( (lv_variables_1_0= ruleVariableDeclaration ) ) (otherlv_2= ',' ( (lv_variables_3_0= ruleVariableDeclaration ) ) )* ) )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1403:1: (otherlv_0= 'global' ( (lv_variables_1_0= ruleVariableDeclaration ) ) (otherlv_2= ',' ( (lv_variables_3_0= ruleVariableDeclaration ) ) )* )
            {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1403:1: (otherlv_0= 'global' ( (lv_variables_1_0= ruleVariableDeclaration ) ) (otherlv_2= ',' ( (lv_variables_3_0= ruleVariableDeclaration ) ) )* )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1403:3: otherlv_0= 'global' ( (lv_variables_1_0= ruleVariableDeclaration ) ) (otherlv_2= ',' ( (lv_variables_3_0= ruleVariableDeclaration ) ) )*
            {
            otherlv_0=(Token)match(input,32,FOLLOW_32_in_ruleGlobalDeclaration3251); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getGlobalDeclarationAccess().getGlobalKeyword_0());
                  
            }
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1407:1: ( (lv_variables_1_0= ruleVariableDeclaration ) )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1408:1: (lv_variables_1_0= ruleVariableDeclaration )
            {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1408:1: (lv_variables_1_0= ruleVariableDeclaration )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1409:3: lv_variables_1_0= ruleVariableDeclaration
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getGlobalDeclarationAccess().getVariablesVariableDeclarationParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleVariableDeclaration_in_ruleGlobalDeclaration3272);
            lv_variables_1_0=ruleVariableDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getGlobalDeclarationRule());
              	        }
                     		add(
                     			current, 
                     			"variables",
                      		lv_variables_1_0, 
                      		"VariableDeclaration");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1425:2: (otherlv_2= ',' ( (lv_variables_3_0= ruleVariableDeclaration ) ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==30) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1425:4: otherlv_2= ',' ( (lv_variables_3_0= ruleVariableDeclaration ) )
            	    {
            	    otherlv_2=(Token)match(input,30,FOLLOW_30_in_ruleGlobalDeclaration3285); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getGlobalDeclarationAccess().getCommaKeyword_2_0());
            	          
            	    }
            	    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1429:1: ( (lv_variables_3_0= ruleVariableDeclaration ) )
            	    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1430:1: (lv_variables_3_0= ruleVariableDeclaration )
            	    {
            	    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1430:1: (lv_variables_3_0= ruleVariableDeclaration )
            	    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1431:3: lv_variables_3_0= ruleVariableDeclaration
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getGlobalDeclarationAccess().getVariablesVariableDeclarationParserRuleCall_2_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleVariableDeclaration_in_ruleGlobalDeclaration3306);
            	    lv_variables_3_0=ruleVariableDeclaration();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getGlobalDeclarationRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"variables",
            	              		lv_variables_3_0, 
            	              		"VariableDeclaration");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGlobalDeclaration"


    // $ANTLR start "entryRuleVariableDeclaration"
    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1455:1: entryRuleVariableDeclaration returns [EObject current=null] : iv_ruleVariableDeclaration= ruleVariableDeclaration EOF ;
    public final EObject entryRuleVariableDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableDeclaration = null;


        try {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1456:2: (iv_ruleVariableDeclaration= ruleVariableDeclaration EOF )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1457:2: iv_ruleVariableDeclaration= ruleVariableDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVariableDeclarationRule()); 
            }
            pushFollow(FOLLOW_ruleVariableDeclaration_in_entryRuleVariableDeclaration3344);
            iv_ruleVariableDeclaration=ruleVariableDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVariableDeclaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariableDeclaration3354); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVariableDeclaration"


    // $ANTLR start "ruleVariableDeclaration"
    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1464:1: ruleVariableDeclaration returns [EObject current=null] : (this_VariableDeclarationWithValue_0= ruleVariableDeclarationWithValue | this_VariableDeclarationUnitialized_1= ruleVariableDeclarationUnitialized ) ;
    public final EObject ruleVariableDeclaration() throws RecognitionException {
        EObject current = null;

        EObject this_VariableDeclarationWithValue_0 = null;

        EObject this_VariableDeclarationUnitialized_1 = null;


         enterRule(); 
            
        try {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1467:28: ( (this_VariableDeclarationWithValue_0= ruleVariableDeclarationWithValue | this_VariableDeclarationUnitialized_1= ruleVariableDeclarationUnitialized ) )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1468:1: (this_VariableDeclarationWithValue_0= ruleVariableDeclarationWithValue | this_VariableDeclarationUnitialized_1= ruleVariableDeclarationUnitialized )
            {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1468:1: (this_VariableDeclarationWithValue_0= ruleVariableDeclarationWithValue | this_VariableDeclarationUnitialized_1= ruleVariableDeclarationUnitialized )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_ID) ) {
                int LA15_1 = input.LA(2);

                if ( (LA15_1==EOF||LA15_1==12||LA15_1==30) ) {
                    alt15=2;
                }
                else if ( (LA15_1==17) ) {
                    alt15=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 15, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1469:5: this_VariableDeclarationWithValue_0= ruleVariableDeclarationWithValue
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getVariableDeclarationAccess().getVariableDeclarationWithValueParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleVariableDeclarationWithValue_in_ruleVariableDeclaration3401);
                    this_VariableDeclarationWithValue_0=ruleVariableDeclarationWithValue();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_VariableDeclarationWithValue_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1479:5: this_VariableDeclarationUnitialized_1= ruleVariableDeclarationUnitialized
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getVariableDeclarationAccess().getVariableDeclarationUnitializedParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleVariableDeclarationUnitialized_in_ruleVariableDeclaration3428);
                    this_VariableDeclarationUnitialized_1=ruleVariableDeclarationUnitialized();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_VariableDeclarationUnitialized_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVariableDeclaration"


    // $ANTLR start "entryRuleVariableDeclarationWithValue"
    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1495:1: entryRuleVariableDeclarationWithValue returns [EObject current=null] : iv_ruleVariableDeclarationWithValue= ruleVariableDeclarationWithValue EOF ;
    public final EObject entryRuleVariableDeclarationWithValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableDeclarationWithValue = null;


        try {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1496:2: (iv_ruleVariableDeclarationWithValue= ruleVariableDeclarationWithValue EOF )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1497:2: iv_ruleVariableDeclarationWithValue= ruleVariableDeclarationWithValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVariableDeclarationWithValueRule()); 
            }
            pushFollow(FOLLOW_ruleVariableDeclarationWithValue_in_entryRuleVariableDeclarationWithValue3463);
            iv_ruleVariableDeclarationWithValue=ruleVariableDeclarationWithValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVariableDeclarationWithValue; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariableDeclarationWithValue3473); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVariableDeclarationWithValue"


    // $ANTLR start "ruleVariableDeclarationWithValue"
    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1504:1: ruleVariableDeclarationWithValue returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleExpression ) ) ) ;
    public final EObject ruleVariableDeclarationWithValue() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        EObject lv_value_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1507:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleExpression ) ) ) )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1508:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleExpression ) ) )
            {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1508:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleExpression ) ) )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1508:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleExpression ) )
            {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1508:2: ( (lv_name_0_0= RULE_ID ) )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1509:1: (lv_name_0_0= RULE_ID )
            {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1509:1: (lv_name_0_0= RULE_ID )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1510:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleVariableDeclarationWithValue3515); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_0_0, grammarAccess.getVariableDeclarationWithValueAccess().getNameIDTerminalRuleCall_0_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getVariableDeclarationWithValueRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_0_0, 
                      		"ID");
              	    
            }

            }


            }

            otherlv_1=(Token)match(input,17,FOLLOW_17_in_ruleVariableDeclarationWithValue3532); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getVariableDeclarationWithValueAccess().getEqualsSignKeyword_1());
                  
            }
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1530:1: ( (lv_value_2_0= ruleExpression ) )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1531:1: (lv_value_2_0= ruleExpression )
            {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1531:1: (lv_value_2_0= ruleExpression )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1532:3: lv_value_2_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getVariableDeclarationWithValueAccess().getValueExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpression_in_ruleVariableDeclarationWithValue3553);
            lv_value_2_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getVariableDeclarationWithValueRule());
              	        }
                     		set(
                     			current, 
                     			"value",
                      		lv_value_2_0, 
                      		"Expression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVariableDeclarationWithValue"


    // $ANTLR start "entryRuleVariableDeclarationUnitialized"
    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1556:1: entryRuleVariableDeclarationUnitialized returns [EObject current=null] : iv_ruleVariableDeclarationUnitialized= ruleVariableDeclarationUnitialized EOF ;
    public final EObject entryRuleVariableDeclarationUnitialized() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableDeclarationUnitialized = null;


        try {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1557:2: (iv_ruleVariableDeclarationUnitialized= ruleVariableDeclarationUnitialized EOF )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1558:2: iv_ruleVariableDeclarationUnitialized= ruleVariableDeclarationUnitialized EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVariableDeclarationUnitializedRule()); 
            }
            pushFollow(FOLLOW_ruleVariableDeclarationUnitialized_in_entryRuleVariableDeclarationUnitialized3589);
            iv_ruleVariableDeclarationUnitialized=ruleVariableDeclarationUnitialized();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVariableDeclarationUnitialized; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariableDeclarationUnitialized3599); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVariableDeclarationUnitialized"


    // $ANTLR start "ruleVariableDeclarationUnitialized"
    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1565:1: ruleVariableDeclarationUnitialized returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleVariableDeclarationUnitialized() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;

         enterRule(); 
            
        try {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1568:28: ( ( (lv_name_0_0= RULE_ID ) ) )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1569:1: ( (lv_name_0_0= RULE_ID ) )
            {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1569:1: ( (lv_name_0_0= RULE_ID ) )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1570:1: (lv_name_0_0= RULE_ID )
            {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1570:1: (lv_name_0_0= RULE_ID )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1571:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleVariableDeclarationUnitialized3640); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_0_0, grammarAccess.getVariableDeclarationUnitializedAccess().getNameIDTerminalRuleCall_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getVariableDeclarationUnitializedRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_0_0, 
                      		"ID");
              	    
            }

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVariableDeclarationUnitialized"


    // $ANTLR start "entryRuleExpression"
    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1595:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1596:2: (iv_ruleExpression= ruleExpression EOF )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1597:2: iv_ruleExpression= ruleExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleExpression_in_entryRuleExpression3680);
            iv_ruleExpression=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpression3690); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1604:1: ruleExpression returns [EObject current=null] : this_Comparison_0= ruleComparison ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_Comparison_0 = null;


         enterRule(); 
            
        try {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1607:28: (this_Comparison_0= ruleComparison )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1609:5: this_Comparison_0= ruleComparison
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getExpressionAccess().getComparisonParserRuleCall()); 
                  
            }
            pushFollow(FOLLOW_ruleComparison_in_ruleExpression3736);
            this_Comparison_0=ruleComparison();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_Comparison_0; 
                      afterParserOrEnumRuleCall();
                  
            }

            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleComparison"
    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1625:1: entryRuleComparison returns [EObject current=null] : iv_ruleComparison= ruleComparison EOF ;
    public final EObject entryRuleComparison() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComparison = null;


        try {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1626:2: (iv_ruleComparison= ruleComparison EOF )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1627:2: iv_ruleComparison= ruleComparison EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getComparisonRule()); 
            }
            pushFollow(FOLLOW_ruleComparison_in_entryRuleComparison3770);
            iv_ruleComparison=ruleComparison();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleComparison; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleComparison3780); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleComparison"


    // $ANTLR start "ruleComparison"
    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1634:1: ruleComparison returns [EObject current=null] : (this_Or_0= ruleOr ( ( ( () otherlv_2= '===' ) | ( () otherlv_4= '==' ) | ( () otherlv_6= '!==' ) | ( () otherlv_8= '!=' ) | ( () otherlv_10= '<=' ) | ( () otherlv_12= '<' ) | ( () otherlv_14= '>=' ) | ( () otherlv_16= '>' ) ) ( (lv_right_17_0= ruleOr ) ) )* ) ;
    public final EObject ruleComparison() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        EObject this_Or_0 = null;

        EObject lv_right_17_0 = null;


         enterRule(); 
            
        try {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1637:28: ( (this_Or_0= ruleOr ( ( ( () otherlv_2= '===' ) | ( () otherlv_4= '==' ) | ( () otherlv_6= '!==' ) | ( () otherlv_8= '!=' ) | ( () otherlv_10= '<=' ) | ( () otherlv_12= '<' ) | ( () otherlv_14= '>=' ) | ( () otherlv_16= '>' ) ) ( (lv_right_17_0= ruleOr ) ) )* ) )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1638:1: (this_Or_0= ruleOr ( ( ( () otherlv_2= '===' ) | ( () otherlv_4= '==' ) | ( () otherlv_6= '!==' ) | ( () otherlv_8= '!=' ) | ( () otherlv_10= '<=' ) | ( () otherlv_12= '<' ) | ( () otherlv_14= '>=' ) | ( () otherlv_16= '>' ) ) ( (lv_right_17_0= ruleOr ) ) )* )
            {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1638:1: (this_Or_0= ruleOr ( ( ( () otherlv_2= '===' ) | ( () otherlv_4= '==' ) | ( () otherlv_6= '!==' ) | ( () otherlv_8= '!=' ) | ( () otherlv_10= '<=' ) | ( () otherlv_12= '<' ) | ( () otherlv_14= '>=' ) | ( () otherlv_16= '>' ) ) ( (lv_right_17_0= ruleOr ) ) )* )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1639:5: this_Or_0= ruleOr ( ( ( () otherlv_2= '===' ) | ( () otherlv_4= '==' ) | ( () otherlv_6= '!==' ) | ( () otherlv_8= '!=' ) | ( () otherlv_10= '<=' ) | ( () otherlv_12= '<' ) | ( () otherlv_14= '>=' ) | ( () otherlv_16= '>' ) ) ( (lv_right_17_0= ruleOr ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getComparisonAccess().getOrParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleOr_in_ruleComparison3827);
            this_Or_0=ruleOr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_Or_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1647:1: ( ( ( () otherlv_2= '===' ) | ( () otherlv_4= '==' ) | ( () otherlv_6= '!==' ) | ( () otherlv_8= '!=' ) | ( () otherlv_10= '<=' ) | ( () otherlv_12= '<' ) | ( () otherlv_14= '>=' ) | ( () otherlv_16= '>' ) ) ( (lv_right_17_0= ruleOr ) ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( ((LA17_0>=33 && LA17_0<=40)) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1647:2: ( ( () otherlv_2= '===' ) | ( () otherlv_4= '==' ) | ( () otherlv_6= '!==' ) | ( () otherlv_8= '!=' ) | ( () otherlv_10= '<=' ) | ( () otherlv_12= '<' ) | ( () otherlv_14= '>=' ) | ( () otherlv_16= '>' ) ) ( (lv_right_17_0= ruleOr ) )
            	    {
            	    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1647:2: ( ( () otherlv_2= '===' ) | ( () otherlv_4= '==' ) | ( () otherlv_6= '!==' ) | ( () otherlv_8= '!=' ) | ( () otherlv_10= '<=' ) | ( () otherlv_12= '<' ) | ( () otherlv_14= '>=' ) | ( () otherlv_16= '>' ) )
            	    int alt16=8;
            	    switch ( input.LA(1) ) {
            	    case 33:
            	        {
            	        alt16=1;
            	        }
            	        break;
            	    case 34:
            	        {
            	        alt16=2;
            	        }
            	        break;
            	    case 35:
            	        {
            	        alt16=3;
            	        }
            	        break;
            	    case 36:
            	        {
            	        alt16=4;
            	        }
            	        break;
            	    case 37:
            	        {
            	        alt16=5;
            	        }
            	        break;
            	    case 38:
            	        {
            	        alt16=6;
            	        }
            	        break;
            	    case 39:
            	        {
            	        alt16=7;
            	        }
            	        break;
            	    case 40:
            	        {
            	        alt16=8;
            	        }
            	        break;
            	    default:
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 16, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt16) {
            	        case 1 :
            	            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1647:3: ( () otherlv_2= '===' )
            	            {
            	            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1647:3: ( () otherlv_2= '===' )
            	            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1647:4: () otherlv_2= '==='
            	            {
            	            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1647:4: ()
            	            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1648:5: 
            	            {
            	            if ( state.backtracking==0 ) {

            	                      current = forceCreateModelElementAndSet(
            	                          grammarAccess.getComparisonAccess().getComparisonLeftAction_1_0_0_0(),
            	                          current);
            	                  
            	            }

            	            }

            	            otherlv_2=(Token)match(input,33,FOLLOW_33_in_ruleComparison3850); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_2, grammarAccess.getComparisonAccess().getEqualsSignEqualsSignEqualsSignKeyword_1_0_0_1());
            	                  
            	            }

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1658:6: ( () otherlv_4= '==' )
            	            {
            	            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1658:6: ( () otherlv_4= '==' )
            	            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1658:7: () otherlv_4= '=='
            	            {
            	            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1658:7: ()
            	            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1659:5: 
            	            {
            	            if ( state.backtracking==0 ) {

            	                      current = forceCreateModelElementAndSet(
            	                          grammarAccess.getComparisonAccess().getEqualsLeftAction_1_0_1_0(),
            	                          current);
            	                  
            	            }

            	            }

            	            otherlv_4=(Token)match(input,34,FOLLOW_34_in_ruleComparison3879); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_4, grammarAccess.getComparisonAccess().getEqualsSignEqualsSignKeyword_1_0_1_1());
            	                  
            	            }

            	            }


            	            }
            	            break;
            	        case 3 :
            	            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1669:6: ( () otherlv_6= '!==' )
            	            {
            	            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1669:6: ( () otherlv_6= '!==' )
            	            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1669:7: () otherlv_6= '!=='
            	            {
            	            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1669:7: ()
            	            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1670:5: 
            	            {
            	            if ( state.backtracking==0 ) {

            	                      current = forceCreateModelElementAndSet(
            	                          grammarAccess.getComparisonAccess().getTypedDifferentLeftAction_1_0_2_0(),
            	                          current);
            	                  
            	            }

            	            }

            	            otherlv_6=(Token)match(input,35,FOLLOW_35_in_ruleComparison3908); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_6, grammarAccess.getComparisonAccess().getExclamationMarkEqualsSignEqualsSignKeyword_1_0_2_1());
            	                  
            	            }

            	            }


            	            }
            	            break;
            	        case 4 :
            	            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1680:6: ( () otherlv_8= '!=' )
            	            {
            	            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1680:6: ( () otherlv_8= '!=' )
            	            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1680:7: () otherlv_8= '!='
            	            {
            	            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1680:7: ()
            	            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1681:5: 
            	            {
            	            if ( state.backtracking==0 ) {

            	                      current = forceCreateModelElementAndSet(
            	                          grammarAccess.getComparisonAccess().getDifferentLeftAction_1_0_3_0(),
            	                          current);
            	                  
            	            }

            	            }

            	            otherlv_8=(Token)match(input,36,FOLLOW_36_in_ruleComparison3937); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_8, grammarAccess.getComparisonAccess().getExclamationMarkEqualsSignKeyword_1_0_3_1());
            	                  
            	            }

            	            }


            	            }
            	            break;
            	        case 5 :
            	            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1691:6: ( () otherlv_10= '<=' )
            	            {
            	            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1691:6: ( () otherlv_10= '<=' )
            	            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1691:7: () otherlv_10= '<='
            	            {
            	            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1691:7: ()
            	            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1692:5: 
            	            {
            	            if ( state.backtracking==0 ) {

            	                      current = forceCreateModelElementAndSet(
            	                          grammarAccess.getComparisonAccess().getLessOrEqualsLeftAction_1_0_4_0(),
            	                          current);
            	                  
            	            }

            	            }

            	            otherlv_10=(Token)match(input,37,FOLLOW_37_in_ruleComparison3966); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_10, grammarAccess.getComparisonAccess().getLessThanSignEqualsSignKeyword_1_0_4_1());
            	                  
            	            }

            	            }


            	            }
            	            break;
            	        case 6 :
            	            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1702:6: ( () otherlv_12= '<' )
            	            {
            	            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1702:6: ( () otherlv_12= '<' )
            	            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1702:7: () otherlv_12= '<'
            	            {
            	            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1702:7: ()
            	            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1703:5: 
            	            {
            	            if ( state.backtracking==0 ) {

            	                      current = forceCreateModelElementAndSet(
            	                          grammarAccess.getComparisonAccess().getLessLeftAction_1_0_5_0(),
            	                          current);
            	                  
            	            }

            	            }

            	            otherlv_12=(Token)match(input,38,FOLLOW_38_in_ruleComparison3995); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_12, grammarAccess.getComparisonAccess().getLessThanSignKeyword_1_0_5_1());
            	                  
            	            }

            	            }


            	            }
            	            break;
            	        case 7 :
            	            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1713:6: ( () otherlv_14= '>=' )
            	            {
            	            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1713:6: ( () otherlv_14= '>=' )
            	            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1713:7: () otherlv_14= '>='
            	            {
            	            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1713:7: ()
            	            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1714:5: 
            	            {
            	            if ( state.backtracking==0 ) {

            	                      current = forceCreateModelElementAndSet(
            	                          grammarAccess.getComparisonAccess().getMoreOrEqualsLeftAction_1_0_6_0(),
            	                          current);
            	                  
            	            }

            	            }

            	            otherlv_14=(Token)match(input,39,FOLLOW_39_in_ruleComparison4024); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_14, grammarAccess.getComparisonAccess().getGreaterThanSignEqualsSignKeyword_1_0_6_1());
            	                  
            	            }

            	            }


            	            }
            	            break;
            	        case 8 :
            	            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1724:6: ( () otherlv_16= '>' )
            	            {
            	            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1724:6: ( () otherlv_16= '>' )
            	            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1724:7: () otherlv_16= '>'
            	            {
            	            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1724:7: ()
            	            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1725:5: 
            	            {
            	            if ( state.backtracking==0 ) {

            	                      current = forceCreateModelElementAndSet(
            	                          grammarAccess.getComparisonAccess().getMoreLeftAction_1_0_7_0(),
            	                          current);
            	                  
            	            }

            	            }

            	            otherlv_16=(Token)match(input,40,FOLLOW_40_in_ruleComparison4053); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_16, grammarAccess.getComparisonAccess().getGreaterThanSignKeyword_1_0_7_1());
            	                  
            	            }

            	            }


            	            }
            	            break;

            	    }

            	    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1734:3: ( (lv_right_17_0= ruleOr ) )
            	    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1735:1: (lv_right_17_0= ruleOr )
            	    {
            	    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1735:1: (lv_right_17_0= ruleOr )
            	    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1736:3: lv_right_17_0= ruleOr
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getComparisonAccess().getRightOrParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOr_in_ruleComparison4076);
            	    lv_right_17_0=ruleOr();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getComparisonRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"right",
            	              		lv_right_17_0, 
            	              		"Or");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleComparison"


    // $ANTLR start "entryRuleOr"
    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1760:1: entryRuleOr returns [EObject current=null] : iv_ruleOr= ruleOr EOF ;
    public final EObject entryRuleOr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOr = null;


        try {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1761:2: (iv_ruleOr= ruleOr EOF )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1762:2: iv_ruleOr= ruleOr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOrRule()); 
            }
            pushFollow(FOLLOW_ruleOr_in_entryRuleOr4114);
            iv_ruleOr=ruleOr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOr; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOr4124); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOr"


    // $ANTLR start "ruleOr"
    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1769:1: ruleOr returns [EObject current=null] : (this_And_0= ruleAnd ( ( () (otherlv_2= 'or' | otherlv_3= '||' ) ) ( (lv_right_4_0= ruleAnd ) ) )* ) ;
    public final EObject ruleOr() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject this_And_0 = null;

        EObject lv_right_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1772:28: ( (this_And_0= ruleAnd ( ( () (otherlv_2= 'or' | otherlv_3= '||' ) ) ( (lv_right_4_0= ruleAnd ) ) )* ) )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1773:1: (this_And_0= ruleAnd ( ( () (otherlv_2= 'or' | otherlv_3= '||' ) ) ( (lv_right_4_0= ruleAnd ) ) )* )
            {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1773:1: (this_And_0= ruleAnd ( ( () (otherlv_2= 'or' | otherlv_3= '||' ) ) ( (lv_right_4_0= ruleAnd ) ) )* )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1774:5: this_And_0= ruleAnd ( ( () (otherlv_2= 'or' | otherlv_3= '||' ) ) ( (lv_right_4_0= ruleAnd ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getOrAccess().getAndParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleAnd_in_ruleOr4171);
            this_And_0=ruleAnd();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_And_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1782:1: ( ( () (otherlv_2= 'or' | otherlv_3= '||' ) ) ( (lv_right_4_0= ruleAnd ) ) )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( ((LA19_0>=41 && LA19_0<=42)) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1782:2: ( () (otherlv_2= 'or' | otherlv_3= '||' ) ) ( (lv_right_4_0= ruleAnd ) )
            	    {
            	    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1782:2: ( () (otherlv_2= 'or' | otherlv_3= '||' ) )
            	    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1782:3: () (otherlv_2= 'or' | otherlv_3= '||' )
            	    {
            	    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1782:3: ()
            	    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1783:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getOrAccess().getOrLeftAction_1_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1788:2: (otherlv_2= 'or' | otherlv_3= '||' )
            	    int alt18=2;
            	    int LA18_0 = input.LA(1);

            	    if ( (LA18_0==41) ) {
            	        alt18=1;
            	    }
            	    else if ( (LA18_0==42) ) {
            	        alt18=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 18, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt18) {
            	        case 1 :
            	            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1788:4: otherlv_2= 'or'
            	            {
            	            otherlv_2=(Token)match(input,41,FOLLOW_41_in_ruleOr4194); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_2, grammarAccess.getOrAccess().getOrKeyword_1_0_1_0());
            	                  
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1793:7: otherlv_3= '||'
            	            {
            	            otherlv_3=(Token)match(input,42,FOLLOW_42_in_ruleOr4212); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_3, grammarAccess.getOrAccess().getVerticalLineVerticalLineKeyword_1_0_1_1());
            	                  
            	            }

            	            }
            	            break;

            	    }


            	    }

            	    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1797:3: ( (lv_right_4_0= ruleAnd ) )
            	    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1798:1: (lv_right_4_0= ruleAnd )
            	    {
            	    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1798:1: (lv_right_4_0= ruleAnd )
            	    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1799:3: lv_right_4_0= ruleAnd
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getOrAccess().getRightAndParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleAnd_in_ruleOr4235);
            	    lv_right_4_0=ruleAnd();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getOrRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"right",
            	              		lv_right_4_0, 
            	              		"And");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOr"


    // $ANTLR start "entryRuleAnd"
    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1823:1: entryRuleAnd returns [EObject current=null] : iv_ruleAnd= ruleAnd EOF ;
    public final EObject entryRuleAnd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnd = null;


        try {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1824:2: (iv_ruleAnd= ruleAnd EOF )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1825:2: iv_ruleAnd= ruleAnd EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAndRule()); 
            }
            pushFollow(FOLLOW_ruleAnd_in_entryRuleAnd4273);
            iv_ruleAnd=ruleAnd();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAnd; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAnd4283); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAnd"


    // $ANTLR start "ruleAnd"
    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1832:1: ruleAnd returns [EObject current=null] : (this_Addition_0= ruleAddition ( ( () (otherlv_2= 'and' | otherlv_3= '&&' ) ) ( (lv_right_4_0= ruleAddition ) ) )* ) ;
    public final EObject ruleAnd() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject this_Addition_0 = null;

        EObject lv_right_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1835:28: ( (this_Addition_0= ruleAddition ( ( () (otherlv_2= 'and' | otherlv_3= '&&' ) ) ( (lv_right_4_0= ruleAddition ) ) )* ) )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1836:1: (this_Addition_0= ruleAddition ( ( () (otherlv_2= 'and' | otherlv_3= '&&' ) ) ( (lv_right_4_0= ruleAddition ) ) )* )
            {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1836:1: (this_Addition_0= ruleAddition ( ( () (otherlv_2= 'and' | otherlv_3= '&&' ) ) ( (lv_right_4_0= ruleAddition ) ) )* )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1837:5: this_Addition_0= ruleAddition ( ( () (otherlv_2= 'and' | otherlv_3= '&&' ) ) ( (lv_right_4_0= ruleAddition ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getAndAccess().getAdditionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleAddition_in_ruleAnd4330);
            this_Addition_0=ruleAddition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_Addition_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1845:1: ( ( () (otherlv_2= 'and' | otherlv_3= '&&' ) ) ( (lv_right_4_0= ruleAddition ) ) )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( ((LA21_0>=43 && LA21_0<=44)) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1845:2: ( () (otherlv_2= 'and' | otherlv_3= '&&' ) ) ( (lv_right_4_0= ruleAddition ) )
            	    {
            	    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1845:2: ( () (otherlv_2= 'and' | otherlv_3= '&&' ) )
            	    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1845:3: () (otherlv_2= 'and' | otherlv_3= '&&' )
            	    {
            	    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1845:3: ()
            	    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1846:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getAndAccess().getAndLeftAction_1_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1851:2: (otherlv_2= 'and' | otherlv_3= '&&' )
            	    int alt20=2;
            	    int LA20_0 = input.LA(1);

            	    if ( (LA20_0==43) ) {
            	        alt20=1;
            	    }
            	    else if ( (LA20_0==44) ) {
            	        alt20=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 20, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt20) {
            	        case 1 :
            	            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1851:4: otherlv_2= 'and'
            	            {
            	            otherlv_2=(Token)match(input,43,FOLLOW_43_in_ruleAnd4353); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_2, grammarAccess.getAndAccess().getAndKeyword_1_0_1_0());
            	                  
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1856:7: otherlv_3= '&&'
            	            {
            	            otherlv_3=(Token)match(input,44,FOLLOW_44_in_ruleAnd4371); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_3, grammarAccess.getAndAccess().getAmpersandAmpersandKeyword_1_0_1_1());
            	                  
            	            }

            	            }
            	            break;

            	    }


            	    }

            	    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1860:3: ( (lv_right_4_0= ruleAddition ) )
            	    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1861:1: (lv_right_4_0= ruleAddition )
            	    {
            	    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1861:1: (lv_right_4_0= ruleAddition )
            	    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1862:3: lv_right_4_0= ruleAddition
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getAndAccess().getRightAdditionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleAddition_in_ruleAnd4394);
            	    lv_right_4_0=ruleAddition();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getAndRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"right",
            	              		lv_right_4_0, 
            	              		"Addition");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAnd"


    // $ANTLR start "entryRuleAddition"
    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1886:1: entryRuleAddition returns [EObject current=null] : iv_ruleAddition= ruleAddition EOF ;
    public final EObject entryRuleAddition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAddition = null;


        try {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1887:2: (iv_ruleAddition= ruleAddition EOF )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1888:2: iv_ruleAddition= ruleAddition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAdditionRule()); 
            }
            pushFollow(FOLLOW_ruleAddition_in_entryRuleAddition4432);
            iv_ruleAddition=ruleAddition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAddition; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAddition4442); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAddition"


    // $ANTLR start "ruleAddition"
    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1895:1: ruleAddition returns [EObject current=null] : (this_Multiplication_0= ruleMultiplication ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMultiplication ) ) )* ) ;
    public final EObject ruleAddition() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_Multiplication_0 = null;

        EObject lv_right_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1898:28: ( (this_Multiplication_0= ruleMultiplication ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMultiplication ) ) )* ) )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1899:1: (this_Multiplication_0= ruleMultiplication ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMultiplication ) ) )* )
            {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1899:1: (this_Multiplication_0= ruleMultiplication ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMultiplication ) ) )* )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1900:5: this_Multiplication_0= ruleMultiplication ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMultiplication ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getAdditionAccess().getMultiplicationParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleMultiplication_in_ruleAddition4489);
            this_Multiplication_0=ruleMultiplication();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_Multiplication_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1908:1: ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMultiplication ) ) )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( ((LA23_0>=45 && LA23_0<=46)) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1908:2: ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMultiplication ) )
            	    {
            	    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1908:2: ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) )
            	    int alt22=2;
            	    int LA22_0 = input.LA(1);

            	    if ( (LA22_0==45) ) {
            	        alt22=1;
            	    }
            	    else if ( (LA22_0==46) ) {
            	        alt22=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 22, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt22) {
            	        case 1 :
            	            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1908:3: ( () otherlv_2= '+' )
            	            {
            	            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1908:3: ( () otherlv_2= '+' )
            	            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1908:4: () otherlv_2= '+'
            	            {
            	            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1908:4: ()
            	            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1909:5: 
            	            {
            	            if ( state.backtracking==0 ) {

            	                      current = forceCreateModelElementAndSet(
            	                          grammarAccess.getAdditionAccess().getPlusLeftAction_1_0_0_0(),
            	                          current);
            	                  
            	            }

            	            }

            	            otherlv_2=(Token)match(input,45,FOLLOW_45_in_ruleAddition4512); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_2, grammarAccess.getAdditionAccess().getPlusSignKeyword_1_0_0_1());
            	                  
            	            }

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1919:6: ( () otherlv_4= '-' )
            	            {
            	            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1919:6: ( () otherlv_4= '-' )
            	            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1919:7: () otherlv_4= '-'
            	            {
            	            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1919:7: ()
            	            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1920:5: 
            	            {
            	            if ( state.backtracking==0 ) {

            	                      current = forceCreateModelElementAndSet(
            	                          grammarAccess.getAdditionAccess().getMinusLeftAction_1_0_1_0(),
            	                          current);
            	                  
            	            }

            	            }

            	            otherlv_4=(Token)match(input,46,FOLLOW_46_in_ruleAddition4541); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_4, grammarAccess.getAdditionAccess().getHyphenMinusKeyword_1_0_1_1());
            	                  
            	            }

            	            }


            	            }
            	            break;

            	    }

            	    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1929:3: ( (lv_right_5_0= ruleMultiplication ) )
            	    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1930:1: (lv_right_5_0= ruleMultiplication )
            	    {
            	    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1930:1: (lv_right_5_0= ruleMultiplication )
            	    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1931:3: lv_right_5_0= ruleMultiplication
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getAdditionAccess().getRightMultiplicationParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleMultiplication_in_ruleAddition4564);
            	    lv_right_5_0=ruleMultiplication();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getAdditionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"right",
            	              		lv_right_5_0, 
            	              		"Multiplication");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAddition"


    // $ANTLR start "entryRuleMultiplication"
    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1955:1: entryRuleMultiplication returns [EObject current=null] : iv_ruleMultiplication= ruleMultiplication EOF ;
    public final EObject entryRuleMultiplication() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiplication = null;


        try {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1956:2: (iv_ruleMultiplication= ruleMultiplication EOF )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1957:2: iv_ruleMultiplication= ruleMultiplication EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMultiplicationRule()); 
            }
            pushFollow(FOLLOW_ruleMultiplication_in_entryRuleMultiplication4602);
            iv_ruleMultiplication=ruleMultiplication();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMultiplication; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMultiplication4612); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMultiplication"


    // $ANTLR start "ruleMultiplication"
    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1964:1: ruleMultiplication returns [EObject current=null] : (this_PrimaryExpression_0= rulePrimaryExpression ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= rulePrimaryExpression ) ) )* ) ;
    public final EObject ruleMultiplication() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_PrimaryExpression_0 = null;

        EObject lv_right_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1967:28: ( (this_PrimaryExpression_0= rulePrimaryExpression ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= rulePrimaryExpression ) ) )* ) )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1968:1: (this_PrimaryExpression_0= rulePrimaryExpression ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= rulePrimaryExpression ) ) )* )
            {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1968:1: (this_PrimaryExpression_0= rulePrimaryExpression ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= rulePrimaryExpression ) ) )* )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1969:5: this_PrimaryExpression_0= rulePrimaryExpression ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= rulePrimaryExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getMultiplicationAccess().getPrimaryExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_rulePrimaryExpression_in_ruleMultiplication4659);
            this_PrimaryExpression_0=rulePrimaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_PrimaryExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1977:1: ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= rulePrimaryExpression ) ) )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( ((LA25_0>=47 && LA25_0<=48)) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1977:2: ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= rulePrimaryExpression ) )
            	    {
            	    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1977:2: ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) )
            	    int alt24=2;
            	    int LA24_0 = input.LA(1);

            	    if ( (LA24_0==47) ) {
            	        alt24=1;
            	    }
            	    else if ( (LA24_0==48) ) {
            	        alt24=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 24, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt24) {
            	        case 1 :
            	            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1977:3: ( () otherlv_2= '*' )
            	            {
            	            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1977:3: ( () otherlv_2= '*' )
            	            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1977:4: () otherlv_2= '*'
            	            {
            	            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1977:4: ()
            	            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1978:5: 
            	            {
            	            if ( state.backtracking==0 ) {

            	                      current = forceCreateModelElementAndSet(
            	                          grammarAccess.getMultiplicationAccess().getMultiLeftAction_1_0_0_0(),
            	                          current);
            	                  
            	            }

            	            }

            	            otherlv_2=(Token)match(input,47,FOLLOW_47_in_ruleMultiplication4682); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_2, grammarAccess.getMultiplicationAccess().getAsteriskKeyword_1_0_0_1());
            	                  
            	            }

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1988:6: ( () otherlv_4= '/' )
            	            {
            	            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1988:6: ( () otherlv_4= '/' )
            	            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1988:7: () otherlv_4= '/'
            	            {
            	            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1988:7: ()
            	            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1989:5: 
            	            {
            	            if ( state.backtracking==0 ) {

            	                      current = forceCreateModelElementAndSet(
            	                          grammarAccess.getMultiplicationAccess().getDivLeftAction_1_0_1_0(),
            	                          current);
            	                  
            	            }

            	            }

            	            otherlv_4=(Token)match(input,48,FOLLOW_48_in_ruleMultiplication4711); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_4, grammarAccess.getMultiplicationAccess().getSolidusKeyword_1_0_1_1());
            	                  
            	            }

            	            }


            	            }
            	            break;

            	    }

            	    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1998:3: ( (lv_right_5_0= rulePrimaryExpression ) )
            	    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1999:1: (lv_right_5_0= rulePrimaryExpression )
            	    {
            	    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:1999:1: (lv_right_5_0= rulePrimaryExpression )
            	    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2000:3: lv_right_5_0= rulePrimaryExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getMultiplicationAccess().getRightPrimaryExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_rulePrimaryExpression_in_ruleMultiplication4734);
            	    lv_right_5_0=rulePrimaryExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getMultiplicationRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"right",
            	              		lv_right_5_0, 
            	              		"PrimaryExpression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMultiplication"


    // $ANTLR start "entryRulePrimaryExpression"
    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2024:1: entryRulePrimaryExpression returns [EObject current=null] : iv_rulePrimaryExpression= rulePrimaryExpression EOF ;
    public final EObject entryRulePrimaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimaryExpression = null;


        try {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2025:2: (iv_rulePrimaryExpression= rulePrimaryExpression EOF )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2026:2: iv_rulePrimaryExpression= rulePrimaryExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPrimaryExpressionRule()); 
            }
            pushFollow(FOLLOW_rulePrimaryExpression_in_entryRulePrimaryExpression4772);
            iv_rulePrimaryExpression=rulePrimaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePrimaryExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePrimaryExpression4782); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePrimaryExpression"


    // $ANTLR start "rulePrimaryExpression"
    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2033:1: rulePrimaryExpression returns [EObject current=null] : ( (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) | ( () otherlv_4= '-' ( (lv_expression_5_0= rulePrimaryExpression ) ) ) | ( () ( (lv_value_7_0= RULE_REAL ) ) ) | ( () ( (lv_value_9_0= RULE_INT ) ) ) | this_FunctionCall_10= ruleFunctionCall | this_Postfix_11= rulePostfix | ( () ( (lv_value_13_0= RULE_STRING ) ) ) | this_ArrayLiteral_14= ruleArrayLiteral | this_FunctionDeclaration_15= ruleFunctionDeclaration | ( () otherlv_17= 'null' ) | ( () otherlv_19= 'false' ) | ( () otherlv_21= 'true' ) ) ;
    public final EObject rulePrimaryExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token lv_value_7_0=null;
        Token lv_value_9_0=null;
        Token lv_value_13_0=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        EObject this_Expression_1 = null;

        EObject lv_expression_5_0 = null;

        EObject this_FunctionCall_10 = null;

        EObject this_Postfix_11 = null;

        EObject this_ArrayLiteral_14 = null;

        EObject this_FunctionDeclaration_15 = null;


         enterRule(); 
            
        try {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2036:28: ( ( (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) | ( () otherlv_4= '-' ( (lv_expression_5_0= rulePrimaryExpression ) ) ) | ( () ( (lv_value_7_0= RULE_REAL ) ) ) | ( () ( (lv_value_9_0= RULE_INT ) ) ) | this_FunctionCall_10= ruleFunctionCall | this_Postfix_11= rulePostfix | ( () ( (lv_value_13_0= RULE_STRING ) ) ) | this_ArrayLiteral_14= ruleArrayLiteral | this_FunctionDeclaration_15= ruleFunctionDeclaration | ( () otherlv_17= 'null' ) | ( () otherlv_19= 'false' ) | ( () otherlv_21= 'true' ) ) )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2037:1: ( (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) | ( () otherlv_4= '-' ( (lv_expression_5_0= rulePrimaryExpression ) ) ) | ( () ( (lv_value_7_0= RULE_REAL ) ) ) | ( () ( (lv_value_9_0= RULE_INT ) ) ) | this_FunctionCall_10= ruleFunctionCall | this_Postfix_11= rulePostfix | ( () ( (lv_value_13_0= RULE_STRING ) ) ) | this_ArrayLiteral_14= ruleArrayLiteral | this_FunctionDeclaration_15= ruleFunctionDeclaration | ( () otherlv_17= 'null' ) | ( () otherlv_19= 'false' ) | ( () otherlv_21= 'true' ) )
            {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2037:1: ( (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) | ( () otherlv_4= '-' ( (lv_expression_5_0= rulePrimaryExpression ) ) ) | ( () ( (lv_value_7_0= RULE_REAL ) ) ) | ( () ( (lv_value_9_0= RULE_INT ) ) ) | this_FunctionCall_10= ruleFunctionCall | this_Postfix_11= rulePostfix | ( () ( (lv_value_13_0= RULE_STRING ) ) ) | this_ArrayLiteral_14= ruleArrayLiteral | this_FunctionDeclaration_15= ruleFunctionDeclaration | ( () otherlv_17= 'null' ) | ( () otherlv_19= 'false' ) | ( () otherlv_21= 'true' ) )
            int alt26=12;
            alt26 = dfa26.predict(input);
            switch (alt26) {
                case 1 :
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2037:2: (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' )
                    {
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2037:2: (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' )
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2037:4: otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')'
                    {
                    otherlv_0=(Token)match(input,21,FOLLOW_21_in_rulePrimaryExpression4820); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_0, grammarAccess.getPrimaryExpressionAccess().getLeftParenthesisKeyword_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getExpressionParserRuleCall_0_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleExpression_in_rulePrimaryExpression4842);
                    this_Expression_1=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Expression_1; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    otherlv_2=(Token)match(input,22,FOLLOW_22_in_rulePrimaryExpression4853); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getPrimaryExpressionAccess().getRightParenthesisKeyword_0_2());
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2055:6: ( () otherlv_4= '-' ( (lv_expression_5_0= rulePrimaryExpression ) ) )
                    {
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2055:6: ( () otherlv_4= '-' ( (lv_expression_5_0= rulePrimaryExpression ) ) )
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2055:7: () otherlv_4= '-' ( (lv_expression_5_0= rulePrimaryExpression ) )
                    {
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2055:7: ()
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2056:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getPrimaryExpressionAccess().getUnitaryMinusAction_1_0(),
                                  current);
                          
                    }

                    }

                    otherlv_4=(Token)match(input,46,FOLLOW_46_in_rulePrimaryExpression4882); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getPrimaryExpressionAccess().getHyphenMinusKeyword_1_1());
                          
                    }
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2065:1: ( (lv_expression_5_0= rulePrimaryExpression ) )
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2066:1: (lv_expression_5_0= rulePrimaryExpression )
                    {
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2066:1: (lv_expression_5_0= rulePrimaryExpression )
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2067:3: lv_expression_5_0= rulePrimaryExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getExpressionPrimaryExpressionParserRuleCall_1_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_rulePrimaryExpression_in_rulePrimaryExpression4903);
                    lv_expression_5_0=rulePrimaryExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getPrimaryExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"expression",
                              		lv_expression_5_0, 
                              		"PrimaryExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2084:6: ( () ( (lv_value_7_0= RULE_REAL ) ) )
                    {
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2084:6: ( () ( (lv_value_7_0= RULE_REAL ) ) )
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2084:7: () ( (lv_value_7_0= RULE_REAL ) )
                    {
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2084:7: ()
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2085:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getPrimaryExpressionAccess().getRealLiteralAction_2_0(),
                                  current);
                          
                    }

                    }

                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2090:2: ( (lv_value_7_0= RULE_REAL ) )
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2091:1: (lv_value_7_0= RULE_REAL )
                    {
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2091:1: (lv_value_7_0= RULE_REAL )
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2092:3: lv_value_7_0= RULE_REAL
                    {
                    lv_value_7_0=(Token)match(input,RULE_REAL,FOLLOW_RULE_REAL_in_rulePrimaryExpression4937); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_value_7_0, grammarAccess.getPrimaryExpressionAccess().getValueREALTerminalRuleCall_2_1_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getPrimaryExpressionRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"value",
                              		lv_value_7_0, 
                              		"REAL");
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2109:6: ( () ( (lv_value_9_0= RULE_INT ) ) )
                    {
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2109:6: ( () ( (lv_value_9_0= RULE_INT ) ) )
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2109:7: () ( (lv_value_9_0= RULE_INT ) )
                    {
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2109:7: ()
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2110:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getPrimaryExpressionAccess().getIntLiteralAction_3_0(),
                                  current);
                          
                    }

                    }

                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2115:2: ( (lv_value_9_0= RULE_INT ) )
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2116:1: (lv_value_9_0= RULE_INT )
                    {
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2116:1: (lv_value_9_0= RULE_INT )
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2117:3: lv_value_9_0= RULE_INT
                    {
                    lv_value_9_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_rulePrimaryExpression4976); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_value_9_0, grammarAccess.getPrimaryExpressionAccess().getValueINTTerminalRuleCall_3_1_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getPrimaryExpressionRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"value",
                              		lv_value_9_0, 
                              		"INT");
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 5 :
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2135:5: this_FunctionCall_10= ruleFunctionCall
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getFunctionCallParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleFunctionCall_in_rulePrimaryExpression5010);
                    this_FunctionCall_10=ruleFunctionCall();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_FunctionCall_10; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 6 :
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2145:5: this_Postfix_11= rulePostfix
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getPostfixParserRuleCall_5()); 
                          
                    }
                    pushFollow(FOLLOW_rulePostfix_in_rulePrimaryExpression5037);
                    this_Postfix_11=rulePostfix();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Postfix_11; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 7 :
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2154:6: ( () ( (lv_value_13_0= RULE_STRING ) ) )
                    {
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2154:6: ( () ( (lv_value_13_0= RULE_STRING ) ) )
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2154:7: () ( (lv_value_13_0= RULE_STRING ) )
                    {
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2154:7: ()
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2155:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getPrimaryExpressionAccess().getStringLiteralAction_6_0(),
                                  current);
                          
                    }

                    }

                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2160:2: ( (lv_value_13_0= RULE_STRING ) )
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2161:1: (lv_value_13_0= RULE_STRING )
                    {
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2161:1: (lv_value_13_0= RULE_STRING )
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2162:3: lv_value_13_0= RULE_STRING
                    {
                    lv_value_13_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rulePrimaryExpression5069); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_value_13_0, grammarAccess.getPrimaryExpressionAccess().getValueSTRINGTerminalRuleCall_6_1_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getPrimaryExpressionRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"value",
                              		lv_value_13_0, 
                              		"STRING");
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 8 :
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2180:5: this_ArrayLiteral_14= ruleArrayLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getArrayLiteralParserRuleCall_7()); 
                          
                    }
                    pushFollow(FOLLOW_ruleArrayLiteral_in_rulePrimaryExpression5103);
                    this_ArrayLiteral_14=ruleArrayLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_ArrayLiteral_14; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 9 :
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2190:5: this_FunctionDeclaration_15= ruleFunctionDeclaration
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getFunctionDeclarationParserRuleCall_8()); 
                          
                    }
                    pushFollow(FOLLOW_ruleFunctionDeclaration_in_rulePrimaryExpression5130);
                    this_FunctionDeclaration_15=ruleFunctionDeclaration();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_FunctionDeclaration_15; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 10 :
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2199:6: ( () otherlv_17= 'null' )
                    {
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2199:6: ( () otherlv_17= 'null' )
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2199:7: () otherlv_17= 'null'
                    {
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2199:7: ()
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2200:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getPrimaryExpressionAccess().getNullLiteralAction_9_0(),
                                  current);
                          
                    }

                    }

                    otherlv_17=(Token)match(input,49,FOLLOW_49_in_rulePrimaryExpression5157); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_17, grammarAccess.getPrimaryExpressionAccess().getNullKeyword_9_1());
                          
                    }

                    }


                    }
                    break;
                case 11 :
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2210:6: ( () otherlv_19= 'false' )
                    {
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2210:6: ( () otherlv_19= 'false' )
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2210:7: () otherlv_19= 'false'
                    {
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2210:7: ()
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2211:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getPrimaryExpressionAccess().getFalseLiteralAction_10_0(),
                                  current);
                          
                    }

                    }

                    otherlv_19=(Token)match(input,50,FOLLOW_50_in_rulePrimaryExpression5186); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_19, grammarAccess.getPrimaryExpressionAccess().getFalseKeyword_10_1());
                          
                    }

                    }


                    }
                    break;
                case 12 :
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2221:6: ( () otherlv_21= 'true' )
                    {
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2221:6: ( () otherlv_21= 'true' )
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2221:7: () otherlv_21= 'true'
                    {
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2221:7: ()
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2222:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getPrimaryExpressionAccess().getTrueLiteralAction_11_0(),
                                  current);
                          
                    }

                    }

                    otherlv_21=(Token)match(input,51,FOLLOW_51_in_rulePrimaryExpression5215); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_21, grammarAccess.getPrimaryExpressionAccess().getTrueKeyword_11_1());
                          
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePrimaryExpression"


    // $ANTLR start "entryRuleArrayLiteral"
    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2239:1: entryRuleArrayLiteral returns [EObject current=null] : iv_ruleArrayLiteral= ruleArrayLiteral EOF ;
    public final EObject entryRuleArrayLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArrayLiteral = null;


        try {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2240:2: (iv_ruleArrayLiteral= ruleArrayLiteral EOF )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2241:2: iv_ruleArrayLiteral= ruleArrayLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getArrayLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleArrayLiteral_in_entryRuleArrayLiteral5252);
            iv_ruleArrayLiteral=ruleArrayLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleArrayLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleArrayLiteral5262); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleArrayLiteral"


    // $ANTLR start "ruleArrayLiteral"
    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2248:1: ruleArrayLiteral returns [EObject current=null] : ( () otherlv_1= '[' ( ( (lv_values_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleExpression ) ) )* )? otherlv_5= ']' ) ;
    public final EObject ruleArrayLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_values_2_0 = null;

        EObject lv_values_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2251:28: ( ( () otherlv_1= '[' ( ( (lv_values_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleExpression ) ) )* )? otherlv_5= ']' ) )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2252:1: ( () otherlv_1= '[' ( ( (lv_values_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleExpression ) ) )* )? otherlv_5= ']' )
            {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2252:1: ( () otherlv_1= '[' ( ( (lv_values_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleExpression ) ) )* )? otherlv_5= ']' )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2252:2: () otherlv_1= '[' ( ( (lv_values_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleExpression ) ) )* )? otherlv_5= ']'
            {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2252:2: ()
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2253:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getArrayLiteralAccess().getArrayLiteralAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,52,FOLLOW_52_in_ruleArrayLiteral5308); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getArrayLiteralAccess().getLeftSquareBracketKeyword_1());
                  
            }
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2262:1: ( ( (lv_values_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleExpression ) ) )* )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( ((LA28_0>=RULE_ID && LA28_0<=RULE_STRING)||LA28_0==21||LA28_0==29||LA28_0==46||(LA28_0>=49 && LA28_0<=52)) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2262:2: ( (lv_values_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleExpression ) ) )*
                    {
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2262:2: ( (lv_values_2_0= ruleExpression ) )
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2263:1: (lv_values_2_0= ruleExpression )
                    {
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2263:1: (lv_values_2_0= ruleExpression )
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2264:3: lv_values_2_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getArrayLiteralAccess().getValuesExpressionParserRuleCall_2_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_in_ruleArrayLiteral5330);
                    lv_values_2_0=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getArrayLiteralRule());
                      	        }
                             		add(
                             			current, 
                             			"values",
                              		lv_values_2_0, 
                              		"Expression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2280:2: (otherlv_3= ',' ( (lv_values_4_0= ruleExpression ) ) )*
                    loop27:
                    do {
                        int alt27=2;
                        int LA27_0 = input.LA(1);

                        if ( (LA27_0==30) ) {
                            alt27=1;
                        }


                        switch (alt27) {
                    	case 1 :
                    	    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2280:4: otherlv_3= ',' ( (lv_values_4_0= ruleExpression ) )
                    	    {
                    	    otherlv_3=(Token)match(input,30,FOLLOW_30_in_ruleArrayLiteral5343); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_3, grammarAccess.getArrayLiteralAccess().getCommaKeyword_2_1_0());
                    	          
                    	    }
                    	    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2284:1: ( (lv_values_4_0= ruleExpression ) )
                    	    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2285:1: (lv_values_4_0= ruleExpression )
                    	    {
                    	    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2285:1: (lv_values_4_0= ruleExpression )
                    	    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2286:3: lv_values_4_0= ruleExpression
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getArrayLiteralAccess().getValuesExpressionParserRuleCall_2_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleExpression_in_ruleArrayLiteral5364);
                    	    lv_values_4_0=ruleExpression();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getArrayLiteralRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"values",
                    	              		lv_values_4_0, 
                    	              		"Expression");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop27;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,53,FOLLOW_53_in_ruleArrayLiteral5380); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getArrayLiteralAccess().getRightSquareBracketKeyword_3());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleArrayLiteral"


    // $ANTLR start "entryRuleVariableReference"
    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2314:1: entryRuleVariableReference returns [EObject current=null] : iv_ruleVariableReference= ruleVariableReference EOF ;
    public final EObject entryRuleVariableReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableReference = null;


        try {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2315:2: (iv_ruleVariableReference= ruleVariableReference EOF )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2316:2: iv_ruleVariableReference= ruleVariableReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVariableReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleVariableReference_in_entryRuleVariableReference5416);
            iv_ruleVariableReference=ruleVariableReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVariableReference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariableReference5426); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVariableReference"


    // $ANTLR start "ruleVariableReference"
    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2323:1: ruleVariableReference returns [EObject current=null] : ( ( ( ruleVariableReferenceArray )=>this_VariableReferenceArray_0= ruleVariableReferenceArray ) | this_VariableReferenceSimple_1= ruleVariableReferenceSimple ) ;
    public final EObject ruleVariableReference() throws RecognitionException {
        EObject current = null;

        EObject this_VariableReferenceArray_0 = null;

        EObject this_VariableReferenceSimple_1 = null;


         enterRule(); 
            
        try {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2326:28: ( ( ( ( ruleVariableReferenceArray )=>this_VariableReferenceArray_0= ruleVariableReferenceArray ) | this_VariableReferenceSimple_1= ruleVariableReferenceSimple ) )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2327:1: ( ( ( ruleVariableReferenceArray )=>this_VariableReferenceArray_0= ruleVariableReferenceArray ) | this_VariableReferenceSimple_1= ruleVariableReferenceSimple )
            {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2327:1: ( ( ( ruleVariableReferenceArray )=>this_VariableReferenceArray_0= ruleVariableReferenceArray ) | this_VariableReferenceSimple_1= ruleVariableReferenceSimple )
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==RULE_ID) ) {
                int LA29_1 = input.LA(2);

                if ( (LA29_1==52) && (synpred4_InternalLeek())) {
                    alt29=1;
                }
                else if ( (LA29_1==EOF||LA29_1==12||(LA29_1>=17 && LA29_1<=19)||LA29_1==22||LA29_1==30||(LA29_1>=33 && LA29_1<=48)||(LA29_1>=53 && LA29_1<=55)) ) {
                    alt29=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 29, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }
            switch (alt29) {
                case 1 :
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2327:2: ( ( ruleVariableReferenceArray )=>this_VariableReferenceArray_0= ruleVariableReferenceArray )
                    {
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2327:2: ( ( ruleVariableReferenceArray )=>this_VariableReferenceArray_0= ruleVariableReferenceArray )
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2327:3: ( ruleVariableReferenceArray )=>this_VariableReferenceArray_0= ruleVariableReferenceArray
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getVariableReferenceAccess().getVariableReferenceArrayParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleVariableReferenceArray_in_ruleVariableReference5479);
                    this_VariableReferenceArray_0=ruleVariableReferenceArray();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_VariableReferenceArray_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2338:5: this_VariableReferenceSimple_1= ruleVariableReferenceSimple
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getVariableReferenceAccess().getVariableReferenceSimpleParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleVariableReferenceSimple_in_ruleVariableReference5507);
                    this_VariableReferenceSimple_1=ruleVariableReferenceSimple();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_VariableReferenceSimple_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVariableReference"


    // $ANTLR start "entryRulePostfix"
    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2354:1: entryRulePostfix returns [EObject current=null] : iv_rulePostfix= rulePostfix EOF ;
    public final EObject entryRulePostfix() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePostfix = null;


        try {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2355:2: (iv_rulePostfix= rulePostfix EOF )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2356:2: iv_rulePostfix= rulePostfix EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPostfixRule()); 
            }
            pushFollow(FOLLOW_rulePostfix_in_entryRulePostfix5542);
            iv_rulePostfix=rulePostfix();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePostfix; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePostfix5552); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePostfix"


    // $ANTLR start "rulePostfix"
    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2363:1: rulePostfix returns [EObject current=null] : (this_VariableReference_0= ruleVariableReference ( ( () otherlv_2= '--' ) | ( () otherlv_4= '++' ) )? ) ;
    public final EObject rulePostfix() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_VariableReference_0 = null;


         enterRule(); 
            
        try {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2366:28: ( (this_VariableReference_0= ruleVariableReference ( ( () otherlv_2= '--' ) | ( () otherlv_4= '++' ) )? ) )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2367:1: (this_VariableReference_0= ruleVariableReference ( ( () otherlv_2= '--' ) | ( () otherlv_4= '++' ) )? )
            {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2367:1: (this_VariableReference_0= ruleVariableReference ( ( () otherlv_2= '--' ) | ( () otherlv_4= '++' ) )? )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2368:5: this_VariableReference_0= ruleVariableReference ( ( () otherlv_2= '--' ) | ( () otherlv_4= '++' ) )?
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getPostfixAccess().getVariableReferenceParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleVariableReference_in_rulePostfix5599);
            this_VariableReference_0=ruleVariableReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_VariableReference_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2376:1: ( ( () otherlv_2= '--' ) | ( () otherlv_4= '++' ) )?
            int alt30=3;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==54) ) {
                alt30=1;
            }
            else if ( (LA30_0==55) ) {
                alt30=2;
            }
            switch (alt30) {
                case 1 :
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2376:2: ( () otherlv_2= '--' )
                    {
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2376:2: ( () otherlv_2= '--' )
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2376:3: () otherlv_2= '--'
                    {
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2376:3: ()
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2377:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElementAndSet(
                                  grammarAccess.getPostfixAccess().getPostfixDecrementValueAction_1_0_0(),
                                  current);
                          
                    }

                    }

                    otherlv_2=(Token)match(input,54,FOLLOW_54_in_rulePostfix5621); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getPostfixAccess().getHyphenMinusHyphenMinusKeyword_1_0_1());
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2387:6: ( () otherlv_4= '++' )
                    {
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2387:6: ( () otherlv_4= '++' )
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2387:7: () otherlv_4= '++'
                    {
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2387:7: ()
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2388:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElementAndSet(
                                  grammarAccess.getPostfixAccess().getPostfixIncrementValueAction_1_1_0(),
                                  current);
                          
                    }

                    }

                    otherlv_4=(Token)match(input,55,FOLLOW_55_in_rulePostfix5650); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getPostfixAccess().getPlusSignPlusSignKeyword_1_1_1());
                          
                    }

                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePostfix"


    // $ANTLR start "entryRuleVariableReferenceSimple"
    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2405:1: entryRuleVariableReferenceSimple returns [EObject current=null] : iv_ruleVariableReferenceSimple= ruleVariableReferenceSimple EOF ;
    public final EObject entryRuleVariableReferenceSimple() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableReferenceSimple = null;


        try {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2406:2: (iv_ruleVariableReferenceSimple= ruleVariableReferenceSimple EOF )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2407:2: iv_ruleVariableReferenceSimple= ruleVariableReferenceSimple EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVariableReferenceSimpleRule()); 
            }
            pushFollow(FOLLOW_ruleVariableReferenceSimple_in_entryRuleVariableReferenceSimple5689);
            iv_ruleVariableReferenceSimple=ruleVariableReferenceSimple();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVariableReferenceSimple; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariableReferenceSimple5699); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVariableReferenceSimple"


    // $ANTLR start "ruleVariableReferenceSimple"
    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2414:1: ruleVariableReferenceSimple returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleVariableReferenceSimple() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;

         enterRule(); 
            
        try {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2417:28: ( ( (otherlv_0= RULE_ID ) ) )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2418:1: ( (otherlv_0= RULE_ID ) )
            {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2418:1: ( (otherlv_0= RULE_ID ) )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2419:1: (otherlv_0= RULE_ID )
            {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2419:1: (otherlv_0= RULE_ID )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2420:3: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getVariableReferenceSimpleRule());
              	        }
                      
            }
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleVariableReferenceSimple5743); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_0, grammarAccess.getVariableReferenceSimpleAccess().getVariableVariableReferenceCrossReference_0()); 
              	
            }

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVariableReferenceSimple"


    // $ANTLR start "entryRuleVariableReferenceArray"
    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2439:1: entryRuleVariableReferenceArray returns [EObject current=null] : iv_ruleVariableReferenceArray= ruleVariableReferenceArray EOF ;
    public final EObject entryRuleVariableReferenceArray() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableReferenceArray = null;


        try {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2440:2: (iv_ruleVariableReferenceArray= ruleVariableReferenceArray EOF )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2441:2: iv_ruleVariableReferenceArray= ruleVariableReferenceArray EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVariableReferenceArrayRule()); 
            }
            pushFollow(FOLLOW_ruleVariableReferenceArray_in_entryRuleVariableReferenceArray5778);
            iv_ruleVariableReferenceArray=ruleVariableReferenceArray();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVariableReferenceArray; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariableReferenceArray5788); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVariableReferenceArray"


    // $ANTLR start "ruleVariableReferenceArray"
    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2448:1: ruleVariableReferenceArray returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_dimensions_2_0= ruleExpression ) ) otherlv_3= ']' )+ ) ;
    public final EObject ruleVariableReferenceArray() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_dimensions_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2451:28: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_dimensions_2_0= ruleExpression ) ) otherlv_3= ']' )+ ) )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2452:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_dimensions_2_0= ruleExpression ) ) otherlv_3= ']' )+ )
            {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2452:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_dimensions_2_0= ruleExpression ) ) otherlv_3= ']' )+ )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2452:2: ( (otherlv_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_dimensions_2_0= ruleExpression ) ) otherlv_3= ']' )+
            {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2452:2: ( (otherlv_0= RULE_ID ) )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2453:1: (otherlv_0= RULE_ID )
            {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2453:1: (otherlv_0= RULE_ID )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2454:3: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getVariableReferenceArrayRule());
              	        }
                      
            }
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleVariableReferenceArray5833); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_0, grammarAccess.getVariableReferenceArrayAccess().getVariableVariableReferenceCrossReference_0_0()); 
              	
            }

            }


            }

            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2465:2: (otherlv_1= '[' ( (lv_dimensions_2_0= ruleExpression ) ) otherlv_3= ']' )+
            int cnt31=0;
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==52) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2465:4: otherlv_1= '[' ( (lv_dimensions_2_0= ruleExpression ) ) otherlv_3= ']'
            	    {
            	    otherlv_1=(Token)match(input,52,FOLLOW_52_in_ruleVariableReferenceArray5846); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_1, grammarAccess.getVariableReferenceArrayAccess().getLeftSquareBracketKeyword_1_0());
            	          
            	    }
            	    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2469:1: ( (lv_dimensions_2_0= ruleExpression ) )
            	    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2470:1: (lv_dimensions_2_0= ruleExpression )
            	    {
            	    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2470:1: (lv_dimensions_2_0= ruleExpression )
            	    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2471:3: lv_dimensions_2_0= ruleExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getVariableReferenceArrayAccess().getDimensionsExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleExpression_in_ruleVariableReferenceArray5867);
            	    lv_dimensions_2_0=ruleExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getVariableReferenceArrayRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"dimensions",
            	              		lv_dimensions_2_0, 
            	              		"Expression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    otherlv_3=(Token)match(input,53,FOLLOW_53_in_ruleVariableReferenceArray5879); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_3, grammarAccess.getVariableReferenceArrayAccess().getRightSquareBracketKeyword_1_2());
            	          
            	    }

            	    }
            	    break;

            	default :
            	    if ( cnt31 >= 1 ) break loop31;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(31, input);
                        throw eee;
                }
                cnt31++;
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVariableReferenceArray"


    // $ANTLR start "entryRuleFunctionCall"
    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2499:1: entryRuleFunctionCall returns [EObject current=null] : iv_ruleFunctionCall= ruleFunctionCall EOF ;
    public final EObject entryRuleFunctionCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionCall = null;


        try {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2500:2: (iv_ruleFunctionCall= ruleFunctionCall EOF )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2501:2: iv_ruleFunctionCall= ruleFunctionCall EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFunctionCallRule()); 
            }
            pushFollow(FOLLOW_ruleFunctionCall_in_entryRuleFunctionCall5917);
            iv_ruleFunctionCall=ruleFunctionCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFunctionCall; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFunctionCall5927); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFunctionCall"


    // $ANTLR start "ruleFunctionCall"
    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2508:1: ruleFunctionCall returns [EObject current=null] : ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= '(' ( ( (lv_args_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleExpression ) ) )* )? otherlv_6= ')' ) ;
    public final EObject ruleFunctionCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_args_3_0 = null;

        EObject lv_args_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2511:28: ( ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= '(' ( ( (lv_args_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleExpression ) ) )* )? otherlv_6= ')' ) )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2512:1: ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= '(' ( ( (lv_args_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleExpression ) ) )* )? otherlv_6= ')' )
            {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2512:1: ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= '(' ( ( (lv_args_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleExpression ) ) )* )? otherlv_6= ')' )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2512:2: () ( (otherlv_1= RULE_ID ) ) otherlv_2= '(' ( ( (lv_args_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleExpression ) ) )* )? otherlv_6= ')'
            {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2512:2: ()
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2513:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getFunctionCallAccess().getFunctionCallAction_0(),
                          current);
                  
            }

            }

            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2518:2: ( (otherlv_1= RULE_ID ) )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2519:1: (otherlv_1= RULE_ID )
            {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2519:1: (otherlv_1= RULE_ID )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2520:3: otherlv_1= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getFunctionCallRule());
              	        }
                      
            }
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFunctionCall5981); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_1, grammarAccess.getFunctionCallAccess().getFunctionFunctionDeclarationCrossReference_1_0()); 
              	
            }

            }


            }

            otherlv_2=(Token)match(input,21,FOLLOW_21_in_ruleFunctionCall5993); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getFunctionCallAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2535:1: ( ( (lv_args_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleExpression ) ) )* )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( ((LA33_0>=RULE_ID && LA33_0<=RULE_STRING)||LA33_0==21||LA33_0==29||LA33_0==46||(LA33_0>=49 && LA33_0<=52)) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2535:2: ( (lv_args_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleExpression ) ) )*
                    {
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2535:2: ( (lv_args_3_0= ruleExpression ) )
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2536:1: (lv_args_3_0= ruleExpression )
                    {
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2536:1: (lv_args_3_0= ruleExpression )
                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2537:3: lv_args_3_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getFunctionCallAccess().getArgsExpressionParserRuleCall_3_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_in_ruleFunctionCall6015);
                    lv_args_3_0=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getFunctionCallRule());
                      	        }
                             		add(
                             			current, 
                             			"args",
                              		lv_args_3_0, 
                              		"Expression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2553:2: (otherlv_4= ',' ( (lv_args_5_0= ruleExpression ) ) )*
                    loop32:
                    do {
                        int alt32=2;
                        int LA32_0 = input.LA(1);

                        if ( (LA32_0==30) ) {
                            alt32=1;
                        }


                        switch (alt32) {
                    	case 1 :
                    	    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2553:4: otherlv_4= ',' ( (lv_args_5_0= ruleExpression ) )
                    	    {
                    	    otherlv_4=(Token)match(input,30,FOLLOW_30_in_ruleFunctionCall6028); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_4, grammarAccess.getFunctionCallAccess().getCommaKeyword_3_1_0());
                    	          
                    	    }
                    	    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2557:1: ( (lv_args_5_0= ruleExpression ) )
                    	    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2558:1: (lv_args_5_0= ruleExpression )
                    	    {
                    	    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2558:1: (lv_args_5_0= ruleExpression )
                    	    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2559:3: lv_args_5_0= ruleExpression
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getFunctionCallAccess().getArgsExpressionParserRuleCall_3_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleExpression_in_ruleFunctionCall6049);
                    	    lv_args_5_0=ruleExpression();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getFunctionCallRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"args",
                    	              		lv_args_5_0, 
                    	              		"Expression");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop32;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_6=(Token)match(input,22,FOLLOW_22_in_ruleFunctionCall6065); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getFunctionCallAccess().getRightParenthesisKeyword_4());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFunctionCall"


    // $ANTLR start "entryRuleReturnStatement"
    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2587:1: entryRuleReturnStatement returns [EObject current=null] : iv_ruleReturnStatement= ruleReturnStatement EOF ;
    public final EObject entryRuleReturnStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReturnStatement = null;


        try {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2588:2: (iv_ruleReturnStatement= ruleReturnStatement EOF )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2589:2: iv_ruleReturnStatement= ruleReturnStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getReturnStatementRule()); 
            }
            pushFollow(FOLLOW_ruleReturnStatement_in_entryRuleReturnStatement6101);
            iv_ruleReturnStatement=ruleReturnStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleReturnStatement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleReturnStatement6111); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleReturnStatement"


    // $ANTLR start "ruleReturnStatement"
    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2596:1: ruleReturnStatement returns [EObject current=null] : (otherlv_0= 'return' ( (lv_value_1_0= ruleExpression ) ) ) ;
    public final EObject ruleReturnStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_value_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2599:28: ( (otherlv_0= 'return' ( (lv_value_1_0= ruleExpression ) ) ) )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2600:1: (otherlv_0= 'return' ( (lv_value_1_0= ruleExpression ) ) )
            {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2600:1: (otherlv_0= 'return' ( (lv_value_1_0= ruleExpression ) ) )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2600:3: otherlv_0= 'return' ( (lv_value_1_0= ruleExpression ) )
            {
            otherlv_0=(Token)match(input,56,FOLLOW_56_in_ruleReturnStatement6148); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getReturnStatementAccess().getReturnKeyword_0());
                  
            }
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2604:1: ( (lv_value_1_0= ruleExpression ) )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2605:1: (lv_value_1_0= ruleExpression )
            {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2605:1: (lv_value_1_0= ruleExpression )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2606:3: lv_value_1_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getReturnStatementAccess().getValueExpressionParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpression_in_ruleReturnStatement6169);
            lv_value_1_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getReturnStatementRule());
              	        }
                     		set(
                     			current, 
                     			"value",
                      		lv_value_1_0, 
                      		"Expression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleReturnStatement"


    // $ANTLR start "entryRuleInclude"
    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2630:1: entryRuleInclude returns [EObject current=null] : iv_ruleInclude= ruleInclude EOF ;
    public final EObject entryRuleInclude() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInclude = null;


        try {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2631:2: (iv_ruleInclude= ruleInclude EOF )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2632:2: iv_ruleInclude= ruleInclude EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIncludeRule()); 
            }
            pushFollow(FOLLOW_ruleInclude_in_entryRuleInclude6205);
            iv_ruleInclude=ruleInclude();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInclude; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleInclude6215); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInclude"


    // $ANTLR start "ruleInclude"
    // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2639:1: ruleInclude returns [EObject current=null] : (otherlv_0= 'include' otherlv_1= '(' ( (lv_importURI_2_0= RULE_STRING ) ) otherlv_3= ')' ) ;
    public final EObject ruleInclude() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_importURI_2_0=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2642:28: ( (otherlv_0= 'include' otherlv_1= '(' ( (lv_importURI_2_0= RULE_STRING ) ) otherlv_3= ')' ) )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2643:1: (otherlv_0= 'include' otherlv_1= '(' ( (lv_importURI_2_0= RULE_STRING ) ) otherlv_3= ')' )
            {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2643:1: (otherlv_0= 'include' otherlv_1= '(' ( (lv_importURI_2_0= RULE_STRING ) ) otherlv_3= ')' )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2643:3: otherlv_0= 'include' otherlv_1= '(' ( (lv_importURI_2_0= RULE_STRING ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,57,FOLLOW_57_in_ruleInclude6252); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getIncludeAccess().getIncludeKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,21,FOLLOW_21_in_ruleInclude6264); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getIncludeAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2651:1: ( (lv_importURI_2_0= RULE_STRING ) )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2652:1: (lv_importURI_2_0= RULE_STRING )
            {
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2652:1: (lv_importURI_2_0= RULE_STRING )
            // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2653:3: lv_importURI_2_0= RULE_STRING
            {
            lv_importURI_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleInclude6281); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_importURI_2_0, grammarAccess.getIncludeAccess().getImportURISTRINGTerminalRuleCall_2_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getIncludeRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"importURI",
                      		lv_importURI_2_0, 
                      		"STRING");
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,22,FOLLOW_22_in_ruleInclude6298); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getIncludeAccess().getRightParenthesisKeyword_3());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInclude"

    // $ANTLR start synpred1_InternalLeek
    public final void synpred1_InternalLeek_fragment() throws RecognitionException {   
        // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:417:3: ( ruleAffectationDecrement )
        // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:417:5: ruleAffectationDecrement
        {
        pushFollow(FOLLOW_ruleAffectationDecrement_in_synpred1_InternalLeek1053);
        ruleAffectationDecrement();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred1_InternalLeek

    // $ANTLR start synpred2_InternalLeek
    public final void synpred2_InternalLeek_fragment() throws RecognitionException {   
        // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:427:7: ( ruleAffectationIncrement )
        // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:427:9: ruleAffectationIncrement
        {
        pushFollow(FOLLOW_ruleAffectationIncrement_in_synpred2_InternalLeek1087);
        ruleAffectationIncrement();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred2_InternalLeek

    // $ANTLR start synpred3_InternalLeek
    public final void synpred3_InternalLeek_fragment() throws RecognitionException {   
        // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:698:4: ( 'else' )
        // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:698:6: 'else'
        {
        match(input,23,FOLLOW_23_in_synpred3_InternalLeek1667); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred3_InternalLeek

    // $ANTLR start synpred4_InternalLeek
    public final void synpred4_InternalLeek_fragment() throws RecognitionException {   
        // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2327:3: ( ruleVariableReferenceArray )
        // ../org.processus.ecleek/src-gen/org/processus/ecleek/parser/antlr/internal/InternalLeek.g:2327:5: ruleVariableReferenceArray
        {
        pushFollow(FOLLOW_ruleVariableReferenceArray_in_synpred4_InternalLeek5463);
        ruleVariableReferenceArray();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred4_InternalLeek

    // Delegated rules

    public final boolean synpred4_InternalLeek() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred4_InternalLeek_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred2_InternalLeek() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred2_InternalLeek_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred1_InternalLeek() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_InternalLeek_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred3_InternalLeek() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred3_InternalLeek_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA2 dfa2 = new DFA2(this);
    protected DFA26 dfa26 = new DFA26(this);
    static final String DFA2_eotS =
        "\17\uffff";
    static final String DFA2_eofS =
        "\17\uffff";
    static final String DFA2_minS =
        "\1\4\4\uffff\1\21\11\uffff";
    static final String DFA2_maxS =
        "\1\71\4\uffff\1\64\11\uffff";
    static final String DFA2_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\uffff\1\6\1\7\1\11\1\12\1\13\1\14\1\15\1\10\1\5";
    static final String DFA2_specialS =
        "\17\uffff}>";
    static final String[] DFA2_transitionS = {
            "\1\5\7\uffff\1\14\1\12\1\13\1\10\4\uffff\1\7\3\uffff\2\6\2\uffff\1\4\1\3\2\uffff\1\2\27\uffff\1\11\1\1",
            "",
            "",
            "",
            "",
            "\3\15\1\uffff\1\16\36\uffff\1\15",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA2_eot = DFA.unpackEncodedString(DFA2_eotS);
    static final short[] DFA2_eof = DFA.unpackEncodedString(DFA2_eofS);
    static final char[] DFA2_min = DFA.unpackEncodedStringToUnsignedChars(DFA2_minS);
    static final char[] DFA2_max = DFA.unpackEncodedStringToUnsignedChars(DFA2_maxS);
    static final short[] DFA2_accept = DFA.unpackEncodedString(DFA2_acceptS);
    static final short[] DFA2_special = DFA.unpackEncodedString(DFA2_specialS);
    static final short[][] DFA2_transition;

    static {
        int numStates = DFA2_transitionS.length;
        DFA2_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA2_transition[i] = DFA.unpackEncodedString(DFA2_transitionS[i]);
        }
    }

    class DFA2 extends DFA {

        public DFA2(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 2;
            this.eot = DFA2_eot;
            this.eof = DFA2_eof;
            this.min = DFA2_min;
            this.max = DFA2_max;
            this.accept = DFA2_accept;
            this.special = DFA2_special;
            this.transition = DFA2_transition;
        }
        public String getDescription() {
            return "119:1: ( (this_Include_0= ruleInclude otherlv_1= ';' ) | (this_GlobalDeclaration_2= ruleGlobalDeclaration otherlv_3= ';' ) | this_FunctionDeclaration_4= ruleFunctionDeclaration | (this_LocalDeclaration_5= ruleLocalDeclaration otherlv_6= ';' ) | (this_FunctionCall_7= ruleFunctionCall otherlv_8= ';' ) | this_Iteration_9= ruleIteration | this_If_10= ruleIf | (this_AffectationStatement_11= ruleAffectationStatement otherlv_12= ';' ) | this_StatementBlock_13= ruleStatementBlock | (this_ReturnStatement_14= ruleReturnStatement otherlv_15= ';' ) | (this_BreakStatement_16= ruleBreakStatement otherlv_17= ';' ) | (this_ContinueStatement_18= ruleContinueStatement otherlv_19= ';' ) | ( () otherlv_21= ';' ) )";
        }
    }
    static final String DFA26_eotS =
        "\16\uffff";
    static final String DFA26_eofS =
        "\5\uffff\1\14\10\uffff";
    static final String DFA26_minS =
        "\1\4\4\uffff\1\14\10\uffff";
    static final String DFA26_maxS =
        "\1\64\4\uffff\1\67\10\uffff";
    static final String DFA26_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\uffff\1\7\1\10\1\11\1\12\1\13\1\14\1\6\1\5";
    static final String DFA26_specialS =
        "\16\uffff}>";
    static final String[] DFA26_transitionS = {
            "\1\5\1\3\1\4\1\6\15\uffff\1\1\7\uffff\1\10\20\uffff\1\2\2\uffff\1\11\1\12\1\13\1\7",
            "",
            "",
            "",
            "",
            "\1\14\10\uffff\1\15\1\14\7\uffff\1\14\2\uffff\20\14\3\uffff\4\14",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA26_eot = DFA.unpackEncodedString(DFA26_eotS);
    static final short[] DFA26_eof = DFA.unpackEncodedString(DFA26_eofS);
    static final char[] DFA26_min = DFA.unpackEncodedStringToUnsignedChars(DFA26_minS);
    static final char[] DFA26_max = DFA.unpackEncodedStringToUnsignedChars(DFA26_maxS);
    static final short[] DFA26_accept = DFA.unpackEncodedString(DFA26_acceptS);
    static final short[] DFA26_special = DFA.unpackEncodedString(DFA26_specialS);
    static final short[][] DFA26_transition;

    static {
        int numStates = DFA26_transitionS.length;
        DFA26_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA26_transition[i] = DFA.unpackEncodedString(DFA26_transitionS[i]);
        }
    }

    class DFA26 extends DFA {

        public DFA26(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 26;
            this.eot = DFA26_eot;
            this.eof = DFA26_eof;
            this.min = DFA26_min;
            this.max = DFA26_max;
            this.accept = DFA26_accept;
            this.special = DFA26_special;
            this.transition = DFA26_transition;
        }
        public String getDescription() {
            return "2037:1: ( (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) | ( () otherlv_4= '-' ( (lv_expression_5_0= rulePrimaryExpression ) ) ) | ( () ( (lv_value_7_0= RULE_REAL ) ) ) | ( () ( (lv_value_9_0= RULE_INT ) ) ) | this_FunctionCall_10= ruleFunctionCall | this_Postfix_11= rulePostfix | ( () ( (lv_value_13_0= RULE_STRING ) ) ) | this_ArrayLiteral_14= ruleArrayLiteral | this_FunctionDeclaration_15= ruleFunctionDeclaration | ( () otherlv_17= 'null' ) | ( () otherlv_19= 'false' ) | ( () otherlv_21= 'true' ) )";
        }
    }
 

    public static final BitSet FOLLOW_ruleScript_in_entryRuleScript75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleScript85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatement_in_ruleScript130 = new BitSet(new long[]{0x030000013310F012L});
    public static final BitSet FOLLOW_ruleStatement_in_entryRuleStatement166 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStatement176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInclude_in_ruleStatement224 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleStatement235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGlobalDeclaration_in_ruleStatement265 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleStatement276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionDeclaration_in_ruleStatement305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLocalDeclaration_in_ruleStatement333 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleStatement344 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionCall_in_ruleStatement374 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleStatement385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIteration_in_ruleStatement414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIf_in_ruleStatement441 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAffectationStatement_in_ruleStatement469 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleStatement480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatementBlock_in_ruleStatement509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReturnStatement_in_ruleStatement537 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleStatement548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBreakStatement_in_ruleStatement578 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleStatement589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleContinueStatement_in_ruleStatement619 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleStatement630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_ruleStatement659 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBreakStatement_in_entryRuleBreakStatement696 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBreakStatement706 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleBreakStatement752 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleContinueStatement_in_entryRuleContinueStatement788 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleContinueStatement798 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleContinueStatement844 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatementBlock_in_entryRuleStatementBlock880 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStatementBlock890 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleStatementBlock927 = new BitSet(new long[]{0x030000013311F010L});
    public static final BitSet FOLLOW_ruleStatement_in_ruleStatementBlock957 = new BitSet(new long[]{0x030000013311F010L});
    public static final BitSet FOLLOW_16_in_ruleStatementBlock970 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAffectationStatement_in_entryRuleAffectationStatement1006 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAffectationStatement1016 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAffectationDecrement_in_ruleAffectationStatement1069 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAffectationIncrement_in_ruleAffectationStatement1103 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAffectation_in_ruleAffectationStatement1131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAffectation_in_entryRuleAffectation1166 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAffectation1176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableReference_in_ruleAffectation1222 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleAffectation1234 = new BitSet(new long[]{0x001E4000202000F0L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleAffectation1255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAffectationDecrement_in_entryRuleAffectationDecrement1291 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAffectationDecrement1301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableReference_in_ruleAffectationDecrement1347 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleAffectationDecrement1359 = new BitSet(new long[]{0x001E4000202000F0L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleAffectationDecrement1380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAffectationIncrement_in_entryRuleAffectationIncrement1416 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAffectationIncrement1426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableReference_in_ruleAffectationIncrement1472 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleAffectationIncrement1484 = new BitSet(new long[]{0x001E4000202000F0L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleAffectationIncrement1505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIf_in_entryRuleIf1541 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIf1551 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleIf1588 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleIf1600 = new BitSet(new long[]{0x001E4000202000F0L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleIf1621 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleIf1633 = new BitSet(new long[]{0x030000013390F010L});
    public static final BitSet FOLLOW_ruleStatement_in_ruleIf1654 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_23_in_ruleIf1675 = new BitSet(new long[]{0x030000013310F010L});
    public static final BitSet FOLLOW_ruleStatement_in_ruleIf1697 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIteration_in_entryRuleIteration1735 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIteration1745 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWhile_in_ruleIteration1792 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleForIn_in_ruleIteration1819 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFor_in_ruleIteration1846 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWhile_in_entryRuleWhile1881 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWhile1891 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleWhile1928 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleWhile1940 = new BitSet(new long[]{0x001E4000202000F0L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleWhile1961 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleWhile1973 = new BitSet(new long[]{0x030000013310F010L});
    public static final BitSet FOLLOW_ruleStatement_in_ruleWhile1994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFor_in_entryRuleFor2030 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFor2040 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleFor2077 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleFor2089 = new BitSet(new long[]{0x0000000010000010L});
    public static final BitSet FOLLOW_ruleForInitializer_in_ruleFor2110 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleFor2122 = new BitSet(new long[]{0x001E4000202000F0L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleFor2143 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleFor2155 = new BitSet(new long[]{0x001E4000202000F0L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleFor2176 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleFor2188 = new BitSet(new long[]{0x030000013310F010L});
    public static final BitSet FOLLOW_ruleStatement_in_ruleFor2209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleForIn_in_entryRuleForIn2245 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleForIn2255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleForIn2292 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleForIn2304 = new BitSet(new long[]{0x0000000010000010L});
    public static final BitSet FOLLOW_ruleForInVariableReference_in_ruleForIn2326 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleForIn2338 = new BitSet(new long[]{0x0000000010000010L});
    public static final BitSet FOLLOW_ruleForInVariableReference_in_ruleForIn2361 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleForIn2373 = new BitSet(new long[]{0x001E4000202000F0L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleForIn2394 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleForIn2406 = new BitSet(new long[]{0x030000013310F010L});
    public static final BitSet FOLLOW_ruleStatement_in_ruleForIn2427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleForInVariableReference_in_entryRuleForInVariableReference2463 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleForInVariableReference2473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleForInVariableReference2511 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleVariableDeclarationUnitialized_in_ruleForInVariableReference2533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableReferenceSimple_in_ruleForInVariableReference2561 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleForInitializer_in_entryRuleForInitializer2596 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleForInitializer2606 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleForInitializer2644 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleVariableDeclarationWithValue_in_ruleForInitializer2666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAffectation_in_ruleForInitializer2694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionDeclaration_in_entryRuleFunctionDeclaration2729 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFunctionDeclaration2739 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleFunctionDeclaration2776 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFunctionDeclaration2793 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleFunctionDeclaration2810 = new BitSet(new long[]{0x0000000080400010L});
    public static final BitSet FOLLOW_ruleParameterDeclaration_in_ruleFunctionDeclaration2832 = new BitSet(new long[]{0x0000000040400000L});
    public static final BitSet FOLLOW_30_in_ruleFunctionDeclaration2845 = new BitSet(new long[]{0x0000000080000010L});
    public static final BitSet FOLLOW_ruleParameterDeclaration_in_ruleFunctionDeclaration2866 = new BitSet(new long[]{0x0000000040400000L});
    public static final BitSet FOLLOW_22_in_ruleFunctionDeclaration2882 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_ruleStatementBlock_in_ruleFunctionDeclaration2903 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameterDeclaration_in_entryRuleParameterDeclaration2939 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParameterDeclaration2949 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleParameterDeclaration2992 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleParameterDeclaration3023 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLocalDeclaration_in_entryRuleLocalDeclaration3064 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLocalDeclaration3074 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleLocalDeclaration3111 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleVariableDeclaration_in_ruleLocalDeclaration3132 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_30_in_ruleLocalDeclaration3145 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleVariableDeclaration_in_ruleLocalDeclaration3166 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_ruleGlobalDeclaration_in_entryRuleGlobalDeclaration3204 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGlobalDeclaration3214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleGlobalDeclaration3251 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleVariableDeclaration_in_ruleGlobalDeclaration3272 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_30_in_ruleGlobalDeclaration3285 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleVariableDeclaration_in_ruleGlobalDeclaration3306 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_ruleVariableDeclaration_in_entryRuleVariableDeclaration3344 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariableDeclaration3354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableDeclarationWithValue_in_ruleVariableDeclaration3401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableDeclarationUnitialized_in_ruleVariableDeclaration3428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableDeclarationWithValue_in_entryRuleVariableDeclarationWithValue3463 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariableDeclarationWithValue3473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleVariableDeclarationWithValue3515 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleVariableDeclarationWithValue3532 = new BitSet(new long[]{0x001E4000202000F0L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleVariableDeclarationWithValue3553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableDeclarationUnitialized_in_entryRuleVariableDeclarationUnitialized3589 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariableDeclarationUnitialized3599 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleVariableDeclarationUnitialized3640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_entryRuleExpression3680 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpression3690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComparison_in_ruleExpression3736 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComparison_in_entryRuleComparison3770 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleComparison3780 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOr_in_ruleComparison3827 = new BitSet(new long[]{0x000001FE00000002L});
    public static final BitSet FOLLOW_33_in_ruleComparison3850 = new BitSet(new long[]{0x001E4000202000F0L});
    public static final BitSet FOLLOW_34_in_ruleComparison3879 = new BitSet(new long[]{0x001E4000202000F0L});
    public static final BitSet FOLLOW_35_in_ruleComparison3908 = new BitSet(new long[]{0x001E4000202000F0L});
    public static final BitSet FOLLOW_36_in_ruleComparison3937 = new BitSet(new long[]{0x001E4000202000F0L});
    public static final BitSet FOLLOW_37_in_ruleComparison3966 = new BitSet(new long[]{0x001E4000202000F0L});
    public static final BitSet FOLLOW_38_in_ruleComparison3995 = new BitSet(new long[]{0x001E4000202000F0L});
    public static final BitSet FOLLOW_39_in_ruleComparison4024 = new BitSet(new long[]{0x001E4000202000F0L});
    public static final BitSet FOLLOW_40_in_ruleComparison4053 = new BitSet(new long[]{0x001E4000202000F0L});
    public static final BitSet FOLLOW_ruleOr_in_ruleComparison4076 = new BitSet(new long[]{0x000001FE00000002L});
    public static final BitSet FOLLOW_ruleOr_in_entryRuleOr4114 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOr4124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnd_in_ruleOr4171 = new BitSet(new long[]{0x0000060000000002L});
    public static final BitSet FOLLOW_41_in_ruleOr4194 = new BitSet(new long[]{0x001E4000202000F0L});
    public static final BitSet FOLLOW_42_in_ruleOr4212 = new BitSet(new long[]{0x001E4000202000F0L});
    public static final BitSet FOLLOW_ruleAnd_in_ruleOr4235 = new BitSet(new long[]{0x0000060000000002L});
    public static final BitSet FOLLOW_ruleAnd_in_entryRuleAnd4273 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAnd4283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAddition_in_ruleAnd4330 = new BitSet(new long[]{0x0000180000000002L});
    public static final BitSet FOLLOW_43_in_ruleAnd4353 = new BitSet(new long[]{0x001E4000202000F0L});
    public static final BitSet FOLLOW_44_in_ruleAnd4371 = new BitSet(new long[]{0x001E4000202000F0L});
    public static final BitSet FOLLOW_ruleAddition_in_ruleAnd4394 = new BitSet(new long[]{0x0000180000000002L});
    public static final BitSet FOLLOW_ruleAddition_in_entryRuleAddition4432 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAddition4442 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultiplication_in_ruleAddition4489 = new BitSet(new long[]{0x0000600000000002L});
    public static final BitSet FOLLOW_45_in_ruleAddition4512 = new BitSet(new long[]{0x001E4000202000F0L});
    public static final BitSet FOLLOW_46_in_ruleAddition4541 = new BitSet(new long[]{0x001E4000202000F0L});
    public static final BitSet FOLLOW_ruleMultiplication_in_ruleAddition4564 = new BitSet(new long[]{0x0000600000000002L});
    public static final BitSet FOLLOW_ruleMultiplication_in_entryRuleMultiplication4602 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMultiplication4612 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimaryExpression_in_ruleMultiplication4659 = new BitSet(new long[]{0x0001800000000002L});
    public static final BitSet FOLLOW_47_in_ruleMultiplication4682 = new BitSet(new long[]{0x001E4000202000F0L});
    public static final BitSet FOLLOW_48_in_ruleMultiplication4711 = new BitSet(new long[]{0x001E4000202000F0L});
    public static final BitSet FOLLOW_rulePrimaryExpression_in_ruleMultiplication4734 = new BitSet(new long[]{0x0001800000000002L});
    public static final BitSet FOLLOW_rulePrimaryExpression_in_entryRulePrimaryExpression4772 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrimaryExpression4782 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rulePrimaryExpression4820 = new BitSet(new long[]{0x001E4000202000F0L});
    public static final BitSet FOLLOW_ruleExpression_in_rulePrimaryExpression4842 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_rulePrimaryExpression4853 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_rulePrimaryExpression4882 = new BitSet(new long[]{0x001E4000202000F0L});
    public static final BitSet FOLLOW_rulePrimaryExpression_in_rulePrimaryExpression4903 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_REAL_in_rulePrimaryExpression4937 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rulePrimaryExpression4976 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionCall_in_rulePrimaryExpression5010 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePostfix_in_rulePrimaryExpression5037 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rulePrimaryExpression5069 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArrayLiteral_in_rulePrimaryExpression5103 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionDeclaration_in_rulePrimaryExpression5130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_rulePrimaryExpression5157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_rulePrimaryExpression5186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_rulePrimaryExpression5215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArrayLiteral_in_entryRuleArrayLiteral5252 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArrayLiteral5262 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_ruleArrayLiteral5308 = new BitSet(new long[]{0x003E4000202000F0L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleArrayLiteral5330 = new BitSet(new long[]{0x0020000040000000L});
    public static final BitSet FOLLOW_30_in_ruleArrayLiteral5343 = new BitSet(new long[]{0x001E4000202000F0L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleArrayLiteral5364 = new BitSet(new long[]{0x0020000040000000L});
    public static final BitSet FOLLOW_53_in_ruleArrayLiteral5380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableReference_in_entryRuleVariableReference5416 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariableReference5426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableReferenceArray_in_ruleVariableReference5479 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableReferenceSimple_in_ruleVariableReference5507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePostfix_in_entryRulePostfix5542 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePostfix5552 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableReference_in_rulePostfix5599 = new BitSet(new long[]{0x00C0000000000002L});
    public static final BitSet FOLLOW_54_in_rulePostfix5621 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_rulePostfix5650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableReferenceSimple_in_entryRuleVariableReferenceSimple5689 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariableReferenceSimple5699 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleVariableReferenceSimple5743 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableReferenceArray_in_entryRuleVariableReferenceArray5778 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariableReferenceArray5788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleVariableReferenceArray5833 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_52_in_ruleVariableReferenceArray5846 = new BitSet(new long[]{0x001E4000202000F0L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleVariableReferenceArray5867 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_53_in_ruleVariableReferenceArray5879 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_ruleFunctionCall_in_entryRuleFunctionCall5917 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFunctionCall5927 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFunctionCall5981 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleFunctionCall5993 = new BitSet(new long[]{0x001E4000206000F0L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleFunctionCall6015 = new BitSet(new long[]{0x0000000040400000L});
    public static final BitSet FOLLOW_30_in_ruleFunctionCall6028 = new BitSet(new long[]{0x001E4000202000F0L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleFunctionCall6049 = new BitSet(new long[]{0x0000000040400000L});
    public static final BitSet FOLLOW_22_in_ruleFunctionCall6065 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReturnStatement_in_entryRuleReturnStatement6101 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReturnStatement6111 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_ruleReturnStatement6148 = new BitSet(new long[]{0x001E4000202000F0L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleReturnStatement6169 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInclude_in_entryRuleInclude6205 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInclude6215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_ruleInclude6252 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleInclude6264 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleInclude6281 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleInclude6298 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAffectationDecrement_in_synpred1_InternalLeek1053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAffectationIncrement_in_synpred2_InternalLeek1087 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_synpred3_InternalLeek1667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableReferenceArray_in_synpred4_InternalLeek5463 = new BitSet(new long[]{0x0000000000000002L});

}